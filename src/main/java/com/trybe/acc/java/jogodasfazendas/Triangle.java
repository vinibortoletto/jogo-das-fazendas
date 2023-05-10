package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa um triângulo e estende a classe abstrata Polygon.
 */
public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
  }

  @Override
  public double area() {
    return (this.base * this.height) / 2;
  }

}
