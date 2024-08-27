package functional_interface.examples;

//Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos

public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        //Usar a function com a expressão lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;
        //Usar a função para dobrar todos os elementos no Stream e armazená-los em outra lista
        /*List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());*/

        List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n*2)
        .collect(Collectors.toList());

        numerosDobrados.forEach(s -> System.out.println(s));
    }
}
