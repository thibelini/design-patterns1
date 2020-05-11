
public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos repovados nao recebem desconto extra");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reporvados nao podem ser Aprovado");	
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos ja esta reprovado");	
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estaduaAtual = new Finalizado();
		
	}

}
