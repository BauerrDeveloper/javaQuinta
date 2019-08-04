package projetomaio;

public class UsaCombustivel {

	public static void main(String[] args) throws Exception {
		
		Combustivel objCombustivel = new Combustivel();
		Combustivel objCombustivel2 = new Combustivel();
		CombustivelComum objCombustivelComum = new CombustivelComum();
		CombustivelAditivado objCombustivelAditivado = new CombustivelAditivado();
		
		
		objCombustivel.setCor("Amarelo");
		objCombustivel.setOctanagem("Alta");
			
		
		objCombustivel2.setCor("Roxo");
		objCombustivel2.setOctanagem("Baixa");
		
		objCombustivelComum.setCor("Vermelho");
		objCombustivelComum.setOctanagem("Alta");
		objCombustivelComum.setPreco(2.50);
		
		objCombustivelAditivado.setCor("Preto");
		objCombustivelAditivado.setOctanagem("Baixa");
		objCombustivelAditivado.setPrecoA(2.89);
		
		
		
		
		System.out.println(objCombustivel.toString());
		System.out.println(objCombustivel2.toString());
		System.out.println(objCombustivelComum.toString());
		System.out.println(objCombustivelAditivado.toString());
		
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		System.out.println(" ");
		
		System.out.println("Preço do Combustivel Implementado");
		System.out.println("Preço combustivel comum: " + objCombustivelComum.calculoPrecoCombustivel());
		System.out.println("Preço combustivel aditivado: " + objCombustivelAditivado.calculoPrecoCombustivel());
		
		CalculaCombustivel objCI = new CombustivelComum();
		CalculaCombustivel objCII = new CombustivelAditivado();
		
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		System.out.println(" ");
		
		System.out.println(objCI.calculoPrecoCombustivel());
		System.out.println(objCII.calculoPrecoCombustivel());

	}

}
