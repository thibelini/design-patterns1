
public class TesteDescontoChainOfResponsibility {

	public static void main(String[] args) {
		calculadorDeDesconto descontos = new calculadorDeDesconto();
	 
		 Orcamento orcamento = new Orcamento(600.00);
		 orcamento.adicionaItem(new Item("Caneta", 250.00));
		 orcamento.adicionaItem(new Item("Lapis", 250.00));
		 
		 double descontoFinal = descontos.calcula(orcamento);
		 
		 System.out.println(descontoFinal);
	 
	}
	
}
