import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DonkeyKong extends Applet implements Runnable, KeyListener {
	int barrelX = 105;
	int barrelY = 80;
	int playerX = 60;
	double playerY = 455;
	int playerSpeedX = 0;
	double playerSpeedY = 0;
	int lives = 5;
	int ladder1X = (int)(Math.random() * 330 + 70);
	int ladder2X = (int)(Math.random() * 330 + 45);
	int ladder3X = (int)(Math.random() * 330 + 70);
	int ladder4X = (int)(Math.random() * 330 + 45);
	int ladder5X = (int)(Math.random() * 330 + 70);
	boolean gameRunning = true;
	@Override
	public void init() {
		setBackground(Color.WHITE);
		setSize(448,536);
		addKeyListener(this);
	}
	@Override
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(25, 100, 360, 20);
		g.fillRect(50, 175, 360, 20);
		g.fillRect(25, 250, 360, 20);
		g.fillRect(50, 325, 360, 20);
		g.fillRect(25, 400, 360, 20);
		g.fillRect(50, 475, 360, 20);
		g.drawString("Lives: " + lives, 10, 20);
		g.setColor(Color.GREEN);
		g.fillRect(ladder1X, 420, 20, 55);
		g.fillRect(ladder2X, 345, 20, 55);
		g.fillRect(ladder3X, 270, 20, 55);
		g.fillRect(ladder4X, 195, 20, 55);
		g.fillRect(ladder5X, 120, 20, 55);
		g.setColor(Color.BLACK);
		g.fillOval(barrelX, barrelY, 20, 20);
		g.setColor(Color.RED);
		g.fillRect(playerX, (int)playerY, 10, 20);
		if (!gameRunning) {
			for (int i = 0; i < 10000; i++) {
				g.setColor(new Color(0, 0, 0, 10));
				g.fillRect(0, 0, 448, 536);
				g.setColor(Color.RED);
				g.setFont(new Font("Press Start K", Font.PLAIN, 60)); 
				g.drawString("Wasted", 40, 320);
				try {
					Thread.sleep(20);
				} catch (InterruptedException Ex) {}
			}	
		}
	}
	@Override
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(gameRunning) {
			if (barrelY == 155 || barrelY == 305 || barrelY == 455) {
				barrelX--;
			}
			if (barrelY == 80 || barrelY == 230 || barrelY == 380) {
				barrelX++;
			}
			if ((barrelX == 30 && !(barrelY == 80 || barrelY == 230 || barrelY == 380)) || (barrelX == 385 && !(barrelY == 155 || barrelY == 305 || barrelY == 455))) {
				barrelY++;
			}
			if (barrelY > 700) {
				barrelX = 105;
				barrelY = 80;
				lives--;
			}
			if (playerY > 700 || (Math.abs(playerY - barrelY) < 30 && Math.abs(playerX - barrelX) < 10)) {
				barrelX = 105;
				barrelY = 80;
				playerX = 60;
				playerY = 455;
				lives--;
			}
			if (!((playerX >= 50 && playerX <= 405 && ((playerY >= 155 && playerY <= 175) || (playerY >= 305 && playerY <= 225) || (playerY >= 455 && playerY <= 475))) || (playerX >= 5 && playerX <= 385 && ((playerY >= 80 && playerY <= 100) || (playerY >= 230 && playerY <= 250) || (playerY >= 380 && playerY <= 400))))) {
				playerSpeedY += .1;
			} else {
				playerSpeedY = 0;
			}
			if ((playerY > 380 && playerY < 420 && Math.abs(playerX - ladder1X) < 30) || (playerY > 305 && playerY < 345 && Math.abs(playerX - ladder2X) < 30) || (playerY > 230 && playerY < 270 && Math.abs(playerX - ladder3X) < 30) || (playerY > 800 && playerY < 120 && Math.abs(playerX - ladder4X) < 30)) {
				playerY--;
			}
			playerX += playerSpeedX;
			playerY += playerSpeedY;
			repaint();
			if (lives <= 0) {
				gameRunning = false;
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException Ex) {}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 37) { // Left
			playerSpeedX -= 1;
		}
		if (e.getKeyCode() == 39) { // Right
			playerSpeedX += 1;
		}
		if (e.getKeyCode() == 38) { // Up
			if (((playerX >= 50 && playerX <= 405 && ((playerY >= 155 && playerY <= 175) || (playerY >= 305 && playerY <= 225) || (playerY >= 455 && playerY <= 475))) || (playerX >= 5 && playerX <= 385 && ((playerY >= 80 && playerY <= 100) || (playerY >= 230 && playerY <= 250) || (playerY >= 380 && playerY <= 400))))) {
				playerY -= 10;
				playerSpeedY -= 3;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		playerSpeedX = 0;
	}
}
