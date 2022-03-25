package com.goit.Task4;
/*

 Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random.
 Реализуйте свой "линейный конгруэнтный генератор".
 Для этого начните с x[0] = seed и затем каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m, для корректных значений a, c, и m.
 Необходимо имплементировать метод, который принимает на вход параметрыa, c, m и seed и возвращает Stream<Long>.
 Для теста используйте данные a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).



  */
import java.util.stream.Stream;

public class Task4Runner {
    public static final long A = 25214903917L;
    public static final int C = 11;
    public static final long M =(long) 2^48;
    public static final long SEED = 0;

    public static void main(String[] args) {
        Generator generate = new Generator();
        generate.Gen(A, C, M, SEED).forEach(System.out::println);
    }
    static class Generator {
        public long x;
        public Stream<Long> Gen(long a, int c, long m, long seed) {
            x = seed;
            return (Stream<Long>) Stream.iterate(seed, n -> x = (long) Math.toIntExact((a * x + c) % m));
        }
    }
}
