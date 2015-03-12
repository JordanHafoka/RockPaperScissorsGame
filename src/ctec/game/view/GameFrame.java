package ctec.game.view;

import ctec.game.controller.GameController;
import javax.swing.*;

public class GameFrame extends JFrame
{
	private GameController baseController;
	private GamePanel basePanel;

	
	public GameFrame(GameController baseController)
	{
		this.baseController = baseController;
		basePanel = new GamePanel(baseController);
	
		
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000,1000);

		this.setVisible(true);
	}
}
