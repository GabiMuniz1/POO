package entities; //<-- pacote da classe

public class Product /*<-- nome da classe*/{ 
	
	/*O prefixo "public" indica que o atributo ou método pode ser
usado em outros arquivos*/
	
	public String name; /*<--- Atributo da classe*/
	public double price; /*<--- Atributo da classe*/
	public int quantity; /*<--- Atributo da classe*/
	

	/*<-- double: Tipo do dado que o método retorna (Se o método não retorna nada, usa-se a palavra "void"*/
	/*<-- totalValueInStock: Nome do método*/
	/*<-- (): Lista de parâmetros do método*/
	
	public double totalValueInStock() {
		return price * quantity; /*Corpo do método*/
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
