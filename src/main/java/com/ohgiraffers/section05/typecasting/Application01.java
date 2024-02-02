package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. 자동 형변환 규칙에 대해 이해할 수 있다.*/

        /*필기.
        *  데이터 형변환
        *  데이터 형변환이 필요한 이유
        *  - 자바에서 다른 타임끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다
        *  - 즉 !!! 같은 데이터 타입끼리만 연산을 수행할 수 있다. */

        /*필기.
        *  형변환의 종루와 규칙
        *  1. 자동형변환(묵시적 형변환-조용하게 진행한다) : 컴파일러가 자동으로 수행해주는 타입 변환
            1.1. 작은 자료형에서 큰 자료향으로는 자동형 변환이 된다!!!!1
            1.2. 정수는 실수로 자동 형변환이 된다, !!!1
                1.3. 문자형은 int형으로 자동 형변환 된다!!!!1
            1.4. 논리형은 형변환 규칙에서 제외된다.
           */

        /*목차. 1. 자동형 변환 규칙 테스트*/
        /*목차. 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환이 된다*/
        /*필기. 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기 때문에 자동으로 쳐 달라*/

        /*목차. 1-1-1. 정수끼리의 자동 형변환*/
        byte bnum= 1;  // 1 byte
        short snum =bnum;  //2 byte
        int inum = snum; // 4byte
        long lnum = inum; // 8byte

        int num1 = 10;  //4byte
        long num2 = 20;   //8byte

//        int result1 = num1 + num2;  //자동으로 큰 쪽 자료형인 long으로 변경후 계산하기 때문에 int형 변수에 담을 수 없다.
        long result1 = num1 + num2;  // int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int ->long으로 변환을

        System.out.println("result = " + result1);

        /*목차.1-1-2. 실수*/
        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;

        System.out.println(" result2 = " +result2);  // 8.0

        /*목차. 1-2. 정수는 실수로 자동 형변환이 된다.*/
        /*필기.
        *  정수를 실수로 변경할 때 소수점 자리가 없어도 실수형태로 표현이 가능하다. 이 때 데이터 손실!!이 없기때문에 자동으로 진행한다.*/

        long eight = 8;  //8
        float four = eight;  //4

        System.out.println(" four = " + four);// float가 실수형이라 8.0으로 나오는듯?

        /*목차. 1-3. 문자형은 int형으로 자동 형변환이 된다*/
        char ch1= 'a';  //2
        int charNumber = ch1;  //4

        System.out.println(" charNumber = " + charNumber);  //a가 97이라 97로 나옴

        char ch2 = 65;

        System.out.println(" ch2 = " + ch2);  //소문자 a는 65임

        /*목차. 1-4. 논리형은 형변환 규칙에서 제외된다.*/
        /*필기. 어느 자료형이든 boolean 을 형변환해서 담을 수 없다.*/
//        boolean isTrue = true;
//        byte b = isTrue;
//        float f = isTrue;
//        String s = isTrue;



    }
}
