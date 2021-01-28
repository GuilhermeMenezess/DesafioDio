import java.util.Scanner;
public class Desafio {
		
	    public static void main(String[] args) {
	      
	      int num;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Entre com qualquer numero");
	      num = sc.nextInt();
	      
	    	for (int i = 2 ; i <= num  ; i += 2) {
	    		System.out.println(i);
	    	}
	    	
	    }
		
	}

