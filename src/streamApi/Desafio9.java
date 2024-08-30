package streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        long totalUnicos = numeros.stream().distinct().count();
        if(numeros.size() == totalUnicos){
            System.out.println("Não há repetições na lista");
        } else{
            System.out.println("Há números repetidos na lista");
        }
    }
}
