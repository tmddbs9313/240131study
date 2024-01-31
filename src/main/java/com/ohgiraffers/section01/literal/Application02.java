package com.ohgiraffers.section01.literal;

public class Application02 {

    public static void main(String[] args) {

        /*수업목표. 값을 직접 연산하여 출력할 수 있다. */

        /*목차. 1. 숫자와 숫자의 연산 */

        System.out.println("==========정수와 정수의 연산===========");
        System.out.println(123 + 456);
        System.out.println(123 - 23 );
        System.out.println(123 * 10);
        System.out.println(123 / 10); // 몫을 반환
        System.out.println(123 % 10); // mod 연산자, 나머지를 반환

        /* 목차.1-2. 실수와 실수의 연산 */
        System.out.println("===========실수와 실수의 연산===========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 % 1.0);

        /*목차. 1-3. 정수와 실수의 연산*/
        /*필기. 정수와 실수 연산의 결과는 항상 실수가 나온다.*/
        System.out.println("===========정수와 실수의 연산============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /*목차. 문자의 연산*/
        /*목차.2-1. 문자와 문자의 연산*/
        System.out.println("============문자와 문자의 연산==========");
        System.out.println('a' + 'b');  // a는 97로, b는 98로 인식하여 195로 출력
        System.out.println('a' -'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /*목차. 2-2. 문자와 정수의 연산*/
        System.out.println("========문자와 정수의 연산=======");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===============연습===============");
        System.out.println('안'+'녕'); //숫자화 되어잇음. 계산해서 나옴

        /*목차. 2-3. 문자와 실수의 연산 */
        System.out.println("================문자와 실수의 연산================");
        System.out.println('a'+ 1.0);
        System.out.println('a'- 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /* 필기.
            여기서 결론은 문자는 내부적으로 숫자 취급을 한다는 것이다.
            결국 지금까지 연산은 숫자끼리의 연산을 본 것이고, 숫자(정수 혹은 실수)형태의 값은 사칙연산과 모드연산(나머지를 반환하는 연산방법)이 가능하다.
         */

        /*목차. 3. 문자열의 연산*/
        /*목차. 3-1. 문자열과 문자열의 연산*/
        // 필기. 문자열과 문자열의 + 연산은 문자열 합치기 (이어 붙이기)가 된다.
        System.out.println("================뭍ㄴ자열과 문자열의 연산================");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");
//        System.out.println("hello" * "world");
//        System.out.println("hello" / "world");
//        System.out.println("hello" % "world");

        /*목차. 3-2. 문자열과 다른 형태의 값 연산*/
        System.out.println("hello"+ 123);
        System.out.println("hello"+123.456);
        System.out.println("hello"+'a');
        System.out.println("hello"+true);

        /*목차. 4. 논리 값 연산*/
        /*목차. 4-1. 논리값과 논리값 연산*/
        //필기. 논리값끼리의연산은 모든 연산자의 사용이 불가능하다.
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        System.out.println("==============논리와 문자열의 연산=============");
        System.out.println(true + "a"); // 논리값은 더하기 할때만 연산가능.
//        System.out.println(true - "a");
//        System.out.println(true / "a");
//        System.out.println(true * "a");
//        System.out.println(true % "a");
    }
}
