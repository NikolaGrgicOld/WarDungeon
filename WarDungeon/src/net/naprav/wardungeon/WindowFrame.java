package net.naprav.wardungeon;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class WindowFrame extends JFrame {
	private static final long serialVersionUID = 1203994186653691379L;

	public static final int WIDTH = 330;
	public static final int HEIGHT = 200;
	public static final int SCALE = 3;
	public static final Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
	
	private ImageIcon icon;
	
	RunGame game;

	public WindowFrame(String title) {
		this.setTitle(title);
		this.setSize(size);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);

		icon = new ImageIcon("res/wardungeon_logo.png");
		this.setIconImage(icon.getImage());

		game = new RunGame();
		
		this.add(game);
		game.begin();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public WindowFrame(String title, int frame, int update) {
		this.setTitle(title + " | " + "FPS: " + frame + ", UPS: " + update);
		this.setSize(size);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocationRelativeTo(null);

		icon = new ImageIcon("res/wardungeon_logo.png");
		this.setIconImage(icon.getImage());

		game = new RunGame();
		
		this.add(game);
		game.begin();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}