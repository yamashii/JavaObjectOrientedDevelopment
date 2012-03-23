package lesson8;

/**
 * @author yamashita
 * @version $Revision$, 2012/03/23
 */
public class FantanMaster extends Master {

  public static final int PASS_LIMIT = 3;

  public void pass(FantanPlayer player) {
    System.out.println("" + player + "さんは" + player.getPass() + "回目のパスをしました。"); //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
    if (player.getPass() > PASS_LIMIT) {
      System.out.println("" + player + "さんは負けです。"); //$NON-NLS-1$//$NON-NLS-2$
      deregisterPlayer(player);
    }
  }
}
