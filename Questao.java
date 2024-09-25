public class Questao {
    private String pergunta;
    private String[] alternativas;
    private int alternativaCorreta;

    public Questao(String pergunta, String[] alternativas, int alternativaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getAlternativas() {
        return alternativas;
    }

    public boolean verificarResposta(int resposta) {
        return resposta == alternativaCorreta;
    }
}

