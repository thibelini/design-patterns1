import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String reazaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	public List<ItemDaNota> itens;
	public String observacao;
	
	public String getReazaoSocial() {
		return reazaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public double getImpostos() {
		return impostos;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public String getObservacao() {
		return observacao;
	}
	
	

}
