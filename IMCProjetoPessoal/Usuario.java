package br.com.imc;

public class Usuario implements UsuarioInterface {
	private double peso;
	private double altura;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarResultado(double imc) {
		// TODO Auto-generated method stub
		if (imc < 18.5)
			return "Você está abaixo do peso.";
		else if (imc >= 18.5 && imc < 25)
			return "Você está dentro do peso ideal.";
		else if (imc >= 25 && imc < 30)
			return "Você está acima do peso.";
		else if (imc >= 30 && imc < 35)
			return "Você está com obesidade grau 1.";
		else if (imc >= 35 && imc < 40)
			return "Você está com obesidade grau 2.";
		else
			return "Você está com obesidade mórbida. Favor procurar ajuda médica URGENTE!";
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
