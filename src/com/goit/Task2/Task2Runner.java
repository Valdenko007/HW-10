package com.goit.Task2;
/*

 Метод принимает на вход список из строк (можно список из Задания 1).
 Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).

 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2Runner {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Kolya", "Vitya", "Misha", "Grisha", "Oksana", "Sasha", "Masha");

        List<String> res = input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}
