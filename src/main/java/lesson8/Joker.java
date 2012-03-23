package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public class Joker extends Card {

  /**
   * Initialize the generated object of {@link Joker}.
   * 
   * @param suit
   * @param number
   */
  public Joker(int suit, int number) {
    super(0, 0);
  }

  /**
   * @param number
   */
  public void setNumber(int number) {
    this.number = number;
  }

  /**
   * 
   */
  public void setSuit(int suit) {
    this.suit = suit;
  }

  /**
   * @see lesson8.Card#toString()
   */
  @Override
  public String toString() {
    return "JK"; //$NON-NLS-1$
  }

}
