package prova;

import java.awt.Frame;
import java.awt.Label;

public class Main {
	
	public void start(){
		System.out.print("hola");
		Frame window = new Frame("El Primer");
		Label label = new Label("Hola tio!");
		window.add(label);
		window.setVisible(true);
		
	}
}
