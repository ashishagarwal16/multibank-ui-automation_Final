package com.example.utils;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utility class to calculate character frequencies
 */
public class CharacterFrequencyUtil {

    /**
     * Count character frequencies in a string
     * @param input String input
     * @return Map<Character, Integer> frequency map
     */
    public static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        if (input == null) {
            return charCountMap; // handle null input
        }

        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
