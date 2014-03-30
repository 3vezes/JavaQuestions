package com.ic;

import com.data.Node;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * I wrote a crawler that visits web pages, stores a few keywords in a database, and follows links to other web pages.
 * I noticed that my crawler was wasting a lot of time visiting the same pages over and over, so I made a hash
 * table visited where I'm storing URLs I've already visited. Now the crawler only visits a URL if
 * it hasn't already been visited. Thing is, the crawler is running on my old desktop computer in my parents'
 * basement (where I totally don't live anymore), and it keeps running out of memory because visited is
 * getting so huge. How can I trim down the amount of space taken up by visited?
 */
public class CrawlerVisitedCache {

    /**
     * Key is the first char of the URL and the value is the trie struct.
     */
    private Map<Character,Node<Character>> trieURLMap = Maps.newHashMap();

    public boolean hasUrl(String url){
        char first = url.charAt(0);

        return trieURLMap.containsKey(first) && recursiveTraverse(advanceNextCharacter(url), trieURLMap.get(first));
    }

    public void addUrl(String url){
        Preconditions.checkArgument(!url.isEmpty(),"URL provided cannot be empty.");

        char firstCharacter = url.charAt(0);
        if(!trieURLMap.containsKey(firstCharacter)){
            trieURLMap.put(firstCharacter,new Node<Character>(firstCharacter));
        }

        recursiveInsert(advanceNextCharacter(url),trieURLMap.get(firstCharacter));
    }

    private void recursiveInsert(String url,Node<Character> node){
        if(url.isEmpty()){
            return;
        }

        char current = url.charAt(0);

        if(!node.hasChild(current)){
            node.addChild(current);
        }

        //Node already in the trie, advance.
        recursiveInsert(advanceNextCharacter(url),node.getChild(current));
    }

    private boolean recursiveTraverse(String url, Node<Character> node){
        if(url.isEmpty()){
            //We traversed all nodes and reached the end.
            return true;
        }

        char current = url.charAt(0);

        return node.hasChild(current) && recursiveTraverse(advanceNextCharacter(url), node.getChild(current));
    }

    private String advanceNextCharacter(String input){
        return (input.isEmpty() || input.length() == 1) ? "" : input.substring(1,input.length());
    }
}
