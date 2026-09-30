package lab2;

public class RegistroResumos {

    private String[] temas;
    private String[] conteudos;

    public RegistroResumos(int numeroDeResumos) {

        temas = new String[numeroDeResumos];
        conteudos = new String[numeroDeResumos];

    }

    public int conta() {
        int total = 0;

        for (int i = 0; i < temas.length; i++) {

            if (temas[i] != null) {

                total++;
            }
        }

        return total;
    }

    public void adiciona(String tema, String conteudo) {

        for (int i = 0; i < temas.length; i++) {

            if (temas[i] == null) {
                temas[i] = tema;
                conteudos[i] = conteudo;
                break;
            }
        }
    }

    public String[] pegaResumos() {

        String[] resumos = new String[temas.length];

        for (int i = 0; i < temas.length; i++) {

            if (temas[i] != null || conteudos[i] != null) {

                resumos[i] = temas[i] + ": " + conteudos[i];
            }
        }
        return resumos;
    }

    public String imprimeResumos() {

        return "- " + conta() + " resumo(s) cadastrado(s)\n" + montaListaTemas();
    }

    public boolean temResumo(String temaBuscado){

        for (int i = 0; i < conta(); i++){

            if (temas[i].equals(temaBuscado)){

                return true;

            }

        }
        return false;
    }

    private String montaListaTemas(){
        String frase = "- ";
        for (int i = 0; i < conta(); i++ ){

            if (i == 0){

                frase += temas[i];
            } else {
                frase += " | " + temas[i];

            }

        }

        return frase;
    }

}

