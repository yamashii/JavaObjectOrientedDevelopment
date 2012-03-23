package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public interface Table {

  /**
   * @param card
   * 
   */
  public void putCard(Card[] card);

  /**
   * @return
   */
  public Card[][] getCards();
}
