package tennis;

public class Juego {
	private Jugador ganador;
	private Jugador j1;
	private Jugador j2;
	
	/**
	 * @param j1
	 * @param j2
	 */
	public Juego(Jugador j1, Jugador j2){
		this.j1 = j1;
		this.j2 = j2;
		jugar();
	}
	
	private void incrementarPunto(){
		int numJugador = (int)Math.round(Math.random()*1);
		
		Jugador[] jugadores = {j1, j2};
		Jugador j = jugadores[numJugador];
		
		j.ganarPunto();
	}
	
	/**
	 * @return boolean
	 */
	private boolean hayGanador(){
		if(j1.getPuntos()>3 && j2.getPuntos()<3){
			return true;
		}
		else if(j2.getPuntos()>3 && j1.getPuntos()<3){
			return true;
		}
		else if(j1.getPuntos()==5 && j2.getPuntos()<5){
			return true;
		}
		else if(j2.getPuntos()==5 && j1.getPuntos()<5){
			return true;
		}
		return false;
	}
	private void comparar(){
		if(j1.getPuntos()==j2.getPuntos() && j1.getPuntos()==4){
			j1.setPuntos(3);
			j2.setPuntos(3);
		}
		if(j1.getPuntos()==4 && j2.getPuntos()<3){
			j1.setPuntos(5);
		}
		if(j2.getPuntos()==4 && j1.getPuntos()<3){
			j2.setPuntos(5);
		}
	}
	
	/**
	 * @return String
	 */
	public String verPuntuaciones(){
		String str = j1.toString()+"\t"+j2.toString();
		if(j1.getPuntos()==j2.getPuntos() && j1.getPuntos()==3){
			str+=" IGUALES";
		}
		
		return str;
		
	}
	
	private void jugar(){
		while(!hayGanador()){
			incrementarPunto();
			comparar();
			System.out.println(verPuntuaciones());
		}
	}
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Iker");
		Jugador j2 = new Jugador("Patri");

		Juego j = new Juego(j1, j2);
	}
}
