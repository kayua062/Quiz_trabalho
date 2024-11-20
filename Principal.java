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
        questoes[0] = new Questao("Qual é a parte do skate que fica em contato com o chão?",
                new String[]{"Deck", "Trucks", "Rodas", "Lixa", "Rolamentos"}, 0);
        questoes[1] = new Questao("O que são os 'trucks' de um skate?",
                new String[]{"Rodas", "Pneus", "Eixos do skate", "Peças de madeira", "Suporte da lixa"}, 2);
        questoes[2] = new Questao("Qual o material mais comum utilizado para a fabricação do deck de skate?",
                new String[]{"Madeira", "Plástico", "Alumínio", "Fibra de carbono", "Aço inoxidável"}, 0);
        questoes[3] = new Questao("Qual é a função das rodas de skate?",
                new String[]{"Garantir a aderência", "Garantir a velocidade", "Fazer o skate deslizar", "Apoiar o deck", "Proteger o eixo"}, 2);
        questoes[4] = new Questao("Qual o tamanho médio das rodas de skate?",
                new String[]{"35mm", "50mm a 54mm", "60mm a 65mm", "70mm", "80mm"}, 1);
        questoes[5] = new Questao("O que é a lixa de um skate?",
                new String[]{"Peça que dá aderência para os pés", "Peça que dá suporte aos trucks", "Material que garante a durabilidade das rodas", "Peça decorativa", "Superfície do deck"}, 0);
        questoes[6] = new Questao("O que é um 'grip tape'?",
                new String[]{"A lixa do skate", "A madeira do deck", "A roda do skate", "Os parafusos do trucks", "A tinta do deck"}, 0);
        questoes[7] = new Questao("Qual é a principal função dos rolamentos no skate?",
                new String[]{"Proteger as rodas", "Aumentar a velocidade", "Garantir o atrito", "Controlar a direção", "Sustentar o deck"}, 1);
        questoes[8] = new Questao("O que significa a sigla 'ABEC' nos rolamentos de skate?",
                new String[]{"É a marca dos rolamentos", "É uma classificação de precisão", "É a forma do rolamento", "É o nome do inventor", "Não tem significado"}, 1);
        questoes[9] = new Questao("O que é um 'kicktail' no skate?",
                new String[]{"Parte da roda", "Parte do deck com curvatura para manobras", "Peça do truck", "O tipo de lixa", "O rolamento do skate"}, 1);
        questoes[10] = new Questao("Qual é a origem do skate?",
                new String[]{"EUA", "Brasil", "França", "Japão", "México"}, 0);
        questoes[11] = new Questao("Qual é o nome da famosa manobra de skate onde o skatista dá um salto e gira o deck 180 graus?",
                new String[]{"Ollie", "Kickflip", "Heelflip", "Pop Shuvit", "Manual"}, 0);