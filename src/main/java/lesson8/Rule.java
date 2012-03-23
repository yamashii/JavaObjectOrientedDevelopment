package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public interface Rule {

  /**
   * @param hand
   * @param table
   * @return
   */
  public Card[] findCandidate(Hand hand, Table table);
}
