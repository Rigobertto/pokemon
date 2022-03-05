package poke;

import java.util.ArrayList;

public class DemoPokemon {
	private static ArrayList<Pokemon> meusPokemon = new ArrayList<Pokemon>();
	public static void main(String[] args) {
		
		Pokemon charmander = new Lizard(4, "Charmander", TiposDePokemon.Fire, 3, 2, 
											"A chama que queima na ponta da cauda de um Charmander é uma indicação de suas emoções.");

		
		Pokemon pikachu = new Mouse(25, "Pikachu", TiposDePokemon.Eletric, 3, 3, 
										"Sempre que um Pikachu se depara com algo novo, ele explode com um choque de eletricidade.");
	
		//System.out.println(charmander);
		//System.out.println(pikachu);
		//pikachu.evoluir();
		//System.out.println(pikachu);
		
		/* 
		 *
		 * 
		 * O método falar retorna uma string então basta usar system.out.printl que funcionará
		 * 
		 * 
		 * */
		//System.out.println(pikachu.falar());
		TiposDePokemon[] classes = {TiposDePokemon.Grass, TiposDePokemon.Poison};
		
		Pokemon bulbassauro = new MultiCategoria(1, "Bulbassauro", classes, 2, 1, 
										"Bulbassauro possui uma semente nas costas e ao absorver os raios de sol, a semente cresce progressivamente");
		//System.out.println(bulbassauro);
		//bulbassauro.evoluir();
		//System.out.println(bulbassauro);
		
		meusPokemon.add(charmander);
		meusPokemon.add(bulbassauro);
		meusPokemon.add(pikachu);
		
		//descreverPokemon(bulbassauro);
		buscarPokemon(meusPokemon, charmander);
	}
	
	public static void buscarPokemon(ArrayList<Pokemon> l, Pokemon p) {
		System.out.println("\n Buscando Pokemon... ");
		
		if(l.contains(p)) {
			System.out.println("Pokemon encontrado! \n");
			descreverPokemon(p);
		}else {
			System.out.println("O Pokemon não foi encontrado! \n");
		}
	}
	
	public static void descreverPokemon(Pokemon p) {
		System.out.println(p);
		System.out.print("Tipo(s): [");
		
		if(p instanceof MultiCategoria) {
			MultiCategoria aux = (MultiCategoria) p;
			for(int i = 0; i< aux.categoria.length; i++) {
				System.out.print(aux.categoria[i] + ";");
			}
		}else {
			System.out.print(p.categoria);
		}
		
		System.out.print("]");
	}
}
