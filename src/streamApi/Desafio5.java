package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        List<Integer> maiorQue5 = numeros.stream().filter(n -> n>5).collect(Collectors.toList());
        int mediaMaior5 = numeros.stream().filter(n -> n>5).reduce(0, somar) / maiorQue5.size();
        System.out.println(mediaMaior5);
    }
}
