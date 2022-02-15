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
        new JacksonExample();
    }

    public JacksonExample() throws IOException {
        JsonResource jsonResource = new JsonResource();
        String bossJson = jsonResource.bossJson;

        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> map = null;

        map = objectMapper.readValue(bossJson, new TypeReference<List<Map<String, Object>>>(){});
        System.out.println(bossJson.getClass().getName());

        System.out.println("json string -> java object");
        System.out.println(map);
        System.out.println(map.getClass().getName()); // java.util.ArrayList;

        List<Map<String, Object>> map1 = null;
        map1 = objectMapper.readValue(new File("C:\\Users\\user\\Documents\\java-basic\\json\\resource\\boss.json"), new TypeReference<List<Map<String, Object>>>() {});

        System.out.println("json object -> java object");
        System.out.println(map1);
        System.out.println(map1.getClass().getName());

        String map2 = objectMapper.writeValueAsString(map1);

        System.out.println("java object -> json object");
        System.out.println(map2);
        System.out.println(map2.getClass().getName());
    }
}
