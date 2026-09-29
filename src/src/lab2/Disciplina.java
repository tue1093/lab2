package lab2;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double nota1 = 0.0;
    private double nota2 = 0.0;
    private double nota3 = 0.0;
    private double nota4 = 0.0;

    public Disciplina(String nomeDisciplina){

        this.nomeDisciplina = nomeDisciplina;

    }

    public int cadastraHoras(int horas){

        this.horasEstudo = horas;

    }

    public void cadastraNotas(int nota,double ValorNota){

        if (nota == 1) {
            this.nota1 = nota;
        }
        if (nota == 2) {
            this.nota2 = nota;
        }
        if (nota == 3) {
            this.nota3 = nota;
        }
        if (nota == 4) {
            this.nota4 = nota;
        }

    }

    public boolean aprovado(){


    }

    public double Media(){

        double media = (nota1+nota2+nota3+nota4) / 4;

        return media;
    }

}
