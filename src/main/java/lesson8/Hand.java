package lesson8;

import java.util.ArrayList;


/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public class Hand {

  private ArrayList<Card> hand = new ArrayList<Card>();

  /**
   * @param card
   * 
   */
  public void addCard(Card card) {
    this.hand.add(card);
  }

  /**
   * @param position
   * @return
   * 
   */
  public Card lookCard(int position) {
    Card lookingCard = null;
    if ((0 <= position) && (position < this.hand.size())) {
      lookingCard = this.hand.get(position);
    }
    return lookingCard;
  }

  /**
   * @param position
   * @return
   */
  public Card pickCard(int position) {
    Card pickedCard = null;
    if ((0 <= position) && (position < this.hand.size())) {
      pickedCard = this.hand.remove(position);
    }
    return pickedCard;
  }

  /**
   * 
   */
  public void shuffle() {
    int number = this.hand.size();
    int pos;
    for (int count = 0; count < number; count++) {
      pos = (int)(Math.random() * number);
      Card pickedCard = this.hand.remove(pos);
      this.hand.add(pickedCard);
    }
  }

  /**
   * @return
   */
  public int getNumberOfCards() {
    return this.hand.size();
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer string = new StringBuffer();
    
    int size = this.hand.size();
    if (size > 0) {
      for (int index = 0; index < size; index++) {
        Card card = this.hand.get(index);
        string.append(card);
        string.append(" "); //$NON-NLS-1$
      }
    }
    return string.toString();
  }

}
