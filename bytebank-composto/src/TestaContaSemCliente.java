
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaGabriella = new Conta();
		System.out.println(contaDaGabriella.getSaldo());
		
		contaDaGabriella.titular = new Cliente();
		System.out.println(contaDaGabriella.titular);
		
		contaDaGabriella.titular.nome = "Gabriella";
		System.out.println(contaDaGabriella.titular.nome);
	}

}
