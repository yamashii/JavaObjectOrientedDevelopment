package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/03/23
 */
public class Fantan {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Master master = new FantanMaster();
    Table table = new FantanTable();
    Rule rule = new FantanRule();

    Player playerA = new FantanPlayer("A", master, table, rule); //$NON-NLS-1$
    Player playerB = new FantanPlayer("B", master, table, rule); //$NON-NLS-1$
    Player playerC = new FantanPlayer("C", master, table, rule); //$NON-NLS-1$

    master.registerPlayer(playerA);
    master.registerPlayer(playerB);
    master.registerPlayer(playerC);

    Hand trump = createTrump();
    master.prepareGame(trump);
    master.startGame();

  }

  private static Hand createTrump() {
    Hand trump = new Hand();
    for (int number = 0; number < Card.CARD_NUM; number++) {
      trump.addCard(new Card(Card.SUIT_CLUB, number));
      trump.addCard(new Card(Card.SUIT_DIAMOND, number));
      trump.addCard(new Card(Card.SUIT_HEART, number));
      trump.addCard(new Card(Card.SUIT_SPADE, number));
    }
    return trump;
  }
}
