import java.util.Scanner;

public class srednia_z_temperatur {

    public static void main(String[] args) {
      double[] temperature = new double[7];
      Scanner inputScanner = new Scanner(System.in);

      for(int i = 0; i < temperature.length; i++) {
        System.out.println("Wprowadź liczbę " + i);
        temperature[i] = inputScanner.nextDouble();
      }

      double summarizedTemp = 0;
      for (double temp : temperature) {
        summarizedTemp += temp;
      }

      System.out.println("Średnia temperatura wynosi " + (summarizedTemp / temperature.length));
    }
  }


