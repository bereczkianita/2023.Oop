package oop.labor12;

import java.util.ArrayList;

public class ArrayListDictionary {
    private ArrayList<String> words;
    private ArrayListDictionary instance;

    public ArrayListDictionary(ArrayList<String> words, ArrayListDictionary instance) {
        this.words = words;
        this.instance = instance;
    }
}
