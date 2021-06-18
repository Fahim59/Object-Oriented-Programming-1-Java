import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
 
class Flag extends Frame implements WindowListener{
 
    public Flag(){
		
		setTitle("Bangladesh Flag");
        setSize(440,280);
        show();
        this.addWindowListener(this);
    }
    public void paint(Graphics g){
		
		//g.setColor(Color.black);
        //g.fillRect(10,30,20,500);
        g.setColor(new Color(0,103,71));                  //Green
		g.fillRect(0,0,440,280);
        g.setColor(new Color(218, 41, 28));              //Color.red
		g.fillOval(140,75,150,150);
		//g.setFont(new Font("", Font.BOLD, 20));
        //g.drawString("OUR FLAG", 100, 270);
    }
 
    public void windowClosing(WindowEvent event) {
        dispose();
        System.exit(0);
    }
 
    public void windowActivated(WindowEvent event) {
    };
 
    public void windowClosed(WindowEvent event) {
    };
 
    public void windowDeactivated(WindowEvent event) {
    };
 
    public void windowDeiconified(WindowEvent event) {
    };
 
    public void windowIconified(WindowEvent event) {
    };
 
    public void windowOpened(WindowEvent event) {
    };
}