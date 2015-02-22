package arbol;

import java.util.Arrays;

public class ArbolNavidad {
	private int n;
	private String[] arbol;
	private final char img = '*';
	
	public ArbolNavidad(int n) {
		this.n = n;
		arbol = new String[n];
		Arrays.fill(arbol,"");
		rellenarArbol();
		dibujarArbol();
	}
	
	private void rellenarArbol(){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n+i; j++) {
				if(j<(n-1)-i){
					arbol[i]+=" ";
				}else{
					arbol[i]+=img;
				}
				
			}
		}
	}
	
	private void dibujarArbol(){
		for (int i = 0; i < n; i++) {
			System.out.println(arbol[i]);
		}
	}
	
	public static void main(String[] args) {
		ArbolNavidad a = new ArbolNavidad(3);
	}
}
