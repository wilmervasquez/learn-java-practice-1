package entidades;

// 1.11. ÁREA DE UN TRIÁNGULO EN FUNCIÓN DEL SEMIPERÍMETRO
public class AreaTriangulo {
  Double ladoA;
  Double ladoB;
  Double ladoC;
  Double semiperimetro;

  Double calcularArea() {
    semiperimetro = (ladoA + ladoB + ladoC) / 2;
    return Math.sqrt(
      semiperimetro * 
      (semiperimetro - ladoA) * 
      (semiperimetro - ladoB) * 
      (semiperimetro - ladoC)
    );
  }

  void mostrarResultado() {
    System.out.println("Resultado(Area): " + calcularArea());
  }

  public static void main(String[] args) {
    AreaTriangulo objeto = new AreaTriangulo();

    objeto.ladoA = 12.0;
    objeto.ladoA = 6.0;
    objeto.ladoA = 8.0;

    objeto.mostrarResultado();
  }
}