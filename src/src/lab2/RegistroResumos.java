package lab2;

public class RegistroResumos {

    private String[] temas;
    private String[] conteudos;

    public RegistroResumos(int numeroDeResumos) {

        temas = new String[numeroDeResumos];
        conteudos = new String[numeroDeResumos];

    }

    public void adicionaResumo(String tema, String conteudo) {

        for (String t : temas) {

            if (t != null) {
                t = tema;
                break;
            }
        }
        for (String c : conteudos) {

            if (c != null) {
                c = conteudo;
                break;
            }
        }
    }

    public String[] pegaResumos(){

        String[] resumos = new String[temas.length];

        for (int i = 0; i < temas.length; i++){

            resumos[i] = temas[i] + ": " + conteudos[i];

        }

        return resumos;
    }

    public void exibeResumosCadastrados(){

        

    }
}

