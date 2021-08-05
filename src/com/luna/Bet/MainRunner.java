package com.luna.Bet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class MainRunner extends JPanel
{
	public Map map = new Map();

	public MainRunner()
	{
		System.out.println("Running");
		JButton button = new JButton("Test!");
		add(button);
		button.addActionListener(this::actionButton);
		button.setActionCommand("button1");
		
		JButton tester2 = new JButton("t");
		add(tester2);
		tester2.addActionListener(this::actionButton);
		tester2.setActionCommand("button2");
	}
	
	private void actionButton(ActionEvent actionEvent)
	{
		if (actionEvent.getActionCommand().equals("button1"))
		{
			System.out.println("It's working :O");	
		}
		
		System.out.println("pressed");
	}
	
	public static void main(String[] args)
	{
		JFrame mainFrame = new JFrame("Bet");
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setLayout(null);
		mainFrame.setResizable(false);
		mainFrame.setSize(new Dimension(1000, 600));
		mainFrame.setContentPane(new MainRunner());
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}

	public class Map
	{
		ArrayList<Territory> territories = new ArrayList<>();

		Map()
		{
			territories.add(new Territory("Argentina"));
			territories.add(new Territory("Brazil"));
			territories.add(new Territory("Peru"));
			territories.add(new Territory("Venezuela"));

		}


	}

	public class Territory
	{
		int id;
		String name;
		int player;
		int troopCount;
		int[] adjacentTerritories;
		boolean fake;

		Territory(String name)
		{
			this.name = name;

		}

	}
}
