
public class Pessoa {
	
	// Abaixo da class = atributo
		String nomeAt;
		int idadeAt;
		Endereco endereco;
		
		// Cotrutores
		public Pessoa() {
			//Nada
		}

		public Pessoa(String nomePar, int idadePar, Endereco enderecoPar) {
			this.nomeAt = nomePar;
			this.idadeAt = idadePar;
			this.endereco = enderecoPar;

		}
		
		// Getters
		public String getNome() {
			return nomeAt;
		}

		public int getIdade() {
			return idadeAt;
		}
		
		//Setters
		public void setNome(String nomePar) {
			this.nomeAt = nomePar.toUpperCase(); // Tudo maíscula
		}
		
		public void setIdade(int idadePar) {
			this.idadeAt = idadePar;
		}
		
		
		public void setEndereco(Endereco enderecoPar) {
			this.endereco = enderecoPar;
		}
		
		public Endereco getEndereco() {
			return endereco;
		}

}
