package Model;

public class Vendas {
    // atributos
    private String carros; // Alterado de "cpf" para "carros"
    private String cliente; // Alterado de "nome" para "cliente"
    private String valorVenda; // Adicionado o atributo "valorVenda"

    // construtor
    public Vendas(String carros, String cliente, String valorVenda) {
        this.carros = carros;
        this.cliente = cliente;
        this.valorVenda = valorVenda;
    }

    // gets e setters
    public String getCarros() {
        return carros;
    }

    public void setCarros(String carros) {
        this.carros = carros;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }
}