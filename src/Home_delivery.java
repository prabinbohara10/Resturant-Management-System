import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home_delivery{
	static JFrame indexframe;
    static Container c;
    static JPanel toppanel;
    static JPanel buttompanel;
    
 

	public static void main(String[] args) {

	    indexframe=new JFrame();
		indexframe.setVisible(true);
		indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		indexframe.setBounds(200,90,930,600);
		indexframe.setTitle("Restaurant Management System");
		c=indexframe.getContentPane();
		c.setBackground(Color.BLUE);
		c.setLayout(null);
		
		//for Font:
		//Font f=new Font("")
		
		//for panel:
		toppanel=new JPanel();
	    buttompanel=new JPanel();
		toppanel.setBounds(0,0,930,100);
		toppanel.setBackground(Color.RED);
		toppanel.setLayout(null);
		
		buttompanel.setBounds(0,100,930,500);
		buttompanel.setBackground(Color.YELLOW);
		buttompanel.setLayout(null);
		c.add(toppanel);
		c.add(buttompanel);
	
		//end of panel:
		
	
		
		//for images:
		ImageIcon img1= new ImageIcon("chicken_hut.jpg");
		Image isecond1=img1.getImage();
		Image ithird1=isecond1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	    ImageIcon last1 =new ImageIcon(ithird1);
	    JLabel img_label1=new JLabel();
	    img_label1=new JLabel(last1);
	    img_label1.setBounds(0, 0, 100, 100);
		//end of images:
	    toppanel.add(img_label1);
	    
	    //for admin login page:
	    JLabel al_label1=new JLabel("Admin Login Form");
	    al_label1.setBounds(300,50,300,100);
	    JLabel al_label2=new JLabel("Enter Username:");
	    al_label2.setBounds(300,150,300,100);
	    JLabel al_label3=new JLabel("Enter Password:");
	    al_label3.setBounds(300,200,300,100);
	    JTextField al_text1=new JTextField();
	    al_text1.setBounds(400,185,300,30);
	    JPasswordField al_pass1=new JPasswordField();
	    al_pass1.setBounds(400,235,300,30);
	    JButton al_button1=new JButton("Login");
	    al_button1.setBounds(400, 300, 150, 30);
	    buttompanel.add(al_label1);
	    buttompanel.add(al_label2);
	    buttompanel.add(al_label3);
	    buttompanel.add(al_text1);
	    buttompanel.add(al_pass1);
	    buttompanel.add(al_button1);

	    String check_password = new String(al_pass1.getPassword());
	    if (check_password.equals("prabin")) {
	    // 	correct
	    } else {
	    // not correct
	    }
	    
	    c.add(toppanel);
		c.add(buttompanel);
	
		
		

		
		

	}
	
}
