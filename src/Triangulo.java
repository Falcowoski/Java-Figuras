public class Triangulo extends Figura {
    public double base;
    public double altura;

    Triangulo(double base, double altura, String color) {
        setAltura(altura);
        setBase(base);
        setColor(color);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return this.getBase() * this.getAltura() / 2;
    }

    @Override
    public String toString() {
        String color = "Cor: " + getColor();
        String base = "Base: " + getBase();
        String altura = "Altura: " + getAltura();
        String area = "Área: " + area();

        String classInfo = color + "\n" + base + "\n" + altura + "\n" + area;

        return classInfo;
    }
}