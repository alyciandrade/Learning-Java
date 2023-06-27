package Questao02;

public class Usuario {
	private String nome;
	private int idade;

	public void cadastrar(String nome, int idade) {
		try {
			if (nome == null || nome.isEmpty() && idade < 18 || idade > 120) {
				throw new IllegalArgumentException("\nO nome não pode ser NULO ou VAZIO. \nIdade Inválida.");
			}

			if (idade < 18 || idade > 120) {
				throw new IllegalArgumentException("\nIdade Inválida.");
			}
			if (nome == null || nome.isEmpty()) {
				throw new IllegalArgumentException("\nO nome não pode ser NULO ou VAZIO.");
			}

			this.nome = nome;
			this.idade = idade;

			System.out.println("Usuário cadastrado com sucesso!");

		} catch (IllegalArgumentException e) {

			System.out.println("Erro ao cadastrar!" + e.getMessage());

		} catch (Exception ex) {

			System.out.println("Erro ao cadastrar!" + ex.getMessage());
		}
	}
}
