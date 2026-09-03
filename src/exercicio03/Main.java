package exercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer, Aluno> lista = new HashMap<>();

        lista.put(10, new Aluno(10,"Selmini"));
        lista.put(20, new Aluno(20,"Age"));
        lista.put(30, new Aluno(30,"Patricia"));
        lista.put(40, new Aluno(40,"Ismael"));

        lista.forEach((integer, aluno) -> {
            System.out.println(aluno);
        });

        for (Map.Entry<Integer>, Aluno item: lista.entrySet()){
            System.out.println("Chave: " + item.getKey() + " | " + item.getValue);
        }
    }
}
