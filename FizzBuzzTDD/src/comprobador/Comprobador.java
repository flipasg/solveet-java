package comprobador;

public class Comprobador {
	
	public String esFizz(int n){
		if(n%3==0) return "Fizz";
		else return "";
	}
	
	public String esBuzz(int n){
		if(n%5==0) return "Buzz";
		else return "";
	}
}
