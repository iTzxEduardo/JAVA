package POOInterface;

public class Trapezio implements FiguraGeometrica {
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    // construtor
    public Trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // getters e setters

  

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
//metodos implementados da classe FiguraGeometrica(interface)
@Override
public double getArea() {
    // TODO Auto-generated method stub
    return (baseMaior+baseMenor)*altura/2;
}
    @Override
    public String getNomeFigura() {
        // TODO Auto-generated method stub
        return "trapezio";
    }

    @Override
    public double getPerimetro() {
        
        return (baseMaior+baseMenor+lado1+lado2);
    }
}
