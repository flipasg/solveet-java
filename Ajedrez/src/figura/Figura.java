/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Figura {
	private static final char mov = '*';
	private char letra;
	private int x;
	private int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the mov
	 */
	public static char getMov() {
		return mov;
	}

	/**
	 * @return the letra
	 */
	public char getLetra() {
		return letra;
	}

	/**
	 * @param letra the letra to set
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @param tablero
	 */
	public void movimiento(Tablero tablero){
		
	}
	
}
