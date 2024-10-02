public class Ficha {
    private Aluno alunoComMaiorNota;
    private Aluno alunoComSegundaMaiorNota;

    public void comparadorDeNotas(Aluno alunoNovo) {
        if (alunoComMaiorNota == null) {
            alunoComMaiorNota = alunoNovo;
        } else if (alunoComSegundaMaiorNota == null) {
            alunoComSegundaMaiorNota = alunoNovo;
        } else if( alunoComMaiorNota.compararNota(alunoNovo)) {
            Aluno alunoTemp = alunoComMaiorNota;
            alunoComMaiorNota = alunoNovo;
            if (alunoComSegundaMaiorNota.compararNota(alunoTemp)) {
                alunoComSegundaMaiorNota = alunoTemp;
            }
        } else if (alunoComSegundaMaiorNota.compararNota(alunoNovo)) {
            alunoComSegundaMaiorNota = alunoNovo;
        }
    }

}
