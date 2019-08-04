import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.rodrigo.dao.DaoAluno;
import br.com.rodrigo.model.Aluno;

public class UsaAluno {

	public static void main(String[] args) throws Exception {
		
		DaoAluno objAluno = new DaoAluno();
				
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rodrigo");
		aluno1.setCpf("12345678900");
		aluno1.setMatricula("000001");
		objAluno.inserirAluno(aluno1);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setId(1);
		aluno2.setNome("Rafaela");
		aluno2.setCpf("05234095916");
		aluno2.setMatricula("000002");
		

		
		DaoAluno daoAluno = new DaoAluno();
		daoAluno.inserirAluno(aluno1);
		daoAluno.inserirAluno(aluno2);

		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno = daoAluno.listaTodos();
		
		for(Aluno a: listaAluno) {
			System.out.println(a.toString());
		}
		
		List<Aluno> listaAlunoPorRange = new ArrayList<Aluno>();
		listaAlunoPorRange = daoAluno.listaPorRange(13, 16);
		
		for(Aluno b: listaAlunoPorRange) {
			System.out.println(b.toString());
		}
		
		System.out.println("");
		System.out.println("Exibindo nomes iniciados por: 'Ra' ");
		System.out.println("");
		
		List<Aluno> listaPorNomeInicio = new ArrayList<Aluno>();
		listaPorNomeInicio = daoAluno.listaPorNomeInicio("Ca");
		
		for (Aluno c: listaPorNomeInicio) {
			System.out.println(c.toString());
			
		}
		
		
	}

}
