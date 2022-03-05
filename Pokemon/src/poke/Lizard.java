package poke;

public class Lizard extends Pokemon{
	private String descricao;
	
	public Lizard(int id, String nome, TiposDePokemon categoria, int ataque, int defesa, String desc) {
		super(id, nome, categoria, ataque, defesa);
		this.descricao = desc;
	}
	
	@Override
	public String falar() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		String desc = super.toString();
		desc += "Descrição: " + this.descricao + "\n";
		return desc;
	}
}
