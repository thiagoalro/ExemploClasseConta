/*Crie uma classe Employee que inclui três atributos: um
primeiro nome (String), um último nome (String) e um
salário mensal (double). Forneça um construtor que inicializa
os três atributos. Forneça métodos set e get para cada atributo.
Se o salário mensal não for positivo, não inicialize o seu valor.
Escreva um programa EmployeeTest que demonstra as
capacidades da classe Employee. Crie dois objetos Employee e
mostre o salário anual de cada objeto. Depois dê a cada
empregado um aumento de 10% e mostre o salário anual dos
empregados novamente.
 */


public class Empregado {
	private String primeiroNome;
	private String ultimoNome;
	private double salarioMensal;

	public Empregado(String primeiroNome, String ultimoNome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;

		if (salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		} else {
			this.salarioMensal = 0;
		}
	}

	public String getPrimeiroNome(){
		return primeiroNome;
	}

	public void setPrimeiroNome(String novoPrimeiroNome){
		primeiroNome = novoPrimeiroNome;
	}

	public String getUltimoNome(){
		return ultimoNome;
	}

	public void setUltimoNome(String novoUltimoNome){
		ultimoNome = novoUltimoNome;
	}

	public void setSalarioMensal(double novoSalarioMensal){
		if (novoSalarioMensal > 0){
			salarioMensal = novoSalarioMensal;
		}
	}

	public double getSalarioMensal(){
		return salarioMensal;
	}

}
