import javax.swing.JFrame;

public class Pong extends JFrame {

	public Pong() {
		setTitle("Pong");
		setSize(100, 200);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Pong();
	}

}
