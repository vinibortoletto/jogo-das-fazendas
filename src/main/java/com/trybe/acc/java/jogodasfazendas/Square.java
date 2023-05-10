package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um quadrado e implementa a interface Farm.
 */
public class Square implements Farm {
  double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }

}
