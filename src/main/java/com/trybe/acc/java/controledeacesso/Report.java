package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Classe Report.
 */
public class Report {
  /**
   * Método getReport - agrupa informações de visitantes.
   */
  public void getReport(ArrayList<Short> ages) {
    short menores = 0;
    short adultas = 0;
    short idosos = 0;
    short total = 0;

    for (short age : ages) {
      if (age < 18) {
        menores += 1;
      } else if (age >= 18 && age <= 49) {
        adultas += 1;
      } else {
        idosos += 1;
      }
      total += 1;
    }

    printReport(menores, adultas, idosos, total);
  }

  /**
   * Método printReport - Imprime informações sobre os visitantes.
   */
  public void printReport(short menores, short adultas, short idosos, short total) {
    Locale.setDefault(Locale.US);

    DecimalFormat df = new DecimalFormat("0.00");

    String menoresQtd;
    String adultasQtd;
    String idososQtd;

    if (total <= 0) {
      menoresQtd = adultasQtd = idososQtd = "0.0";
    } else {
      menoresQtd = df.format((double) menores * 100 / total);
      adultasQtd = df.format((double) adultas * 100 / total);
      idososQtd = df.format((double) idosos * 100 / total);
    }

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultas);
    System.out.println("a partir de 50: " + idosos);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + menoresQtd + "%");
    System.out.println("adultas: " + adultasQtd + "%");
    System.out.println("a partir de 50: " + idososQtd + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);
  }
}
