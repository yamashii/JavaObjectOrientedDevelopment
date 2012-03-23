package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/02/21
 */
public abstract class Player {

  protected String name;
  protected Table table;
  protected Hand myhand = new Hand();
  protected Master master;
  protected Rule rule;

  /**
   * Initialize the generated object of {@link Player}.
   * 
   * @param name
   * @param master
   * @param table
   * @param rule
   */
  public Player(String name, Master master, Table table, Rule rule) {
    this.name = name;
    this.master = master;
    this.table = table;
    this.rule = rule;
  }

  /**
   * @param nextPlayer
   */
  public abstract void play(Player nextPlayer);

  /**
   * @param card
   */
  public void receiveCard(Card card) {
    this.myhand.addCard(card);
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.name;
  }

}
