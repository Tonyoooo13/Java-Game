import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{

	Draw drawing;

	public MyFrame(){
		this.drawing = new Draw();
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_W){
			drawing.moveUp();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D){
			drawing.moveRight();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S){
			drawing.moveDown();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_A){
			drawing.moveLeft();
			System.out.println("pos: " + drawing.x + ", " + drawing.y);
		}
		else if(e.getKeyCode() == KeyEvent.VK_J){
			drawing.attack();
			System.out.println("attack");
		}
		else if(e.getKeyCode() == KeyEvent.VK_T){
			drawing.spawnEnemy();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE){
			drawing.jumpAnimation();
		}
		else if(e.getKeyCode() == KeyEvent.VK_Q){
			drawing.dieAnimation();
		}
		else if(e.getKeyCode() == KeyEvent.VK_E){
			drawing.getUpAnimation();
		}

	}

	public void keyReleased(KeyEvent e){

	}

	public void keyTyped(KeyEvent e){
		
	}

	public static void main(String args[]){
		MyFrame gameFrame = new MyFrame();
		gameFrame.setSize(600,600);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		gameFrame.getContentPane().add(gameFrame.drawing);
		gameFrame.addKeyListener(gameFrame);
		System.out.println("practical programming");
	}
}
