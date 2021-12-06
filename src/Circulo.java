import java.lang.Math;

public class Circulo extends Figura {
    public double raio;

    Circulo(double raio, String color) {
        setRaio(raio);
        setColor(color);
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double area() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double diametro() {
        return getRaio() * 2;
    }

    @Override
    public String toString() {
        String color = "Cor: " + getColor();
        String raio = "Raio: " + getRaio();
        String area = "Área: " + area();
        String diametro = "Diâmetro: " + diametro();

        String classInfo = color + "\n" + raio + "\n" + area + "\n" + diametro;

        return classInfo;
    }
}
