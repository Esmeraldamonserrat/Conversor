package main;

import javax.swing.JOptionPane;

public class Function {
		public static String getOption() {
			String opcion = null;
			
			try {
				opcion = JOptionPane.showInputDialog(null, "Elige el tipo de conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new String[] {"Conversor de monedas", "Conversor de temperatura"}, "Seleccion").toString();
			}catch(NullPointerException e) {
				JOptionPane.showMessageDialog(null, "No selecciono una opcion, el programa terminará");
				System.exit(0);
			}
			
			return opcion;
			}

		/**
		 * Metodo que verifica si el numero ingresado es mayor que 0
		 * @param input
		 */
		public static void verificarInput(double input) {
			if(input <= 0)
				throw new IllegalArgumentException();
		}
}
