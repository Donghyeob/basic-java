package json;

/*
* Jackson-core
* Databind - ObjectMapper class 포함
* Annotation - ObjectMapper를 사용하기 위해 필요*/
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import json.resource.JsonResource;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JacksonExample {
    public static void main(String[] args) throws IOException {
        // resource에 있는 json file
        JsonResource jsonResource = new JsonResource();
        String bossJson = jsonResource.bossJson;

        // ObjectMapper - Jackson library에 포함되어있는 class
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> map = null;

        // Json String -> Java Object
        map = objectMapper.readValue(bossJson, new TypeReference<List<Map<String, Object>>>(){});
        System.out.println(bossJson.getClass().getName());

        System.out.println("**********Json String -> Java Object**********");
        System.out.println(map);
        System.out.println(map.getClass().getName()); // java.util.ArrayList;

        // Json Object -> Java Object
        List<Map<String, Object>> map1 = null;
        map1 = objectMapper.readValue(new File("C:\\Users\\dongh\\IdeaProjects\\basic-java\\json\\resource\\boss.json"), new TypeReference<List<Map<String, Object>>>() {});

        System.out.println("**********Json Object -> Java Object**********");
        System.out.println(map1);
        System.out.println(map1.getClass().getName());

        // Java Object -> Json Object
        String map2 = objectMapper.writeValueAsString(map1);

        System.out.println("**********Java Object -> Json Object**********");
        System.out.println(map2);
        System.out.println(map2.getClass().getName());
    }
}
