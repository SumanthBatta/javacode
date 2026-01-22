package Jsons;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.util.HashMap;
import java.util.Map;

public class FindCountKeys {
    public static void main(String[] args) throws Exception {
        String json = "[{ \"name\": \"AAA\", \"age\": 30, \"isStudent\": false, \"courses\": [\"Math\",\"Science\"] },"
                + "{ \"name\": \"BBB\", \"age\": 30, \"isStudent\": false, \"courses\": [\"Science\",\"History\"] },"
                + "{ \"name\": \"CCC\", \"age\": 30, \"isStudent\": false, \"courses\": [\"Math\"] }]";

        CountKeyValues(json);
    }

//    public static void CountKeyValues(String json) throws Exception {
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        JsonNode rootnode = mapper.readTree(json);
//        Map<String,Integer> obj = new HashMap<>();
//        if(rootnode.isArray()) {
//            for (JsonNode node : rootnode) {
//                if (node.has("courses") && node.get("courses").isArray()) {
//                    for (JsonNode course : node.get("courses")) {
//                        String courseName = course.asText();
//                        obj.put(courseName, obj.getOrDefault(courseName, 1) + 1);
//                    }
//                }
//            }
//        }
//
//        obj.forEach((k,v) ->
//                System.out.println("Key : "+k + " "+ "value: "+v));
//
//
//
//    }
public static void CountKeyValues(String json) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode rootNode = mapper.readTree(json);
    Map<String, Integer> obj = new HashMap<>();

    if (rootNode.isArray()) {
        for (JsonNode node : rootNode) {
            if (node.has("courses") && node.get("courses").isArray()) {
                for (JsonNode course : node.get("courses")) {
                    String courseName = course.asText();
                    obj.put(courseName, obj.getOrDefault(courseName, 1) + 1);
                }
            }
        }
    }
    obj.forEach((k, v) ->
            System.out.println("Key : " + k + " " + "value: " + v));
}
}
