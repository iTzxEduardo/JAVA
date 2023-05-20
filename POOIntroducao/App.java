package POOIntroducao;

public class App {
    public static void main(String[] args) {

        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua das Flores, 123");
        ana.setIdade(22);
        ana.setNotaCiencias(7);
        ana.setNotaMatematica(8);
        ana.setNotaPortugues(8);
        carlos.getMedia();
        beto.setNome("Roberto da Silva");
        beto.setEndereco("Rua das ruas, 321");
        beto.setIdade(26);
        beto.setNotaCiencias(8);
        beto.setNotaMatematica(7);
        beto.setNotaPortugues(9);
        beto.getMedia();
        carlos.setNome("Carlos Alberto");
        carlos.setEndereco("Rua com rua, 132");
        carlos.setIdade(9);
        carlos.setNotaCiencias(4);
        carlos.setNotaMatematica(6);
        carlos.setNotaPortugues(9);
        carlos.getMedia();
        System.out.println("nome"+ana.getNome());
        System.out.println("Endereço"+ana.getEndereco());
        System.out.println("Contador"+ana.getIdade());
        System.out.println("Contador:" +RegistraAluno.getQuantidadeAlunos());
        
        System.out.println("nome"+beto.getNome());
        System.out.println("Endereço"+beto.getEndereco());
        System.out.println("Idade"+beto.getIdade());
        System.out.println("Contador:" +RegistraAluno.getQuantidadeAlunos());

        System.out.println("nome"+carlos.getNome());
        System.out.println("Endereço"+carlos.getEndereco());
        System.out.println("Idade"+carlos.getIdade());
        System.out.println("Contador:" +RegistraAluno.getQuantidadeAlunos());

       

    }
}
