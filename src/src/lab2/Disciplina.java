package lab2;

import java.util.Arrays;

/**
 *  Classe responsável por gerenciar as notas e as horas de estudo de uma disciplina específica
 *  Por padrão uma disciplina tem 4 notas que são inicializadas como 0.0
 *  O aluno estará aprovado uma vez que a média das suas 4 notas resulte em 7.0 ou mais
 *
 * @ author Mateus Queiroz de Andrade
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    /**
     * Inicializa uma nova disciplina recebendo o nome da disciplina e definindo as 4 notas iniciais como 0.0.
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[]{0.0,0.0,0.0,0.0};
    }

    /**
     * Método que define um novo valor para horasEstudo.
     * @param horas valor que horasEstudo deve assumir
     */
    public void cadastraHoras(int horas) {

        this.horasEstudo = horas;

    }

    /**
     *  Método que define um novo valor para uma das quatro notas.
     * @param nota uma das notas de 1 a 4 que se deseja modificar o valor
     * @param ValorNota novo valor da nota selecionada
     */
    public void cadastraNota(int nota, double ValorNota) {

        notas[nota - 1] = ValorNota;
    }

    /**
     * Método que analisa a média do aluno e a sua situação de aprovação frente a disciplina.
     * @return true caso a média seja maior ou igual a 7.0, false caso contrário
     */
    public boolean aprovado() {

        double media = Media();

        if (media >= 7.0) {

            return true;
        } else {
            return false;
        }
    }

    /**
     * Método auxiliar para o cálculo da média das 4 notas
     * @return A média das notas
     */
    public double Media() {

        double media = 0.0;

        for (double nota : notas){
            media += nota;
        }

        media /= 4;

        return media;
    }

    /**
     *  Override do método toString
     *
     * @return o nome da disciplina em seguida as horas estudas, a media das notas e o valor de cada uma das notas
     */
    @Override
    public String toString(){
        double media = Media();
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + " " + Arrays.toString(notas);
    }

}
