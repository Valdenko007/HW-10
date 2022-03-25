package com.goit.Task3;
/*

 Дан массив:
 ["1, 2, 0", "4, 5"]
 Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть
 "0, 1, 2, 4, 5"

 */

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3Runner {
    public static void main(String[] args) {
        String[] input = new String[]{"1, 2, 0", "4, 5"};
        String result = Arrays.stream(input)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
        System.out.println(result);


    }
}
