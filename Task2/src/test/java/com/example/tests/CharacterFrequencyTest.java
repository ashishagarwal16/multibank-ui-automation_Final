package com.example.tests;

import com.example.utils.CharacterFrequencyUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Map;

public class CharacterFrequencyTest {

    @DataProvider(name = "stringData")
    public Object[][] stringDataProvider() {
        return new Object[][]{
                {"hello world", "h:1,e:1,l:3,o:2, ,w:1,r:1,d:1,"},
                {"TestNG", "T:1,e:1,s:1,t:1,N:1,G:1,"},
                {"aaabbb", "a:3,b:3,"},
                {"", ""}, // edge case: empty string
                {null, ""} // edge case: null input
        };
    }

    @Test(dataProvider = "stringData")
    public void testCharacterFrequency(String input, String expectedOutput) {
        Map<Character, Integer> frequencyMap = CharacterFrequencyUtil.getCharacterFrequency(input);

        // Convert Map to String for comparison
        StringBuilder actualOutput = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            actualOutput.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }

        Assert.assertEquals(actualOutput.toString(), expectedOutput);
    }
}
