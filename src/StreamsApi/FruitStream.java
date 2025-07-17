package StreamsApi;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitStream {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Grape","Fig", "PineApple","Apple","Grape","Fig", "PineApple");

        List<String> fr =  fruits.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(e ->e.getValue()>1).toList()
                .stream().map(Entry::getKey).toList();

        String result = fr.stream()
                .min(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println(result);

        String s = fruits.stream().distinct().min(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(s);

        List<String> list = fruits.stream().distinct().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list);
    }
}
