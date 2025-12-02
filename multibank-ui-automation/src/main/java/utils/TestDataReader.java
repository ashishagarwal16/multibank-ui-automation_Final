package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TestDataReader {
    private JsonNode rootNode;

    public TestDataReader(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        rootNode = mapper.readTree(new File(filePath));
    }

    public String getValue(String key) {
        return rootNode.path(key).asText();
    }
}
