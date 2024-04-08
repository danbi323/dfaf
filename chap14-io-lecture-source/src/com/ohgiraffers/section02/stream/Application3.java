package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Application3 {

    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/com/ohgiraffers/section02/stream/test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
