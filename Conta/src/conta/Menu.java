package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.Visualizar();
		c1.Sacar(12000.0f);
		c1.Visualizar();
		c1.Depositar(5000.0f);
		c1.Visualizar();

		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.Visualizar();
		cc1.Sacar(12000.0f);
		cc1.Visualizar();
		cc1.Depositar(5000.0f);
		cc1.Visualizar();

		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.Visualizar();
		cp1.Sacar(1000.0f);
		cp1.Visualizar();
		cp1.Depositar(5000.0f);
		cp1.Visualizar();

		int opcao;

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
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas");
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
