package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

/* Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado
 * É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o consumer com expressão lambda para imprimir números pares
        /*Consumer<Integer> imprimmirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };*/
        
        numeros.stream().forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}
