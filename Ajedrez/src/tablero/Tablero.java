/**
 * 
 */
package tablero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import figura.*;

/**
 * @author ikk
 *
 */
public class Tablero {
	private char[][] tablero = new char[7][7];
	
	/**
	 * 
	 */
	public Tablero() {
		char casilla = 'B';
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = casilla;
				
				if(casilla=='B')
					casilla = 'N';
				else
					casilla = 'B';
			}
		}
	}
	
	/**
	 * @return the tablero
	 */
	public char[][] getTablero() {
		return tablero;
	}

	/**
	 * @param x
	 * @param y
	 * @param car
	 */
	public void setTablero(int x, int y, char car) {
		tablero[y][x] = car;
	}

	public void verTablero(){
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print("["+tablero[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	/**
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private static String pedirFigura() throws NumberFormatException, IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String tipo;
		
		do{
			System.out.println("DIME EL NOMBRE DE LA FIGURA");
			System.out.println("PEON TORRE CABALLO ALFIL REINA REY");
			tipo = b.readLine().toUpperCase();
			System.out.println(tipo);
		}while(!tipo.equals("PEON") && !tipo.equals("TORRE") && !tipo.equals("CABALLO") && !tipo.equals("ALFIL") && !tipo.equals("REINA") && !tipo.equals("REY"));
		
		if(!tipo.equals("REINA") && !tipo.equals("TORRE")){
			System.out.println("DIME LA POSICION DEL "+tipo);
		}else{
			System.out.println("DIME LA POSICION DE LA "+tipo);
		}
		
		return tipo;
	}
	
	/**
	 * @param str
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private static int[] pedirCoordenadas() throws NumberFormatException, IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int[] aint = new int[2];
		
		System.out.println("X: ");
		int x = Integer.parseInt(b.readLine())-1;
		System.out.println("Y: ");
		int y = Integer.parseInt(b.readLine())-1;
		if(x>6 || x<0 || y>6 || y<0){
			System.out.println("LA FIGURA NO PUEDE COLOCARSE FUERA DEL TABLERO");
		}else{
			aint[0] = x;
			aint[1] = y;
		}
		
		return aint;
	}
	
	/**
	 * @param tipo
	 * @param x
	 * @param y
	 * @return
	 */
	private static Figura crearFigura(String tipo, int x, int y){
		Figura f = new Figura(x, y);
		if(tipo.equals("PEON")){
			f = new Peon(x, y);
		}
		if(tipo.equals("TORRE")){
			f = new Torre(x, y);
		}
		if(tipo.equals("CABALLO")){
			f = new Caballo(x, y);
		}
		if(tipo.equals("ALFIL")){
			f = new Alfil(x, y);
		}
		if(tipo.equals("REINA")){
			f = new Reina(x, y);
		}
		if(tipo.equals("REY")){
			f = new Rey(x, y);
		}
		
		return f;
	}
	
	/**
	 * @param f
	 */
	public void colocarFigura(Figura f){
		setTablero(f.getX(), f.getY(), f.getLetra());
	}
	
	/**
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public void verMovimiento() throws NumberFormatException, IOException{
		String tipo = pedirFigura();
		int[] aint = pedirCoordenadas();
		Figura f = crearFigura(tipo, aint[0], aint[1]);
		colocarFigura(f);
		f.movimiento(this);
		verTablero();
	}
}
