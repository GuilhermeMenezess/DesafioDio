import java.util.Scanner;

public class Desafio2 {
		
	    public static void main(String[] args)  {
	        Scanner leitor = new Scanner(System.in);
	        
	        int idadeDias = leitor.nextInt();
	        int idadeAno = idadeDias / 365;
	        idadeDias -= idadeAno * 365;
	        int idadeMes = idadeDias / 30;
	              
	        System.out.println( idadeAno + " ano(s)");
	        System.out.println( idadeMes + " mes(es)");
	        System.out.println( idadeDias+ " dia(s)");
	    }
		
	}
