package entities; //<-- pacote da classe

public class Product /*<-- nome da classe*/{ 
	
	/*O prefixo "public" indica que o atributo ou m�todo pode ser
usado em outros arquivos*/
	
	public String name; /*<--- Atributo da classe*/
	public double price; /*<--- Atributo da classe*/
	public int quantity; /*<--- Atributo da classe*/
	

	/*<-- double: Tipo do dado que o m�todo retorna (Se o m�todo n�o retorna nada, usa-se a palavra "void"*/
	/*<-- totalValueInStock: Nome do m�todo*/
	/*<-- (): Lista de par�metros do m�todo*/
	
	public double totalValueInStock() {
		return price * quantity; /*Corpo do m�todo*/
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueInStock());
	}
}
