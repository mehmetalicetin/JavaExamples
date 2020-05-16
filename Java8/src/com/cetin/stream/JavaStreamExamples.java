package com.cetin.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExamples {
    public static void main(String[] args) throws IOException {
        //1. Integer Stream:
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();

        //2. Integer Stream with skip()
        IntStream.range(1, 10).skip(5).forEach(number -> System.out.print(number));
        System.out.println();

        //3. Integer Stream with sum()
        System.out.print(IntStream.range(1, 10).sum());
        System.out.println();

        //4. Stream.of, sorted and findfirst
        Object[] values = new Object[]{"Mehmet", "Ali", "Kazım", "Fatma"};
        Stream.of(values).sorted().findFirst().ifPresent(x -> System.out.println(x));
        System.out.println();

        //5.  Stream from Array, sort, filter and print
        String[] names = new String[]{"Ankit", "Al", "Kushal", "Brent", "Sarika"};
        Arrays.stream(names)        //same as Stream.of
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(x -> System.out.println(x));
        System.out.println();

        //6.  average of squares of an int array
        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        //7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans");
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
        System.out.println();

        //8. Stream rows from text file, sort, filter, and print
        Stream<String> bands = Files.lines(Paths.get("F:\\TrainingMyself\\gitLocalRepository\\Java8\\src\\com\\cetin\\resouces\\sample.txt"));
        bands.sorted()
                .filter(x -> x.length() > 50)
                .forEach(System.out::println);
        bands.close();
        System.out.println();

        //9. Stream rows from text file and save to list
        List<String> lines = Files.lines(Paths.get("F:\\TrainingMyself\\gitLocalRepository\\Java8\\src\\com\\cetin\\resouces\\sample.txt"))
                .filter(x -> x.contains("can"))
                .collect(Collectors.toList());
        lines.forEach(System.out::println);
        System.out.println();

        //10. Stream rows from csv file and count
        Stream<String> datas = Files.lines(Paths.get("F:\\TrainingMyself\\gitLocalRepository\\Java8\\src\\com\\cetin\\resouces\\data.csv"));
        long rowCount = datas.map(x -> x.split(","))
                .filter(x -> x.length >= 3).count();
        System.out.println(rowCount);
        datas.close();
        System.out.println();

        //11. Stream rows from csv file and parse data from rows
        Stream<String> datas2 = Files.lines(Paths.get("F:\\TrainingMyself\\gitLocalRepository\\Java8\\src\\com\\cetin\\resouces\\data.csv"));
        datas2.map(x -> x.split(","))
                .filter(x -> x.length >= 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "    " + x[1] + "     " + x[2]));
        datas2.close();

        //12. Stream rows from csv files, store fields in HashMap
        Stream<String> datas3 = Files.lines(Paths.get("F:\\TrainingMyself\\gitLocalRepository\\Java8\\src\\com\\cetin\\resouces\\data.csv"));
        Map<String, String> map = datas3.map(x -> x.split(","))
                .filter(x -> x.length >= 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(x -> x[0], x->x[1]));
        for (String key : map.keySet()) {
            System.out.println(key + "     " + map.get(key));
        }
        datas2.close();

        //13. Reduction - sum
        double total = Stream.of(7.1,8.5,7.7,4.5).reduce(0.0,(Double a, Double b)->a+b);
       // double total = Stream.of(7.1,8.5,7.7,4.5).reduce(0.0, Double::sum);
        System.out.println(total);

        //14. SummaryStatistic
        IntSummaryStatistics intSummaryStatistics = IntStream.of(1,8,9,10).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
