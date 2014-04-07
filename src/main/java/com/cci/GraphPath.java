package com.cci;

import com.data.Node;
import com.google.common.collect.Sets;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Given a directed graph, design an algorithm to find out whether there is a route
 * between two nodes.
 */
public final class GraphPath {

    public static <T> boolean findPath(Node<T> start,Node<T> end){
        Set<Node<T>> visitedNodes = Sets.newHashSet();

        Queue<Node<T>> nodeToVisitQueue = new LinkedList<Node<T>>();
        nodeToVisitQueue.add(start);

        while (!nodeToVisitQueue.isEmpty()){
            Node<T> current = nodeToVisitQueue.remove();

            if(current.equals(end)){ return true; }

            //Let's visit it's children.
            visitedNodes.add(current);
            for(Node<T> child : current.getChildren()){
                if(!visitedNodes.contains(child)){
                    nodeToVisitQueue.add(child);
                }
            }
        }

        return false;
    }
}
