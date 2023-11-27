package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Connection.ConnectionFactory;
import Model.Pessoas;
import logs.RegistroOperacoes;

public class PessoasDAO{
    
    //atributos

    private Connection connection;
    private List<Pessoas> pessoas;

    //construtor

    public PessoasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoas_cadastropessoas (NOME VARCHAR(255),ENDERECO VARCHAR(255),FONE VARCHAR(255),CPF VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

      public List<Pessoas> listarTodos() {
        PreparedStatement stmt = null;

        // Declaração do objeto PreparedStatement para executar a consulta
        ResultSet rs = null;

        // Declaração do objeto ResultSet para armazenar os resultados da consulta
        pessoas = new ArrayList<>();

        // Cria uma lista para armazenar os pessoas recuperados do banco de dados
        try {
            stmt = connection.prepareStatement("SELECT * FROM pessoas_cadastropessoas");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto pessoas com os valores do
                // registro

                Pessoas pessoa = new Pessoas(
                        rs.getString("nome"),
                        rs.getString("endereco"),
                        rs.getInt("fone"),
                        rs.getInt("cpf"));
                        
                pessoas.add(pessoa); // Adiciona o objeto pessoas à lista de pessoas
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);

            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return pessoas; // Retorna a lista de pessoas recuperados do banco de dados
    }

    //Cadastrar pessoas no banco

    public void cadastrar(String nome, String endereco, int fone, int cpf ){
        PreparedStatement stmt = null;

        //define a instrução SQL parametrizada para cadastrar na tabela

        String sql = "INSERT INTO pessoas_cadastropessoas (nome, endereco, fone, cpf) VALUES (?, ?, ?, ?)";
        try{
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setInt(3, fone);
            stmt.setInt(4, cpf);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
        }

        //atualizar dados no banco

   //Atualizar dados no banco
    public void atualizar(String nome, String endereco, int fone, int cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela cpf
        String sql = "UPDATE carros_lojacarros SET nome = ?, endereco = ?, fone = ?, valor = ? WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setInt(3, fone);
           
            //cpf é chave primaria não pode ser alterada.
            stmt.setInt(5, cpf);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
            new RegistroOperacoes().registrarOperacao("Cadastro da pessoas : "+cpf+" Atualizado com Sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(int cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela cpf
        String sql = "DELETE FROM carros_lojacarros WHERE cpf = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cpf);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
            new RegistroOperacoes().registrarOperacao("Cadastro da pessoas : "+cpf+" Apagado do Banco com Sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

}