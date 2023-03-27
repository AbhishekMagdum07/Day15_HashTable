package com.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    // Uc2 = Ability to find frequency of words in a paragraph.
    public void freuencyOfWords(){
        String line = "Paranoids are not paranoid because they are paranoid but\n" +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
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
