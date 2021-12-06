public class App {
    public static void main(String[] args) throws Exception {

        // Instanciamento da classe Circulo
        Circulo circulo = new Circulo(5, "Vermelho");
        System.out.println("Círculo \n" + circulo.toString()); 

        System.out.println("========================");

        // Instanciamento da classe Triangulo
        Triangulo triangulo = new Triangulo(10, 5, "Amarelo");
        System.out.println("Triangulo \n" + triangulo.toString());

        System.out.println("========================");

        // Instanciamento da classe Retangulo
        Retangulo retangulo = new Retangulo(15, 20, "Azul");
        System.out.println("Retangulo \n" + retangulo.toString());

        System.out.println("========================");

        // Instanciamento da classe Quadrado
        Quadrado quadrado = new Quadrado(5, "Roxo");
        System.out.println("Quadrado \n" + quadrado.toString());
    }
}
