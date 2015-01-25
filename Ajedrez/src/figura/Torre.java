/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Torre extends Figura{

	/**
	 * @param x
	 * @param y
	 */
	public Torre(int x, int y) {
		super(x, y);
		setLetra('T');
	}

	/* (non-Javadoc)
	 * @see figura.Figura#movimiento(tablero.Tablero)
	 */
	@Override
	public void movimiento(Tablero tablero) {
		int y = getY();
		int x = getX();
		char car = getMov();
		
		for (int i = 0; i < tablero.getTablero().length; i++) {
			if(i!=y){
				tablero.setTablero(x, i, car);
			}
		}
		
		for (int i = 0; i < tablero.getTablero().length; i++) {
			if(i!=x){
				tablero.setTablero(i, y, car);
			}
		}
	}

}
