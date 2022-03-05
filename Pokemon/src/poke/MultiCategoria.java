package poke;

public class MultiCategoria extends Pokemon{
	protected TiposDePokemon[] categoria = new TiposDePokemon[2];
	private String descricao;
	
	public MultiCategoria(int id, String nome, TiposDePokemon[] cat, int ataque, int defesa, String desc) {
		super(id, nome, ataque, defesa);
		for(int i=0; i<this.categoria.length; i++) {
			this.categoria[i] = cat[i];
		}
		this.descricao=desc;
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
