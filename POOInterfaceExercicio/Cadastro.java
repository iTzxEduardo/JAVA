package POOInterfaceExercicio;

public class Cadastro {
    //atributos
    private String nome;
    private double altura;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    // construtor
    public Cadastro(String nome, double altura, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.anoNascimento = anoNascimento;
        this.mesNascimento = mesNascimento;
        this.diaNascimento = diaNascimento;
    }
    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    
    //métodos Imprimir e Calcular idade

    public int calcularIdade(){
        int idade;
        if(diaNascimento<=29 && mesNascimento<=5 ){
            idade = 2023 - anoNascimento;
        }   else{
            idade = 2023 - anoNascimento - 1;
        }
        return idade;
    }
    public void calcularIdade1(){
        int idade;
        if(diaNascimento<=29 && mesNascimento<=5 ){
            idade = 2023 - anoNascimento;
        }   else{
            idade = 2023 - anoNascimento - 1;
        }
        System.out.println("A Idade é "+idade);
    }
    public void imprimirInfo() {
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Nascimento: "
                +diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
    }

    

}
