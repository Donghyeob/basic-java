package json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import json.resource.JsonResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GsonExample {
    public static void main(String[] args) {

        Gson gson = new Gson();

        // bossJson - Json Array 형태의 String
        JsonResource jsonResource = new JsonResource();
        String bossJson = jsonResource.bossJson;
        String user = jsonResource.user;

        // fromJson - reader로 읽든 string으로 읽든 뒤에 지정된 클래스의 객체로 역직렬화  
        /*Json String -> Json Array*/
        JsonArray jsonArray = gson.fromJson(bossJson, JsonArray.class);

        System.out.println(jsonArray.getClass().getName()); //com.google.gson.JsonArray
        System.out.println(jsonArray);

        /*Json String -> Java ArrayList*/
        List<Map<String, Object>> map = new ArrayList<>();
        map = gson.fromJson(bossJson, ArrayList.class);

        System.out.println(map.getClass().getName()); //java.util.ArrayList
        System.out.println(map);

        /*Json String -> Json Object*/
        JsonObject jsonObject = gson.fromJson(user, JsonObject.class);

        System.out.println(jsonObject.getClass().getName()); //com.google.gson.JsonObject
        System.out.println(jsonObject);

        /*Json String -> Java HashMap*/
        Map<String, Object> map1 = new HashMap<>();
        map1 = gson.fromJson(user, HashMap.class);

        System.out.println(map1.getClass().getName()); //java.util.HashMap
        System.out.println(map1);

        /*Json Object or Json Array에서 Java Object로 변환 시 string으로 변환 후
         * 진행하는 편*/

    }
}
