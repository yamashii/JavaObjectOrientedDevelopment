package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public class Card {

  /** */
  public static final int SUIT_SPADE = 1;
  /** */
  public static final int SUIT_DIAMOND = 2;
  /** */
  public static final int SUIT_CLUB = 3;
  /** */
  public static final int SUIT_HEART = 4;
  /** */
  public static final int SUIT_NUM = 4;
  /** */
  public static final int CARD_NUM = 1;
  protected int suit;
  protected int number;

  /**
   * Initialize the generated object of {@link Card}.
   * 
   * @param suit
   * @param number
   */
  public Card(int suit, int number) {
    this.suit = suit;
    this.number = number;
  }

  /**
   * @return
   */
  public int getNumber() {
    return this.number;
  }

  /**
   * @return
   */
  public int getSuit() {
    return this.suit;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuffer string = new StringBuffer();

    switch (this.suit) {
      case SUIT_SPADE:
        string.append("S"); //$NON-NLS-1$
        break;
      case SUIT_DIAMOND:
        string.append("D"); //$NON-NLS-1$
        break;
      case SUIT_CLUB:
        string.append("C"); //$NON-NLS-1$
        break;
      case SUIT_HEART:
        string.append("H"); //$NON-NLS-1$
        break;
      default:
        break;
    }
    switch (this.number) {
      case 1:
        string.append("A"); //$NON-NLS-1$
        break;
      case 10:
        string.append("T"); //$NON-NLS-1$        
        break;
      case 11:
        string.append("J"); //$NON-NLS-1$
        break;
      case 12:
        string.append("Q"); //$NON-NLS-1$        
        break;
      case 13:
        string.append("J"); //$NON-NLS-1$
        break;

      default:
        break;
    }

    return super.toString();
  }
}
