package aula04;

public class UsaAviao {

	public static void main(String[] args) {
		
		Aviao objAviao1 = new Aviao();
		Aviao objAviao2 = new Aviao(2, "Jumbo");
		
		objAviao1.setCodigo(1);
		objAviao1.setNomeAviao("Rafalle");
		
		System.out.println(objAviao1.getCodigo());
		System.out.println(objAviao1.getNomeAviao());
		
		System.out.println(objAviao2.getCodigo());
		System.out.println(objAviao2.getNomeAviao());
		
		
	}

}
