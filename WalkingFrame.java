import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingFrame extends JFrame implements ActionListener{
	
	private Man man;
	public WalkingFrame(){
		this.setBounds(100,100,600,400);
		man = new Man(0,0);
		this.setLayout(null);
		this.add(man);
		Timer timer = new Timer(10,this);
		timer.start();
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == e.VK_W){
					man.setDY(-2);
				}
				if(e.getKeyCode() == e.VK_S){
					man.setDY(2);
				}
				if(e.getKeyCode() == e.VK_A){
					man.setDX(-2);
				}
				if(e.getKeyCode() == e.VK_D){
					man.setDX(2);
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == e.VK_W){
					man.setDY(0);
				}
				if(e.getKeyCode() == e.VK_S){
					man.setDY(0);
				}
				if(e.getKeyCode() == e.VK_A){
					man.setDX(0);
				}
				if(e.getKeyCode() == e.VK_D) {
					man.setDX(0);
				}
				if(e.getKeyCode() == e.VK_ENTER) {
					System.out.println(man.getX() + " " + man.getY());
				}
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		/*this.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
				man.setLocation(e.getX(), e.getY());
			}
			
		});*/
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new WalkingFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		man.update();
		repaint();
	}
}
