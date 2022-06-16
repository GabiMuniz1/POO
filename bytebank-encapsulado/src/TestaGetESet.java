
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente gabriella = new Cliente();
		//conta.titular = gabriella;
		gabriella.setNome("Gabriella Muniz");
		
		conta.setTitular(gabriella);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
	}

}
