package exercicios_classes_atributos;

public class TesteContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.nome =  "Tiago Gonçalves Cesar";
		contato.endereco = "Avenida Oscar Alves Rangel ";
		contato.email = "tgcestudos@hotmail.com";
		
		contato.telefones = new String[5];
		contato.telefones[0] = "28999766167";
		contato.telefones[1] = "28999766168";
		contato.telefones[2] = "28999766169";
		
		System.out.println("Nome: " +contato.nome);
		System.out.println("Endereço: " +contato.endereco);
		System.out.println("Email: " +contato.email);
		System.out.println("Telefone: " +contato.telefones[0]);
		
		
	}

}
