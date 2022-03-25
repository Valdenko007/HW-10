package com.goit.Task1;
/*

 Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...",
 с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).

 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1Runner {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Kolya", "Vitya", "Misha", "Grisha", "Oksana", "Sasha", "Masha");

        String res = input.stream()
                .filter(element -> input.indexOf(element) % 2 == 0)
                .map(element -> (input.indexOf(element)+1) + ". " + element)
                .collect(Collectors.joining(", ", "Names are: ", "."));

        System.out.println(res);
    }
}
