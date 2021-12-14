import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Pong extends JFrame {
		private final static String WINDOW_TITLE = "Pong";
		private final static int WINDOW_WIDTH = 800;
		private final static int WINDOW_HEIGHT = 600;
		private final static Color BACKGROUND_COLOUR = Color.BLACK;
		
	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class PongPanel extends JPanel implements ActionListener, KeyListener {
		
		public PongPanel() {
			setBackground(BACKGROUND_COLOUR);
		}

		@Override
		public void keyTyped(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
	}

}
