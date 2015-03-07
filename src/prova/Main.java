package prova;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Main {
	
	public Graphics g;
	public void start(){
		System.out.print("hola");
		Frame window = new Frame("El Primer");
		Label label = new Label("Hola tio!");
		label.setLocation(10, 10);
		Panel panel = new Panel();
		window.add(label);
		window.setVisible(true);
		window.add(panel);
		window.setResizable(false);
		panel.add(label);
		window.addWindowListener(new WindowListener() {
			
			public void windowClosed(WindowEvent arg0) {
			}

			public void windowActivated(WindowEvent arg0) {
			}

			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		
			public void windowDeactivated(WindowEvent arg0) {
			}

		
			public void windowDeiconified(WindowEvent arg0) {
			}

			public void windowIconified(WindowEvent arg0) {
			}

		
			public void windowOpened(WindowEvent arg0) {
			}
		});
		window.pack();
		g = panel.getGraphics();
		draw(g);
	}
	public void draw(Graphics g){
		g.fillRect(10,10,100,100);
	}
}
