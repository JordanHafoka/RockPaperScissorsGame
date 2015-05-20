package ctec.game.controller;

import ctec.game.view.GameFrame;
import javax.swing.*;

public class GameController
{
	private GameFrame baseFrame;
	
	public GameController()
	{
		baseFrame = new GameFrame(this);
	}
	public void start()
	{

	}

	public int computersChoice()
	{
		int choice = (int)(Math.random()*3+1);
		if (choice == 0)
			this.computersChoice();
			
			
		return choice;
		
	}
}
