public class Aluno {
    private String matricula;
    private double nota;

    public Aluno(String matricula,
                 double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    // retorna o valor da matricula
    public String getMatricula() {
        return matricula;
    }

    // retorna o valor da nota
    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }

    public boolean compararNota(Aluno novoAluno) {
        return novoAluno.nota > nota;
    }
}
