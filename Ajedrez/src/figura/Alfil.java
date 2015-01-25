/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Alfil extends Figura{

	/**
	 * @param x
	 * @param y
	 */
	public Alfil(int x, int y) {
		super(x, y);
		setLetra('A');
	}

	/* (non-Javadoc)
	 * @see figura.Figura#movimiento(tablero.Tablero)
	 */
	@Override
	public void movimiento(Tablero tablero) {
		int y = getY();
		int x = getX();
		char car = getMov();
		int iX = x;
		int iY = y;
		
		while(iX!=0 && iY!=0){
			iX--;
			iY--;
		}
		
		while (iX<7 && iY<7) {
			if(iX!=x && iY!=y){
				tablero.setTablero(iX, iY, car);
			}
			iX++;
			iY++;
		}
		
		
		iX = x;
		iY = y;
		
		while(iX!=6 && iY!=0){
			iX++;
			iY--;
		}
		
		while (iX>=0 && iY<=6) {
			if(iX!=x && iY!=y){
				tablero.setTablero(iX, iY, car);
			}
			iX--;
			iY++;
		}
	}
	
	
}
