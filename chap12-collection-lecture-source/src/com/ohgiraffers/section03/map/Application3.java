package com.ohgiraffers.section03.map;

import java.util.*;

public class Application3 {


    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("one", "java");
        hmap.put("two", "oracle");
        hmap.put("three", "jdbc");
        hmap.put("four", "html");
        hmap.put("five", "css");
        Iterator<String> iterator = hmap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = hmap.get(key);
            System.out.println(key +"="+ value);
        }

        System.out.println("===========================");
        
        Collection<String> collection = hmap.values();
        Iterator<String> iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            System.out.println("iterator1.next() = " + iterator1.next());
        }

        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "array[i]=" + array[i]);
        }

        Set<Map.Entry<String, String>> set = hmap.entrySet();
        Iterator<Map.Entry<String, String>> iterator2 = set.iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, String> map = iterator2.next();
            System.out.println(map.getKey() + "=" + map.getValue());
        }



    }
}
