public class EmpregadoTeste {

	public static void main(String[] args){
		Empregado chefe = new Empregado("José", "da Silva", 10000);
		Empregado gerente = new Empregado("Maria", "Sousa", 4000);

		System.out.print("Mostrando o salário anual dos empregados:\n");
		System.out.printf("Salário anual do %s é %.2f.%n", chefe.getPrimeiroNome(), chefe.getSalarioMensal()*12);
		System.out.printf("Salário anual do %s é %.2f.%n", gerente.getPrimeiroNome(), gerente.getSalarioMensal()*12);

		System.out.print("Aumentando em 10% os salários dos empregados ...\n");

		chefe.setSalarioMensal(chefe.getSalarioMensal() * 1.1);
		gerente.setSalarioMensal(gerente.getSalarioMensal() * 1.1);

		System.out.print("Mostrando o salário anual dos empregados:\n");
		System.out.printf("Salário anual do %s é %.2f.%n", chefe.getPrimeiroNome(), chefe.getSalarioMensal()*12);
		System.out.printf("Salário anual do %s é %.2f.%n", gerente.getPrimeiroNome(), gerente.getSalarioMensal()*12);

	}

}
