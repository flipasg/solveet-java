/**
 * 
 */
package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Caballo extends Figura{

	/**
	 * @param x
	 * @param y
	 */
	public Caballo(int x, int y) {
		super(x, y);
		setLetra('C');
	}

	/* (non-Javadoc)
	 * @see figura.Figura#movimiento(tablero.Tablero)
	 */
	@Override
	public void movimiento(Tablero tablero) {
		int y = getY();
		int x = getX();
		char car = getMov();
		
		x+=2;
		if(x>=0 && x<=6){
			y+=1;
			if(y>=0 && y<=6){
				tablero.setTablero(x, y, car);
			}
			y-=2;
			if(y>=0 && y<=6){
				tablero.setTablero(x, y, car);
			}
		}
		
		y = getY();
		x = getX();
		
		x-=2;
		if(x>=0 && x<=6){
			y+=1;
			if(y>=0 && y<=6){
				tablero.setTablero(x, y, car);
			}
			y-=2;
			if(y>=0 && y<=6){
				tablero.setTablero(x, y, car);
			}
		}
		
		y = getY();
		x = getX();
		
		y+=2;
		if(y>=0 && y<=6){
			x+=1;
			if(x>=0 && x<=6){
				tablero.setTablero(x, y, car);
			}
			x-=2;
			if(x>=0 && x<=6){
				tablero.setTablero(x, y, car);
			}
		}
		
		y = getY();
		x = getX();
		
		y-=2;
		if(y>=0 && y<=6){
			x+=1;
			if(x>=0 && x<=6){
				tablero.setTablero(x, y, car);
			}
			x-=2;
			if(x>=0 && x<=6){
				tablero.setTablero(x, y, car);
			}
		}
			
	}
	
	

}
