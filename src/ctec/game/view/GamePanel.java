package ctec.game.view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

import ctec.game.controller.GameController;

public class GamePanel extends JPanel
{

	private GameController baseController;
	private SpringLayout baseLayout;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private JTextPane displayPane;
	private Label winScoreLabel;
	private Label loseScoreLabel;
	private Label tieScoreLabel;
	private Label winsScores;
	private Label losesScores;
	private Label tiesScores;

	public GamePanel(GameController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rockButton = new JButton();
		rockButton.setText("Rock");
		paperButton = new JButton();
		paperButton.setText("Paper");
		scissorsButton = new JButton();
		scissorsButton.setText("Scissors");
		displayPane = new JTextPane();
		winScoreLabel = new Label();
		winScoreLabel.setText("Wins: ");
		loseScoreLabel = new Label();
		loseScoreLabel.setText("Losses: ");
		tieScoreLabel = new Label();
		tieScoreLabel.setText("Ties: ");
		winsScores = new Label();
		losesScores = new Label();
		tiesScores = new Label();
	
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				baseController.computersChoice();
				if(baseController.computersChoice()==1)
				{
					displayPane.setText("Try Again");
					tiesScores.setText(tiesScore());
				}
				else if(baseController.computersChoice()==2)
				{
					displayPane.setText("Paper Covers Rock, You Lose:(");
					losesScores.setText(loseScore());
					
				}
				else if(baseController.computersChoice()==3)
				{
					displayPane.setText("Rock Crushes Scissors, You Win!!!:D");
					winsScores.setText(winScore());
				}
				else if(baseController.computersChoice()==0)
				{
					displayPane.setText("Try Again");
				}
				
						
			}
			
		});
		paperButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				baseController.computersChoice();
				if(baseController.computersChoice()==1)
				{
					displayPane.setText("Paper Covers Rock, You Win!!!:D");
					winsScores.setText(winScore());
				}
				else if(baseController.computersChoice()==2)
				{
					
					displayPane.setText("Try Again");
					tiesScores.setText(tiesScore());
					
				}
				else if(baseController.computersChoice()==3)
				{
					
					displayPane.setText("Scissors Cuts Paper, You Lose:(");
					losesScores.setText(loseScore());
				}
				else if(baseController.computersChoice()==0)
				{
					displayPane.setText("Try Again");
				}
				
			}
			
		});
		scissorsButton.addActionListener(new ActionListener() 
		{
			
			
			@Override
			public void actionPerformed(ActionEvent click) 
			{
				baseController.computersChoice();
				
				if(baseController.computersChoice()==1)
				{
				
					displayPane.setText("Rock Crushes Scissors, You Lose:(");
					losesScores.setText(loseScore());
				}
				else if(baseController.computersChoice()==2)
				{
					
					displayPane.setText("Scissors Cuts Paper, You Win!!!:D");
					winsScores.setText(winScore());
					
				}
				else if(baseController.computersChoice()==3)
				{
					
					displayPane.setText("Try Again");
					tiesScores.setText(tiesScore());
				}
				else if(baseController.computersChoice()==0)
				{
					displayPane.setText("Try Again");
				}
				
			}
			
		});
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 98, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, loseScoreLabel, -715, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, tieScoreLabel, 0, SpringLayout.WEST, winScoreLabel);
		baseLayout.putConstraint(SpringLayout.EAST, scissorsButton, 0, SpringLayout.EAST, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, displayPane, 292, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayPane, -382, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rockButton, -33, SpringLayout.NORTH, displayPane);
		baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 247, SpringLayout.EAST, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayPane, 106, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayPane, -250, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
		baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 661, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, winScoreLabel, 226, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, winScoreLabel, -725, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, tieScoreLabel, 0, SpringLayout.SOUTH, tiesScores);
		baseLayout.putConstraint(SpringLayout.NORTH, tiesScores, 18, SpringLayout.SOUTH, losesScores);
		baseLayout.putConstraint(SpringLayout.WEST, tiesScores, 0, SpringLayout.WEST, losesScores);
		baseLayout.putConstraint(SpringLayout.NORTH, losesScores, 6, SpringLayout.SOUTH, winsScores);
		baseLayout.putConstraint(SpringLayout.WEST, losesScores, 281, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, losesScores, -695, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, loseScoreLabel, 6, SpringLayout.SOUTH, winsScores);
		baseLayout.putConstraint(SpringLayout.WEST, winsScores, 6, SpringLayout.EAST, winScoreLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, winScoreLabel, 0, SpringLayout.NORTH, winsScores);
		baseLayout.putConstraint(SpringLayout.NORTH, winsScores, 10, SpringLayout.NORTH, this);
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(1000,1000);
		this.add(rockButton);
		this.add(paperButton);
		this.add(scissorsButton);
		this.add(losesScores);
		this.add(tiesScores);
		this.add(winsScores);
		this.add(winScoreLabel);
		this.add(loseScoreLabel);
		this.add(tieScoreLabel);
	
	
		this.add(displayPane);
		this.setVisible(true);
	}
	private String winScore()
	{
		String oldScore = winsScores.getText();
		String newScore = oldScore+1;
		return newScore;
	}
	private String loseScore()
	{
		String oldScore = losesScores.getText();
		String newScore = oldScore+1;
		return newScore;
	}
	private String tiesScore()
	{
		String oldScore = tiesScores.getText();
		String newScore = oldScore+1;
		return newScore;
	}
	
}
