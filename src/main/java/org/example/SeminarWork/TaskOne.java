package org.example.SeminarWork;

import java.util.HashSet;
import java.util.Set;

/**
 1) Дан массив чисел, посчитать процент уникальных чисел.
 *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

 */
public class TaskOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 0, 0};
        int arrSize = arr.length;
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < arrSize; i++) {
            integerSet.add(arr[i]);
        }
        int integerSetSize = integerSet.size();
        int unikNumber = integerSetSize * 100 / arrSize;
        System.out.println("unikNumber = " + unikNumber + "%");
    }
}
