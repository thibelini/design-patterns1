
public class Aprovado implements EstadoDeUmOrcamento {

	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento ja esta Aprovado");	
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos aprovados nao podem ser reprovados");	
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estaduaAtual = new Finalizado();
		
	}
}
