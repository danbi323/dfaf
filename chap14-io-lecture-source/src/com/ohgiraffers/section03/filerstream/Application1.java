package com.ohgiraffers.section03.filerstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filerstream/test"));
            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
             if (bw != null) {

                 try {
                     bw.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}
