public class Questao {
    // Atributos da classe
    private String pergunta;
    private String[] alternativas;
    private int respostaCorreta;

    // Construtor da classe
    public Questao(String pergunta, String[] alternativas, int respostaCorreta) {
        // Verificando se a resposta correta está dentro dos limites válidos
        if (respostaCorreta < 0 || respostaCorreta >= alternativas.length) {
            throw new IllegalArgumentException("Índice da resposta correta inválido.");
        }

        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    // Getter para obter a pergunta
    public String getPergunta() {
        return pergunta;
    }

    // Getter para obter as alternativas
    public String[] getAlternativas() {
        return alternativas;
    }