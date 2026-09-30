package lab2;

import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = {0.0,0.0,0.0,0.0};


    public Disciplina(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;

    }

    public void cadastraHoras(int horas) {

        this.horasEstudo = horas;

    }

    public void cadastraNota(int nota, double ValorNota) {

        notas[nota - 1] = ValorNota;
    }
    public boolean aprovado() {

        double media = Media();

        if (media > 7.0) {

            return true;
        } else {
            return false;
        }

    }
    public double Media() {

        double media = 0.0;

        for (double nota : notas){
            media += nota;
        }

        media /= 4;

        return media;
    }

    @Override
    public String toString(){
        double media = Media();
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(notas);
    }

}
