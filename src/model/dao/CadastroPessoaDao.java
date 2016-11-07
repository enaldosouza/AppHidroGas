
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Pessoa;

/**
 * @author Enaldo
 */
public class CadastroPessoaDao {
    
    Pessoa  pessoa = new Pessoa();
    private String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection con;
    
    public CadastroPessoaDao(){
    
    }
    
    public boolean create(Pessoa pessoa){
    
        sql = "insert into pessoa (cidade_cod_cidade, nome, tipo_logadouro, logradouro,"
                + "num_logradouro, bairro, cep, uf, telefone_res, telefone_com, celular"
                + "tipo_pessoa, dt_cadastro, dt_desativacao) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        con = ConnectionFactory.getConnetion();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pessoa.getCidadeCodCidade());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getTipo_logradouro());
            ps.setString(4, pessoa.getLogradouro());
            ps.setString(5, pessoa.getNumLogradouro());
            ps.setString(6, pessoa.getBairro());
            ps.setString(7, pessoa.getCep());
            ps.setString(8, pessoa.getUf());
            ps.setString(9, pessoa.getTelefone_res());
            ps.setString(9, pessoa.getTelefone_com());
            ps.setString(10, pessoa.getCelular());
            ps.setString(11, pessoa.getTipo_pessoa());
            ps.setString(12, pessoa.getDt_cadastro());       
            ps.setString(13, pessoa.getDt_desativacao());  
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
}
