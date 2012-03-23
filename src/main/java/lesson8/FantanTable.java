package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/03/23
 */
public class FantanTable implements Table {

  private Card[][] table = new Card[Card.SUIT_NUM][Card.CARD_NUM];

  /**
   * @see lesson8.Table#putCard(lesson8.Card[])
   */
  public void putCard(Card[] card) {
    int number = card[0].getNumber();
    int suit = card[0].getSuit();
    this.table[suit - 1][number - 1] = card[0];
  }

  /**
   * @see lesson8.Table#getCards()
   */
  public Card[][] getCards() {
    Card[][] copyTable = new Card[Card.SUIT_NUM][Card.CARD_NUM];
    for (int suit = 0; suit < Card.SUIT_NUM; suit++) {
      System.arraycopy(this.table[suit], 0, copyTable[suit], 0, Card.CARD_NUM);
    }
    return copyTable;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer tableString = new StringBuffer(200);
    for (int suit = 0; suit < Card.SUIT_NUM; suit++) {
      for (int number = 0; number < Card.CARD_NUM; number++) {
        if (this.table[suit][number] != null) {
          tableString.append(this.table[suit][number]);
        } else {
          tableString.append(".."); //$NON-NLS-1$
        }
        tableString.append(" "); //$NON-NLS-1$
      }
      tableString.append("\n"); //$NON-NLS-1$
    }
    return tableString.toString();
  }
}
