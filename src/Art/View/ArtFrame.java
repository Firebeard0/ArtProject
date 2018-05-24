package Art.View;
import Art.controller.*;

import javax.swing.JFrame;

public class ArtFrame extends JFrame {
	
	public ArtController ShapePanel;
	
	public ArtFrame()
	{
		super();
		
		this.ShapePanel = new ArtController();
		setupFrame();
	}
	
	void setupFrame()
	{
		this.setSize(1200,700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in Java");
		this.setVisible(true);
	}
}
