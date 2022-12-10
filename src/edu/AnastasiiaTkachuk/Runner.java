package edu.AnastasiiaTkachuk;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,2,4,2,1);
        String result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
