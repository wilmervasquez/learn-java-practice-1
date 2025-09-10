package entidades;

// 1.17. LEY DE SENOS
public class LeyDeSenos {
  Double ladoA;
  Double ladoB;
  Double ladoC;
  // angulos opuestos a los lados en radianes
  Double alfa;
  Double beta;
  Double gamma;


  Double calcularLadoA() {
    return (ladoC / Math.sin(alfa)) * Math.sin(gamma);
  }

  Double calcularLadoB() {
    return (ladoC / Math.sin(beta)) * Math.sin(gamma);
  }

  void mostrarResultado() {
    System.out.println("Resultado:");
    System.out.println("Lado A: " + calcularLadoA());
    System.out.println("Lado B: " + calcularLadoB());
  }

  public static void main(String[] args) {
    LeyDeSenos objeto = new LeyDeSenos();

    objeto.ladoC = 10.0;
    objeto.alfa = Math.toRadians(30);
    objeto.beta = Math.toRadians(45);
    objeto.gamma = Math.toRadians(60);

    objeto.mostrarResultado();
  }
}
