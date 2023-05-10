package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um círculo e implementa a interface Farm.
 */
public class Circle implements Farm {
  private static final double PI = 3.14;
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return PI * (this.radius * this.radius);
  }

}
