package com.ohgiraffers.section02.String;

public class Application1 {

    public static void main(String[] args) {
        // String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용
        /*
        charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환
        인덱스는 0부터 시작하는 숫자체계를 의미하며
        인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundsException 발생
         */

        String str = "apple";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str.charAt(i));
        }

        /*
        compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를
        크면 양수를 반환
        단, 이 메소드는 대소문자를 구분해 비교
         */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3))); // 0

        System.out.println("compareTo() : " + (str4.compareTo(str2))); // -32 작으면 음수
        System.out.println("compareTo() : " + (str2.compareTo(str4))); // 32 크면 양수

        System.out.println("compareTo() : " + (str2.compareTo(str5))); // -5 작으면 음수
        System.out.println("compareTo() : " + (str5.compareTo(str2))); // 5 크면 양수

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열 반환
        원본 문자열에는 영향을 주지않움
         */

        System.out.println("concat() : " + (str2.concat(str5))); // javaoracle
        System.out.println("str2 : " + str2);

        /*
        indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
        단, 일치하는 문자가 없는경우 -1을 반환
         */
        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a')); // 1
        System.out.println("indexOf('a') : " + indexOf.indexOf('z')); // -1
        /*
        lastIndexOf() : 문자열 탐색을 뒤에서부터하고 처음 일치하는 위치의 인덱스 반환
        단, 일치하는 문자가 없는 경우 -1
         */

        System.out.println("lastIndexOf('a'):" + indexOf.lastIndexOf('a')); //7
        System.out.println("lastIndexOf('z'):" + indexOf.lastIndexOf('z')); //-1

        // trim() : 문자열의 앞 위에 공백을 제거한 문자열을 반환
        String trimStr = "   java   "; // 앞 뒤 공백 3칸씩
        System.out.println("trimStr = #" + trimStr + "#");
        System.out.println("trim = #" + trimStr.trim() + "#");
        System.out.println("trimStr = #" + trimStr + "#"); //원본엔 영향 x

        /*
        toLowerCase() : 모든 문자를 소문자로 변환
        toUpperCase() : 모든 문자를 대문자로 변환
         */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        System.out.println("caseStr = " + caseStr);

        /*
        substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환
         */

        String javaoracle = "javaoracle";

        System.out.println("substring(3, 6) : " + javaoracle.substring(3, 6)); // aor 6전까지
        System.out.println("substring(3) : " + javaoracle.substring(3)); // aoracle

        System.out.println("javaoracle = " + javaoracle);

        // replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다
        System.out.println("replace() : " + javaoracle.replace("java", "python"));
        System.out.println("javaoracle = " + javaoracle);

        // length() : 문자열의 길이를 정수형으로 변환한다.
        System.out.println("length() : " + javaoracle.length()); // 10
        System.out.println("빈 문자열의 길이 " + ("".length())); // 0

        // isEmpty() : 문자열의 길이가 0이면 true 아니면 false 반환
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "   ".isEmpty());

        // 길이가 0인 문자열은 null과는 다름
        String str6 = null;
        String str7 = "";



    }
}
