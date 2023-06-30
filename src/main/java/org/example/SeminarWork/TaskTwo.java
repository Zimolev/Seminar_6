package org.example.SeminarWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 2) Найти пересечение двух множеств
 Пример:
 set1= [1,2,3,4]
 set2= [3,5,6,7]
 Вывод в консоль:
 [3]

 */
public class TaskTwo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer>set1set2 = new HashSet<>(set1);
        set1set2.retainAll(set2);
        System.out.println("set1set2 = " + set1set2);
        System.out.println("set2 = " + set2);
        System.out.println("set1 = " + set1);
    }
}
