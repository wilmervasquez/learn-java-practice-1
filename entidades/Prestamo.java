package entidades;

// 1.16. MONTO A DEVOLVER POR UN CAPITAL PRESTADO
public class Prestamo {
  Double capital;
  Double tasaDeInteres;
  Integer periodos;

  Double calcularMontoADevolver() {
    return capital * (1 + tasaDeInteres) * periodos;
  }

  void mostrarResultado() {
    System.out.println("Resultado(Monto a devolver): " + calcularMontoADevolver());
  }

  public static void main(String[] args) {
    Prestamo objeto = new Prestamo();

    objeto.capital = 15000.0;
    objeto.tasaDeInteres = 0.09; 
    objeto.periodos = 5; 

    objeto.mostrarResultado();
  }
}
