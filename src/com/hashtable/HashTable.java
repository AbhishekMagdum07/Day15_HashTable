package com.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    // Uc1 = Ability to find frequency of words in a sentence.
    public void freuencyOfWords(){
        String line = "To be or not to be";
        String newLine =   line.toLowerCase();   // convert line to lower case to avoid miscalculations.

        String[] sentence = newLine.split(" "); // split the sectence and store word in array.
        Hashtable<String,Integer> table = new Hashtable<>();

        for (int i = 0; i < sentence.length; i++) {

            if (table.containsKey(sentence[i])) {
                table.put(sentence[i], table.get(sentence[i]) + 1);
            } else {
                table.put(sentence[i], 1);
            }
        }
            System.out.println("Word  ==  frequency");
        for (Map.Entry<String, Integer> print : table.entrySet()) {

            System.out.println(print.getKey() +"  ==  "+print.getValue());
        }
    }
    public static void main(String[] args) {
        HashTable run = new HashTable();
        run.freuencyOfWords();
    }
}
