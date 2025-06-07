package Model;

public class Aluno {
    public String nome;
    public double altura;
    public int anoMatricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }

    public void setAnoMatricula(int anoMatricula) {
        this.anoMatricula = anoMatricula;
    }

    public void estudar(){
        System.out.println(nome + " está revisando conteúdos desde " + anoMatricula + "...");
    }
}
