import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("Faculdade XYZ");
        System.out.println("Aluno: Seu Nome Completo");
        System.out.println("Professor: Nome do Professor");
        System.out.println("Bem-vindo ao quiz sobre vida acadêmica! Você responderá 15 perguntas de múltipla escolha.");

        // Criar perguntas
        Questao[] questoes = new Questao[15];

        questoes[0] = new Questao("Qual é a duração média de um curso de graduação?",
                new String[]{"2 anos", "3 anos", "4 anos", "5 anos", "6 anos"}, 2);
        questoes[1] = new Questao("O que é um TCC?",
                new String[]{"Trabalho de Conclusão de Curso", "Teste de Competência Científica", "Trabalho de Convivência Coletiva", "Técnica de Comunicação Clara", "Treinamento de Capacidade Criativa"}, 0);
        // Adicione mais 13 perguntas aqui...

        // Exemplo de outras perguntas
        questoes[2] = new Questao("Qual é a importância do estágio?",
                new String[]{"Experiência prática", "Aumento de notas", "Apenas um requisito", "Não é importante", "Para fazer amigos"}, 0);
        questoes[3] = new Questao("O que é um edital?",
                new String[]{"Um documento de convocação", "Uma lista de livros", "Um calendário de aulas", "Um formulário de inscrição", "Um manual de alunos"}, 0);
        questoes[4] = new Questao("Como funciona a seleção de disciplinas?",
                new String[]{"Livre escolha", "Definido por professores", "Baseado em notas", "Somente obrigatórias", "Não há seleção"}, 1);
        questoes[5] = new Questao("O que é um currículo?",
                new String[]{"Um documento de habilidades", "Uma lista de amigos", "Um livro de receitas", "Uma apostila", "Um teste"}, 0);
        questoes[6] = new Questao("O que significa a sigla 'PUC'?",
                new String[]{"Pontifícia Universidade Católica", "Public University of College", "Pública Universidade de Ciências", "Professores Universitários de Curta", "Programa Universitário Compulsório"}, 0);
        questoes[7] = new Questao("O que são disciplinas eletivas?",
                new String[]{"Obrigações", "Disciplinas opcionais", "Matérias de férias", "Apenas práticas", "Não existem"}, 1);
        questoes[8] = new Questao("O que é uma pós-graduação?",
                new String[]{"Curso após a graduação", "Curso de férias", "Curso de inglês", "Curso para professores", "Curso de verão"}, 0);
        questoes[9] = new Questao("Qual é a função de um professor?",
                new String[]{"Ensinar", "Avaliar", "Aconselhar", "Pesquisador", "Todas as anteriores"}, 4);
        questoes[10] = new Questao("O que é uma banca examinadora?",
                new String[]{"Grupo de avaliação", "Conjunto de alunos", "Grupo de pesquisa", "Comissão de festas", "Nenhuma das anteriores"}, 0);
        questoes[11] = new Questao("O que é um calendário acadêmico?",
                new String[]{"Datas importantes", "Livros disponíveis", "Testes", "Horários de aula", "Notícias"}, 0);
        questoes[12] = new Questao("Qual é a função da coordenação de curso?",
                new String[]{"Administrar o curso", "Dar aulas", "Fazer provas", "Organizar festas", "Criar disciplinas"}, 0);
        questoes[13] = new Questao("O que é um semestre letivo?",
                new String[]{"Período de aulas", "Período de férias", "Tempo para provas", "Prazo de estágio", "Nenhuma das anteriores"}, 0);
        questoes[14] = new Questao("O que é a matrícula?",
                new String[]{"Inscrição em disciplinas", "Pagamento de mensalidade", "Inscrição em estágios", "Compra de livros", "Participação em eventos"}, 0);

        // Variáveis para contagem de acertos e erros
        int acertos = 0;
        int erros = 0;

        // Loop pelas questões
        for (Questao questao : questoes) {
            System.out.println("\n" + questao.getPergunta());
            String[] alternativas = questao.getAlternativas();
            for (int i = 0; i < alternativas.length; i++) {
                System.out.println((i + 1) + ". " + alternativas[i]);
            }

            // Ler resposta do usuário
            System.out.print("Digite o número da sua resposta: ");
            int resposta = scanner.nextInt() - 1;

            // Verificar resposta
            if (questao.verificarResposta(resposta)) {
                acertos++;
                System.out.println("Resposta correta!");
            } else {
                erros++;
                System.out.println("Resposta incorreta.");
            }
        }

        // Resultados finais
        System.out.println("\nVocê acertou " + acertos + " questões e errou " + erros + " questões.");
        double porcentagem = (acertos / 15.0) * 100;
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        scanner.close();
    }
}
