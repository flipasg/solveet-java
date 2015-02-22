
public class Capicua {
	
	public static long calcularCapicua(long n){
		//Generamos un objeto de tipo String para facilitar la inversión del número
		String numero = Long.toString(n);
		
		/*
		 * Si la longitud del número es inferior a 2, no podremos calcular el capicúa
		 * Devolveremos -1
		 */
		if(numero.length()<2){
			return -1;
		}else{
			 // Si la longitud es mayor calculamos la suma del número y su inverso
			long suma = 0;
			
			/*
			 * Generamos un objeto StringBuilder que nos permite manipular el String
			 * Así usando la función reverse() del "builder" obtendremos el número inverso
			 */
			StringBuilder builder = new StringBuilder(numero);
			
			//Calculamos la suma
			suma = Long.parseLong(numero)+Long.parseLong(builder.reverse().toString());
			builder = new StringBuilder(Long.toString(suma));
			
			/*
			 * Instanciamos en el mismo objeto StringBuilder uno sobre la suma
			 * O creamos otro objeto para poder invertirlo y saber si la cadena es capicua
			 */
			if(Long.toString(suma).equals(builder.reverse().toString())){
				//Si la suma es capicua devolvemos el número
				return suma;
			}else{
				//Si la suma no es capicua llamamos recursivamente a esta función
				return calcularCapicua(suma);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(calcularCapicua(187));
	}
}
