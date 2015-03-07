package prova;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Main {
	
	public void start(){
		System.out.print("hola");
		Frame window = new Frame("El Primer");
		Label label = new Label("Hola tio!");
		window.add(label);
		window.setVisible(true);
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
	}
}
