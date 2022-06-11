package br.com.imc;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario();
		
		int peso;
		double altura;
		
		Object[] continuar = {"Continuar", "Sair"};
		String desejaContinuar;
		
		do {
			JOptionPane.showInputDialog("Informe seu peso em kg:");
			altura = JOptionPane.showInputDialog("Informe sua altura em metros:");
			
			peso = peso.replace(",", ".");
			altura = altura.replace(",", ".");
			
			usuario.setPeso(Double.parseDouble(peso));
			usuario.setAltura(Double.parseDouble(altura));
			
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", usuario.calcularIMC()) + ".\n" + usuario.mostrarResultado());
			
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja continuar?", "Continuar", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
			
			if (desejaContinuar == "Sair")
				JOptionPane.showMessageDialog(null, "Tenha um ótimo dia!");
			
		} while (desejaContinuar == "Sair");
		
		System.exit(0);

	}

}
