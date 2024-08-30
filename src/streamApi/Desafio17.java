package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPrimos = numeros.stream()
        .distinct()
        .filter(Desafio17::isPrimo)
        .collect(Collectors.toList());

        System.out.println(numerosPrimos);
        
    }

    private static boolean isPrimo(int n){
        boolean resposta = false;
        if(n>=2){
            for(int i = 2; i <=n; i++){
                if(n%i ==0 && i<n){
                    break;
                } else{
                    if(i==n){
                        resposta = true;
                    }
                }
            }
        }
        return resposta;
    }
}
