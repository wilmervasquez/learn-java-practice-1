package entidades;

// 1.20. CONVERSIÓN DE GRADOS CELSIUS A FARENHEIT, KELVIN Y RANKINE
public class ConversorDeTemperatura {
  Double gradosCelsius;

  Double convertirAFarenheit(Double gradosCelsius) {
    return (gradosCelsius * 9/5) + 32;
  }

  Double convertirAKelvin(Double gradosCelsius) {
    return gradosCelsius + 273.15;
  }

  Double convertirARankine(Double gradosCelsius) {
    return (9/5) * gradosCelsius + 492;
  }

  void mostrarResultados() {
    System.out.println("Grados Celsius: " + gradosCelsius + "°");
    System.out.println("Farenheit: " + convertirAFarenheit(gradosCelsius));
    System.out.println("Kelvin: " + convertirAKelvin(gradosCelsius));
    System.out.println("Rankine: " + convertirARankine(gradosCelsius));
  }

  public static void main(String[] args) {
    ConversorDeTemperatura objeto = new ConversorDeTemperatura();

    objeto.gradosCelsius = 57.0;

    objeto.mostrarResultados();
  }
}