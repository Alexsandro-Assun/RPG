package CriandoRpg;

public class Player {
	
	public String nome;
	private float HP;
	private int armadura;
	private int resisteciaMagica;
	private int danoFisico;
	private int danoMagico;
	private double critico;
	public boolean ocultar;
	
	public Player(float hp, int arm, int mr, int ad, int ap, double crt) {
		nome();
		this.HP = hp;
		this.armadura = arm;
		this.resisteciaMagica = mr;
		this.danoFisico = ad;
		this.danoMagico = ap;
		this.critico = crt;
		
	}

	public void status()
	{
		System.out.println("Status base do jogador: "+this.nome);
		System.out.println("Vida: "+this.HP);
		System.out.println("Armadura: "+this.armadura);
		System.out.println("Resistência Mágica: "+this.resisteciaMagica);
		System.out.println("Dano Físico: "+this.danoFisico);
		System.out.println("Dano Mágico: "+this.danoMagico);
		System.out.println("Crítico: "+this.critico+"\n");
		
	}
	public void mostrarStatus() 
	{
		if (ocultar == true) 
		{
			System.out.println("Status base do jogador "+nome+" estão ocultos \n");
		}
		else 
		{
			status();
		}
	
		
	}
	public void invisivel()
	{
		this.ocultar = true;
	}
	
	public void visivel()
	{
		this.ocultar = false;
	}

	public void nome ()
	{
			
		System.out.println("Digite o nome do jogador ");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getHP() {
		return HP;
	}
	public void setHP(float hP) {
		HP = hP;
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
	public double getCritico() {
		return critico;
	}
	public void setCritico(double critico) {
		this.critico = critico;
	}
	public boolean isOcultar() {
		return ocultar;
	}
	public void setOcultar(boolean ocultar) {
		this.ocultar = ocultar;
	}
	
}
