
public class TestaBanco {

	public static void main(String[] args) {

		Cliente gabriella = new Cliente();
		
		gabriella.nome = "Gabriella Muniz";
		gabriella.cpf = "222.222.222-22";
		gabriella.profissao = "programadora";
		
		Conta contaDaGabriella = new Conta();
		contaDaGabriella.deposita(100);
		
		//associa a cliente Gabriella a conta contaDaGabriella
		contaDaGabriella.titular = gabriella;
		System.out.println(contaDaGabriella.titular.nome);
	}
}
