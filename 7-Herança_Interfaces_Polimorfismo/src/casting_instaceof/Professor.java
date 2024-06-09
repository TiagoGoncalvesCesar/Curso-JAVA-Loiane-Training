package casting_instaceof;

public class Professor extends Pessoa {
	private String nomeCurso;
	private double salario;
	
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
	public String obterEtiquetaEndereço() {
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		return s;
	}
	
}
