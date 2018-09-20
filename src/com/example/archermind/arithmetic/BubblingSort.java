package com.example.archermind.arithmetic;

/*
 * 冒泡排序通过重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来，直到没有再需要交换的元素为止（对n个项目需要O(n^2)的比较次数）。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 */
public class BubblingSort {

    private static int[] sTestBubbuling = new int[] { 22, 11, 24, 4, 33, 45, 26 };

    public static void main(String[] args) {
        executeBubbling();
        executeBubbling1();
    }

    // Function 1
    private static void executeBubbling() {
        int temp;
        for (int index = 0; index < sTestBubbuling.length - 1; index++) {
            for (int last = index + 1; last < sTestBubbuling.length - 1; last++) {
                if (sTestBubbuling[index] > sTestBubbuling[last]) {
                    temp = sTestBubbuling[index];
                    sTestBubbuling[index] = sTestBubbuling[last];
                    sTestBubbuling[last] = temp;
                }
            }
        }
        traverseArray();
    }

    // 冒泡排序的原则是：
    // 1.俩俩之间比较，将小的数值和大的数值之间交互，一趟结束之后，最大的数值将会被替换到最后
    // 2.第二趟之间仍然是选择俩俩比较，但是次数-1，将小的数值和大的数值之间交互，将第二大的数值替倒数第二位，一次类推...
    private static void executeBubbling1() {
        int temp;
        for (int index = 0; index < sTestBubbuling.length - 1; index++) {
            for (int last = 0; last < sTestBubbuling.length - 1 - index; last++) {
                if (sTestBubbuling[last] > sTestBubbuling[last + 1]) {
                    temp = sTestBubbuling[last];
                    sTestBubbuling[last] = sTestBubbuling[last + 1];
                    sTestBubbuling[last + 1] = temp;
                    // 每趟比较之后的结果
                    traverseArray();
                }
            }
        }
        traverseArray();
    }

    private static void traverseArray() {
        for (int number : sTestBubbuling) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
