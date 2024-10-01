public class Aluno {
    private String matricula;
    private double nota;

    public Aluno(String matricula,
                 double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}
