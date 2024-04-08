package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application  {
    /*
    FileReader
    FileInputStream 사용하는 방법이 거의 동일
    단 byte 단위가 아니라 character 단위로 읽어드리는 부분이 차이점
    따라서 2바이트던 3바이트던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올수있
     */
    public static void main(String[] args) {

    FileReader fr = null;

        try {
            fr = new FileReader("src/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;

            while ((value = fr.read()) != -1) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
