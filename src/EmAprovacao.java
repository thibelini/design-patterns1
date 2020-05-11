	
public class EmAprovacao implements EstadoDeUmOrcamento {
	
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estaduaAtual = new Aprovado();		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estaduaAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos em aprovacao nao podem ir direto para finalizado");		
	}
	
}
