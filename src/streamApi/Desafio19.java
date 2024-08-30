package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer somaMultiplos3e5 = numeros.stream()
        .distinct()
        .filter(n -> n%3==0 || n%5==0)
        .reduce(0, (a, b) -> a + b);

        System.out.println(somaMultiplos3e5);
    }
}
