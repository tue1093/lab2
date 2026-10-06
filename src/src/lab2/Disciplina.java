package lab2;

import java.util.Arrays;

/**
 *  Classe responsavel por gerenciar as notas e as horas de estudo de uma disciplina especifica
 *  Por padrão uma disciplina tem 4 notas que são inicializadas como 0.0
 *  O aluno estará aprovado uma vez que a media das suas 4 notas resulte em 7.0 ou mais
 *
 * @ author Mateus Queiroz de Andrade
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    /**
     * Inicializa uma nova disciplina
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[]{0.0,0.0,0.0,0.0};
    }

    public void cadastraHoras(int horas) {

        this.horasEstudo = horas;

    }

    public void cadastraNota(int nota, double ValorNota) {

        notas[nota - 1] = ValorNota;
    }
    public boolean aprovado() {

        double media = Media();

        if (media >= 7.0) {

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
