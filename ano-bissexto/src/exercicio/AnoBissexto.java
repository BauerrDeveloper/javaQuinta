package exercicio;

import java.util.Scanner;

public class AnoBissexto {
	
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int numero;
		int ano;
		boolean bissexto;
		
		System.out.println("Digite um n�mero de 1 a 12, representando o m�s escolhido:");
		numero = input.nextInt();
		
		System.out.println("Digite um ano ");
		ano = input.nextInt();
		
		switch(numero)
		
		{
		    case 1:
		    	System.out.println("M�s de janeiro possui 31 dias.");
		            break;
		    case 2:
		    	bissexto = ( ( ano % 4 == 0 && ano % 100 != 0 ) || ( ano % 400 == 0 ) );
		    	if (bissexto) { 
		    		System.out.println("Esse ano � bissexto, o m�s de fevereiro possui 29 dias.");
		        }
		        else{
		        	System.out.println("M�s de fevereiro possui 28 dias.");
		        }
					
		            break;
		    case 3:
		    	System.out.println("M�s de mar�o possui 31 dias.");
		            break; 
		    case 4:
		    	System.out.println("M�s de abril possui 30 dias.");
		            break;    
		    case 5:
		    	System.out.println("M�s de maio possui 31 dias.");
		            break;
		    case 6:
		    	System.out.println("M�s de junho possui 30 dias.");
		            break;
		    case 7:
		    	System.out.println("M�s de julho possui 31 dias.");
		            break;
		    case 8:
		    	System.out.println("M�s de agosto possui 31 dias.");
		            break;
		    case 9:
		    	System.out.println("M�s de setembro possui 30 dias.");
		            break;
		    case 10:
		    	System.out.println("M�s de outubro possui 31 dias.");
		            break;
		    case 11:
		    	System.out.println("M�s de novembro possui 30 dias.");
		            break;
		    case 12:
		    	System.out.println("M�s de dezembro possui 31 dias.");
		            break;
		    default:
		    	System.out.println("Op��o inv�lida, escolha um n�mero de 1 a 12.");
		}	

	}
}


