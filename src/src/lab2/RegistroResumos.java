package lab2;

import java.util.Arrays;

/**
 * Classe responsável pelo armazenamento dos resumos criados pelo aluno.
 * Armazena uma quantidade limitada de resumos.
 * A quantidade de resumos é definida pelo aluno.
 *
 * @ author Mateus Queiroz de Andrade
 */
public class RegistroResumos {

    private Resumo[] resumo;
    private int numResumos;

    /**
     * Inicializa um novo Registro para os resumos do aluno.
     * Define o numResumos com base no número inserido pelo aluno e cria um novo array com tamanho definido pelo número de Resumos
     * @param numeroDeResumos número máximo de resumos que podem ser adicionados ao registro
     */
    public RegistroResumos(int numeroDeResumos) {

        this.numResumos = numeroDeResumos;
        this.resumo = new Resumo[numeroDeResumos];
    }

    /**
     * Método responsável por passar pelo array de resumos e contar as posições que já foram preenchidas por resumos
     * @return total de posições já preenchidas com resumos
     */
    public int conta() {
        int total = 0;

        for (int i = 0; i < resumo.length; i++) {

            if (resumo[i] != null) {

                total++;
            }
        }

        return total;
    }

    /**
     * Método que adiciona um novo resumo ao array Resumos em uma posição que ainda não foi ocupada por um resumo e caso não tenha um resumo já cadastrado com o mesmo nome do novo adicionado.
     * @param tema do resumo
     * @param conteudo do resumo
     */
    public void adiciona(String tema, String conteudo) {

        if (temResumo(tema)){return;}

        for (int i = 0; i < resumo.length; i++) {

            if (resumo[i] == null) {
                Resumo r1 = new Resumo(tema,conteudo);
                resumo[i] = r1;
                break;
            }
        }
    }

    /**
     *  Método que gera um array com a formatação tema: resumo para cada resumo preenchido no array Resumos.
     * @return o array resumos com a formatação tema: resumo para cada resumo
     */
    public String[] pegaResumos() {

        String[] resumos = new String[resumo.length];

        for (int i = 0; i < resumo.length; i++) {

            if (resumo[i] != null) {

                resumos[i] = resumo[i].getTema() + ": " + resumo[i].getConteudo();
            }
        }
        return resumos;
    }

    /**
     *  Método que imprime a quantidade de resumos cadastrados e na linha seguinte os temas dos resumos cadastrados.
     * @return uma String contendo a quantidade de resumos cadastrados e na linha seguinte os temas dos resumos cadastrados.
     */
    public String imprimeResumos() {

        return "- " + conta() + " resumo(s) cadastrado(s)\n" + montaListaTemas();
    }

    /**
     * Método que percorre o array Resumos buscando por um tema informado pelo aluno.
     * @param temaBuscado
     * @return true caso exista um resumo com esse tema informado, false caso contrário
     */
    public boolean temResumo(String temaBuscado){

        for (int i = 0; i < conta(); i++){

            if (resumo[i].getTema().equals(temaBuscado)){

                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveBusca) {
        int quantidadeTemasComChave = 0;
        String chaveLower = chaveBusca.toLowerCase();
        String[] temasComChave;

        for (int i = 0; i < conta(); i++) {

            if (resumo[i].getConteudo().toLowerCase().contains(chaveLower)) {

                quantidadeTemasComChave += 1;
            }
        }
        temasComChave = new String[quantidadeTemasComChave];

        for (int i = 0; i < quantidadeTemasComChave;i++){

            if (resumo[i].getConteudo().toLowerCase().contains(chaveLower)) {

                temasComChave[i] = resumo[i].getTema();
                }
            }

        Arrays.sort(temasComChave);
        return temasComChave;
    }

    /**
     *  Método auxiliar para montar uma String com os temas dos resumos cadastrados.
     * @return String montada com a formatação - resumo1 | resumo2
     */
    private String montaListaTemas(){
        String frase = "- ";
        for (int i = 0; i < conta(); i++ ){

            if (i == 0){

                frase += resumo[i].getTema();
            } else {
                frase += " | " + resumo[i].getTema();
            }
        }
        return frase;
    }
}
