package lab2;

/**
 * A classe Descanso serve para acompanhar a rotina de descanso de um aluno
 * Ele deve descansar 26 horas ou mais por semana para estar descansado
 * O aluno começa cansado
 *
 * @author Mateus Queiroz de Andrade
 */
public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;
    private String statusGeral;

    /**
     * Inicializa o objeto da classe descanso, definindo os atributos horasDescanso e numeroSemanas como 1 e o statusGeral como "cansado"
     */
    public Descanso() {
        this.horasDescanso = 1;
        this.numeroSemanas = 1;
        this.statusGeral = "cansado";
    }

    /**
     * Método que define uma nova quantidade de horas descansadas
     * @param valor que o atributo horasDescanso deve assumir
     */
    public void defineHorasDescanso(int valor) {

        this.horasDescanso = valor;
    }

    /**
     * Método que define um novo número de semanas
     * @param valor que o atributo numeroSemanas deve assumir
     */
    public void defineNumeroSemanas(int valor) {

        this.numeroSemanas = valor;

    }

    /**
     * Método que modifica o atributo statusGeral para descansado caso o aluno tenha cumprido as 26 horas semanais necessárias.
     * @return o statusGeral do aluno, descansado ou cansado
     */
    public String getStatusGeral() { // modifica o atributo statusGeral para descansado caso o aluno tenha cumprido as 26 horas semanais necessarias.

        if ((this.horasDescanso / this.numeroSemanas) >= 26) {

            this.statusGeral = "descansado";

        } else {
            this.statusGeral = "cansado";

        }
        return this.statusGeral;
    }

}
