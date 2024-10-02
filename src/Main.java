
public class Main {
    public static void main(String[] args) {
        Aluno aluno =
                new Aluno("12345",
                        20.0);

        System.out.println("Matricula: "
                + aluno.getMatricula()
                + " Nota: " + aluno.getNota());
        System.out.println(aluno);

    }
}