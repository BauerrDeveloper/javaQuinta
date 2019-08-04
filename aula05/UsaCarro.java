package aula05;

public class UsaCarro {

	public static void main(String[] args) {
		
		Carro[] vetorCarros = new Carro[3];
		
		Carro objCarro1 = new Carro();
		objCarro1.setCodigo("001");
		objCarro1.setMarca("VOlkswagen");
		objCarro1.setPreco(50000.00);
		
		Carro objCarro2 = new Carro();
		objCarro2.setCodigo("002");
		objCarro2.setMarca("Fiat");
		objCarro2.setPreco(70000.00);
		
		Carro objCarro3 = new Carro();
		objCarro3.setCodigo("003");
		objCarro3.setMarca("Chevrolet");
		objCarro3.setPreco(30000.00);
		
		vetorCarros[0] = objCarro1;
		vetorCarros[1] = objCarro2;
		vetorCarros[2] = objCarro3;
		
		for (int i = 0; i < vetorCarros.length; i++) {
			System.out.println("Código: " + vetorCarros[i].getCodigo());
			System.out.println("Marca: " + vetorCarros[i].getMarca());
			System.out.println("Preço R$: " + vetorCarros[i].getPreco());
			System.out.println("-------------------------");
		}
		
	}

}
