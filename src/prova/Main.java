package prova;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
	
	public Graphics g;
	long lastTime = 0;
	long now = 0;
	long pass = 1000000000 / 4;
	double delta = 0;
	
	public void start(){
		Frame window = new Frame("El Primer");
		window.setLocation(400, 100);
		Panel panel = new Panel();
		Label label = new Label("Hola tio!");
		label.setAlignment(Label.CENTER);
		window.setSize(200, 80);
		window.add(panel);
		window.add(label);
		window.setVisible(true);
		window.setResizable(false);
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
	public void running(){
		while(true){
			now = System.nanoTime();
			delta = (now - lastTime) / pass;
			if(delta >= 1){
				lastTime = now;
				delta--;
				draw(g);
			}
			
			
		}
	}
	public void draw(Graphics g){
		g.fillRect(10,10,100,100);
		System.out.println("print");
		
	}
}
