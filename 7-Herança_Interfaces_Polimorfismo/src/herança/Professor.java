package herança;

public class Professor extends Pessoa {
	
	private String nomeCurso;
	private double salario;
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomrCurso) {
		this.nomeCurso = nomrCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
}
