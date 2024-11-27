import java.util.Scanner;

public class Questao {
    String pergunta;
    String[] alternativas;
    String correta;

    public Questao(String pergunta, String[] alternativas, String respostaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.correta = respostaCorreta;
    }

    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("Parabéns! Resposta Correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("Resposta inválida! Digite uma das opções válidas: A, B, C, D ou E.");
        return false;
    }

    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println("A. " + this.alternativas[0]);
        System.out.println("B. " + this.alternativas[1]);
        System.out.println("C. " + this.alternativas[2]);
        System.out.println("D. " + this.alternativas[3]);
        System.out.println("E. " + this.alternativas[4]);
        System.out.println();
    }
}
