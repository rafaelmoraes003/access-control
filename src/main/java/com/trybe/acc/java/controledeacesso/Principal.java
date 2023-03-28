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

    }

    sc.close();
  }
}
