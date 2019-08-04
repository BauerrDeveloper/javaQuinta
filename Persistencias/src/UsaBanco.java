import br.com.rodrigo.dao.DaoProduto;
import br.com.rodrigo.model.Produto;

public class UsaBanco {

	public static void main(String[] args) throws Exception {
		
		DaoProduto pod = new DaoProduto();
		
		Produto onj = new Produto();
		onj.setNome("Maria NN");
		onj.setTelefone("48 999355870");
		pod.inserirProduto(onj);
		
		Produto rod = new Produto();
		rod.setNome("Rodrigo");
		rod.setTelefone("48 999002408");
		pod.inserirProduto(rod);
		

		pod.excluirProduto(6);
		
	

	}

}
