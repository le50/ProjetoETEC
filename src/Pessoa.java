
public class Pessoa {
	
	// Abaixo da class = atributo
		String nomeAt;
		int idadeAt;
		Endereco estadoAt;
		
		// Cotrutores
		public Pessoa() {
			//Nada
		}

		public Pessoa(String nomePar, int idadePar) {
			this.nomeAt = nomePar;
			this.idadeAt = idadePar;

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

}
