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
//		computersChoice();
	}
//	public int getRock()
//	{
//		return 1;
//	}
//	public int getPaper()
//	{
//		return 2;
//	}
//	public int getScissors()
//	{
//		return 3;
//	}
	public int computersChoice()
	{
		int choice = (int)(Math.random()*3);
		if (choice == 0)
			this.computersChoice();
		return choice;
	}
}
