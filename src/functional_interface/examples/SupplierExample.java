package functional_interface.examples;

//Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//É comumente usada para criar ou fornecer novos objetos de um determinado tipo

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, bem-vindo!";

        //Usar o supplier para obter uma lista com 5 saudações
        //List<String> listaSaudacoes = Stream.generate(saudacao)
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
        .limit(5)
        .collect(Collectors.toList());

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
    }

}
