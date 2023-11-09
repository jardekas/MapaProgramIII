package Entities;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void cadastrarUsuario(String cpf, String telefone, String nome) {
        id += 1;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
    }
    public String toString () {
    	return "Nome: "
    			+ nome +
    			"\n CPF: "
    			+ cpf + 
    			"\n Telefone: "
    			+ telefone;
        
    }
}