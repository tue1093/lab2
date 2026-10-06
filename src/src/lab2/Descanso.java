package lab2;

public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;
    private String statusGeral;


    public Descanso() {
        this.horasDescanso = 1;
        this.numeroSemanas = 1;
        this.statusGeral = "cansado";
    }

    public void defineHorasDescanso(int valor) {

        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {

        this.numeroSemanas = valor;

    }

    public String getStatusGeral() {

        if ((this.horasDescanso / this.numeroSemanas) >= 26) {

            this.statusGeral = "descansado";

        } else {
            this.statusGeral = "cansado";

        }
        return this.statusGeral;
    }

}
