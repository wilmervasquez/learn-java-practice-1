package entidades;

// 1.14. DISTANCIA ENTRE DOS PUNTOS
public class DistanciaDePuntos {
  Double x1;
  Double y1;
  Double x2;
  Double y2;

  Double calcularDistancia() {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  void mostrarResultado() {
    System.out.println("Resultado(Distancia): " + calcularDistancia());
  }

  public static void main(String[] args) {
    DistanciaDePuntos objeto = new DistanciaDePuntos();

    objeto.x1 = 2.0;
    objeto.y1 = 2.0;
    objeto.x2 = 2.0;
    objeto.y2 = 2.0;

    objeto.mostrarResultado();
  }
}
