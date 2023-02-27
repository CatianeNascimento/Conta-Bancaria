package conta;

import java.util.Scanner;

import conta.util.Cores;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ContaController contas = new ContaController();

		
		int opcao, numero, agencia, tipo, aniversario;
		String titular; 
		float saldo, limite;
		
		System.out.println("Criar Contas");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "Catiane Souza", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Graziele Maria", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 126, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "--------------------------------------------------");
			System.out.println("                                                  ");
			System.out.println("           BANCO DO BRAZIL COM Z                  ");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			System.out.println("   1 - Criar Conta                                ");
			System.out.println("   2 - Listar todas as contas                     ");
			System.out.println("   3 - Buscar Conta por Número                    ");
			System.out.println("   4 - Atualizar Dados da Conta                   ");
			System.out.println("   5 - Apagar Conta                               ");
			System.out.println("   6 - Sacar                                      ");
			System.out.println("   7 - Depositar                                  ");
			System.out.println("   8 - Transferir valores entre Contas           ");
			System.out.println("   9 - Sair                                       ");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			System.out.println("Entre com a opção desejada                        ");
			System.out.println("                                                  " + Cores.TEXT_RESET);
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta");
				
				System.out.println("Digite o número da Agência: ");
				agencia = input.nextInt();
				System.out.println("Digite o nome do Titular: ");
				input.skip("\\R");
				titular = input.nextLine();
				
				do {
					System.out.println("Digite o tipo de Conta (1-CC ou 2-CP): ");
					tipo = input.nextInt();
				} while (tipo < 1 && tipo > 2);
				
				System.out.println("Digite o saldo da Conta (R$): ");
				saldo = input.nextFloat();
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = input.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo,
							titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Digite o dia do Aniversário da Conta: ");
					aniversario = input.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo,
							titular, saldo, aniversario));
				}
				}
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas");
				contas.listarTodas();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número");
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta");
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Conta");
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque");
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Déposito");
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas");
				break;

			case 9:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Banco do Brazil com Z - O seu futuro começa aqui");
				input.close();
				System.exit(0);
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Inválida");
				break;
			}

		}

	}

}
