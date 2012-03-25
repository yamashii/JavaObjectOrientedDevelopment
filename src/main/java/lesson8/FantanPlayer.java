package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/03/23
 */
public class FantanPlayer extends Player {

  private int pass;

  /**
   * Initialize the generated object of {@link FantanPlayer}.
   * 
   * @param name
   * @param master
   * @param table
   * @param rule
   */
  public FantanPlayer(String name, Master master, Table table, Rule rule) {
    super(name, master, table, rule);
  }

  /**
   * @see lesson8.Player#receiveCard(lesson8.Card)
   */
  @Override
  public void receiveCard(Card card) {
    if (card.getNumber() == 7) {
      System.out.println(this.name + ":" + card.getNumber() + "を置きました。"); //$NON-NLS-1$//$NON-NLS-2$
      super.table.putCard(new Card[] {card});
    } else {
      super.receiveCard(card);
    }
  }

  /**
   * @see lesson8.Player#play(lesson8.Player)
   */
  @Override
  public void play(Player nextPlayer) {
    System.out.println("" + this.myhand); //$NON-NLS-1$

    Card[] candidate = this.rule.findCandidate(this.myhand, this.table);

    if (candidate != null) {
      System.out.println("" + candidate[0].getNumber() + "を置きました。\n"); //$NON-NLS-1$//$NON-NLS-2$
      this.table.putCard(candidate);

      System.out.println(this.table);

      if (this.myhand.getNumberOfCards() == 0) {
        this.master.declareWin(this);
      }
    } else {
      this.pass++;
      ((FantanMaster)this.master).pass(this);

      if (this.pass > FantanMaster.PASS_LIMIT) {
        int numberOfHand = this.myhand.getNumberOfCards();

        for (int count = 0; count < numberOfHand; count++) {
          this.table.putCard(new Card[] {this.myhand.pickCard(0)});
        }
      }

    }
  }

  /**
   * @return
   */
  public int getPass() {
    return this.pass;
  }

}
