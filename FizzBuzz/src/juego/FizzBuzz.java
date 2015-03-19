package juego;

public class FizzBuzz {
	
	public void jugar(){
		for (int i = 1; i < 101; i++) {
			System.out.println(evaluarNumero(i));
		}
	}
	
	private String evaluarNumero(int n){
		String str = "";
		
		str+=(esFizz(n)).concat(esBuzz(n));
		
		if(str.isEmpty()){
			str+=(Integer.toString(n));
		}
		
		return str;
	}
	
	private String esFizz(int n){
		
		if(n%3==0 || Integer.toString(n).contains("3")){
			return "Fizz";
		}else{
			return "";
		}
	}
	
	private String esBuzz(int n){
		
		if(n%5==0 || Integer.toString(n).contains("5")){
			return "Buzz";
		}else{
			return "";
		}
	}
	
	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.jugar();
	}
}
