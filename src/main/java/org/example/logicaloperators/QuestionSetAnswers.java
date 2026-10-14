package org.example.logicaloperators;

public class QuestionSetAnswers {
    public static void main(String args[]) {
        /* Logical Operators */
        System.out.println(true || false && false); // true
        System.out.println((5 > 3) && !(2 < 1 || 3 == 3)); // false

        boolean a = false, b = true;
        System.out.println(a && (b = false)); // false, value of b is true
        System.out.println("Value of b is: " +b);

        System.out.println(!(true && false || true)); // false

        System.out.println((10 > 5) || (5 / 0 == 1)); // true

        System.out.println((false && true) || (true && true)); // true

        System.out.println((10 < 5) || (20 > 10 && 5 < 2)); // false

        boolean x = true, y = false, z = true;
        System.out.println((x || y) && !(y && z)); // true

        System.out.println(!(5 == 5 && 10 > 2) || (false)); // false

        System.out.println((true && false) || (false || true)); // true

        /* Arithmetic Operators */
        System.out.println(10 + 2 * 5 - 3); // 17

        System.out.println((10 + 2) * (5 - 3)); // 24

        System.out.println(20 / 5 + 3 * 2 - 1); // 9

        System.out.println(100 % 3 * 4 + 6 / 2); //  7

        System.out.println(10 + 20 / 5 * 2); // 18

        System.out.println(5 + 2 * 3 % 4); //   7  (* is higher precedence than %)

        System.out.println((12 - 4) * 2 + 3); // 19

        System.out.println(15 / 2 * 2); // 14

        int ia = 5;
        System.out.println(++ia + ia++); // 12

        int ix = 10;
        System.out.println(ix++ + ++ix + ix); // 34

        /* Relational Operators */

        System.out.println((10 > 5) == (5 < 10)); // true

        System.out.println(5 >= 5 && 6 != 7); // true

        System.out.println('A' == 65); // true

        System.out.println('B' > 'A' && 'a' > 'Z'); // true

        System.out.println(5 < 3 || 2 == 2 && 3 > 1); // true

        System.out.println((10 == 10) && !(10 != 10)); // true

        int ra = 10, rb = 20, rc = 30;
        System.out.println(ra < rb && rb < rc); // true

        System.out.println((5 < 6) == true); // true

        System.out.println((true == false) != (false == false)); // true

        System.out.println((5 < 10 ? 1 : 0) == 1); // true

        /* Complex Increment / Decrement Questions */

        int ina = 5;
        System.out.println(++ina + ina++); // 12

        int in1a = 10;
        int in1b = in1a++ + ++in1a + in1a;
        System.out.println(in1b); // 34

        int inx = 3;
        inx = inx++ + ++inx;
        System.out.println(inx); // 8

        int i = 1;
        int result = i++ + i++ + i;
        System.out.println(result); // 6

        int in2a = 2, in2b = 3;
        int in2c = ++in2a * in2b-- + in2a--;
        System.out.println(in2c); // 12

        int in3a = 5;
        int in3b = in3a++ + ++in3a + in3a++ + --in3a;
        System.out.println("a = " + in3a + ", b = " + in3b); // 7, 26

        int in4a = 1;
        in4a = in4a++ - --in4a + ++in4a - in4a--; // 1 - 1 + 2 - 2
        System.out.println(in4a); // 0

        int tr =  2 - 4 + 7 - 1;
        System.out.println(tr); // 8

        int x1 = 4, y1 = 5;
        int z1 = ++x1 + y1-- - x1++ + --y1;
        System.out.println(z1); // 8

        int x2 = 6;
        System.out.println(x2++ + x2++ + ++x2); // 22

        int a1 = 10;
        a1 = a1++ + ++a1 - --a1 + a1--;
        System.out.println(a1); //22

        int a2 = 2;
        int b2 = a2++ + ++a2 + a2 + --a2 + a2--;
        System.out.println("a = " + a2 + ", b = " + b2); // 16

        int a3 = 1, b3 = 1;
        int c3 = a3++ + b3++ + ++a3 + ++b3;
        System.out.println(c3); //8

        int a4 = 0;
        int b4 = a4++ + a4++ + a4++ + a4++;
        System.out.println(b4); // 6

        int a5 = 1;
        int b5 = a5++ + ++a5 + a5++ + ++a5;
        System.out.println("a = " + a5 + ", b = " + b5); // 12

        int x3 = 3;
        int y3 = x3++ + ++x3 + x3++ + --x3;
        System.out.println(y3); // 18

        int x4 = 1;
        x4 = x4++ + x4++ + ++x4 + --x4;
        System.out.println(x4); // 10

        int a6 = 2;
        int b6 = --a6 + a6++ + ++a6 + a6--;
        System.out.println(b6); // 8

        int x5 = 5;
        int y5 = ++x5 + x5++ + --x5 + x5--;
        System.out.println("x = " + x5 + ", y = " + y5); // 5, 24

        int a7 = 3, b7 = 4;
        int c7 = a7++ + b7++ + ++a7 + --b7 + a7 + b7;
        System.out.println(c7); // 25

        int a8 = 1;
        int b8 = a8++ + ++a8 * a8-- + --a8;
        System.out.println(b8); // 11

        int a9 = 1;
        a9 = a9++ + ++a9 * (a9++ + --a9) - a9--;
        System.out.println(a9); // 16

        int x6 = 2, y6 = 3;
        int z6 = x6++ * --y6 + ++x6 * y6-- + x6++ - y6;
        System.out.println("x = " + x6 + ", y = " + y6 + ", z = " + z6); // 5, 1, 15

        int a10 = 5;
        int b10 = a10++ + a10++ + ++a10 + a10-- + --a10;
        System.out.println("a = " + a10 + ", b = " + b10); // 6, 33

        int a11 = 1;
        int b11 = a11++ + (a11++ * (a11++ + --a11) + a11--);
        System.out.println("a = " + a11 + ", b = " + b11); // 2, 16

        int i1 = 0;
        i1 = i1++ - --i1 + ++i1 + i1-- - i1++ + ++i1;
        System.out.println(i1); // 4

        int a12 = 1, b12 = 2, c12 = 3, d12 = 4;
        int result1 = a12++ + ++b12 * c12-- - - --d12;
        System.out.println("a=" + a12 + ", b=" + b12 + ", c=" + c12 + ", d=" + d12 + ", result=" +
                result1); // 2, 3, 2, 3, 13

        int a13 = 2, b13 = 3, c13 = 4, d13 = 5;
        int result2 = --a13 + b13++ - c13-- + ++d13 + a13++ * --b13;
        System.out.println("a=" + a13 + ", b=" + b13 + ", c=" + c13 + ", d=" + d13 + ", result=" +
                result2); //2, 3, 3, 6, 9

        int a14 = 5, b14 = 4, c14 = 3, d14 = 2;
        int result3 = a14-- + ++b14 * --c14 - d14++ + b14-- + c14;
        System.out.println("a=" + a14 + ", b=" + b14 + ", c=" + c14 + ", d=" + d14 + ", result=" +
                result3); //4, 4, 2, 3, 20

        int a15 = 3, b15 = 2, c15 = 1, d15 = 0;
        int result4 = ++a15 * b15-- + c15++ - --d15 + d15++ * --b15;
        System.out.println("a=" + a15 + ", b=" + b15 + ", c=" + c15 + ", d=" + d15 + ", result=" +
                result4); // 4, 0, 2, 0 ,10


        int a16 = 1, b16 = 2, c16 = 3, d16 = 4;
        int result5 = a16++ + b16++ + c16++ + d16++ + --a16 + --b16 + --c16 + --d16;
        System.out.println("a=" + a16 + ", b=" + b16 + ", c=" + c16 + ", d=" + d16 + ", result=" +
                result5); // 1, 2, 3, 4 ,20
    }
}
