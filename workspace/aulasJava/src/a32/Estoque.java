package a32;

public class Estoque 
{
	private String nome;
	private int qtdAtual,qtdMinima;
	
	public Estoque()
	{
		
	}
	
	public Estoque(String nome,int qtdAtual,int qtdMinima)
	{
		this.nome=nome;
		this.qtdAtual=qtdAtual;
		this.qtdMinima=qtdMinima;
	}
	
	public void mudarNome(String nome)
	{
		this.nome=nome;
	}
	
	public void mudarQtdMinimma(int qtdMinima)
	{
		if(qtdMinima>0)
		{
			this.qtdMinima=qtdMinima;
		}
	}
	
	public void repor(int qtd)
	{
		if(qtd>0)
		{
			qtdAtual += qtd;
		}else{
			System.out.println("valor invalido");
		}
	}
	
	public void darBaixa(int qtd)
	{
		if((qtdAtual - qtd)>0)
		{
			qtdAtual -= qtd;
		}else{
			System.out.println("valor invalido");
		}
	}
	
	public String mostra()
	{
		return "o produto "+nome+" esta com "+qtdAtual+" sendo o minimo de "+qtdMinima;
	}
	
	public Boolean precisaRepor()
	{
		if (qtdAtual<=qtdMinima)
		{
			return true;
		}else{
			return false;
		}
	}

}
