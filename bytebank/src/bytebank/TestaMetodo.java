package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaGabriela = new Conta();
		contaDaGabriela.saldo = 100;
		contaDaGabriela.deposita(50);
		System.out.println(contaDaGabriela.saldo);
		
		contaDaGabriela.saca(20); /*invoca??o de metodo utiliza ()*/
		System.out.println(contaDaGabriela.saldo);
		
		Conta contaDoSergio = new Conta();
		contaDoSergio.deposita(1000);

		boolean sucessoTransferencia = contaDoSergio.transfere(300, contaDaGabriela);
        if(sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");

        }
		System.out.println(contaDoSergio.saldo);	
		System.out.println(contaDaGabriela.saldo);
		
		contaDaGabriela.titular = "Gabriella Muniz";
		System.out.println(contaDaGabriela.titular);
		}
	}

