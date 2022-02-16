package json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import json.resource.JsonResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GsonExample {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // bossJson - Json Array 형태의 String
        JsonResource jsonResource = new JsonResource();
        String bossJson = jsonResource.bossJson;

        // fromJson - reader로 읽든 string으로 읽든 뒤에 지정된 클래스의 객체로 역직렬화  
        /*Json String -> Json Array*/
        JsonArray jsonArray = gson.fromJson(bossJson, JsonArray.class);

        System.out.println(jsonArray.getClass().getName());
        System.out.println(jsonArray);

        /*Json String -> Java ArrayList*/
        List<Map<String, Object>> map = new ArrayList<>();
        map = gson.fromJson(bossJson, ArrayList.class);

        System.out.println(map.getClass().getName());
        System.out.println(map);
    }
}
