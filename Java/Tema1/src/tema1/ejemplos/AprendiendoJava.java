package tema1.ejemplos;

public class AprendiendoJava {
	

	public static void main (String[] args) {
		inicializar();
		verTodo();
		verHastaMayorQue(25);
	}
	
	static int[] vector;
	
	/** 
	 * Inicializa un vector de 20 posiciones con valores aleatorioas de 1 a 50
	 */
	
	static void inicializar() {
		
//		int i = 0;
//		while (i<20) {
//			/*...*/
//			i++;
//		}
		vector = new int[20]; //Crea un vector de 20 posiciones. Asigna una memoria de 20 posiciones al vector.
		for (int i=0 /*Inicializazion*/; i<20 /*Condicion De Continuacion*/; i++ /* Actualizacion*/) {
			vector[i] = (int)/*Casting explicito, de doblue (decimales), a int (Entero)*/(Math.random() * 50/*Rango entre 0 y 49*/) + 1 /*Para hacer de 50*/;		
		}
		
	}
	
	
	/**
	 * Saca a consola el vector en una sola linea separando los elementos por espacio
	 */
	
	static void verTodo() {
		for (int valor: vector) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	/**
	 * Saca a consola el vector de izquierda a derecha avado en el ultimo valor inferior o igual al umbral
	 *  En una sola linea separando valores por espacios
	 * @param umbralMayor Valor del umbral, debe ser positivo
	 */
	
	static void verHastaMayorQue( int umbralMayor) {
		int indice = 0;
		while (vector[indice] <= umbralMayor) {
		  System.out.print(vector[indice] + " ");
		  indice++;
		  
		}
		
//		for (int indice = 0; vector[indice] <= umbralMayor; indice++) {
//			System.out.print(vector[indice] + " ");
//		}
		
		System.out.println();	
		
	}
		
}
