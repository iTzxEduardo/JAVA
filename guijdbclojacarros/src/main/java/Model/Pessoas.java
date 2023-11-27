package Model;

public class Pessoas {
    
    //atributos

    private String nome;
    private String endereco;
    private int fone;
    private int cpf;

      //construtor

    public Pessoas(String nome, String endereco, int fone, int cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.cpf = cpf;
    }

    //getter setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    } 

  

    
}
