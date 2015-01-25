package Triangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Triangulo {
	private double angA = 0;
	private double angB = 0;
	private double angC = 0;
	private double segA = 0;
	private double segB = 0;
	private double segC = 0;
	private int contSeg = 0;
	private int contAng = 0;
	/**
	 * 
	 */
	public Triangulo() {
		
	}
	
	private void pedirDatos() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		boolean masDatos = true;
		String resMasDatos = "";
		String dato = "";
		double valorDato = 0;
		
		do {
			
			System.out.println("Dime que dato deseas introducir");
			System.out.println("Angulos: A | B | C");
			System.out.println("Segmentos: a | b | c");
			dato = b.readLine();
			
			while(!dato.equals("A") && !dato.equals("B") && !dato.equals("C") && !dato.equals("a") && !dato.equals("b") && !dato.equals("c")){
				System.out.println("Dime que dato deseas introducir");
				System.out.println("Angulos: A | B | C");
				System.out.println("Segmentos: a | b | c");
				dato = b.readLine();
			}
			
			if(dato.equals("A") || dato.equals("B") || dato.equals("C")){
				System.out.println("Dime el valor del angulo "+dato);
				valorDato = Double.parseDouble(b.readLine());
				if(dato.equals("A")){
					angA = valorDato;
				}
				if(dato.equals("B")){
					angB = valorDato;
				}
				if(dato.equals("C")){
					angC = valorDato;
				}
				contAng++;
			}
			if(dato.equals("a") || dato.equals("b") || dato.equals("c")){
				System.out.println("Dime el valor del segmento "+dato);
				valorDato = Double.parseDouble(b.readLine());
				if(dato.equals("a")){
					segA = valorDato;
				}
				if(dato.equals("b")){
					segB = valorDato;
				}
				if(dato.equals("c")){
					segC = valorDato;
				}
				contSeg++;
			}
			
			System.out.println("¿Deseas introducir más datos? S/N");
			resMasDatos = b.readLine().toLowerCase();
			if(!resMasDatos.equals("s") && !resMasDatos.equals("si")){
				masDatos = false;
			}
		} while (masDatos);
		
	}
	
	private boolean datosNecesarios(){
		//necesitamos saber tres datos mínimo, y uno de ellos debe ser un lado
		if(contSeg==0 || (contSeg!=0 && ((contSeg+contAng)<3))){
			return false;
		}else{
			return true;
		}
	}
	
	
	private void calcularIncognitas(){
		if(contSeg==1){
			//1 segmento - MINIMO 2 angulos
			//calculamos angulo restante, si es que no lo tenemos ya
			if(angA==0){
				angA = 180-(angB+angC);
				contAng++;
			}
			if(angB==0){
				angB = 180-(angA+angC);
				contAng++;
			}
			if(angC==0){
				angC = 180-(angA+angB);
				contAng++;
			}
			
			//calculamos segmentos restantes con el teorema del seno
			if(segA!=0){
				 segB = ((segA*Math.sin(Math.toRadians(angB)))/(Math.sin(Math.toRadians(angA))));
				 segC = ((segA*Math.sin(Math.toRadians(angC)))/(Math.sin(Math.toRadians(angA))));
			}else{
				if(segB!=0){
					 segA = ((segB*Math.sin(Math.toRadians(angA)))/(Math.sin(Math.toRadians(angB))));
					 segC = ((segB*Math.sin(Math.toRadians(angC)))/(Math.sin(Math.toRadians(angB))));
				}else{
					if(segC!=0){
						 segA = ((segC*Math.sin(Math.toRadians(angA)))/(Math.sin(Math.toRadians(angC))));
						 segB = ((segC*Math.sin(Math.toRadians(angB)))/(Math.sin(Math.toRadians(angC))));
					}
				}
			}
			contSeg+=2;
		}
		
		if(contSeg==2){
			//2 segmentos - MINIMO 1 angulo
			//calculamos segmento restante
			
			//si el angulo es el que forman los segmentos aplicamos el teorema del coseno
			if(segA!=0 && segB!=0 && angC!=0){
				segC = Math.sqrt(Math.pow(segA, 2)+Math.pow(segB, 2)-(2*segA*segB*Math.cos(Math.toRadians(angC))));
			}else{
				if(segA!=0 && segC!=0 && angB!=0){
					segB = Math.sqrt(Math.pow(segA, 2)+Math.pow(segC, 2)-(2*segA*segC*Math.cos(Math.toRadians(angB))));
				}else{
					if(segB!=0 && segC!=0 && angA!=0){
						segA = Math.sqrt(Math.pow(segB, 2)+Math.pow(segC, 2)-(2*segA*segB*Math.cos(Math.toRadians(angA))));
					}else{
						//si el angulo es otro el teorema del seno
						if(segA==0){
							if(angB!=0){
								segA = ((segB*Math.sin(Math.toRadians(angA)))/(Math.sin(Math.toRadians(angB))));
							}else{
								segA = ((segC*Math.sin(Math.toRadians(angA)))/(Math.sin(Math.toRadians(angC))));
							}
						}
						if(segB==0){
							if(angA!=0){
								segB = ((segA*Math.sin(Math.toRadians(angB)))/(Math.sin(Math.toRadians(angA))));
							}else{
								segB = ((segC*Math.sin(Math.toRadians(angB)))/(Math.sin(Math.toRadians(angC))));
							}
						}
						if(segC==0){
							if(angA!=0){
								segC = ((segA*Math.sin(Math.toRadians(angC)))/(Math.sin(Math.toRadians(angA))));
							}else{
								segC = ((segB*Math.sin(Math.toRadians(angC)))/(Math.sin(Math.toRadians(angB))));
							}
						}
					}
				}
			}
			contSeg++;
		}
		
		if(contSeg==3){
			//3 segmentos - MINIMO 0 angulos
			//calculamos los tres angulos con el teorema del coseno
			if(angA==0){
				angA = Math.toDegrees(Math.acos((Math.pow(segB, 2)+Math.pow(segC, 2)-Math.pow(segA, 2))/(2*segB*segC)));
				contAng++;
			}
			if(angB==0){
				angB = Math.toDegrees(Math.acos((Math.pow(segA, 2)+Math.pow(segC, 2)-Math.pow(segB, 2))/(2*segA*segC)));
				contAng++;
			}
			if(angC==0){
				angC = Math.toDegrees(Math.acos((Math.pow(segA, 2)+Math.pow(segB, 2)-Math.pow(segC, 2))/(2*segA*segB)));
				contAng++;
			}
		}
		
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###.##");
		return "Triangulo [angA=" + df.format(angA) + ", angB=" + df.format(angB) + ", angC=" + df.format(angC)
				+ ", segA=" + df.format(segA) + ", segB=" + df.format(segB) + ", segC=" + df.format(segC) + "]";
	}

	public void crearTriangulo() throws IOException{
		pedirDatos();
		if(datosNecesarios()){
			calcularIncognitas();
			System.out.println(toString());
		}else{
			System.out.println("Se necesitan más datos");
		}
		
	}


	
}
