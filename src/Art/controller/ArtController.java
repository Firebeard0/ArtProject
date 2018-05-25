package Art.controller;
import java.awt.Frame;

import javax.swing.JOptionPane;
import Art.View.*;

public class ArtController {
	ArtFrame frame;
	
	public ArtController()
	{
		 this.setFrame(new ArtFrame());
		 
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame, "Welcome To Art");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return frame;
	}
	
	public void setFrame(ArtFrame _frame)
	{
		this.frame = _frame;
	}
	
}
