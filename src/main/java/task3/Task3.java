package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        List<String> res = Arrays.stream(arr)
                .map(nameLine -> Arrays.asList(nameLine.split(", ")))
                .flatMap(l -> l.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("res = " + res);

    }


}
