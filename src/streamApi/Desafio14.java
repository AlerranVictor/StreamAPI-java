package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> maiorPrimo = numeros.stream()
        .distinct()
        .sorted((a, b) -> b - a)
        .filter(Desafio14::isPrimo)
        .findFirst();

        if(maiorPrimo.isPresent()){
            System.out.println("O número " + maiorPrimo.get() + " é o maior primo");
        } else{
            System.out.println("Não há números primos");
        }
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
