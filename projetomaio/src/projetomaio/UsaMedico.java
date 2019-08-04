package projetomaio;

public class UsaMedico {

	public static void main(String[] args) throws Exception {
		
		Medico objMedico1 = new Medico();
		Medico objMedico2 = new Medico();
		Pediatra objPediatra = new Pediatra();
		Cardiologista objCardiologista = new Cardiologista();
		
		objMedico1.setNome("Pitangui");
		objMedico1.setCrm("56789");
		
		objMedico2.setNome("Barbara");
		objMedico2.setCrm("12345");
		
		objPediatra.setNome("Dona Doutora");
		objPediatra.setCrm("15923");
		objPediatra.setTipoPaciente("Crian�as");
		
		System.out.println(objMedico1.toString());
		System.out.println(objMedico2.toString());
		System.out.println(objPediatra.toString());
		
		System.out.println("Sal�rio do Pediatra: R$ " + objPediatra.calculaSalario());
		System.out.println("Sal�rio do Cardiologista: R$ " + objCardiologista.calculaSalario());
		
	}

}
