import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;


public class lotek_zlotek {
//sami wybieramy z jakiego przedziału liczb mają sie losowac, ile ma być liczb w jednym losie i ile losowań

public static void main(String[] args)  throws IOException {
  Random los = new Random();
  Scanner licznik = new Scanner(System.in);
  int j;
  String nazwa_pliku = "c:\\lotek_zlotek.txt";
  //FileWriter plik1 =null;
  PrintWriter plik1 = null;

      plik1 = new PrintWriter(nazwa_pliku);

    System.out.println("Podaj zakres z jakiego mają się liczby losować (losowanie będzie się odbywało z pominięciem cyfry 0");
    j = licznik.nextInt();
    int[] i = new int[j];
    byte a;
    int kopia;
    System.out.println("Podaj ile liczb wylosować w jednej turze");
    //i[j] =licznik.nextInt();
    byte z = licznik.nextByte();
    System.out.println("Ile losowań chcesz przeprowadzić");
    byte x = licznik.nextByte();
    for (byte b = 1; b <= x; b++) {
      for (a = 1; a <= z; a++) {

        i[a] = los.nextInt(j);
        /*plik1.print("  |  ");
        plik1.print(i[a]);    //te 3 działały
        plik1.print("  |  ");*/
        if (i[a] == 0) {
          i[a] = los.nextInt(j);
          kopia = i[a];

          //System.out.print("  |  " + i[a]);
          //System.out.flush();
          //System.out.println("co jest grane");}
        }
        System.out.print("  |  " + i[a]);
          plik1.print("  |  " + i[a] + "  |  ");

        //plik1.write("  |  " + i[a] + "/n");
      }

      System.out.println();
      //plik1.write("  |  "+ i[a]);
      plik1.println("  ||  Los nr "+a);

    }
    System.out.println();
    plik1.close();
  return;

  }

}
