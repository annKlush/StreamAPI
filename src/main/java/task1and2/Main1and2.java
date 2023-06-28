package task1and2;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main1and2 {
    public static void main(String[] args) {
        String[] nam = {"John", "Bill", "Hanna", "Den", "Nicola", "Vika", "Sophi"};
        System.out.println(Arrays.toString(nam));
        Task1 task1 = new Task1();
        task1.everyThirdElem(nam);

        System.out.println("Upper case, sorted from Z to A:");
        Arrays.asList("John", "Bill", "Hanna", "Den", "Nicola", "Vika", "Sophi")
                .stream()
                .sorted(Collections.reverseOrder())
                .map(name -> name.toUpperCase())
                .peek(e -> System.out.print(e + " "))
                .collect(Collectors.toList());
    }
}
