package CriandoRpg;

import java.util.Scanner;

public class Jogo  {

	public static void main(String[] args) {
		
		int op1,op2;
		Scanner ler = new Scanner(System.in);
		
		Player p1 = new Player(500, 4, 10, 15, 5,1.5 );
		p1.nome = ler.nextLine();
		p1.visivel();
		p1.mostrarStatus();
		
		
		System.out.println("     Habilidades");
		System.out.println("=======================");
		System.out.println("|  ESCOLHA UMA OPÇÃO: |");
		System.out.println("|  1) Ataque Físico   |");
		System.out.println("|  2) Magia           |");
		System.out.println("|  3) Crítico         |");
		System.out.println("=======================");
		
		op1 = ler.nextInt();
		
		do {
			
			switch(op1)
			{
				case 1 :
					op2 = ler.nextInt();
				{
					if (op2==1)
					{
						System.out.println("TotsukaTsurugi");
						System.out.println("");	
					}
					if (op2==2)
					{
						System.out.println("Santouryuu");
						System.out.println("");	
					}
				break;}
				
				case 2 :
				{	
				System.out.println("Cadastros");
				break;
				}
				case 3 :
				{
				System.out.println("Sair");
				break;
				}
				default :
				{
				System.out.println("   Opção inválida");
				break;
				}
			}
		
			
			}while(op1!=3);
	}

}
