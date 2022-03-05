package poke;

public class Mouse extends Pokemon{
	
	private String descricao;
	private final int FATOR_EVOLUTIVO = 4;
	
	public Mouse(int id, String nome, TiposDePokemon categoria, int ataque, int defesa, String desc) {
		super(id, nome, categoria, ataque, defesa);
		this.descricao = desc;
	}
	
	@Override
	public int getFATOR_EVOLUTIVO() {
		return this.FATOR_EVOLUTIVO;
	}
	
	@Override
	public String falar() {
		return this.nome;
	}
	
	public String toString(){
		String desc = super.toString();
			desc += "Descrição: " + this.descricao + "\n";
		return desc;
	}
}
