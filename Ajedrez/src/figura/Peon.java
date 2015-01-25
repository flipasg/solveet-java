package figura;

import tablero.Tablero;

/**
 * @author ikk
 *
 */
public class Peon extends Figura{
	/**
	 * @param x
	 * @param y
	 */
	public Peon(int x, int y) {
		super(x, y);
		setLetra('P');
	}

	/* (non-Javadoc)
	 * @see figura.Figura#movimiento()
	 */
	@Override
	public void movimiento(Tablero tablero) {
		int y = getY();
		int x = getX();
		char car = getMov();
		
		if(y==0){
			System.out.println("NO HAY MOVIMIENTOS");
		}else{
			if(y>5){
				System.out.println("EL PEÓN NO PUEDE POSICIONARSE TAN ATRÁS");
			}else{
				tablero.setTablero(x, y-1, car);
				if(y==5){
					tablero.setTablero(x, y-2, car);
				}
			}
		}
	}
	
	
	
	
}
