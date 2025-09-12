
public class Principal {

	public static void main(String[] args) {
		
		// Objeto = Instâmcia da Classe
		Pessoa victor_obj = new Pessoa();
		
		Pessoa luiz_obj = new Pessoa("Luis", 15);
		
		Pessoa rafael_obj = new Pessoa();
		
		luiz_obj.setNome("Luiz");
		
		System.out.println(victor_obj.getNome()); // sysout + crtl + space
		System.out.println(luiz_obj.getNome());
	}

}
