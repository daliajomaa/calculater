import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener  {
	private Model modell;
	private View vieww;
	
	public Controller(Model modeel, View vieew) {
		this.modell = modeel;
		this.vieww = vieew;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
			modell.update(command);
			vieww.update(modell.getValue());
				  
	}
}
