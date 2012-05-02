package hoge;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;


public class Sample extends JPanel {

  /**
   * Create the panel.
   */
  public Sample() {
    setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JLabel lblNewLabel_1 = new JLabel("north");
    add(lblNewLabel_1);
    
    JLabel lblNewLabel_3 = new JLabel("New label");
    add(lblNewLabel_3);
    
    JLabel lblNewLabel_2 = new JLabel("New label");
    add(lblNewLabel_2);
    
    JLabel lblNewLabel = new JLabel("New label");
    add(lblNewLabel);

  }
  
  private double calcNum(double price) {
    price = price * 0.9;
    
    return price;
    
  }

}
