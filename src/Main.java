/*Adaptar a classe Account para armazenar o saldo da conta. Sua
classe deve ter um construtor que recebe um nome e um saldo
inicial e o construtor deve validar se o saldo inicial é maior ou
igual a 0. Caso o saldo inicial do construtor seja negativo,
inicializar o saldo com 0. Você também deve criar um método
para fazer um depósito de forma que o depósito só seja
efetivado se for válido, ou seja, se o depósito for maior que 0.
Além disso, você deve criar um método get para recuperar o
saldo. Em seguida, crie uma classe como programa principal
para usar a classe Account com valores válidos e inválidos de
saldo.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner inputStrings = new Scanner(System.in);
		Scanner input = new Scanner(System.in);


		System.out.print("-- Criando a conta do cliente 1 --\n");
		System.out.print("Digite o nome do cliente 1: ");
		Conta cliente = new Conta(inputStrings.nextLine(), -10);

		System.out.print(" -- Conta do cliente 1 criada: --\n");

		System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());

		System.out.print("-- Criando a conta do cliente 2 --\n");
		System.out.print("Digite o nome do cliente 2: ");
		Conta cliente2 = new Conta(inputStrings.nextLine(), 100);

		System.out.print(" -- Conta do cliente 2 criada: --\n");
		System.out.printf("Nome do cliente 2: %s%n", cliente2.getName());
		System.out.printf("Saldo do cliente 2: %.2f%n", cliente2.getSaldo());


		System.out.print(" -- Operações de depósito --\n");
		System.out.print("Cliente 1 fazendo um depósito ...\n");
		cliente.deposito(50.60);

		System.out.print("Cliente 2 fazendo um depósito ...\n");
		cliente2.deposito(-10);

		System.out.print(" -- Contas depois dos depósitos --\n");
		System.out.printf("Nome do cliente 1: %s%n", cliente.getName());
		System.out.printf("Saldo do cliente 1: %.2f%n", cliente.getSaldo());

		System.out.printf("Nome do cliente 2: %s%n", cliente2.getName());
		System.out.printf("Saldo do cliente 2: %.2f%n", cliente2.getSaldo());

	}
}

