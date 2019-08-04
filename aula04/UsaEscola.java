package aula04;

public class UsaEscola {

	public static void main(String[] args) {
		
		Escola objEscola1 = new Escola();
		Escola objEscola2 = new Escola("Colégio Militar Feliciano Nunes Pires", "Av. MAdre Benvenuta, 9875", "(48) 3632-6565");
		
		
		objEscola1.setNomeEscola("Escola Estadual Simão José Hess");
		objEscola1.setEnderecoEscola("Av. Madre Benvenuta, 1234");
		objEscola1.setTelefoneEscola("(48) 3234-9999");
		
		System.out.println(objEscola1.getNomeEscola());
		System.out.println(objEscola1.getEnderecoEscola());
		System.out.println(objEscola1.getTelefoneEscola());
		
		System.out.println();
		
		System.out.println(objEscola2.getNomeEscola());
		System.out.println(objEscola2.getEnderecoEscola());
		System.out.println(objEscola2.getTelefoneEscola());
		

	}

}
