package lab2;

public class Descanso {

    private int horasDescanso = 1;
    private int numeroSemanas = 1;
    private String statusGeral = "cansado";


    public Descanso(){

    }

    public void defineHorasDescanso(int valor){

        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor){

        this.numeroSemanas = valor;

    }

    public String getStatusGeral(){


        if ((this.horasDescanso / this.numeroSemanas) >= 26) {

            this.statusGeral = "descansado";

        }

        return this.statusGeral;
    }

}
