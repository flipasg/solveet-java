package mina;

public class Mina {
	private String mina;
	private final String diamante = "<>"; 
	
	public Mina(String mina){
		this.mina = mina;
	}
	
	public int cantidadDiamantes(){
		int cantidadDiamantes = 0;
		while(mina.contains(diamante)){
			cantidadDiamantes++;
			mina = mina.replaceFirst(diamante, "");
			
		}
		return cantidadDiamantes;
		
	}
	
	public static void main(String[] args) {
		Mina m = new Mina("<><<>><<");
		System.out.println(m.cantidadDiamantes());
	}
}
