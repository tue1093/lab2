package lab2;

/**
 * Classe responsável por armazenar o tema e o conteúdo inserido pelo aluno para compor um resumo
 *
 * @ author Mateus Queiroz de Andrade
 */
public class Resumo {
    
    private String tema;
    private String conteudo;

    /**
     * Inicializa um novo Resumo com o tema e o conteúdo informados pelo aluno.
     * @param tema
     * @param conteudo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Método que retorna o tema do resumo criado.
     * @return tema do resumo
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Método que retorna o contéudo do resumo criado.
     * @return conteúdo do resumo
     */
    public String getConteudo(){
        
     return this.conteudo;   

    }
}
