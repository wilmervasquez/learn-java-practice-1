package entidades;

// 1.13. TEOREMA DEL COSENO
public class TeoremaDelCoseno {
  Double ladoB;
  Double ladoC;
  Double alfa; // en radianes

  Double calcularLadoDesconocido() {
    return Math.sqrt(
      Math.pow(ladoB, 2) +
      Math.pow(ladoC, 2) -
      2 * ladoB * ladoC * Math.cos(alfa)
    );
  }

  void mostrarResultado() {
    System.out.println("Resultado(Lado desconocido): " + calcularLadoDesconocido());
  }

  public static void main(String[] args) {
    TeoremaDelCoseno objeto = new TeoremaDelCoseno();

    objeto.ladoB = 6.0;
    objeto.ladoC = 9.0;
    objeto.alfa = 0.5235; // 30°

    objeto.mostrarResultado();
  }
}
