package com.jd.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by lichunran on 2018/8/8.
 */
public class JSONTest {

    @Test
    public void test() {

        /*Shoe nike = new Shoe();

        nike.setBrand("nike");

        nike.setType(1);

        Person zhangsan = new Person();

        zhangsan.setName("zhangsan");

        zhangsan.setAge(17);

        zhangsan.setSex("male");

        zhangsan.setShoe(nike);

        String personJson = JSON.toJSONString(zhangsan);

        System.out.println(personJson);

        String json = "{\"age\":0,\"name\":\"zhangsan\",\"sex\":\"male\",\"shoe\":{\"type\":1}}";

        JSONObject parse = (JSONObject)JSONObject.parse(json);

        System.out.println(parse.get("age"));

        Person person = JSON.parseObject(json, Person.class);

        System.out.println(person.getShoe().getBrand());

        System.out.println(true != true);*/

        System.out.println(true == Boolean.TRUE);

        if(true == Boolean.TRUE) {
            System.out.println("123");
        }
    }


}
