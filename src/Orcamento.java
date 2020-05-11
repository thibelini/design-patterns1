import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;	
	
	protected EstadoDeUmOrcamento estaduaAtual;

	public Orcamento (double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estaduaAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		// nao pode ser alterado pelo mundo de fora, somente pela classe
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estaduaAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estaduaAtual.aprova(this);
	}
	
	public void reprova() {
		estaduaAtual.reprova(this);
	}
	
	public void finaliza() {
		estaduaAtual.finaliza(this);
	}
	
	

}
