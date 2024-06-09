package exercicio_relacionamento_tem_um_2;

public class Curso {
	private String nome;
	private String horario;
	private Aluno[]alunos;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
}
