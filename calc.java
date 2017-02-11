import javax.swing.JFrame;

public class calc {
	public static void main(String[] args) {
		
	Model modell = new Model();
    View vieww = new View();
		
		Controller controllerr = new Controller(modell, vieww);
		vieww.registerListener(controllerr);
		vieww.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vieww.setSize(400, 300);
		vieww.setVisible(true);
	}
}
