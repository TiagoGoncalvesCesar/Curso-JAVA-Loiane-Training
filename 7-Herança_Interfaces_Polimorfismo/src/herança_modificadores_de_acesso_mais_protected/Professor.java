package herança_modificadores_de_acesso_mais_protected;

public class Professor extends Pessoa {
	private String nomeCurso;
	private double salario;
	
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Maria";
		super.nomeVisibilidade = "Maria";
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
