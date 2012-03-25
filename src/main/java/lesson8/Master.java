package lesson8;

import java.util.ArrayList;


/**
 * @author yamashita
 * @version $Revision$, 2012/02/22
 */
public class Master {

  private ArrayList<Player> players = new ArrayList<Player>();

  /**
   * @param cards
   */
  public void prepareGame(Hand cards) {
    System.out.println("「カードを配ります。」"); //$NON-NLS-1$
    cards.shuffle();
    int numberOfCards = cards.getNumberOfCards();
    int numberOfPlayers = this.players.size();
    for (int index = 0; index < numberOfCards; index++) {
      Card card = cards.pickCard(0);
      Player player = this.players.get(index % numberOfPlayers);
      player.receiveCard(card);
    }
  }

  /**
   * 
   */
  public void startGame() {
    System.out.println("\n [ゲームを開始します」"); //$NON-NLS-1$
    for (int count = 0; this.players.size() > 1; count++) {
      int playerIndex = count & this.players.size();
      int nextPlayerIndex = (count + 1) % this.players.size();

      Player player = this.players.get(playerIndex);

      Player nextPlayer = this.players.get(nextPlayerIndex);

      System.out.println("\n" + player + "さんの番です。"); //$NON-NLS-1$//$NON-NLS-2$
      player.play(nextPlayer);
    }

    System.out.println("[ゲームを終了しました。"); //$NON-NLS-1$
  }

  /**
   * @param winner
   */
  public void declareWin(Player winner) {
    System.out.println("" + winner + "さんが上がりました。"); //$NON-NLS-1$//$NON-NLS-2$

    deregisterPlayer(winner);
  }

  /**
   * @param player
   */
  public void registerPlayer(Player player) {
    this.players.add(player);
  }

  /**
   * @param player
   */
  public void deregisterPlayer(Player player) {
    this.players.remove(this.players.indexOf(player));

    if (this.players.size() == 1) {
      Player loser = this.players.get(0);
      System.out.println("" + loser + "さんの負けです。"); //$NON-NLS-1$//$NON-NLS-2$
    }
  }

}
