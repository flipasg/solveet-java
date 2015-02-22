
public class Dorsales {
	
	private static int ambosDorsales(int n1, int n2){
		String ambos = Integer.toString(n1);
		if(n2<10){
			ambos+=0;
		}
		ambos+=Integer.toString(n2);
		int sumaAlCuadrado = (int)Math.pow(n1+n2, 2);
		if(ambos.equals(Integer.toString(sumaAlCuadrado))){
			return Integer.parseInt(ambos);
		}else{
			return -1;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				if(ambosDorsales(i, j)!=-1){
					System.out.println(ambosDorsales(i, j));
				}
			}
		}
	}

}
