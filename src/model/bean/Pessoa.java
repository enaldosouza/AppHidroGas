
package model.bean;

public class Pessoa {
    
    private String nome;
    private String tipo_logradouro;
    private String bairro;
    private String cep;
    private String uf;
    private String telefone_res;
    private String telefone_com;
    private String celular;
    private String tipo_pessoa;
    private String dt_cadastro;
    private String senha;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_logradouro() {
        return tipo_logradouro;
    }

    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone_res() {
        return telefone_res;
    }

    public void setTelefone_res(String telefone_res) {
        this.telefone_res = telefone_res;
    }

    public String getTelefone_com() {
        return telefone_com;
    }

    public void setTelefone_com(String telefone_com) {
        this.telefone_com = telefone_com;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }

    public String getDt_cadastro() {
        return dt_cadastro;
    }

    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }

    public String getSenha() {
        return senha;
    }

     public void setSenha(String senha) {
        this.senha = senha;
    }
}
