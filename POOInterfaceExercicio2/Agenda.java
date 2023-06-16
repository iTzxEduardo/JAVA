package POOInterfaceExercicio2;

public class Agenda {
    int idade;
    String nome;
    double Altura;

    
    public Agenda(int idade, String nome, double atura) {
        this.idade = idade;
        this.nome = nome;
        this.Altura = atura;
    }
    public Agenda() {
        
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAtura() {
        return Altura;
    }
    public void setAtura(double atura) {
        this.Altura = atura;
    }
    
    
}
