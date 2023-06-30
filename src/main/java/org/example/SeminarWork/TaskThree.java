package org.example.SeminarWork;


import java.util.*;

/**
 * 3) Найти пересечения слов в массивах и указать их общее количество.
 * Пример:
 * Mas1= [“qwe”,”asd”,”qwe”,”x”]
 * Mas2=[“qwe”,”v”]
 * Результат:
 * qwe=3
 */
public class TaskThree {
    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> str2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        exOne(str1, str2);
        exTwo(str1, str2);
    }

    private static void exOne(List<String> str1, List<String> str2) {
        Set<String> stringSet = new HashSet<>(str1);
        stringSet.retainAll(str2);
        System.out.println("stringSet = " + stringSet);
        for (String s : stringSet) {
            int count = 0;
            for (int i = 0; i < str1.size(); i++) {
                if (s.equals(str1.get(i))) {
                    count++;
                }
            }
            for (int j = 0; j < str2.size(); j++) {
                if (s.equals(str2.get(j))) {
                    count++;
                }
            }
            System.out.println(s + " = " + count);
        }
    }
    private static void exTwo(List<String> str1, List<String> str2) {
        Set<String> stringSet = new HashSet<>(str1);
        stringSet.retainAll(str2);
        System.out.println("stringSet = " + stringSet);
        Map<String, Integer> map = new HashMap<>();
        for (String s : str1) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s)+1);
        }
        for (String s : str2) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s)+1);
        }
        for (String s : stringSet) {
            System.out.println(s + " = " + map.get(s));
        }
    }
}

