/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Reina extends Figura{

	/**
	 * @param x
	 * @param y
	 */
	public Reina(int x, int y) {
		super(x, y);
		setLetra('Q');
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
