package tennis;

public class Jugador {
	private final String[] marcador = {"0 puntos","15 puntos","30 puntos","40 puntos","Ventaja","Ganador"};
	private String nombre;
	private int puntos;
	
	/**
	 * @param nombre
	 */
	public Jugador(String nombre){
		this.nombre = nombre;
		puntos = 0;
	}

	public void ganarPunto(){
		puntos++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre + " "+marcador[puntos];
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
}
