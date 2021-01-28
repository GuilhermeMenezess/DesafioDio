import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
	    num = scanner.nextInt();
	    
	    while (num < 0 || num > 100) {
		    	
	    	num = scanner.nextInt();
	   	}

	    if (num == 0) {
	    	System.out.println("E");
	    } else if ( 1 <= num && num <= 35 ) {
	    	System.out.println("D");	    	
	    } else if ( 36 <= num && num <= 60 ) {
	    	System.out.println("C");	    	
	    } else if ( 61 <= num && num <= 85 ) {
	    	System.out.println("B");	    	
	    } else if ( 86 <= num && num <= 100 ) {
	    	System.out.println("A");	    	
	    }
		
	     
}
}
	  