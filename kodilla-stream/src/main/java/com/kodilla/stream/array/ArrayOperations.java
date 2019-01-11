package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));
       IntStream intStream = IntStream.of(numbers);
       OptionalDouble average = intStream.average();
                System.out.println(average.orElse(-1));
        return average;
                //=(IntStream.of(numbers).average.orElse(-1));
    }

}