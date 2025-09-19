
public class Discente extends Pessoa{

	// Atributos
	int nota1At;
	int nota2At;
	int nota3At;
	int nota4At;
	
	//Construtores:
	public Discente(int nota1Par, int nota2Par, int nota3Par, int nota4Par, String nomePar, int idadePar, Endereco enderecoPar) {
		
		super(nomePar, idadePar, enderecoPar);
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;

	}
	
	//Setter:
	public void setNota1(int nota) {
		this.nota1At = nota;
	}
	
	public void setNota2(int nota) {
		this.nota2At = nota;
	}
	
	public void setNota3(int nota) {
		this.nota3At = nota;
	}
	
	public void setNota4(int nota) {
		this.nota4At = nota;
	}
	
	// getters
	public int getNota1() {
		
	}
}
