public class Retangulo extends Figura {
    public double lado1;
    public double lado2;

    Retangulo(double lado1, double lado2, String color) {
        setLado1(lado1);
        setLado2(lado2);
        setColor(color);
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public double area() {
        return this.getLado1() * this.getLado2();
    }

    @Override
    public String toString() {
        String color = "Cor: " + getColor();
        String lado1 = "Lado 1: " + getLado1();
        String lado2 = "Lado 2: " + getLado2();
        String area = "Área: " + area();

        String classInfo = color + "\n" + lado1 + "\n" + lado2 + "\n" + area;

        return classInfo;
    }
}
