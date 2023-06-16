package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        System.out.println("Area="+figura1.getArea()
        +" Perimetro="+figura1.getPerimetro()+" "
        +figura1.getNomeFigura());

        Retangulo figura2=new Retangulo(10, 5);
        System.out.println("Area="+figura2.getArea()
        +" /nPerimetro="+figura2.getPerimetro()+" "
        +figura2.getNomeFigura());

        Trapezio figura3 = new Trapezio(10, 4, 4, 6, 6);
        System.out.println("Area="+figura3.getArea()
        +" /nPerimetro="+figura3.getPerimetro()+" "
        +figura3.getNomeFigura());
    }
}
