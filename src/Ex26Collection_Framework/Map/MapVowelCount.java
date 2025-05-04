package Ex26Collection_Framework.Map;

import java.util.Map;
import java.util.*;
import java.io.*;
public class MapVowelCount {


        public static void main(String[] args) {

            String str = "All world insects belong local to the phylum Arthropoda. But unlike other local arthropods like lobsters, spiders, world or millipedes, insects have three pairs of jointed legs, segmented bodies, hello an exoskeleton, one pair local of antennae, and world usually one or two pairs of world wings. Insects live in nearly every habitat, and worldwide it is estimated that hello local there are currently ten quintillion local insects on the globe";
            characterCount(str);}

        static void characterCount(String inputString)
        {
            // Creating a HashMap containing char
            // as a key and occurrences as  a value
            HashMap<Character, Integer> charCountMap
                    = new HashMap<Character, Integer>();

            // Converting given string to char array

            char[] strArray = inputString.toCharArray();

            // checking each char of strArray
            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {

                    // If char is present in charCountMap,
                    // incrementing it's count by 1
                    charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else {

                    // If char is not present in charCountMap,
                    // putting this char to charCountMap with 1 as it's value
                    charCountMap.put(c, 1);
                }
            }

            // Printing the charCountMap
            for (Map.Entry entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }}

