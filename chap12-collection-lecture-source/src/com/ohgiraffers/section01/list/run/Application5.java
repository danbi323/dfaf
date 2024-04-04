package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {
        /*
        Queue에 대해 이해
        선형 메모리 공간에 데이터를 저장하는
        선입선출(FIFO First Input First Out) 방식의 자료구조
        대부분 LinkedList 사용
         */

        // 인터페이스이기때문에 인스턴스 생성이 불가능
        Queue<String> queue = new LinkedList<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println("queue = " + queue);

        /*
        peek() : 큐의 가장 앞에있는 요소(먼저 들어온 요소를 반환)
        poll() : 큐의 가장 앞에 있는 요소를 반환하고 제거 
         */

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll()); // first
        System.out.println("queue.poll() = " + queue.poll()); // second
        System.out.println("queue = " + queue);

    }
}
