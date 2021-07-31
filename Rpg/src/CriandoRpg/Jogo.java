package CriandoRpg;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

	public static void main(String[] args) {

		int op1, ataque, magia, critico,op2=0;
		Scanner ler = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Digite o nome do jogador ");

		Player p1 = new Player(900, 4, 3, 15, 5, (float) 1.5);
		p1.setNome(ler.nextLine());
		p1.visivel();
		p1.mostrarStatus();


		Player cpu = new Player(1000, 5, 3, 15, 5, (float) 2.0);
		cpu.setNome("CPU");
		
		if(p1.getNome().equals(cpu.getNome())) {
			cpu.setHp(0);
			
		}

		while (p1.getHp() > 0 && cpu.getHp() > 0) {
			
			
			System.out.println("     Habilidades       ");
			System.out.println("=======================");
			System.out.println("|  ESCOLHA UMA OP��O: |");
			System.out.println("|  1) Ataque F�sico   |");
			System.out.println("|  2) Magia           |");
			System.out.println("|  3) Cr�tico         |");
			System.out.println("=======================");

			op1 = ler.nextInt();

			switch (op1) {

			case 1: {
				System.out.println("    Ataque F�sico      ");

				System.out.println("=======================");
				System.out.println("|  1) Santouryuu      |");
				System.out.println("|  2) TotsukaTsurugi  |");
				System.out.println("=======================");
				ataque = ler.nextInt();

				switch (ataque) {

				case 1: {
					cpu.Santouryuu();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");
				} break;

				case 2: {
					cpu.TotsukaTsurugi();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");
				} break;

				default:
					System.out.println("\nOp��o inv�lida\n");

				}

			}
				break;

//------------------ ------------magias--------------------------------------------
			case 2: {
				System.out.println("	 Magias            ");

				System.out.println("=======================");
				System.out.println("|  1) Blizzard        |");
				System.out.println("|  2) FaiyaaArashi    |");
				System.out.println("|  3) Raitou          |");
				System.out.println("=======================");
				magia = ler.nextInt();

				switch (magia) {
				case 1: {
					cpu.Blizzard();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");

				}
					break;

				case 2: {
					cpu.FaiyaaArashi();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");

				}
					break;

				case 3: {
					cpu.Raitou();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");

				} break ;
				
				default:
					System.out.println("\nOp��o inv�lida\n");
				
				}
			}
				break;

//------------------ ------------critico--------------------------------------------

			case 3: {
				System.out.println("      Cr�tico          ");

				System.out.println("=======================");
				System.out.println("| 1) Bakuhatsu        |");
				System.out.println("=======================");

				critico = ler.nextInt();

				switch (critico) {

				case 1:
					cpu.critico = p1.critico;
					cpu.Bakuhatsu();
					System.out.println("\nCPU HP restante :" + cpu.getHp() + "\n");
					break;

				default:
					System.out.println("\nOp��o inv�lida\n");

					break;

				}

			}

				break;

			default: {
				System.out.println("\nOp��o inv�lida\n");
			}

			}
			System.out.println("=======================");
			System.out.println("|Turno do jogador: "+cpu.getNome()+"|");
			System.out.println("=======================\n");

			
			switch(op2+r.nextInt(5)) {
				case 1:{
					System.out.print(cpu.getNome()+" usou ");
					p1.Blizzard();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				case 2:{
					System.out.print(cpu.getNome()+" usou ");
					p1.Santouryuu();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				case 3:{
					System.out.print(cpu.getNome()+" usou ");
					p1.TotsukaTsurugi();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				case 4:{
					System.out.print(cpu.getNome()+" usou ");
					p1.FaiyaaArashi();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				case 5:{
					p1.critico = cpu.critico;
					System.out.print(cpu.getNome()+" usou ");
					p1.Bakuhatsu();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				case 6:{
					System.out.print(cpu.getNome()+" usou ");
					p1.Raitou();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
				
				default:{
					System.out.print(cpu.getNome()+" usou ");
					p1.Raitou();
					System.out.println("\n"+p1.getNome()+" HP restante :" + p1.getHp() + "\n");
				} break;
			}
		} 
		if(p1.getHp() > 0) {
			System.out.println("### VOC� GANHOU ###");
		} else {
			System.out.println("### VOC� PERDEU ###");
		}
			System.out.println("### FIM DE JOGO ###");
	}

}
