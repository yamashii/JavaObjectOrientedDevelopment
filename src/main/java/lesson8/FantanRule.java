package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/03/23
 */
public class FantanRule implements Rule {

  /**
   * @see lesson8.Rule#findCandidate(lesson8.Hand, lesson8.Table)
   */
  public Card[] findCandidate(Hand hand, Table table) {
    Card[] candidate = null;

    int numberOfHand = hand.getNumberOfCards();
    for (int position = 0; position < numberOfHand; position++) {

      Card lookingCard = hand.lookCard(position);
      int number = lookingCard.getNumber();
      int suit = lookingCard.getSuit();

      int leftNumber = (number != 1) ? number - 1 : Card.CARD_NUM;
      int rightNumber = (number != Card.CARD_NUM) ? number + 1 : 1;

      if ((true == isThereCard(table, suit, leftNumber)) || (true == isThereCard(table, suit, rightNumber))) {
        candidate = new Card[1];
        candidate[0] = hand.pickCard(position);
        break;
      }
    }
    return candidate;
  }

  private static boolean isThereCard(Table table, int suit, int number) {
    Card[][] cards = table.getCards();
    try {
      if (cards[suit - 1][number - 1] != null) {
        return true;
      }
    } catch (Exception e) {
      System.out.println(suit);
      System.out.println(number);
      throw new IllegalStateException(e);
    }
    return false;
  }

}
