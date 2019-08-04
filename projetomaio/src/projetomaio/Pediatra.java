package projetomaio;

public class Pediatra extends Medico implements Medicos {

	private String tipoPaciente;
	
	public Pediatra() {
		
	}

	public String getTipoPaciente() {
		return tipoPaciente;
	}

	public void setTipoPaciente(String tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

	@Override
	public String toString() {
		return "Pediatra [tipoPaciente=" + tipoPaciente + ", Nome=" + getNome() + ", CRM=" + getCrm() + "]";
	}

	@Override
	public Double calculaSalario() throws Exception {
		return 3000.00;
	}

	@Override
	public int geraIdade() throws Exception {
		return 40;
	}

	@Override
	public void escreveConsulta() throws Exception {
		System.out.println("Consulta as 13:00 horas.");
		
	}


	

}
