package relacionamento_tem_um;

public class TesteContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Tiago");
		// contato.setEndreco("Espirito Santo");
		//contato.setTelefone("28 99912-1234");

		// Relacionamento tem-un endereço

		Endereco end = new Endereco();
		end.setNomeRua("Rua José Cardoso");
		end.setNumero("1421");
		end.setComplemento("Ap 201");
		end.setCidade("Vitória");
		end.setEstado("Espirito Santo");
		end.setCep("295643-123");

		contato.setEndereco(end);
		
		// Relacionamento tem-un telefome
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDd("28");
		telefone.setNumero("9999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDd("28");
		telefone2.setNumero("3542-4545");
		
		Telefone[]telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		// contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		// Teste saída no console
		System.out.println(contato.getNome());
		// System.out.println(contato.getTelefone());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDd() + " " + contato.getTelefone().getNumero());
		}*/
		if (contato != null && contato.getTelefones() != null)
			for (Telefone t: contato.getTelefones()) {
				System.out.println(t.getDd() + " " + t.getNumero());
			}
	}
}