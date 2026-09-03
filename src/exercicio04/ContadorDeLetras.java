package exercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDeLetras {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase;
        char letra;

        System.out.println("Frase: ");
        frase = entrada.nextLine();

        for (int i=0; i< frase.length(); i++){
            letra = frase.charAt(i);

            if (Character.isLetter(letra)){

            }
        }
    }
}
