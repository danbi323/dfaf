package com.ohgiraffers.section03.filerstream;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*
        System.in : 콘솔롤부터 입력받는다
        System.out : 콘솔로부터 출력한다
        System.err : 콘솔로부터 출력한다
         */
        // System.in을  InputStreamReader로 변환하여 바이트기반의 스트림을 문자 기반의 스트림으로 변환후
        // 버퍼를 이용한 보조 스트림과 연결함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("문자열 입력 : ");
            String value = br.readLine();
            System.out.println("value = " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null){

                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write("아아아아응");
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
