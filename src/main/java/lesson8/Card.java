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
  public static final int CARD_NUM = 13;
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
      case 2:
        string.append("2"); //$NON-NLS-1$
        break;
      case 3:
        string.append("3"); //$NON-NLS-1$
        break;
      case 4:
        string.append("4"); //$NON-NLS-1$
        break;
      case 5:
        string.append("5"); //$NON-NLS-1$
        break;
      case 6:
        string.append("6"); //$NON-NLS-1$
        break;
      case 7:
        string.append("7"); //$NON-NLS-1$
        break;
      case 8:
        string.append("8"); //$NON-NLS-1$
        break;
      case 9:
        string.append("9"); //$NON-NLS-1$
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

    return string.toString();
  }
}
