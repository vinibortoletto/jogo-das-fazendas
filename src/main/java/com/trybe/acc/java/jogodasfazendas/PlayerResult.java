package com.trybe.acc.java.jogodasfazendas;

/**
 * Classe que representa os resultados de um jogador no jogo das fazendas.
 */
public class PlayerResult {
  String playerName;
  Farm[] farms;

  public PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }

  /**
   * Calcula a pontuação do jogador com base nas áreas das fazendas que possui.
   *
   * @return a pontuação do jogador
   */
  public double score() {
    double score = 0.0;

    for (Farm farm : this.farms) {
      score += farm.area();
    }

    return score;
  }

  public String toString() {
    return "";
  }
}
