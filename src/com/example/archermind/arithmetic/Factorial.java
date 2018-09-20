package com.example.archermind.arithmetic;

/*
 * 编写一个程序，输入n,求n！（用递归的方式实现）。
 */

public class Factorial {

    static int result = 1;

    public static void main(String[] args) {
        int number = executeFactorial(4);
        int number1 = executeFactorial1(5);
        System.out.println(number);
        System.out.println(number1);
    }

    // function 1
    // 利用静态变量的递归方式
    private static int executeFactorial(int index) {
        if (index == 1) {
            return result * index;
        }
        result = result * index;
        return executeFactorial(index - 1);
    }

    // function 2
    // 利用递归的处理方式，阶乘的目的是，n * (n-1) * (n-2) * .... 1.
    private static int executeFactorial1(int index) {
        if (index == 1) {
            return index;
        }
        return index * executeFactorial1(index - 1);
    }

}
