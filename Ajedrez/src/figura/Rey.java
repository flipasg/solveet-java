/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Rey extends Figura{

	/**
	 * @param x
	 * @param y
	 */
	public Rey(int x, int y) {
		super(x, y);
		setLetra('K');
	}

	/* (non-Javadoc)
	 * @see figura.Figura#movimiento(tablero.Tablero)
	 */
	@Override
	public void movimiento(Tablero tablero) {
		int y = getY();
		int x = getX();
		char car = getMov();
		
		if(y!=0){
			tablero.setTablero(x, y-1, car);
		}
		if(x!=0){
			tablero.setTablero(x-1, y, car);
		}
		if(y!=6){
			tablero.setTablero(x, y+1, car);
		}
		if(x!=6){
			tablero.setTablero(x+1, y, car);
		}
		
	}
	
	
}
