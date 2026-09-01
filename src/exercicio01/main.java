package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {
    static void main() {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Selmini",6.6,20));
        lista.add(new Candidato("Patricia",5.9,16));
        lista.add(new Candidato("Antonio",7.2,10));
        lista.add(new Candidato("Maria",10,5));

        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica).reversed()
                .thenComparingInt(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome).reversed());

        System.out.println("Nome \t"+ "Nota técnica \t" + "Anos Experiencia \t");
        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
