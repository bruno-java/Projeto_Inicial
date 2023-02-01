package curso_programacao;

import java.util.Scanner;

public class cond04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int HrInicial = sc.nextInt();
		int HrFinal = sc.nextInt();
		
		int duracao;
		if (HrInicial < HrFinal) {
			duracao = HrFinal - HrInicial;
	  }		
	    else {
	    	
	    	duracao = 24 - HrInicial + HrFinal;
	    
		}
		  
	     System.out.println("O jogo durou " + duracao + " HORA(S)");
		 sc.close();
	}

}


