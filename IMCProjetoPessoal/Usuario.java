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
			return "Voc� est� abaixo do peso.";
		else if (imc >= 18.5 && imc < 25)
			return "Voc� est� dentro do peso ideal.";
		else if (imc >= 25 && imc < 30)
			return "Voc� est� acima do peso.";
		else if (imc >= 30 && imc < 35)
			return "Voc� est� com obesidade grau 1.";
		else if (imc >= 35 && imc < 40)
			return "Voc� est� com obesidade grau 2.";
		else
			return "Voc� est� com obesidade m�rbida. Favor procurar ajuda m�dica URGENTE!";
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
