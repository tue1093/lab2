package lab2;

public class RegistroResumos {

    private Resumo[] Resumo;
    private int numResumos;

    public RegistroResumos(int numeroDeResumos) {

        this.numResumos = numeroDeResumos;
        this.Resumo = new Resumo[numeroDeResumos];
    }

    public int conta() {
        int total = 0;

        for (int i = 0; i < Resumo.length; i++) {

            if (Resumo[i] != null) {

                total++;
            }
        }

        return total;
    }

    public void adiciona(String tema, String conteudo) {

        if (temResumo(tema)){return;}

        for (int i = 0; i < Resumo.length; i++) {

            if (Resumo[i] == null) {
                Resumo r1 = new Resumo(tema,conteudo);
                Resumo[i] = r1;
                break;
            }
        }
    }

    public String[] pegaResumos() {

        String[] resumos = new String[Resumo.length];

        for (int i = 0; i < Resumo.length; i++) {

            if (Resumo[i] != null) {

                resumos[i] = Resumo[i].getTema() + ": " + Resumo[i].getConteudo();
            }
        }
        return resumos;
    }

    public String imprimeResumos() {

        return "- " + conta() + " resumo(s) cadastrado(s)\n" + montaListaTemas();
    }

    public boolean temResumo(String temaBuscado){

        for (int i = 0; i < conta(); i++){

            if (Resumo[i].getTema().equals(temaBuscado)){

                return true;
            }
        }
        return false;
    }
    private String montaListaTemas(){
        String frase = "- ";
        for (int i = 0; i < conta(); i++ ){

            if (i == 0){

                frase += Resumo[i].getTema();
            } else {
                frase += " | " + Resumo[i].getTema();
            }
        }
        return frase;
    }
}
