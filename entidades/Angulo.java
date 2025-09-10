package entidades;

// 1.18. CONVERSIÓN DE GRADOS SEXAGESIMALES A CENTESIMALES Y RADIANES
public class Angulo {
  Double grados;

  Double convertirACentesimales(Double grados) {
    return grados * (10.0 / 9.0);
  }

  Double convertirARadianes(Double grados) {
    return 180 / (Math.PI * grados);
  }

  void mostrarResultados() {
    System.out.println("Grados: " + grados);
    System.out.println("Centesimales: " + convertirACentesimales(grados));
    System.out.println("Radianes: " + convertirARadianes(grados));
  }

  public static void main(String[] args) {
    Angulo objeto = new Angulo();

    objeto.grados = 30.0;

    objeto.mostrarResultados();
  }
}

