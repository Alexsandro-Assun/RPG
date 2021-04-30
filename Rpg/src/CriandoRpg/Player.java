package CriandoRpg;

public class Player {

	public String nome;
	private float hp;
	private int armadura;
	private int resisteciaMagica;
	private int danoFisico;
	private int danoMagico;
	public float critico;
	public boolean ocultar;

	// Skills
	private int santouryuu = 25;
	private float bakuhatsu = 11;
	private int totsukaTsurugi = 19;
	private float faiyaaArashi = (float) 3.5;
	private int blizzard = 35;
	private int raitou = 8;
	private int ac = 1 ;
	private int cont = 5;


	// metodos dos players
	public Player(float hp, int arm, int mr, int ad, int ap, float crt) {
		this.hp = hp;
		this.armadura = arm;
		this.resisteciaMagica = mr;
		this.danoFisico = ad;
		this.danoMagico = ap;
		this.critico = crt;

	}

	public void status() {
		System.out.println("Status base do jogador: " + this.nome);
		System.out.println("Vida: " + this.hp);
		System.out.println("Armadura: " + this.armadura);
		System.out.println("Resistência Mágica: " + this.resisteciaMagica);
		System.out.println("Dano Físico: " + this.danoFisico);
		System.out.println("Dano Mágico: " + this.danoMagico);
		System.out.println("Crítico: " + this.critico + "\n");

	}

	public void mostrarStatus() {
		if (ocultar == true) {
			System.out.println("Status base do jogador " + nome + " estão ocultos \n");
		} else {
			status();
		}

	}

	public void invisivel() {
		this.ocultar = true;
	}

	public void visivel() {
		this.ocultar = false;
	}

	// metodos das skills
	public void Santouryuu() {
		System.out.println("Santouryuu " + (santouryuu-armadura) + " de dano");
		danoFisico += 15;
		hp = hp - santouryuu + armadura;
		if (danoFisico>=44 && danoFisico<=46) {
			critico += (float) 0.5;
		}
	}

	public void Bakuhatsu() {
		
		if (cont >0) {
			System.out.println("Bakuhatsu " + (bakuhatsu * critico+(danoFisico+danoMagico)) + " de dano ");
			System.out.println((cont-1)+"/5 restantes");
			hp = hp - (bakuhatsu * critico+(danoFisico+danoMagico));
			cont--;
		}
		
		if (cont == 0) {
			System.out.println("Bakuhatsu não está mais disponível");
		}
	}

	public void TotsukaTsurugi() {
		System.out.println("TotsukaTsurugi " + (totsukaTsurugi-armadura) + " de dano");
		danoMagico += 9;
		hp = hp - totsukaTsurugi + armadura;
		if(danoMagico>=31 && danoMagico<=33) {
			totsukaTsurugi += danoMagico;
		}
		
	}

	public void FaiyaaArashi() {
		System.out.println("Faiyaa Arashi " + (faiyaaArashi-resisteciaMagica) + " de dano");
		hp = hp - faiyaaArashi + resisteciaMagica;
		if (hp <= 900 && hp > 700) {
			int x;
			for (x = 3; x <= 9; x++) {
				faiyaaArashi += x;
			}
		}

		if (hp <= 700 && hp > 500) {
			int x;
			for (x = 3; x <= 6; x++) {
				faiyaaArashi += x;
			}
		}

		if (hp <= 300) {
			int x;
			for (x = 3; x <= 3; x++) {
				faiyaaArashi += x;
			}
		}

	}

	public void Blizzard() {
		System.out.println("Blizzard " + (blizzard-resisteciaMagica) + " de dano");
		hp = hp - blizzard + resisteciaMagica;
		resisteciaMagica -= 1;
			
		if (resisteciaMagica == 0) {
			resisteciaMagica = 3;
		}
	}

	public void Raitou() {
		System.out.println("Raitou acumulou  "+(raitou+raitou)+" de dano "+ac+"/5 acumulos");
		
		if(ac<=5) {
			ac++;

		}
		if (ac==6) {
			ac=1;
		}

		
		if (raitou<128) {
				raitou = raitou + raitou;
				hp = hp - 0;
		}

		if(raitou == 128) {
			System.out.println("Raitou causou "+ (raitou-resisteciaMagica)+" de dano acumulado");
			hp = hp - raitou + resisteciaMagica;
			raitou = 8;
		}
	}

	
	// getters e setters

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) {
		this.ac = ac;
	}

	public float getFaiyaaArashi() {
		return faiyaaArashi;
	}

	public void setFaiyaaArashi(float faiyaaArashi) {
		this.faiyaaArashi = faiyaaArashi;
	}

	public int getBlizzard() {
		return blizzard;
	}

	public void setBlizzard(int blizzard) {
		this.blizzard = blizzard;
	}

	public int getRaitou() {
		return raitou;
	}

	public void setRaitou(int raitou) {
		this.raitou = raitou;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getBakuhatsu() {
		return bakuhatsu;
	}

	public void setBakuhatsu(float bakuhatsu) {
		this.bakuhatsu = bakuhatsu;
	}

	public int getTotsukaTsurugi() {
		return totsukaTsurugi;
	}

	public void setTotsukaTsurugi(int totsukaTsurugi) {
		this.totsukaTsurugi = totsukaTsurugi;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getResisteciaMagica() {
		return resisteciaMagica;
	}

	public void setResisteciaMagica(int resisteciaMagica) {
		this.resisteciaMagica = resisteciaMagica;
	}

	public int getDanoFisico() {
		return danoFisico;
	}

	public void setDanoFisico(int danoFisico) {
		this.danoFisico = danoFisico;
	}

	public int getDanoMagico() {
		return danoMagico;
	}

	public void setDanoMagico(int danoMagico) {
		this.danoMagico = danoMagico;
	}

	public float getCritico() {
		return critico;
	}

	public void setCritico(float critico) {
		this.critico = critico;
	}

	public boolean isOcultar() {
		return ocultar;
	}

	public void setOcultar(boolean ocultar) {
		this.ocultar = ocultar;
	}

	public int getSantouryuu() {
		return santouryuu;
	}

	public void setSantouryuu(int santouryuu) {
		santouryuu = santouryuu;
	}

}
