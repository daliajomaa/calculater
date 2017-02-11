import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	private JLabel display;
	  private JPanel buttonsPanel;
	  private int digits;
	  
	  public View() {
		  
			super("claculater");
		
			JPanel displayPanel = new JPanel();
			add(displayPanel, BorderLayout.NORTH);

			display = new JLabel("0.0");
			displayPanel.add(display);
			digits = -1;
			
			buttonsPanel = new JPanel();
			add(buttonsPanel, BorderLayout.CENTER);
			buttonsPanel.setLayout(new GridLayout(4, 4, 0, 0));
			
			String[] buttonStrings = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*","0", ".", "=", "/"};
			
			for (String s : buttonStrings) {
				buttonsPanel.add(new JButton(s));
			}
		}
		
		public void registerListener(Controller controllerr) {
			Component[] components = buttonsPanel.getComponents();
			for (Component component : components) {
				if (component instanceof AbstractButton) {
					AbstractButton button = (AbstractButton) component;
					button.addActionListener(controllerr);
				}
			}
		}
		
		public void update(String value) {
			if (digits < 0) {
				display.setText(value);
			} else {
				String format = "%." + digits + "f";
				String text = String.format(format, Double.valueOf(value));
				display.setText(text);
			}
		}
		
		public void setDigits(int string) {
			this.digits = string;
		}
}
