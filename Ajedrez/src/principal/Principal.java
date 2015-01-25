package principal;

import java.io.IOException;

import tablero.Tablero;

public final class Principal {
	
	public static void main(String[] args) throws IOException {
		Tablero tablero = new Tablero();
		tablero.verMovimiento();
	}

}
