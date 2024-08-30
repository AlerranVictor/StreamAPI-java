package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3); 
        List<Integer> totalCaracteres = numeros.stream().map(n -> n.toString().length()).collect(Collectors.toList());
        Integer somaCaracteres = totalCaracteres.stream().reduce(0, (a, b) -> a+b);
        System.out.println(somaCaracteres);
    }
}
