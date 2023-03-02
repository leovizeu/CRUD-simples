package system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class CRUD {

	private List<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrar() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome da pessoa a ser cadastrada: ");
		String nome = input.nextLine();
		
		System.out.println("Sobrenome da pessoa a ser cadastrada: ");
		String sobreNome = input.nextLine();
		
		System.out.println("Email da pessoa a ser cadastrada: ");
		String email = input.nextLine();
		
		System.out.println("RG da pessoa a ser cadastrada: ");
		int rg = input.nextInt();
		
		System.out.println("Data de nascimento da pessoa a ser cadastrada: ");
		int dataNascimento = input.nextInt();
		
		Pessoa cadastro = new Pessoa (nome, sobreNome, email, rg, dataNascimento);
		
		pessoas.add(cadastro);
		
	    System.out.println("\n");
	}
	
	public void atualizarCadastro() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o RG do cadastro a ser atualizado: ");
		int rg = input.nextInt();
		input.nextLine();
		
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getRg() == rg) {
				System.out.println("Informe novo Nome: ");
				String nome = input.nextLine();
				pessoa.setNome(nome);
				
				System.out.println("Informe novo Sobrenome: ");
				String sobreNome = input.nextLine();
				pessoa.setSobrenome(sobreNome);
				
				System.out.println("Informe novo Email: ");
				String email = input.nextLine();
				pessoa.setEmail(email);
				
				System.out.println("Informe nova Data de Nascimento: ");
				int dataNascimento = input.nextInt();
				pessoa.setDataNascimento(0);
			}
		}
		System.out.println("Pessoa não encontrada.");
		System.out.println("\n");
	}
	
	public void lerPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o RG da pessoa a ser lida:");
        int rg = input.nextInt();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Sobrenome: " + pessoa.getSobrenome());
                System.out.print("Email: " + pessoa.getEmail());
                System.out.println("\n");
                return;
            }

        }
        System.out.println("Pessoa não encontrada.");
        System.out.println("\n");
    }
	
	public void excluir() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o RG da pessoa a ser excluida:");
        int rg = scanner.nextInt();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getRg() == rg) {
                pessoas.remove(pessoa);
                System.out.print("Pessoa excluida com sucesso!");
                System.out.println("\n");
                return;
            }

        }
        System.out.println("Pessoa não encontrada.");
        System.out.println("\n");

    }

}
