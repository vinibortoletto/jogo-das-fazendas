package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe abstrata que representa um polígono e implementa a interface Farm.
 */
public abstract class Polygon implements Farm {
  double base;
  double height;

  public Polygon(double base, double height) {
    this.base = base;
    this.height = height;
  }
}
