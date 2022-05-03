import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Billing {
	static JFrame indexframe;
    static Container c;
  

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
			JPanel toppanel=new JPanel();
		    JPanel buttompanel=new JPanel();
		    
		    JPanel panel1=new JPanel();
		    JPanel panel2=new JPanel();
		    JPanel panel3=new JPanel();
		    JPanel panel4=new JPanel();
		    JPanel panel5=new JPanel();
		    JPanel panel6=new JPanel();
		 
			toppanel.setBounds(0,0,930,100);
			toppanel.setBackground(Color.RED);
			toppanel.setLayout(null);
			
			buttompanel.setBounds(0,0,930,600);
			buttompanel.setBackground(Color.YELLOW);
			buttompanel.setLayout(null);
			
			panel1.setBounds(0,101,630,50);
			panel1.setBackground(Color.RED);
			panel1.setLayout(null);
			panel2.setBounds(632,102,298,450);
			panel2.setBackground(Color.GREEN);
			panel2.setLayout(null);
			panel3.setBounds(0,153,300,399);
			panel3.setBackground(Color.RED);
			panel3.setLayout(null);
			panel4.setBounds(302,153,328,299);
			panel4.setBackground(Color.RED);
			panel4.setLayout(null);
			panel5.setBounds(302,454,328,98);
			panel5.setBackground(Color.RED);
			panel5.setLayout(null);
			panel6.setBounds(0,554,930,50);
			panel6.setBackground(Color.RED);
			panel6.setLayout(null);
			
			c.add(toppanel);
			c.add(buttompanel);
			c.add(panel1);
			c.add(panel2);
			c.add(panel3);
			c.add(panel4);
			c.add(panel5);
			c.add(panel6);
		
			//end of panel:
			
			//for textfield in panel2:
			
			/* for numbers i have just changed
			 *  variable from b_text1 to b_txt1.
			 */
			
	
			
			JTextField b_txt1=new JTextField("  S.N.");
			JTextField b_txt2=new JTextField();
			JTextField b_txt3=new JTextField();
			JTextField b_txt4=new JTextField();
			JTextField b_txt5=new JTextField();
			JTextField b_txt6=new JTextField();
			JTextField b_txt7=new JTextField();
			JTextField b_txt8=new JTextField();
			JTextField b_txt9=new JTextField();
			
			JTextField b_text1=new JTextField("   Name of the item");
			JTextField b_text2=new JTextField();
			JTextField b_text3=new JTextField();
			JTextField b_text4=new JTextField();
			JTextField b_text5=new JTextField();
			JTextField b_text6=new JTextField();
			JTextField b_text7=new JTextField();
			JTextField b_text8=new JTextField();
			JTextField b_text9=new JTextField();
			
			JTextField b_tx1=new JTextField("  Rate");
			JTextField b_tx2=new JTextField();
			JTextField b_tx3=new JTextField();
			JTextField b_tx4=new JTextField();
			JTextField b_tx5=new JTextField();
			JTextField b_tx6=new JTextField();
			JTextField b_tx7=new JTextField();
			JTextField b_tx8=new JTextField();
			JTextField b_tx9=new JTextField();
			
			b_txt1.setBounds(30,10,35,30);
			b_txt1.setBackground(Color.GREEN);
			b_txt2.setBounds(30,45,35,30);
			b_txt2.setBackground(Color.GRAY);
			b_txt3.setBounds(30,80,35,30);
			b_txt3.setBackground(Color.GRAY);
			b_txt4.setBounds(30,115,35,30);
			b_txt4.setBackground(Color.GRAY);
			b_txt5.setBounds(30,150,35,30);
			b_txt5.setBackground(Color.GRAY);
			b_txt6.setBounds(30,185,35,30);
			b_txt6.setBackground(Color.GRAY);
			b_txt7.setBounds(30,220,35,30);
			b_txt7.setBackground(Color.GRAY);
			b_txt8.setBounds(30,255,35,30);
			b_txt8.setBackground(Color.GRAY);
			b_txt9.setBounds(30,290,35,30);
			b_txt9.setBackground(Color.GRAY);
			
		    b_text1.setBounds(65,10,150,30);
			b_text1.setBackground(Color.GREEN);
			b_text2.setBounds(65,45,150,30);
			b_text2.setBackground(Color.GRAY);
			b_text3.setBounds(65,80,150,30);
			b_text3.setBackground(Color.GRAY);
			b_text4.setBounds(65,115,150,30);
			b_text4.setBackground(Color.GRAY);
			b_text5.setBounds(65,150,150,30);
			b_text5.setBackground(Color.GRAY);
			b_text6.setBounds(65,185,150,30);
			b_text6.setBackground(Color.GRAY);
			b_text7.setBounds(65,220,150,30);
			b_text7.setBackground(Color.GRAY);
			b_text8.setBounds(65,255,150,30);
			b_text8.setBackground(Color.GRAY);
			b_text9.setBounds(65,290,150,30);
			b_text9.setBackground(Color.GRAY);
			
			b_tx1.setBounds(215,10,60,30);
			b_tx1.setBackground(Color.GREEN);
			b_tx2.setBounds(215,45,60,30);
			b_tx2.setBackground(Color.GRAY);
			b_tx3.setBounds(215,80,60,30);
			b_tx3.setBackground(Color.GRAY);
			b_tx4.setBounds(215,115,60,30);
			b_tx4.setBackground(Color.GRAY);
			b_tx5.setBounds(215,150,60,30);
			b_tx5.setBackground(Color.GRAY);
			b_tx6.setBounds(215,185,60,30);
			b_tx6.setBackground(Color.GRAY);
			b_tx7.setBounds(215,220,60,30);
			b_tx7.setBackground(Color.GRAY);
			b_tx8.setBounds(215,255,60,30);
			b_tx8.setBackground(Color.GRAY);
			b_tx9.setBounds(215,290,60,30);
			b_tx9.setBackground(Color.GRAY);
			
			panel3.add(b_txt1);
			panel3.add(b_txt2);
			panel3.add(b_txt3);
			panel3.add(b_txt4);
			panel3.add(b_txt5);
			panel3.add(b_txt6);
			panel3.add(b_txt7);
			panel3.add(b_txt8);
			panel3.add(b_txt9);
			
			panel3.add(b_text1);
			panel3.add(b_text2);
			panel3.add(b_text3);
			panel3.add(b_text4);
			panel3.add(b_text5);
			panel3.add(b_text6);
			panel3.add(b_text7);
			panel3.add(b_text8);
			panel3.add(b_text9);
			
			panel3.add(b_tx1);
			panel3.add(b_tx2);
			panel3.add(b_tx3);
			panel3.add(b_tx4);
			panel3.add(b_tx5);
			panel3.add(b_tx6);
			panel3.add(b_tx7);
			panel3.add(b_tx8);
			panel3.add(b_tx9);
			
		
			
			//for images: & a_imgt refers to top image:
			ImageIcon b_imgt= new ImageIcon("chicken_hut.jpg");
			Image b_isecondt=b_imgt.getImage();
			Image b_ithirdt=b_isecondt.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		    ImageIcon b_lastt =new ImageIcon(b_ithirdt);
		    JLabel b_img_labelt=new JLabel();
		    b_img_labelt=new JLabel(b_lastt);
		    b_img_labelt.setBounds(0, 0, 100, 100);
			//end of images:
		    toppanel.add(b_img_labelt);
		    
		      
		    //starting of 1 item:
		  //for images:
			ImageIcon b_img1= new ImageIcon("chicken_hut.jpg");
			Image b_isecond1=b_img1.getImage();
			Image b_ithird1=b_isecond1.getScaledInstance(99, 75, Image.SCALE_SMOOTH);
		    ImageIcon b_last1 =new ImageIcon(b_ithird1);
		    JLabel b_img_label1=new JLabel();
		    b_img_label1=new JLabel(b_last1);
		    b_img_label1.setBounds(-3, -15, 100, 100);
		    panel2.add(b_img_label1);
			//end of images:
		    
		    b_img_label1.addMouseListener(new MouseListener() {
		    	public void mouseClicked(MouseEvent arg0) {	
		    		if(b_text2.getText().equals("")) {b_text2.setText("new");}
		    		else if(b_text3.getText().equals("")) {b_text3.setText("new");}
		    		else if(b_text4.getText().equals("")) {b_text4.setText("new");}
		    		else if(b_text5.getText().equals("")) {b_text5.setText("new");}
		    		else if(b_text6.getText().equals("")) {b_text6.setText("new");}
		    		else if(b_text7.getText().equals("")) {b_text7.setText("new");}
		    		else if(b_text8.getText().equals("")) {b_text8.setText("new");}
		    		else if(b_text9.getText().equals("")) {b_text9.setText("new");}
		    		
		    		if (b_tx2.getText().equals("")) {b_tx2.setText("55");}
		    		else if (b_tx3.getText().equals("")) {b_tx3.setText("55");}
		    		else if (b_tx4.getText().equals("")) {b_tx4.setText("55");}
		    		else if (b_tx5.getText().equals("")) {b_tx5.setText("55");}
		    		else if (b_tx6.getText().equals("")) {b_tx6.setText("55");}
		    		else if (b_tx7.getText().equals("")) {b_tx7.setText("55");}
		    		else if (b_tx8.getText().equals("")) {b_tx8.setText("55");}
		    		else if (b_tx9.getText().equals("")) {b_tx9.setText("55");}
		    		}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {} });
		    //end of 1 item:
		    
		    //starting of 2 item:
		  //for images:
			ImageIcon b_img2= new ImageIcon("chicken_hut.jpg");
			Image b_isecond2=b_img2.getImage();
			Image b_ithird2=b_isecond2.getScaledInstance(99, 75, Image.SCALE_SMOOTH);
		    ImageIcon b_last2 =new ImageIcon(b_ithird2);
		    JLabel b_img_label2=new JLabel();
		    b_img_label2=new JLabel(b_last2);
		    b_img_label2.setBounds(-3, -15, 100, 100);
		    panel2.add(b_img_label2);
			//end of images:
		    
		    b_img_label2.addMouseListener(new MouseListener() {
		    	public void mouseClicked(MouseEvent arg0) {
		    		if(b_text2.getText().equals("")) {b_text2.setText("new");}
		    		else if(b_text3.getText().equals("")) {b_text3.setText("new");}
		    		else if(b_text4.getText().equals("")) {b_text4.setText("new");}
		    		else if(b_text5.getText().equals("")) {b_text5.setText("new");}
		    		else if(b_text6.getText().equals("")) {b_text6.setText("new");}
		    		else if(b_text7.getText().equals("")) {b_text7.setText("new");}
		    		else if(b_text8.getText().equals("")) {b_text8.setText("new");}
		    		else if(b_text9.getText().equals("")) {b_text9.setText("new");}
		    		
		    		if (b_tx2.getText().equals("")) {b_tx2.setText("55");}
		    		else if (b_tx3.getText().equals("")) {b_tx3.setText("55");}
		    		else if (b_tx4.getText().equals("")) {b_tx4.setText("55");}
		    		else if (b_tx5.getText().equals("")) {b_tx5.setText("55");}
		    		else if (b_tx6.getText().equals("")) {b_tx6.setText("55");}
		    		else if (b_tx7.getText().equals("")) {b_tx7.setText("55");}
		    		else if (b_tx8.getText().equals("")) {b_tx8.setText("55");}
		    		else if (b_tx9.getText().equals("")) {b_tx9.setText("55");}
		    		}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {} });
		    //end of 1 item:
		    c.add(toppanel);
			c.add(buttompanel);
		
	}

}
