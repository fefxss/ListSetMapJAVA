package exercicio01;

public class Candidato {
    private String nome;
    private double notaTecnica;
    private int anosExperiencia;

    public Candidato(String nome, double notaTecnica, int anosExperiencia) {
        this.nome = nome;
        this.notaTecnica = notaTecnica;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(int notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public double getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(double anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}
