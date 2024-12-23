import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("Alfredo Nasser");
        System.out.println("Aluno: Kayuã Dias Gomes");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz sobre Skate e Acessórios! Você responderá 15 perguntas de múltipla escolha.");

        // Criar perguntas
        Questao[] questoes = new Questao[15];

        // Definição das perguntas sobre Skate
        questoes[0] = new Questao("1- Qual é a parte do skate que fica em contato com o chão?",
                new String[]{"Deck", "Trucks", "Rodas", "Lixa", "Rolamentos"}, "A");
        questoes[1] = new Questao("2- O que são os 'trucks' de um skate?",
                new String[]{"Rodas", "Pneus", "Eixos do skate", "Peças de madeira", "Suporte da lixa"}, "C");
        questoes[2] = new Questao("3- Qual o material mais comum utilizado para a fabricação do deck de skate?",
                new String[]{"Madeira", "Plástico", "Alumínio", "Fibra de carbono", "Aço inoxidável"}, "A");
        questoes[3] = new Questao("4- Qual é a função das rodas de skate?",
                new String[]{"Garantir a aderência", "Garantir a velocidade", "Fazer o skate deslizar", "Apoiar o deck", "Proteger o eixo"}, "C");
        questoes[4] = new Questao("5- Qual o tamanho médio das rodas de skate?",
                new String[]{"35mm", "50mm a 54mm", "60mm a 65mm", "70mm", "80mm"}, "B");
        questoes[5] = new Questao("6- O que é a lixa de um skate?",
                new String[]{"Peça que dá aderência para os pés", "Peça que dá suporte aos trucks", "Material que garante a durabilidade das rodas", "Peça decorativa", "Superfície do deck"}, "A");
        questoes[6] = new Questao("7- O que é um 'grip tape'?",
                new String[]{"A lixa do skate", "A madeira do deck", "A roda do skate", "Os parafusos do trucks", "A tinta do deck"}, "A");
        questoes[7] = new Questao("8- Qual é a principal função dos rolamentos no skate?",
                new String[]{"Proteger as rodas", "Aumentar a velocidade", "Garantir o atrito", "Controlar a direção", "Sustentar o deck"}, "B");
        questoes[8] = new Questao("9- O que significa a sigla 'ABEC' nos rolamentos de skate?",
                new String[]{"É a marca dos rolamentos", "É uma classificação de precisão", "É a forma do rolamento", "É o nome do inventor", "Não tem significado"}, "B");
        questoes[9] = new Questao("10- O que é um 'kicktail' no skate?",
                new String[]{"Parte da roda", "Parte do deck com curvatura para manobras", "Peça do truck", "O tipo de lixa", "O rolamento do skate"}, "B");
        questoes[10] = new Questao("11- Qual é a origem do skate?",
                new String[]{"EUA", "Brasil", "França", "Japão", "México"}, "A");
        questoes[11] = new Questao("12- Qual é o nome da famosa manobra de skate onde o skatista dá um salto e gira o deck 180 graus?",
                new String[]{"Ollie", "Kickflip", "Heelflip", "Pop Shuvit", "Manual"}, "A");
        questoes[12] = new Questao("13- O que são os 'risers' de skate?",
                new String[]{"Pedaços de madeira que protegem o deck", "Espaçadores para as rodas", "Espaçadores entre o truck e o deck", "Proteção para as rolamentos", "Rodas de reserva"}, "C");
        questoes[13] = new Questao("14- Qual é a função de um 'bearings spacer'?",
                new String[]{"Ajustar a lixa", "Espaçar as rodas do truck", "Ajustar o tamanho das rodas", "Ajustar o tamanho do deck", "Aumentar a velocidade do skate"}, "B");
        questoes[14] = new Questao("15- Qual é o nome da peça responsável por conectar as rodas aos trucks?",
                new String[]{"Eixo", "Pino", "Parafuso", "Ponte", "Base plate"}, "A");

        int pontuacao = 0;

        // Loop para fazer as perguntas
        for (Questao questoe : questoes) {
            questoe.escrevaQuestao();
            String resposta = questoe.leiaResposta();

            // Verificando se a resposta está correta
            if (questoe.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        // Exibindo a pontuação final
        System.out.println("\nQuiz finalizado!");
        System.out.println("Sua pontuação final é: " + pontuacao + " de " + questoes.length);

        // Calculando a porcentagem de acertos
        double porcentagem = ((double) pontuacao / questoes.length) * 100;
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        scanner.close();
    }
}
