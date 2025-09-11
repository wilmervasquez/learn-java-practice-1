package entidades.ejercicio10;

// 1.20. CONVERSIÓN DE GRADOS CELSIUS A FARENHEIT, KELVIN Y RANKINE
public class ConversorDeTemperatura {
  Double gradosCelsius;

  Double convertirAFarenheit() {
    return (gradosCelsius * 9/5) + 32;
  }

  Double convertirAKelvin() {
    return gradosCelsius + 273.15;
  }

  Double convertirARankine() {
    return (9/5) * gradosCelsius + 492;
  }

  void mostrarResultados() {
    System.out.println("Grados Celsius: " + gradosCelsius + "°");
    System.out.println("Farenheit: " + convertirAFarenheit());
    System.out.println("Kelvin: " + convertirAKelvin());
    System.out.println("Rankine: " + convertirARankine());
  }
}