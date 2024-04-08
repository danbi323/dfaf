package com.ohgiraffers.section03.map;

import java.util.*;

public class Application1 {

    /*
    Map 인터페이스의 특징
    Collection 인터페이스와 다른 저장방식을 가진다.
    키(key) 와 값(value)를 하나의 쌍으로 저장하는 방식 사용
     */
    /*
    키(key)란?
    값(value)를 찾기위한 이름 역할을 하는 객체
    1. 요소의 저장순서를 유지하지않음
    2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능
     */

    /*
    HashMap 검색속도가 매우 빠름
     */

    public static <Stirng> void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("one", new Date());
        hashMap.put(12, "red apple");
        hashMap.put(33, 123);

        System.out.println("hashMap = " + hashMap);

        hashMap.put(12,"banana");
        System.out.println("hashMap = " + hashMap);

        hashMap.put(11, "banana");
        hashMap.put(9, "banana");
        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.get(9) = " + hashMap.get(9));

        hashMap.remove(9);
        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.size() = " + hashMap.size());

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        // 반복자를 이용해 keySet()으로 처리
        Iterator<String> ketIter = hmap2.keySet().iterator();

        while (ketIter.hasNext()){
            String key = ketIter.next();
            String value = hmap2.get(key);
            System.out.println(key + "=" + value);

        }

        Collection<String> values = hmap2.values();

        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());        }

        // Object[]로 배열 만들어서 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : valueArr[i] = " + valueArr[i]);

        }

        // Entry<>를 가지고 만들어서 처리 : 키와 객체를 쌍으로 묶는것
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIterator = set.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }








    }
}
