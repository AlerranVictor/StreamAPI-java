package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {
    /*
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
     * É comumento usado para filtrar os elementos do Stream com base em alguma condição
     */
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "TypeScript", "JavaScript", "C", "C++", "Go");
        //Criar um predicate que verifica se a palavra tem mais de 5 caracteres
        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
        .filter(p -> p.length() > 5)
        .forEach(p -> System.out.println(p));
    }
}
