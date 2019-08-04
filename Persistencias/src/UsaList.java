import java.util.ArrayList;
import java.util.List;

import br.com.rodrigo.model.Produto;

public class UsaList {

	public static void main(String[] args) {
		//List + <tipo da lista> + nome da lista = new ArrayList<tipo da lista();>
		List<String> nomes = new ArrayList<String>();
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Farinha");
		p1.setTelefone("48 999355870");
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Arroz");
		p2.setTelefone("48 999002408");
		
		produtos.add(p1);
		produtos.add(p2);
		
		for (Produto p: produtos) {
			System.out.println(p.getId());
			System.out.println(p.getNome());
			System.out.println(p.getTelefone());
			System.out.println(" ******************* ");
		}
		
		
		nomes.add("Joana");
		nomes.add("Maria");
		nomes.add("Narnia");
		nomes.add("Paula");
		nomes.add("Capitã Marvel");
		nomes.add("Homem de Ferro");
		nomes.add("Capitão América");
		nomes.add("Hulk");
		nomes.add("Pantera Negra");
		nomes.add("Homem Formiga");
		nomes.add(10, "Elemento adicionado na posição 10");
		
		
		
		
		
		for (String l: nomes) {
			System.out.println(l);
		}
		
		nomes.remove(3);
		
		System.out.println(">>>> REMOVE <<<<");
		for (String l: nomes) {
			System.out.println(l);
		}
		
		if (nomes.contains("Narnia")) {
			System.out.println(nomes.indexOf("Narnia"));
		}
		
		if (nomes.contains("Narnia")) {
			System.out.println(nomes.indexOf("Narnia"));
			nomes.remove(nomes.indexOf("Narnia"));
		}
		
		for (String l: nomes) {
			System.out.println(l);
		}
		
		System.out.println("----------");
		System.out.println(nomes.get(5));
		System.out.println("----------");
		System.out.println(nomes.get(3));
	}

}
