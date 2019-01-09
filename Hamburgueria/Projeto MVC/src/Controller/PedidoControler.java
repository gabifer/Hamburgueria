package Controller;

import Banco.ConnectionFactory;
import Model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PedidoControler 
{
    private Connection conn;
    
    public PedidoControler() throws Exception
    {
        try 
        {
            this.conn = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso!");
        }
        
        catch (Exception ex) 
        {
          System.out.println("nao conectou! Erro: " + ex.getMessage());
          ex.printStackTrace();
          throw new Exception(ex.getMessage());
        }
    }
    
    public boolean Pedir(Pedido pedido)
    {
        PreparedStatement stmt = null;
        String sql = "Insert into produto(nome, endereco, telefone, lanche, bebida, quantidade, valor) values (?,?,?,?,?,?,?);";
 
        try
        {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pedido.getNome());
            stmt.setString(1, pedido.getNome());
            stmt.setString(2, pedido.getEndereco());
            stmt.setInt(3, pedido.getTelefone());
            stmt.setString(4, pedido.getLanche());
            stmt.setString(5, pedido.getBebida());
            stmt.setInt(6, pedido.getQuantidade());
            stmt.setDouble(7, pedido.getValor());
            stmt.execute();

            return true;
        } 
        
        catch (SQLException ex) 
        {
            System.out.println("Problemas ao cadastrar Produto! Erro: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        } 
        
        finally 
        {
            try 
            {
                ConnectionFactory.closeConnection(conn, stmt);
            } 
            
            catch (Exception ex) 
            {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    } 
    
    
    public boolean Excluir(Pedido pedido)
    {
        PreparedStatement stmt = null;
        String sql = "Delete from produto where nome="+pedido.getNome()+"";
        
        try
        {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, pedido.getNome());
            stmt.setString(2, pedido.getEndereco());
            stmt.setInt(3, pedido.getTelefone());
            stmt.setString(4, pedido.getLanche());
            stmt.setString(5, pedido.getBebida());
            stmt.setInt(6, pedido.getQuantidade());
            stmt.setDouble(7, pedido.getValor());
            stmt.execute();
            
            return true;
        }
        
        catch (SQLException ex) 
        {
            System.out.println("Problemas ao excluir Produto! Erro: " + ex.getMessage());
            ex.printStackTrace();

            return false;
        } 
    }
 }

