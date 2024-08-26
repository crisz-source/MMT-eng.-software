import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private List<Jogo> jogos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.menu();
    }

    public void menu() {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar novo jogo");
            System.out.println("2. Aplicar desconto no jogo");
            System.out.println("3. Aumentar preço do jogo");
            System.out.println("4. Atualizar classificação etária do jogo");
            System.out.println("5. Mostrar detalhes dos jogos");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarJogo();
                    break;
                case 2:
                    aplicarDesconto();
                    break;
                case 3:
                    aumentarPreco();
                    break;
                case 4:
                    atualizarClassificacao();
                    break;
                case 5:
                    mostrarDetalhes();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 6);
    }

    private void adicionarJogo() {
        System.out.print("Título do jogo: ");
        String titulo = scanner.nextLine();
        System.out.print("Classificação etária do jogo: ");
        String classificacaoEtaria = scanner.nextLine();
        System.out.print("Preço do jogo: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine();  

        Jogo jogo = new Jogo(titulo, classificacaoEtaria, preco);
        jogos.add(jogo);

        System.out.println("Jogo adicionado com sucesso!");
    }

    private void aplicarDesconto() {
        mostrarDetalhes();
        System.out.print("Escolha o índice do jogo para aplicar desconto: ");
        int indice = scanner.nextInt() - 1;
        System.out.print("Percentual de desconto: ");
        double percentual = scanner.nextDouble();
        scanner.nextLine();  

        if (indice >= 0 && indice < jogos.size()) {
            jogos.get(indice).aplicarDesconto(percentual);
            System.out.println("Desconto aplicado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void aumentarPreco() {
        mostrarDetalhes();
        System.out.print("Escolha o índice do jogo para aumentar o preço: ");
        int indice = scanner.nextInt() - 1;
        System.out.print("Percentual de aumento: ");
        double percentual = scanner.nextDouble();
        scanner.nextLine();  

        if (indice >= 0 && indice < jogos.size()) {
            jogos.get(indice).aumentarPreco(percentual);
            System.out.println("Preço aumentado com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void atualizarClassificacao() {
        mostrarDetalhes();
        System.out.print("Escolha o índice do jogo para atualizar a classificação etária: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();  
        System.out.print("Nova classificação etária: ");
        String novaClassificacao = scanner.nextLine();

        if (indice >= 0 && indice < jogos.size()) {
            jogos.get(indice).atualizarClassificacao(novaClassificacao);
