package temperaturas;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	private static final String[] OPCIONES = {"Celcius a Kelvin.", "Celcius a Fahrenheit.", "Fahrenheit a Celcius.", "Kelvin a Celcius."};
	
	public static void convertir(double input) {
		String opcion = "";
		try {
			opcion = JOptionPane.showInputDialog(null, "Elige una opcion", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, OPCIONES, "Seleccion").toString();
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "No selecciono una opción, el programa terminará");
			System.exit(0);
		}
		
		double out = 0;
		if(opcion.equals(OPCIONES[0]))
			out = input + 273.15;
		else if(opcion.equals(OPCIONES[1]))
			out = (input * (9/5)) + 32;
		else if(opcion.equals(OPCIONES[2]))
			out = (input - 32) * 5/9;
		else 
			out = input - 273.15;
		out = Math.round(out * 100) / 100; //formato dos digitos despues de la coma
		
		JOptionPane.showMessageDialog(null, input + "º grados " + control(opcion)[0] + " son " + out + "º grados " + control(opcion)[1]);
	}
	

	/**
	 * Este metodo sirve para controlar los nombres de las temperaturas que se estan utilizando
	 * @param opcion
	 * @return un arreglo con las temperaturas utilizadas
	 */
	private static String[] control(String opcion) {
		char[] opcionChar = opcion.toCharArray();
		String[] out = {"", ""};
		
		for(int i = 0; i < opcion.indexOf(" "); i++)
			out[0] += opcionChar[i];
		for(int i = opcion.lastIndexOf(" ") + 1; i < opcion.length(); i++)
			out[1] += opcionChar[i];
		
		return out;
	}
}
