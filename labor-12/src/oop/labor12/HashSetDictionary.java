package oop.labor12;

import java.util.Set;

public class HashSetDictionary {
    private Set<String> words;
    private HashSetDictionary instance;

    public HashSetDictionary(Set<String> words, HashSetDictionary instance) {
        this.words = words;
        this.instance = instance;
    }

}
