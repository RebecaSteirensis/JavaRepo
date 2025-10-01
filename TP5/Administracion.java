import java.util.ArrayList;

public class Administracion {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(new Punto( 1, 2), 8);
        Triangulo triangulo = new Triangulo(new Punto(3,2), 2.5, 3.8);
        Circulo circulo = new Circulo(1.13 , new Punto(23, 9));
        Elipse elipse = new Elipse(3.2, 1.27, new Punto());

        Jardin wings = new Jardin("Wings");
        wings.agregarFigura(cuadrado);
        wings.agregarFigura(triangulo);
        wings.agregarFigura(circulo);
        wings.agregarFigura(elipse);

        wings.detalleFiguras();
    }
}