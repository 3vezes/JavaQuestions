package com.cci;

import com.data.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphPathTest {

    private Node<String> startVertex;
    private Node<String> endVertex;

    private Node<String> invalidStart;
    private Node<String> invalidEnd;

    /**
     * Setup graph with cycles.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        Node<String> a = new Node<String>("A");
        Node<String> b = new Node<String>("B");
        Node<String> c = new Node<String>("C");
        Node<String> d = new Node<String>("D");
        Node<String> e = new Node<String>("E");

        //A -> B
        a.addChild(b);

        // B -> C, B -> D
        b.addChild(c);
        b.addChild(d);

        //C -> D
        c.addChild(d);

        // D -> E
        d.addChild(e);

        // E -> B
        e.addChild(b);

        //Path exists but contains cycles.
        startVertex = a;
        endVertex = e;

        //No path exist
        invalidStart = e;
        invalidEnd = a;
    }

    @Test
    public void testPath() throws Exception {
        Assert.assertFalse(GraphPath.findPath(invalidStart,invalidEnd));
        Assert.assertTrue(GraphPath.findPath(startVertex,endVertex));
    }
}
