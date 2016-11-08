
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Pessoa;
import model.bean.PessoaFisica;
import model.bean.PessoaJuridica;

/**
 * @author Enaldo
 */
public class CadastroPessoaDao {
    
    Pessoa        pessoa = new Pessoa();
    PessoaFisica pFisica = new PessoaFisica();  
    PessoaJuridica pJur  = new PessoaJuridica();
    
    private String sql           = null;
    private PreparedStatement ps = null;
    private ResultSet rs         = null;
    private Connection con;
    
    public CadastroPessoaDao(){
    
    }
    
    public boolean createPessoa(Pessoa pessoa){
    
        sql = "insert into pessoa (nome, tipo_logadouro, logradouro,"
                + "num_logradouro, bairro, cep, uf, telefone_res, telefone_com, celular"
                + "tipo_pessoa, dt_cadastro) values(?,?,?,?,?,?,?,?,?,?,?,?)";
        con = ConnectionFactory.getConnetion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getTipo_logradouro());
            ps.setString(3, pessoa.getLogradouro());
            ps.setString(4, pessoa.getNumLogradouro());
            ps.setString(5, pessoa.getBairro());
            ps.setString(6, pessoa.getCep());
            ps.setString(7, pessoa.getUf());
            ps.setString(8, pessoa.getTelefone_res());
            ps.setString(9, pessoa.getTelefone_com());
            ps.setString(10, pessoa.getCelular());
            ps.setString(11, pessoa.getTipo_pessoa());
            ps.setString(12, pessoa.getDt_cadastro());       
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com Sucesso!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
            return true;
            
        }catch (SQLException sqle) {
            String sqlState = sqle.getSQLState();
            if(sqlState.equals("23505")){ 
                JOptionPane.showMessageDialog(null, "Pessoa já cadastrada!", 
                "Aviso", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Falha na Conexão:  " + sqle);
            }
        }finally{
            ConnectionFactory.closeConnection(con, ps);
        }
        return false;
    }
    
    public boolean createPessoaFisica(PessoaFisica pFisica){
    
        sql = "insert into pessoa_fisica (cpf, rg, dt_nascimento, sexo) values(?,?,?,?)";
        con = ConnectionFactory.getConnetion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pFisica.getCpf());
            ps.setString(2, pFisica.getRg());
            ps.setString(3, pFisica.getDt_nascimento());
            ps.setString(4, pFisica.getSexo());
     
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Pessoa Física cadastrada com Sucesso!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
            return true;
            
        }catch (SQLException sqle) {
            String sqlState = sqle.getSQLState();
            if(sqlState.equals("23505")){ 
                JOptionPane.showMessageDialog(null, "Pessoa Física já cadastrada!", 
                "Aviso", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Falha na Conexão:  " + sqle);
            }
        }finally{
            ConnectionFactory.closeConnection(con, ps);
        }
        return false;
    }
    
    public boolean createPessoaJuridica(PessoaJuridica pJuridica){
    
        sql = "insert into pessoa_juridica (cnpj, ie, im, nome_fantasia) values(?,?,?,?)";
        con = ConnectionFactory.getConnetion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pJuridica.getCnpj());
            ps.setString(2, pJuridica.getIe());
            ps.setString(3, pJuridica.getIm());
            ps.setString(4, pJuridica.getNome_fantasia());
     
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Pessoa Jurídica cadastrada com Sucesso!",
            "Aviso", JOptionPane.WARNING_MESSAGE);
            return true;
            
        }catch (SQLException sqle) {
            String sqlState = sqle.getSQLState();
            if(sqlState.equals("23505")){ 
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica já cadastrada!", 
                "Aviso", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Falha na Conexão:  " + sqle);
            }
        }finally{
            ConnectionFactory.closeConnection(con, ps);
        }
        return false;
    }    
}
