package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Short> ages = new ArrayList<Short>();

    short option = 1;

    while (option == 1) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");

      option = sc.nextShort();

      if (option != 1 && option != 2) {
        System.out.println("Entre com uma opção válida!");
        option = 1;
        continue;
      }

      if (option == 2) {
        Report report = new Report();
        report.getReport(ages);
        break;
      }

      System.out.println("Entre com a idade:");
      short age = sc.nextShort();

      if (age < 18) {
        System.out.println("Pessoa cliente menor de idade, catraca liberada!");
      } else if (age >= 18 && age <= 49) {
        System.out.println("Pessoa adulta, catraca liberada!");
      } else {
        System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
      }

      ages.add(age);
    }

    sc.close();
  }
}
