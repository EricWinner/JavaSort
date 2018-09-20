package com.example.archermind.arithmetic;

/*
 * 在简单选择排序过程中，所需移动记录的次数比较少。最好情况下，即待排序记录初始状态就已经是正序排列了，则不需要移动记录。
 * 最坏情况下，即待排序记录初始状态是按第一条记录最大，之后的记录从小到大顺序排列，则需要移动记录的次数最多为3（n-1）。
 */
public class SimpleSort {

    static int[] sTestSimple = { 3, 1, 2, 8, 4, 5, 24, 12 };

    public static void main(String[] args) {
        exectueSimpleSort();
    }

    // 选择排序的原则：
    // 1.先排出最小的数字，将第一个数字作为最小数，之后的数字都会第一个数字进行比较，当有更小的数字，记住最小数的角标，之后将第一个数字和最小的数字进行交换
    // 2.之后再将第二个数字作为最小的数字，与之后的数字再次进行比较，当有更小的数字，记住最小数的角标，之后将第2个数字和最小的数字进行交换，以此类推....
    private static void exectueSimpleSort() {
        int min = 0;
        for (int index = 0; index < sTestSimple.length - 1; index++) {
            min = index;
            for (int last = index + 1; last < sTestSimple.length; last++) {
                System.out.println("min = " + min);
                if (sTestSimple[last] < sTestSimple[min]) {
                    min = last;
                }
            }
            if (min != index) {
                int temp = sTestSimple[index];
                sTestSimple[index] = sTestSimple[min];
                sTestSimple[min] = temp;
            }
        }
        for (int number = 0; number < sTestSimple.length - 1; number++) {
            System.out.println(sTestSimple[number]);
        }
    }
}
