package system;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {


        CRUD crud = new CRUD();
        Scanner scanner = new Scanner(System.in);

        System.out.println("O que deseja fazer? \n");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Escolha opção:");
            System.out.println("[1] - Cadastrar pessoa");
            System.out.println("[2] - Atualizar pessoa");
            System.out.println("[3] - Ler pessoa");
            System.out.println("[4] - Excluir pessoa");
            System.out.println("[5] - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    crud.cadastrar();
                    break;
                case 2:
                    crud.atualizarCadastro();
                    break;
                case 3:
                    crud.lerPessoa();
                    break;
                case 4:
                    crud.excluir();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
