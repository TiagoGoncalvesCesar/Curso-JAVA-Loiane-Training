package herança_modificadores_de_acesso_mais_protected;

public class Aluno extends Pessoa {
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "Maria";
		super.nomeVisibilidade = "Maria";
	}
	
	public Aluno() {
		super();	
	}
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public boolean verifcarAprovado() {
		return true;
	}
	public void metodoQualquer() {
		super.setCpf("1236542");
		
		this.setCpf("5242236");
	}
}
