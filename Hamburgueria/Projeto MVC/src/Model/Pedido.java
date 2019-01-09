package Model;

public class Pedido 
{
    private String nome;
    private String endereco;
    private int telefone;
    private String lanche;
    private String bebida;
    private int quantidade;
    private Double valor;
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public String getEndereco()
    {
        return endereco;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public int getTelefone()
    {
        return telefone;
    }
    
    public void setLanche(String lanche)
    {
        this.lanche = lanche;
    }
    
    public String getLanche()
    {
        return lanche;
    }
    
    public void setBebida(String bebida)
    {
        this.bebida = bebida;
    }
    
    public String getBebida()
    {
        return bebida;
    }
    
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade()
    {
        return quantidade;
    }
    
    public void setValor(Double valor)
    {
        this.valor = valor;
    }
    
    public Double getValor()
    {
        return valor;
    }
}
