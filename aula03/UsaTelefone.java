package aula03;

public class UsaTelefone {

	public static void main(String[] args) {
		
		Telefone telefone1 = new Telefone(); //() é o construtor.
		telefone1.setTipoDeTeclado("Físico");
		telefone1.setFabricante("Intelbras");
		
		System.out.println(telefone1.toString());
		
		TelefoneCelular objetoCelular1 = new TelefoneCelular();
		objetoCelular1.setTipoDeTeclado("Virtual");
		objetoCelular1.setFabricante("Samsung");
		objetoCelular1.setSistemaOperacional("Android");
		
		System.out.println(objetoCelular1.toString());
		
		@SuppressWarnings("unused")
		Telefone telefone2 = new Telefone("Fisico 2");
		
	}

}
