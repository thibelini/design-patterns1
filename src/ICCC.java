
public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		double iccc;	
		
		if (orcamento.getValor() < 1000.00) {
			iccc = orcamento.getValor() * 0.5;
		}
		else if (orcamento.getValor() >= 1000.00 && orcamento.getValor() <= 3000.00) {
			iccc =  orcamento.getValor() * 0.7;
 		}
		else {
			iccc =  orcamento.getValor() * 0.8 + 30.00;
		}
		
		return iccc;		
	}
	
}
