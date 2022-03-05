package poke;

public abstract class Pokemon implements Evolucao {
	private int id;
	protected String nome;
	protected TiposDePokemon categoria;
	private int nivel;
	private int ataque;
	private int defesa;
	private final int FATOR_EVOLUTIVO = 2;
	
	public Pokemon(int id, String n, TiposDePokemon cat, int at, int def) {
		this(id,n,at,def);
		this.categoria = cat;
	}
	public Pokemon(int id, String n, int at, int def) {
		this.id = id;
		this.nome = n;
		this.ataque = at;
		this.defesa = def;
		this.nivel = 1;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public void setNivel() {
		this.nivel++;
	}
	
	public abstract String falar();
	
	public int getFATOR_EVOLUTIVO() {
		return this.FATOR_EVOLUTIVO;
	}
	
	public void evoluir() {
		setAtaque(getAtaque()*getFATOR_EVOLUTIVO());
		setDefesa(getDefesa()*getFATOR_EVOLUTIVO());
		System.out.println(this.nome + "Evoluindo... agora meu ataque e minha defesa terão os valores multiplicados por " + getFATOR_EVOLUTIVO());
		setNivel();
	}
	
	@Override
	public String toString(){
		String str = "Dados do Pokemon: \n" + "ID: " + id + " \n Nome: " + nome + 
				" \n Nível: " + nivel + " \n Ataque: " + ataque + 
				" \n Defesa: " + defesa + "\n";
		return str;
	}
	
	
	
}
