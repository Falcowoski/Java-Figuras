public class Quadrado extends Retangulo {
    Quadrado(double lado, String color) {
        super(lado, lado, color);
    }

    @Override
    public String toString() {
        String color = "Cor: " + getColor();
        String lado = "Lado: " + getLado1();
        String area = "Área: " + area();

        String classInfo = color + "\n" + lado + "\n" + area;

        return classInfo;
    }
}
