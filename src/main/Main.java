package main;

import javax.swing.JOptionPane;

import monedas.ConversorMonedas;
import temperaturas.ConversorTemperatura;

public class Main {
	public static void main(String[] args) {
		
		while(true) {
			double input = 0;
			if(Function.getOption().equals("Conversor de monedas")) {
				try {
					input = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de Pesos Mexicanos"));
					Function.verificarInput(input);
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No ingresaste un número valido, el programa terminará");
					break;
				}catch(IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un número mayor que 0.");
					continue;
				}
				ConversorMonedas.convertir(input);
			}else {
				try {
					input = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura en Celcius"));
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No ingresaste un número valido, el programa terminará");
					break;
				}
				ConversorTemperatura.convertir(input);
			}
			
			
			if(JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?") != JOptionPane.YES_OPTION)
				break;
		}
	}
}
