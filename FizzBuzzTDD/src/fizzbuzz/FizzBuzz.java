package fizzbuzz;

import comprobador.Comprobador;

public class FizzBuzz {
	private int numeroMaximo;
	private Comprobador c;
	
	public FizzBuzz(int numeroMaximo, Comprobador c){
		this.numeroMaximo = numeroMaximo;
		this.c = c;
	}
	
	public void jugar(){
		String numero = "";
		for (int i = 1; i <= numeroMaximo; i++) {
			numero+=c.esFizz(i);
			numero+=c.esBuzz(i);
			
			if(numero.isEmpty()) numero+=i;
		}
	}
}
