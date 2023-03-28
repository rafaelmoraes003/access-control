package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Classe Report.
 */
public class Report {
  /**
   * Método printReport - Imprime informções sobre os visitantes.
   */
  public void printReport(int menores, int adultas, int aPartirDeCinquenta, int total) {
    Locale.setDefault(Locale.US);

    DecimalFormat df = new DecimalFormat("0.00");

    String menoresQtd;
    String adultasQtd;
    String aPartirDeCinquentaQtd;

    if (total <= 0) {
      menoresQtd = adultasQtd = aPartirDeCinquentaQtd = "0.0";
    } else {
      menoresQtd = df.format((double) menores * 100 / total);
      adultasQtd = df.format((double) adultas * 100 / total);
      aPartirDeCinquentaQtd = df.format((double) aPartirDeCinquenta * 100 / total);
    }



    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultas);
    System.out.println("a partir de 50: " + aPartirDeCinquenta);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("menores: " + menoresQtd + "%");
    System.out.println("adultas: " + adultasQtd + "%");
    System.out.println("a partir de 50: " + aPartirDeCinquentaQtd + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);
  }
}
