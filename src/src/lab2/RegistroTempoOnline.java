package lab2;

/**
 * Classe responsável por manter a informação sobre quantidade de horas de internet que o aluno tem dedicado a uma disciplina remota.
 *
 * @ author Mateus Queiroz de Andrade
 */
public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    /**
     * Inicializa um Novo registro de tempo online recebendo o nome da disciplina a ser monitorada e define por padrão o atributo tempoEsperado como 120.
     * @param nomeDisciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){

        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
    }

    /**
     * Inicializa um Novo registro de tempo online recebendo o nome da disciplina a ser monitorada e a quantidade de tempo esperado que deve-se dedicar a essa disciplina.
     * @param nomeDisciplina
     * @param tempoEsperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado){

        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
    }

    /**
     * Método que permite adicionar uma quantidade de tempo ao atributo tempoInvestidoOnline referente ao tempo dedicado a disciplina.
     * @param tempo tempo adicional a ser somado ao total de tempo investido online
     */
    public void adicionaTempoOnline(int tempo){

        this.tempoInvestidoOnline += tempo;
    }

    /**
     * Método que confere se o Aluno atingiu o tempo online esperado pela disciplina
     * @return true se o tempo investido for maior ou igual ao tempo esperado, false caso contrário
     */
    public boolean atingiuMetaTempoOnline(){

        if (tempoInvestidoOnline >= tempoEsperado){

            return true;
        }
        return false;
    }

    /**
     * Override do método toString
     * @return retorna uma String com nome da disciplina + o tempo investido online pelo aluno / tempo esperado pela disciplina
     */
    @Override
    public String toString(){

        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoEsperado;

    }
}
