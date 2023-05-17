package oop.labor12;

import java.util.Set;

public class TreeSetDictionary {
    private Set<String> words;
    private TreeSetDictionary instance;

    public TreeSetDictionary(Set<String> words, TreeSetDictionary instance) {
        this.words = words;
        this.instance = instance;
    }

}
