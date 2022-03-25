package com.goit.Task5;
/*

 Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
 который "перемешивает" элементы из стримов first и second, останавливается тогда,
 когда у одного из стримов закончатся элементы.

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task5Runner {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Piston", "Hub", "Shaft", "CrankShaft", "HeadBlock");
        List<String> list2 = Arrays.asList("Carburetor", "Injection", "Valve", "TimeBelt", "Bearing", "BrakePad", "BrakeDisk");
        zip(list2.stream(), list1.stream())
                .forEach(System.out::println);

    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        long size = Math.min(firstList.size(), secondList.size());
        List<T> mix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            mix.add(firstList.get(i));
            mix.add(secondList.get(i));
        }
        return mix.stream();
    }
}
