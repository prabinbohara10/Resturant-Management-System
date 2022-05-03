import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Index{
	static JFrame indexframe;
    static Container c;
    static JPanel toppanel;
    static JPanel buttompanel;
    
 
   
  

	public static void main(String[] args) {
		
	    indexframe=new JFrame();
		indexframe.setVisible(true);
		indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		indexframe.setBounds(200,87,930,615);
		indexframe.setTitle("Restaurant Management System (By Prabin Bohara)");
		c=indexframe.getContentPane();
		c.setBackground(Color.BLUE);
		c.setLayout(null);
		
		ImageIcon ititle=new ImageIcon("images/logo1.jpg");
	    indexframe.setIconImage(ititle.getImage());
		
		
		
		//for panel:
		toppanel=new JPanel();
	    buttompanel=new JPanel();
		toppanel.setBounds(0,0,930,100);
		Color color1=new Color(25,25,112);
		toppanel.setBackground(color1);
		toppanel.setLayout(null);
		
		buttompanel.setBounds(0,100,930,500);
		Color color2=new Color(72,61,139);
		buttompanel.setBackground(color2);
		buttompanel.setLayout(null);
		c.add(toppanel,BorderLayout.CENTER);
		c.add(buttompanel,BorderLayout.CENTER);
	    //end of panel:
		
		//for copyright:
		Font copyf=new Font("Arial",Font.BOLD,15);
		
		
		
		JLabel copy_label=new JLabel("Copyright \u00a9 2018. All rights reserved. Created by Prabin Bohara");
		copy_label.setBounds(20,445,850,30);
		copy_label.setFont(copyf);
		copy_label.setForeground(Color.WHITE);
		buttompanel.add(copy_label);
		
		//for heading
		JLabel heading=new JLabel("Restaurant");
		heading.setBounds(270,0,500,100);
		Font headingf=new Font("Blackadder ITC",Font.BOLD,80);
	    heading.setFont(headingf);
		Color colorf=new Color(255,255,255);
		heading.setForeground(colorf);
		heading.setBackground(color2);
		
		toppanel.add(heading);
		
		//for images:
			ImageIcon img1= new ImageIcon("images/logo5.png");
			Image isecond1=img1.getImage();
			Image ithird1=isecond1.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
		    ImageIcon last1 =new ImageIcon(ithird1);
		    JLabel img_label1=new JLabel();
		    img_label1=new JLabel(last1);
		    img_label1.setBounds(20, 0, 200, 100);
			//end of images:
		    toppanel.add(img_label1);
		
		//for images: 
		ImageIcon img= new ImageIcon("images/operator1.png");
		Image isecond=img.getImage();
		Image ithird=isecond.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	    ImageIcon last =new ImageIcon(ithird);
	    JLabel img_label=new JLabel();
	    img_label=new JLabel(last);
	    img_label.setBounds(0, 0, 100, 100);
		//end of images:
	  
		  //for images:
			ImageIcon imga= new ImageIcon("images/main_img.png");
			Image iseconda=imga.getImage();
			Image ithirda=iseconda.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		    ImageIcon lasta =new ImageIcon(ithirda);
		    JLabel img_labela=new JLabel();
		    img_labela=new JLabel(lasta);
		    img_labela.setBounds(680, 250, 250, 250);
			//end of images:
		    buttompanel.add(img_labela);
	  
	    
		//for images:
		ImageIcon img2= new ImageIcon("images/admin1.png");
		Image isecond2=img2.getImage();
		Image ithird2=isecond2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	    ImageIcon last2 =new ImageIcon(ithird2);
	    JLabel img_label2=new JLabel();
	    img_label2.setBackground(color2);
	    img_label2=new JLabel(last2);
	    img_label2.setBounds(0, 0, 100, 100);
		//end of images:
	 
	    

	    
	    JLabel admin_text=new JLabel("Operator Login                    Admin Login");
	    admin_text.setBounds(213,250,500,100);
		Font admin_textf=new Font("Arial",Font.BOLD,25);
	    admin_text.setFont(admin_textf);
		Color admin_textc=new Color(255,255,255);
		admin_text.setForeground(colorf);
		buttompanel.add(admin_text);
		
		
		
		
		//for button:
		JButton button1=new JButton();
		JButton button2=new JButton();
		button1.setBounds(200,80,200,200);
		button2.setBounds(500,80,200,200);
		buttompanel.add(button1);
		buttompanel.add(button2);
		//end of button:
		 button1.add(img_label);
		 button2.add(img_label2);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("any");
				
				
//start of Admin_login.java:
			
				indexframe=new JFrame();
				indexframe.setVisible(true);
				indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				indexframe.setBounds(200,87,930,615);
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
				toppanel.setBackground(color1);
				toppanel.setLayout(null);
				
				buttompanel.setBounds(0,100,930,500);
				Color color3=new Color(65,105,225);
				buttompanel.setBackground(color3);
				buttompanel.setLayout(null);
				c.add(toppanel);
				c.add(buttompanel);
			
				//end of panel:
				
				toppanel.add(heading);
				
				
				//for images:
				ImageIcon img1= new ImageIcon("images/logo5.png");
				Image isecond1=img1.getImage();
				Image ithird1=isecond1.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
			    ImageIcon last1 =new ImageIcon(ithird1);
			    JLabel img_label1=new JLabel();
			    img_label1=new JLabel(last1);
			    img_label1.setBounds(20, 0, 200, 100);
				//end of images:
			    toppanel.add(img_label1);
			    
			    //for admin login page:
			    Font loginf=new Font("Imprint MT Shadow",Font.BOLD,30);
			    JLabel al_label1=new JLabel("Operator Login Form");
			    al_label1.setBounds(297,50,400,100);
			    al_label1.setFont(loginf);
			    
			    Font userf=new Font("David",Font.BOLD,20);
			    JLabel al_label2=new JLabel("Enter Username:");
			    al_label2.setBounds(230,150,300,100);
			    al_label2.setFont(userf);
			    JLabel al_label3=new JLabel("Enter Password:");
			    al_label3.setBounds(230,200,300,100);
			    al_label3.setFont(userf);
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
			    
			   
			    
			    al_button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {


			    String check_password = new String(al_pass1.getPassword());
			    if (check_password.equals("operator")&&(al_text1.getText().equals("prabin10"))  ) {
			    	
//starting of main.java:
			    	
			    	indexframe=new JFrame();
					indexframe.setVisible(true);
					indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					indexframe.setBounds(200,87,930,615);
					indexframe.setTitle("Restaurant Management System");
					c=indexframe.getContentPane();
					c.setBackground(Color.BLUE);
					c.setLayout(null);
					
				
					//for panel:
					toppanel=new JPanel();
				    buttompanel=new JPanel();
					toppanel.setBounds(0,0,930,100);
					toppanel.setBackground(color1);
					toppanel.setLayout(null);
					
					buttompanel.setBounds(0,100,930,500);
					Color color3=new Color(65,105,225);
					buttompanel.setBackground(color3);
					buttompanel.setLayout(null);
					c.add(toppanel);
					c.add(buttompanel);
				
					//end of panel:
					
					toppanel.add(heading);
					
					
					//for images:
					ImageIcon mimg1= new ImageIcon("images/logo5.png");
					Image misecond1=mimg1.getImage();
					Image mithird1=misecond1.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
				    ImageIcon mlast1 =new ImageIcon(mithird1);
				    JLabel mimg_label1=new JLabel();
				    mimg_label1=new JLabel(mlast1);
				    mimg_label1.setBounds(20, 0, 200, 100);
					//end of images:
				    toppanel.add(mimg_label1);
				    
				    
// starting of bimg_label (billing):
				    
				    JLabel main_text=new JLabel("Billing System                    Home Delivery");
				    main_text.setBounds(213,270,500,100);
					Font main_textf=new Font("Arial",Font.BOLD,25);
				    main_text.setFont(main_textf);
					Color main_textc=new Color(255,255,255);
					main_text.setForeground(main_textc);
					buttompanel.add(main_text);
					
				    
				    //for image:
				    ImageIcon bimg1= new ImageIcon("images/e_biling.png");
					Image bisecond1=bimg1.getImage();
					Image bithird1=bisecond1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				    ImageIcon bmlast1 =new ImageIcon(bithird1);
				    JLabel bimg_label1=new JLabel();
				    bimg_label1=new JLabel(bmlast1);
				    buttompanel.add(bimg_label1);
				    bimg_label1.setBounds(200, 100, 200, 200);
					//end of images:
				    

				    bimg_label1.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {
				    		
				    	
				  
				    

				    	
			    	
//starting of Billing.java:
			    	

			        

					
					indexframe=new JFrame();
					indexframe.setVisible(true);
					indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					indexframe.setBounds(200,88,930,615);
					indexframe.setTitle("Restaurant Management System");
					c=indexframe.getContentPane();
					c.setBackground(Color.BLUE);
					c.setLayout(null);
					
					
					
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
					toppanel.setBackground(color1);
					toppanel.setLayout(null);
					
					buttompanel.setBounds(0,0,930,600);
					buttompanel.setBackground(Color.WHITE);
					buttompanel.setLayout(null);
					
					//for images:
					ImageIcon img1= new ImageIcon("images/logo5.png");
					Image isecond1=img1.getImage();
					Image ithird1=isecond1.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
				    ImageIcon last1 =new ImageIcon(ithird1);
				    JLabel img_label1=new JLabel();
				    img_label1=new JLabel(last1);
				    img_label1.setBounds(20, 0, 200, 100);
					//end of images:
				    toppanel.add(img_label1);
				   
				    
				    toppanel.add(heading);
					
					
					panel1.setBounds(0,101,630,50);
					panel1.setBackground(color3);
					panel1.setLayout(null);
					panel2.setBounds(632,102,298,450);
					panel2.setBackground(color3);
					panel2.setLayout(null);
					panel3.setBounds(0,153,300,399);
					panel3.setBackground(color3);
					panel3.setLayout(null);
					panel4.setBounds(302,153,328,299);
					panel4.setBackground(color3);
					panel4.setLayout(null);
					panel5.setBounds(302,454,328,98);
					panel5.setBackground(color3);
					panel5.setLayout(null);
					panel6.setBounds(0,554,930,50);
					panel6.setBackground(color3);
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
					
					//for panel6:
					
					//for copyright:
					Font copy2f=new Font("Arial",Font.BOLD,13);
					
					JLabel copy_label=new JLabel("Copyright \u00a9 2018. All rights reserved. Created by Prabin Bohara");
					copy_label.setBounds(7,-3,848,30);
					copy_label.setFont(copy2f);
					copy_label.setForeground(Color.BLACK);
					panel6.add(copy_label);
					
					//for panel1:
				
					JLabel name=new JLabel("Name :");
					name.setBounds(10, 9, 100, 10);
					name.setBackground(Color.BLACK);
					JLabel phone=new JLabel("Phone No. :");
					phone.setBounds(10, 29, 100, 10);
					JLabel address=new JLabel("Address :");
					address.setBounds(225, 9, 100, 10);
					JLabel table=new JLabel("Table No. :");
					table.setBounds(225, 29, 100, 10);
					JLabel date=new JLabel("Date :");
					date.setBounds(445, 9, 100, 10);
					panel1.add(name);
					panel1.add(phone);
					panel1.add(address);
					panel1.add(table);
					panel1.add(date);
					
					JTextField namet=new JTextField();
					namet.setBounds(80,5,100,20);
					JTextField phonet=new JTextField();
					phonet.setBounds(80,25,100,20);
					JTextField addresst=new JTextField();
					addresst.setBounds(300,5,100,20);
					JTextField tablet=new JTextField();
					tablet.setBounds(300,25,100,20);
					JTextField datet=new JTextField();
					datet.setBounds(485,5,100,20);
					panel1.add(datet);
					panel1.add(namet);
					panel1.add(phonet);
					panel1.add(addresst);
					panel1.add(tablet);
					//end of panel1:
					
					
					//for textfield in panel2:
					/* for numbers i have just changed
					 *  variable from b_text1 to b_txt1.
					 */
					JTextField b_txt1=new JTextField("  S.N.");
					JTextField b_txt2=new JTextField("    1");
					JTextField b_txt3=new JTextField("    2");
					JTextField b_txt4=new JTextField("    3");
					JTextField b_txt5=new JTextField("    4");
					JTextField b_txt6=new JTextField("    5");
					JTextField b_txt7=new JTextField("    6");
					JTextField b_txt8=new JTextField("    7");
					JTextField b_txt9=new JTextField("    8");
					
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
				
					
				
					
				
				    
				      
		  //starting of 1 item:
				  //for images:
					ImageIcon b_img1= new ImageIcon("images/mango.jpg");
					Image b_isecond1=b_img1.getImage();
					Image b_ithird1=b_isecond1.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
				    ImageIcon b_last1 =new ImageIcon(b_ithird1);
				    JLabel b_img_label1=new JLabel();
				    b_img_label1=new JLabel(b_last1);
				    b_img_label1.setBounds(-3, -15, 100, 100);
				    panel2.add(b_img_label1);
					//end of images:
				    
				    b_img_label1.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {	
				    		if(b_text2.getText().equals("")) {b_text2.setText("  Mango");}
				    		else if(b_text3.getText().equals("")) {b_text3.setText("  Mango");}
				    		else if(b_text4.getText().equals("")) {b_text4.setText("  Mango");}
				    		else if(b_text5.getText().equals("")) {b_text5.setText("  Mango");}
				    		else if(b_text6.getText().equals("")) {b_text6.setText("  Mango");}
				    		else if(b_text7.getText().equals("")) {b_text7.setText("  Mango");}
				    		else if(b_text8.getText().equals("")) {b_text8.setText("  Mango");}
				    		else if(b_text9.getText().equals("")) {b_text9.setText("  Mango");}
				    		
				    		if (b_tx2.getText().equals("")) {b_tx2.setText("  320.00");}
				    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  320.00");}
				    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  320.00");}
				    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  320.00");}
				    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  320.00");}
				    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  320.00");}
				    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  320.00");}
				    		else if (b_tx9.getText().equals("")) {b_tx9.setText("  320.00");}
				    		}
						public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {} });
				    //end of 1 item:
				    
		   //starting of 2 item:
				  //for images:
					ImageIcon b_img2= new ImageIcon("images/lentil_soup.jpg");
					Image b_isecond2=b_img2.getImage();
					Image b_ithird2=b_isecond2.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
				    ImageIcon b_last2 =new ImageIcon(b_ithird2);
				    JLabel b_img_label2=new JLabel();
				    b_img_label2=new JLabel(b_last2);
				    b_img_label2.setBounds(96, -15, 100, 100);
				    panel2.add(b_img_label2);
					//end of images:
				    
				    b_img_label2.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {
				    		if(b_text2.getText().equals("")) {b_text2.setText("  Lentil Soup");}
				    		else if(b_text3.getText().equals("")) {b_text3.setText("  Lentil Soup");}
				    		else if(b_text4.getText().equals("")) {b_text4.setText("  Lentil Soup");}
				    		else if(b_text5.getText().equals("")) {b_text5.setText("  Lentil Soup");}
				    		else if(b_text6.getText().equals("")) {b_text6.setText("  Lentil Soup");}
				    		else if(b_text7.getText().equals("")) {b_text7.setText("  Lentil Soup");}
				    		else if(b_text8.getText().equals("")) {b_text8.setText("  Lentil Soup");}
				    		else if(b_text9.getText().equals("")) {b_text9.setText("  Lentil Soup");}
				    		
				    		if (b_tx2.getText().equals("")) {b_tx2.setText("  90.00");}
				    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  90.00");}
				    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  90.00");}
				    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  90.00");}
				    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  90.00");}
				    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  90.00");}
				    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  90.00");}
				    		else if (b_tx9.getText().equals("")) {b_tx9.setText("90.00");}
				    		}
						public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {} });
				  //end of 2 item:
				    
					  //starting of 3 item:
					  //for images:
						ImageIcon b_img3= new ImageIcon("images/momo.jpg");
						Image b_isecond3=b_img3.getImage();
						Image b_ithird3=b_isecond3.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
					    ImageIcon b_last3 =new ImageIcon(b_ithird3);
					    JLabel b_img_label3=new JLabel();
					    b_img_label3=new JLabel(b_last3);
					    b_img_label3.setBounds(195, -15, 100, 100);
					    panel2.add(b_img_label3);
						//end of images:
					    
					    b_img_label3.addMouseListener(new MouseListener() {
					    	public void mouseClicked(MouseEvent arg0) {
					    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Momo");}
					    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Momo");}
					    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Momo");}
					    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Momo");}
					    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Momo");}
					    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Momo");}
					    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Momo");}
					    		else  {b_text9.setText("  Chicken Momo");}
					    		
					    		if (b_tx2.getText().equals("")) {b_tx2.setText("  150.00");}
					    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  150.00");}
					    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  150.00");}
					    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  150.00");}
					    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  150.00");}
					    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  150.00");}
					    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  150.00");}
					    		else {b_tx9.setText("  150.00");}
						    	
					    	
					    		}
							public void mouseEntered(MouseEvent e) {}
							public void mouseExited(MouseEvent e) {}
							public void mousePressed(MouseEvent e) {}
							public void mouseReleased(MouseEvent e) {} });
					  //end of 3 item:
					    
					    //starting of 4 item:
						  //for images:
							ImageIcon b_img4= new ImageIcon("images/chowmein.jpg");
							Image b_isecond4=b_img4.getImage();
							Image b_ithird4=b_isecond4.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
						    ImageIcon b_last4 =new ImageIcon(b_ithird4);
						    JLabel b_img_label4=new JLabel();
						    b_img_label4=new JLabel(b_last4);
						    b_img_label4.setBounds(-3, 59, 100, 100);
						    panel2.add(b_img_label4);
							//end of images:
						    
						    b_img_label4.addMouseListener(new MouseListener() {
						    	public void mouseClicked(MouseEvent arg0) {
						    	
						    		if(b_text2.getText().equals("")) {b_text2.setText("  Chowmien");}
						    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chowmien");}
						    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chowmien");}
						    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chowmien");}
						    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chowmien");}
						    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chowmien");}
						    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chowmien");}
						    		else  {b_text9.setText("  Chowmien");}
						    		
				    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  130.00");}
						    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  130.00");}
						    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  130.00");}
						    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  130.00");}
						    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  130.00");}
						    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  130.00");}
						    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  130.00");}
						    		else  {b_tx9.setText("  130.00");}
						    		}
								public void mouseEntered(MouseEvent e) {}
								public void mouseExited(MouseEvent e) {}
								public void mousePressed(MouseEvent e) {}
								public void mouseReleased(MouseEvent e) {} });
						  //end of 4 item:
				    
						  //starting of  5 item:
							  //for images:
								ImageIcon b_img5= new ImageIcon("images/coca_cola.jpg");
								Image b_isecond5=b_img5.getImage();
								Image b_ithird5=b_isecond5.getScaledInstance(96, 73, Image.SCALE_SMOOTH);
							    ImageIcon b_last5 =new ImageIcon(b_ithird5);
							    JLabel b_img_label5=new JLabel();
							    b_img_label5=new JLabel(b_last5);
							    b_img_label5.setBounds(96, 59, 100, 100);
							    panel2.add(b_img_label5);
								//end of images:
							    
							    b_img_label5.addMouseListener(new MouseListener() {
							    	public void mouseClicked(MouseEvent arg0) {
							    	
							    		if(b_text2.getText().equals("")) {b_text2.setText("  Coca Cola");}
							    		else if(b_text3.getText().equals("")) {b_text3.setText("  Coca Cola");}
							    		else if(b_text4.getText().equals("")) {b_text4.setText("  Coca Cola");}
							    		else if(b_text5.getText().equals("")) {b_text5.setText("  Coca Cola");}
							    		else if(b_text6.getText().equals("")) {b_text6.setText("  Coca Cola");}
							    		else if(b_text7.getText().equals("")) {b_text7.setText("  Coca Cola");}
							    		else if(b_text8.getText().equals("")) {b_text8.setText("  Coca Cola");}
							    		else  {b_text9.setText("  Coca Cola");}
							    		
					    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
							    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  115.00");}
							    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  115.00");}
							    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  115.00");}
							    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  115.00");}
							    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  115.00");}
							    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  115.00");}
							    		else  {b_tx9.setText("  115.00");}
							    		}
									public void mouseEntered(MouseEvent e) {}
									public void mouseExited(MouseEvent e) {}
									public void mousePressed(MouseEvent e) {}
									public void mouseReleased(MouseEvent e) {} });
							  //end of 5 item:
							
							    
							    //starting of  6 item:
								  //for images:
									ImageIcon b_img6= new ImageIcon("images/fanta.jpg");
									Image b_isecond6=b_img6.getImage();
									Image b_ithird6=b_isecond6.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
								    ImageIcon b_last6=new ImageIcon(b_ithird6);
								    JLabel b_img_label6=new JLabel();
								    b_img_label6=new JLabel(b_last6);
								    b_img_label6.setBounds(195, 59, 100, 100);
								    panel2.add(b_img_label6);
									//end of images:
								    
								    b_img_label6.addMouseListener(new MouseListener() {
								    	public void mouseClicked(MouseEvent arg0) {
								    	
								    		if(b_text2.getText().equals("")) {b_text2.setText("  Fanta");}
								    		else if(b_text3.getText().equals("")) {b_text3.setText("  Fanta");}
								    		else if(b_text4.getText().equals("")) {b_text4.setText("  Fanta ");}
								    		else if(b_text5.getText().equals("")) {b_text5.setText("  Fanta");}
								    		else if(b_text6.getText().equals("")) {b_text6.setText("  Fanta");}
								    		else if(b_text7.getText().equals("")) {b_text7.setText("  Fanta");}
								    		else if(b_text8.getText().equals("")) {b_text8.setText("  Fanta");}
								    		else  {b_text9.setText("  Fanta");}
								    		
						    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  105.00");}
								    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  105.00");}
								    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  105.00");}
								    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  105.00");}
								    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  105.00");}
								    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  105.00");}
								    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  105.00");}
								    		else  {b_tx9.setText("  105.00");}
								    		}
										public void mouseEntered(MouseEvent e) {}
										public void mouseExited(MouseEvent e) {}
										public void mousePressed(MouseEvent e) {}
										public void mouseReleased(MouseEvent e) {} });
								  //end of 6 item:
								    
								    //starting of  7 item:
									  //for images:
										ImageIcon b_img7= new ImageIcon("images/burger.jpg");
										Image b_isecond7=b_img7.getImage();
										Image b_ithird7=b_isecond7.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
									    ImageIcon b_last7=new ImageIcon(b_ithird7);
									    JLabel b_img_label7=new JLabel();
									    b_img_label7=new JLabel(b_last7);
									    b_img_label7.setBounds(-3, 134, 100, 100);
									    panel2.add(b_img_label7);
										//end of images:
									    
									    b_img_label7.addMouseListener(new MouseListener() {
									    	public void mouseClicked(MouseEvent arg0) {
									    	
									    		if(b_text2.getText().equals("")) {b_text2.setText("  Burger");}
									    		else if(b_text3.getText().equals("")) {b_text3.setText("  Burger");}
									    		else if(b_text4.getText().equals("")) {b_text4.setText("  Burger ");}
									    		else if(b_text5.getText().equals("")) {b_text5.setText("  Burger");}
									    		else if(b_text6.getText().equals("")) {b_text6.setText("  Burger");}
									    		else if(b_text7.getText().equals("")) {b_text7.setText("  Burger");}
									    		else if(b_text8.getText().equals("")) {b_text8.setText("  Burger");}
									    		else  {b_text9.setText("  Burger");}
									    		
							    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
									    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  259.00");}
									    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  259.00");}
									    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  259.00");}
									    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  259.00");}
									    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  259.00");}
									    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  259.00");}
									    		else  {b_tx9.setText("  259.00");}
									    		}
											public void mouseEntered(MouseEvent e) {}
											public void mouseExited(MouseEvent e) {}
											public void mousePressed(MouseEvent e) {}
											public void mouseReleased(MouseEvent e) {} });
									  //end of 7 item:
									    
									    
									  //starting of  8 item:
										  //for images:
											ImageIcon b_img8= new ImageIcon("images/chicken_bucket.jpg");
											Image b_isecond8=b_img8.getImage();
											Image b_ithird8=b_isecond8.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
										    ImageIcon b_last8=new ImageIcon(b_ithird8);
										    JLabel b_img_label8=new JLabel();
										    b_img_label8=new JLabel(b_last8);
										    b_img_label8.setBounds(96, 134, 100, 100);
										    panel2.add(b_img_label8);
											//end of images:
										    
										    b_img_label8.addMouseListener(new MouseListener() {
										    	public void mouseClicked(MouseEvent arg0) {
										    	
										    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Bucket");}
										    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Bucket");}
										    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Bucket");}
										    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Bucket");}
										    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Bucket");}
										    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Bucket");}
										    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Bucket");}
										    		else  {b_text9.setText("  Chicken Bucket");}
										    		
								    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
										    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  889.00");}
										    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  889.00");}
										    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  889.00");}
										    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  889.00");}
										    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  889.00");}
										    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  889.00");}
										    		else  {b_tx9.setText("  889.00");}
										    		}
												public void mouseEntered(MouseEvent e) {}
												public void mouseExited(MouseEvent e) {}
												public void mousePressed(MouseEvent e) {}
												public void mouseReleased(MouseEvent e) {} });
										  //end of 8 item:
										    
										    //starting of  9 item:
											  //for images:
												ImageIcon b_img9= new ImageIcon("images/sausage.jpg");
												Image b_isecond9=b_img9.getImage();
												Image b_ithird9=b_isecond9.getScaledInstance(96, 73, Image.SCALE_SMOOTH);
											    ImageIcon b_last9=new ImageIcon(b_ithird9);
											    JLabel b_img_label9=new JLabel();
											    b_img_label9=new JLabel(b_last9);
											    b_img_label9.setBounds(195, 134, 100, 100);
											    panel2.add(b_img_label9);
												//end of images:
											    
											    b_img_label9.addMouseListener(new MouseListener() {
											    	public void mouseClicked(MouseEvent arg0) {
											    	
											    		if(b_text2.getText().equals("")) {b_text2.setText("  Sausage");}
											    		else if(b_text3.getText().equals("")) {b_text3.setText("  Sausage");}
											    		else if(b_text4.getText().equals("")) {b_text4.setText("  Sausage");}
											    		else if(b_text5.getText().equals("")) {b_text5.setText("  Sausage");}
											    		else if(b_text6.getText().equals("")) {b_text6.setText("  Sausage");}
											    		else if(b_text7.getText().equals("")) {b_text7.setText("  Sausage");}
											    		else if(b_text8.getText().equals("")) {b_text8.setText("  Sausage");}
											    		else  {b_text9.setText("  Sausage");}
											    		
									    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  340.00");}
											    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  340.00");}
											    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  340.00");}
											    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  340.00");}
											    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  340.00");}
											    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  340.00");}
											    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  340.00");}
											    		else  {b_tx9.setText("  340.00");}
											    		}
													public void mouseEntered(MouseEvent e) {}
													public void mouseExited(MouseEvent e) {}
													public void mousePressed(MouseEvent e) {}
													public void mouseReleased(MouseEvent e) {} });
											  //end of 9 item:
											    
											  //starting of  10 item:
												  //for images:
													ImageIcon b_img10= new ImageIcon("images/pizza.jpg");
													Image b_isecond10=b_img10.getImage();
													Image b_ithird10=b_isecond10.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
												    ImageIcon b_last10=new ImageIcon(b_ithird10);
												    JLabel b_img_label10=new JLabel();
												    b_img_label10=new JLabel(b_last10);
												    b_img_label10.setBounds(-3, 208, 100, 98);
												    panel2.add(b_img_label10);
													//end of images:
												    
												    b_img_label10.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    	
												    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Pizza");}
												    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Pizza");}
												    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Pizza");}
												    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Pizza");}
												    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Pizza");}
												    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Pizza");}
												    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Pizza");}
												    		else  {b_text9.setText("  Chicken Pizza");}
												    		
										    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  210.00");}
												    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  210.00");}
												    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  210.00");}
												    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  210.00");}
												    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  210.00");}
												    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  210.00");}
												    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  210.00");}
												    		else  {b_tx9.setText("  210.00");}
												    		}
														public void mouseEntered(MouseEvent e) {}
														public void mouseExited(MouseEvent e) {}
														public void mousePressed(MouseEvent e) {}
														public void mouseReleased(MouseEvent e) {} });
												  //end of 10 item:
												    
												    //starting of  11 item:
													  //for images:
														ImageIcon b_img11= new ImageIcon("images/drumstick.jpg");
														Image b_isecond11=b_img11.getImage();
														Image b_ithird11=b_isecond11.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
													    ImageIcon b_last11=new ImageIcon(b_ithird11);
													    JLabel b_img_label11=new JLabel();
													    b_img_label11=new JLabel(b_last11);
													    b_img_label11.setBounds(96,208, 100, 100);
													    panel2.add(b_img_label11);
														//end of images:
													    
													    b_img_label11.addMouseListener(new MouseListener() {
													    	public void mouseClicked(MouseEvent arg0) {
													    	
													    		if(b_text2.getText().equals("")) {b_text2.setText("  Drumstick      ");}
													    		else if(b_text3.getText().equals("")) {b_text3.setText("  Drumstick      ");}
													    		else if(b_text4.getText().equals("")) {b_text4.setText("  Drumstick      ");}
													    		else if(b_text5.getText().equals("")) {b_text5.setText("  Drumstick      ");}
													    		else if(b_text6.getText().equals("")) {b_text6.setText("  Drumstick      ");}
													    		else if(b_text7.getText().equals("")) {b_text7.setText("  Drumstick      ");}
													    		else if(b_text8.getText().equals("")) {b_text8.setText("  Drumstick      ");}
													    		else  {b_text9.setText("  Drumstick      ");}
													    		
											    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  175.00");}
													    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  175.00");}
													    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  175.00");}
													    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  175.00");}
													    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  175.00");}
													    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  175.00");}
													    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  175.00");}
													    		else  {b_tx9.setText("  175.00");}
													    		}
															public void mouseEntered(MouseEvent e) {}
															public void mouseExited(MouseEvent e) {}
															public void mousePressed(MouseEvent e) {}
															public void mouseReleased(MouseEvent e) {} });
													  //end of 11 item:
													    
													    //starting of  12 item:
														  //for images:
															ImageIcon b_img12= new ImageIcon("images/sandwich.jpg");
															Image b_isecond12=b_img12.getImage();
															Image b_ithird12=b_isecond12.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
														    ImageIcon b_last12=new ImageIcon(b_ithird12);
														    JLabel b_img_label12=new JLabel();
														    b_img_label12=new JLabel(b_last12);
														    b_img_label12.setBounds(195, 208, 100, 100);
														    panel2.add(b_img_label12);
															//end of images:
														    
														    b_img_label12.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Sandwich      ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Sandwich      ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Sandwich      ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Sandwich      ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Sandwich      ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Sandwich      ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Sandwich      ");}
														    		else  {b_text9.setText("  Sandwich      ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  95.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  95.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  95.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  95.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  95.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  95.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  95.00");}
														    		else  {b_tx9.setText("  95.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 12 item:
														    
														  //starting of  13 item:
															  //for images:
																ImageIcon b_img13= new ImageIcon("images/fish_curry.jpg");
																Image b_isecond13=b_img13.getImage();
																Image b_ithird13=b_isecond13.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last13=new ImageIcon(b_ithird13);
															    JLabel b_img_label13=new JLabel();
															    b_img_label13=new JLabel(b_last13);
															    b_img_label13.setBounds(-3, 281, 100, 100);
															    panel2.add(b_img_label13);
																//end of images:
														    
														    b_img_label13.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Fish Curry    ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Fish Curry    ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Fish Curry    ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Fish Curry    ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Fish Curry    ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Fish Curry    ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Fish Curry    ");}
														    		else  {b_text9.setText("  Fish Curry    ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  190.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  190.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  190.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  190.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  190.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  190.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  190.00");}
														    		else  {b_tx9.setText("  190.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 13 item:
														    
														  //starting of  14 item:
															  //for images:
																ImageIcon b_img14= new ImageIcon("images/coffee.jpg");
																Image b_isecond14=b_img14.getImage();
																Image b_ithird14=b_isecond14.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last14=new ImageIcon(b_ithird14);
															    JLabel b_img_label14=new JLabel();
															    b_img_label14=new JLabel(b_last14);
															    b_img_label14.setBounds(96, 281, 100, 100);
															    panel2.add(b_img_label14);
																//end of images:
														    
														    b_img_label14.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Coffee        ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Coffee        ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Coffee        ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Coffee        ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Coffee        ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Coffee        ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Coffee        ");}
														    		else  {b_text9.setText("  Coffee        ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  75.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  75.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  75.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  75.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  75.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  75.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  75.00");}
														    		else  {b_tx9.setText("  75.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 14 item:
												    
														    
														  //starting of  15 item:
															  //for images:
																ImageIcon b_img15= new ImageIcon("images/spring_roll.jpg");
																Image b_isecond15=b_img15.getImage();
																Image b_ithird15=b_isecond15.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last15=new ImageIcon(b_ithird15);
															    JLabel b_img_label15=new JLabel();
															    b_img_label15=new JLabel(b_last15);
															    b_img_label15.setBounds(195, 281, 100, 100);
															    panel2.add(b_img_label15);
																//end of images:
														    
														    b_img_label15.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Spring Roll   ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Spring Roll   ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Spring Roll   ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Spring Roll   ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Spring Roll   ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Spring Roll   ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Spring Roll   ");}
														    		else  {b_text9.setText("  Spring Roll   ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  400.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  400.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  400.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  400.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  400.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  400.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  400.00");}
														    		else  {b_tx9.setText("  400.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 15 item:
														    
														  //starting of  16 item:
															  //for images:
																ImageIcon b_img16= new ImageIcon("images/chicken_chilly.jpg");
																Image b_isecond16=b_img16.getImage();
																Image b_ithird16=b_isecond16.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last16=new ImageIcon(b_ithird16);
															    JLabel b_img_label16=new JLabel();
															    b_img_label16=new JLabel(b_last16);
															    b_img_label16.setBounds(-3, 355, 100, 100);
															    panel2.add(b_img_label16);
																//end of images:
														    
														    b_img_label16.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Chilly");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Chilly");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Chilly");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Chilly");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Chilly");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Chilly");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Chilly");}
														    		else  {b_text9.setText("  Chicken Chilly");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  290.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  290.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  290.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  290.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  290.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  290.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  290.00");}
														    		else  {b_tx9.setText("  290.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 16 item:
														    
														  //starting of  17 item:
															  //for images:
																ImageIcon b_img17= new ImageIcon("images/green_salad.jpg");
																Image b_isecond17=b_img17.getImage();
																Image b_ithird17=b_isecond17.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last17=new ImageIcon(b_ithird17);
															    JLabel b_img_label17=new JLabel();
															    b_img_label17=new JLabel(b_last17);
															    b_img_label17.setBounds(96, 355, 100, 100);
															    panel2.add(b_img_label17);
																//end of images:
														    
														    b_img_label17.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Green Salad   ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Green Salad   ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Green Salad   ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Green Salad   ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Green Salad   ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Green Salad   ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Green Salad   ");}
														    		else  {b_text9.setText("  Green Salad   ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  210.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  210.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  210.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  210.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  210.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  210.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  210.00");}
														    		else  {b_tx9.setText("  210.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 17 item:
														    
														    //starting of  18 item:
															  //for images:
																ImageIcon b_img18= new ImageIcon("images/mixed_veg_curry.jpg");
																Image b_isecond18=b_img18.getImage();
																Image b_ithird18=b_isecond18.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last18=new ImageIcon(b_ithird18);
															    JLabel b_img_label18=new JLabel();
															    b_img_label18=new JLabel(b_last18);
															    b_img_label18.setBounds(195, 355, 100, 100);
															    panel2.add(b_img_label18);
																//end of images:
														    
														    b_img_label18.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Mixed Veg Curry");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Mixed Veg Curry");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Mixed Veg Curry");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Mixed Veg Curry");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Mixed Veg Curry");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Mixed Veg Curry");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Mixed Veg Curry");}
														    		else  {b_text9.setText("  Mixed Veg Curry");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  90.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  90.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  90.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  90.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  90.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  90.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  90.00");}
														    		else  {b_tx9.setText("  90.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 18 item:
												    
									//for reset button:
												    JButton reset_button=new JButton("Reset");
											        reset_button.setBounds(50, 330, 70, 20);
											        panel3.add(reset_button);
											        reset_button.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    		b_text2.setText(null);
												    		b_text3.setText(null);
												    		b_text4.setText(null);
												    		b_text5.setText(null);
												    		b_text6.setText(null);
												    		b_text7.setText(null);
												    		b_text8.setText(null);
												    		b_text9.setText(null);
												    		
												    		b_tx2.setText(null);
												    		b_tx3.setText(null);
												    		b_tx4.setText(null);
												    		b_tx5.setText(null);
												    		b_tx6.setText(null);
												    		b_tx7.setText(null);
												    		b_tx8.setText(null);
												    		b_tx9.setText(null);}
												    	
												    		public void mouseEntered(MouseEvent e) {}
															public void mouseExited(MouseEvent e) {}
															public void mousePressed(MouseEvent e) {}
															public void mouseReleased(MouseEvent e) {} });
											        
											     // for discount:
												    
												    JButton dis_button=new JButton("Discount");
												    dis_button.setBounds(50, 360, 110, 20);
												    panel3.add(dis_button);
												    
												    JTextField dis_field=new JTextField();
												    dis_field.setBounds(190, 360, 100, 20);
												    panel3.add(dis_field);
												        
												    		
												    
								   //for total button:
											        JButton total_button=new JButton("Total");
											        total_button.setBounds(200, 330, 70, 20);
											        panel3.add(total_button);
											        total_button.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    		
												    		//for calculation:
												    	
															
														    JTextArea bill=new JTextArea();
														    bill.setBounds(5,5,318,290);
														    Color panel4c=new Color	(147,112,219);
														    bill.setBackground(panel4c);
														    
														    panel4.add(bill);
														    
														    bill.append("\n                                     Bill of the Costumer ");
														    bill.append("\n----------------------------------------------------------------------------------------\n");
														    bill.append("Bill No. :006\n");
														    bill.append("Name : "+namet.getText()+"\t Date : "+datet.getText()+"\n");
														    bill.append("----------------------------------------------------------------------------------------\n");
														    bill.append("\n");
														    bill.append("    S.N."+"     Name of Item"+"\t  Price(Rs.)"+"       Remarks\n");
														    bill.append("     1       "+b_text2.getText()+"     "+b_tx2.getText()+"\n");
														    bill.append("     2       "+b_text3.getText()+"     "+b_tx3.getText()+"\n");
														    bill.append("     3       "+b_text4.getText()+"     "+b_tx4.getText()+"\n");
														    bill.append("     4       "+b_text5.getText()+"     "+b_tx5.getText()+"\n");
														    bill.append("     5       "+b_text6.getText()+"     "+b_tx6.getText()+"\n");
														    bill.append("     6       "+b_text7.getText()+"     "+b_tx7.getText()+"\n");
														    bill.append("     7       "+b_text8.getText()+"     "+b_tx8.getText()+"\n");
														    bill.append("     8       "+b_text9.getText()+"     "+b_tx9.getText()+"\n");
														    
												
														    
														
														    //for panel5:

															JLabel bill_amt=new JLabel("Bill Amount :");
															panel5.add(bill_amt);
															bill_amt.setBounds(10, 12, 150, 10);
															JLabel received=new JLabel("Payment Received :");
															panel5.add(received);
															received.setBounds(10, 32, 150, 10);
															JLabel service=new JLabel("Service Charges :");
															panel5.add(service);
															service.setBounds(10, 52, 150, 10);
															JLabel refund=new JLabel("Refund :");
															panel5.add(refund);
															refund.setBounds(10, 72, 150, 10);
															
															JTextField bill_amtt=new JTextField();
															panel5.add(bill_amtt);
															bill_amtt.setBounds(130,10,100,20);
															JTextField receivedt=new JTextField();
															panel5.add(receivedt);
															receivedt.setBounds(130,30,100,20);
															JTextField servicet=new JTextField();
															panel5.add(servicet);
															servicet.setBounds(130,50,100,20);
															JTextField refundt=new JTextField();
															panel5.add(refundt);
															refundt.setBounds(130,70,100,20);
															
											 //for final calculation:
															float t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0;
														if(!"".equals(b_tx2.getText())) {t2=Float.parseFloat(b_tx2.getText());}
														if(!"".equals(b_tx3.getText())) {t3=Float.parseFloat(b_tx3.getText());}
														if(!"".equals(b_tx4.getText())) {t4=Float.parseFloat(b_tx4.getText());}
														if(!"".equals(b_tx5.getText())) {t5=Float.parseFloat(b_tx5.getText());}
														if(!"".equals(b_tx6.getText())) {t6=Float.parseFloat(b_tx6.getText());}
														if(!"".equals(b_tx7.getText())) {t7=Float.parseFloat(b_tx7.getText());}
														if(!"".equals(b_tx8.getText())) {t8=Float.parseFloat(b_tx8.getText());}
														if(!"".equals(b_tx9.getText())) {t9=Float.parseFloat(b_tx9.getText());}
															
															float semi_total=t2+t3+t4+t5+t6+t7+t8+t9;
															String grand_total=Float.toString(semi_total);
															bill_amtt.setText(grand_total);
															
												
															
															
															
															
															
														
												
														    
														    
										    
												    		
												    	}
												    	public void mouseEntered(MouseEvent e) {}
														public void mouseExited(MouseEvent e) {}
														public void mousePressed(MouseEvent e) {}
														public void mouseReleased(MouseEvent e) {} });
											        

													
															

												    	
												    
						 	
						        	
				    		
				  
					
		
					    
				    
				    
				    
				  
				    
				      
																	    
				    
				    c.add(toppanel);
					c.add(buttompanel);
//end of Billing.java:
				    	}
				    	public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {}});
				    
	
					
	// starting of fimg_label (food delivery) :
					  //for image:
				    ImageIcon fimg1= new ImageIcon("images/delivery.png");
					Image fisecond1=fimg1.getImage();
					Image fithird1=fisecond1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				    ImageIcon fmlast1 =new ImageIcon(fithird1);
				    JLabel fimg_label1=new JLabel();
				    fimg_label1=new JLabel(fmlast1);
				    buttompanel.add(fimg_label1);
				    fimg_label1.setBounds(500, 100, 200, 200);
					//end of images:
				    

				    fimg_label1.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {
				    		
				    	
				  
				    

				    	
			    	
//starting of food delivery.java:
			    	

					indexframe=new JFrame();
					indexframe.setVisible(true);
					indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					indexframe.setBounds(200,90,930,600);
					indexframe.setTitle("Restaurant Management System");
					c=indexframe.getContentPane();
					c.setBackground(Color.BLUE);
					c.setLayout(null);
					
					
					
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
					toppanel.setBackground(color1);
					toppanel.setLayout(null);
					
					buttompanel.setBounds(0,0,930,600);
					buttompanel.setBackground(Color.WHITE);
					buttompanel.setLayout(null);
					
					//for images:
					ImageIcon img1= new ImageIcon("images/logo5.png");
					Image isecond1=img1.getImage();
					Image ithird1=isecond1.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
				    ImageIcon last1 =new ImageIcon(ithird1);
				    JLabel img_label1=new JLabel();
				    img_label1=new JLabel(last1);
				    img_label1.setBounds(20, 0, 200, 100);
					//end of images:
				    toppanel.add(img_label1);
				   
				    
				    toppanel.add(heading);
					
					
					panel1.setBounds(0,101,630,50);
					panel1.setBackground(color3);
					panel1.setLayout(null);
					panel2.setBounds(2,325,297,221);
					panel2.setBackground(Color.RED);
					panel2.setLayout(null);
					panel3.setBounds(2,153,299,170);
					panel3.setBackground(color3);
					panel3.setLayout(null);
					panel4.setBounds(302,153,328,325);
					panel4.setBackground(color3);
					panel4.setLayout(null);
					panel5.setBounds(302,480,328,98);
					panel5.setBackground(color3);
					panel5.setLayout(null);
					panel6.setBounds(634,102,398,485);
					panel6.setBackground(color3);
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
					
					//for panel1:
					Font font1=new Font("Arial",Font.BOLD,20);
					JLabel label1=new JLabel("Home Delivery Service");
					label1.setBounds(5,2,300,20);
					panel1.add(label1);
					
					//for panel6:
					//for images:
					ImageIcon aimg1= new ImageIcon("images/delivery.png");
					Image aisecond1=aimg1.getImage();
					Image aithird1=aisecond1.getScaledInstance(390, 450, Image.SCALE_SMOOTH);
				    ImageIcon alast1 =new ImageIcon(aithird1);
				    JLabel aimg_label1=new JLabel();
				    aimg_label1=new JLabel(alast1);
				    aimg_label1.setBounds(2, 2, 398, 485);
					//end of images:
				    panel6.add(aimg_label1);
					
					
					//for panel3:
				
					JLabel name=new JLabel("Name :");
					name.setBounds(10, 10, 100, 10);
					name.setBackground(Color.BLACK);
					JLabel phone=new JLabel("Phone No. :");
					phone.setBounds(10,35 , 100, 10);
					JLabel address=new JLabel("Address :");
					address.setBounds(10, 60, 100, 10);
					JLabel house=new JLabel("House No. :");
					house.setBounds(10, 85, 100, 10);
					JLabel deliverby=new JLabel("Deliver By :");
					panel3.add(deliverby);
				    deliverby.setBounds(10, 110, 100, 10);
				    JLabel paymentm=new JLabel("Payment Method :");
					paymentm.setBounds(10, 135, 1300, 10);
					
					panel3.add(name);
					panel3.add(phone);
					panel3.add(address);
					panel3.add(house);
				
					panel3.add(paymentm);
					
					
					JTextField namet=new JTextField();
					namet.setBounds(120,6,100,20);
					JTextField phonet=new JTextField();
					phonet.setBounds(120,29,100,20);
					JTextField addresst=new JTextField();
					addresst.setBounds(120,52,100,20);
					JTextField houset=new JTextField();
					houset.setBounds(120,75,100,20);
					JTextField deliverbyt=new JTextField();
					deliverbyt.setBounds(120,98,100,20);
					JTextField paymentmt=new JTextField();
					paymentmt.setBounds(120,130,100,20);
				
					
					panel3.add(namet);
					panel3.add(phonet);
					panel3.add(addresst);
					panel3.add(houset);
					panel3.add(deliverbyt);
					panel3.add(paymentmt);
					//end of panel3:
					
					
					//for textfield in panel4:
					/* for numbers i have just changed
					 *  variable from b_text1 to b_txt1.
					 */
					JTextField b_txt1=new JTextField("  S.N.");
					JTextField b_txt2=new JTextField("    1");
					JTextField b_txt3=new JTextField("    2");
					JTextField b_txt4=new JTextField("    3");
					JTextField b_txt5=new JTextField("    4");
					JTextField b_txt6=new JTextField("    5");
					JTextField b_txt7=new JTextField("    6");
					JTextField b_txt8=new JTextField("    7");
					JTextField b_txt9=new JTextField("    8");
					
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
					
					panel4.add(b_txt1);
					panel4.add(b_txt2);
					panel4.add(b_txt3);
					panel4.add(b_txt4);
					panel4.add(b_txt5);
					panel4.add(b_txt6);
					panel4.add(b_txt7);
					panel4.add(b_txt8);
					panel4.add(b_txt9);
					
					panel4.add(b_text1);
					panel4.add(b_text2);
					panel4.add(b_text3);
					panel4.add(b_text4);
					panel4.add(b_text5);
					panel4.add(b_text6);
					panel4.add(b_text7);
					panel4.add(b_text8);
					panel4.add(b_text9);
					
					panel4.add(b_tx1);
					panel4.add(b_tx2);
					panel4.add(b_tx3);
					panel4.add(b_tx4);
					panel4.add(b_tx5);
					panel4.add(b_tx6);
					panel4.add(b_tx7);
					panel4.add(b_tx8);
					panel4.add(b_tx9);
			
					
				
					
				
				    
				      
		  //starting of 1 item:
				  //for images:
					ImageIcon b_img1= new ImageIcon("images/mango.jpg");
					Image b_isecond1=b_img1.getImage();
					Image b_ithird1=b_isecond1.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
				    ImageIcon b_last1 =new ImageIcon(b_ithird1);
				    JLabel b_img_label1=new JLabel();
				    b_img_label1=new JLabel(b_last1);
				    b_img_label1.setBounds(-3, -15, 100, 100);
				    panel2.add(b_img_label1);
					//end of images:
				    
				    b_img_label1.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {	
				    		if(b_text2.getText().equals("")) {b_text2.setText("  Mango");}
				    		else if(b_text3.getText().equals("")) {b_text3.setText("  Mango");}
				    		else if(b_text4.getText().equals("")) {b_text4.setText("  Mango");}
				    		else if(b_text5.getText().equals("")) {b_text5.setText("  Mango");}
				    		else if(b_text6.getText().equals("")) {b_text6.setText("  Mango");}
				    		else if(b_text7.getText().equals("")) {b_text7.setText("  Mango");}
				    		else if(b_text8.getText().equals("")) {b_text8.setText("  Mango");}
				    		else if(b_text9.getText().equals("")) {b_text9.setText("  Mango");}
				    		
				    		if (b_tx2.getText().equals("")) {b_tx2.setText("  320.00");}
				    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  320.00");}
				    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  320.00");}
				    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  320.00");}
				    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  320.00");}
				    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  320.00");}
				    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  320.00");}
				    		else if (b_tx9.getText().equals("")) {b_tx9.setText("  320.00");}
				    		}
						public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {} });
				    //end of 1 item:
				    
		   //starting of 2 item:
				  //for images:
					ImageIcon b_img2= new ImageIcon("images/lentil_soup.jpg");
					Image b_isecond2=b_img2.getImage();
					Image b_ithird2=b_isecond2.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
				    ImageIcon b_last2 =new ImageIcon(b_ithird2);
				    JLabel b_img_label2=new JLabel();
				    b_img_label2=new JLabel(b_last2);
				    b_img_label2.setBounds(96, -15, 100, 100);
				    panel2.add(b_img_label2);
					//end of images:
				    
				    b_img_label2.addMouseListener(new MouseListener() {
				    	public void mouseClicked(MouseEvent arg0) {
				    		if(b_text2.getText().equals("")) {b_text2.setText("  Lentil Soup");}
				    		else if(b_text3.getText().equals("")) {b_text3.setText("  Lentil Soup");}
				    		else if(b_text4.getText().equals("")) {b_text4.setText("  Lentil Soup");}
				    		else if(b_text5.getText().equals("")) {b_text5.setText("  Lentil Soup");}
				    		else if(b_text6.getText().equals("")) {b_text6.setText("  Lentil Soup");}
				    		else if(b_text7.getText().equals("")) {b_text7.setText("  Lentil Soup");}
				    		else if(b_text8.getText().equals("")) {b_text8.setText("  Lentil Soup");}
				    		else if(b_text9.getText().equals("")) {b_text9.setText("  Lentil Soup");}
				    		
				    		if (b_tx2.getText().equals("")) {b_tx2.setText("  90.00");}
				    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  90.00");}
				    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  90.00");}
				    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  90.00");}
				    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  90.00");}
				    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  90.00");}
				    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  90.00");}
				    		else if (b_tx9.getText().equals("")) {b_tx9.setText("90.00");}
				    		}
						public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {} });
				  //end of 2 item:
				    
					  //starting of 3 item:
					  //for images:
						ImageIcon b_img3= new ImageIcon("images/momo.jpg");
						Image b_isecond3=b_img3.getImage();
						Image b_ithird3=b_isecond3.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
					    ImageIcon b_last3 =new ImageIcon(b_ithird3);
					    JLabel b_img_label3=new JLabel();
					    b_img_label3=new JLabel(b_last3);
					    b_img_label3.setBounds(195, -15, 100, 100);
					    panel2.add(b_img_label3);
						//end of images:
					    
					    b_img_label3.addMouseListener(new MouseListener() {
					    	public void mouseClicked(MouseEvent arg0) {
					    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Momo");}
					    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Momo");}
					    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Momo");}
					    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Momo");}
					    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Momo");}
					    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Momo");}
					    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Momo");}
					    		else  {b_text9.setText("  Chicken Momo");}
					    		
					    		if (b_tx2.getText().equals("")) {b_tx2.setText("  150.00");}
					    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  150.00");}
					    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  150.00");}
					    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  150.00");}
					    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  150.00");}
					    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  150.00");}
					    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  150.00");}
					    		else {b_tx9.setText("  150.00");}
						    	
					    	
					    		}
							public void mouseEntered(MouseEvent e) {}
							public void mouseExited(MouseEvent e) {}
							public void mousePressed(MouseEvent e) {}
							public void mouseReleased(MouseEvent e) {} });
					  //end of 3 item:
					    
					    //starting of 4 item:
						  //for images:
							ImageIcon b_img4= new ImageIcon("images/chowmein.jpg");
							Image b_isecond4=b_img4.getImage();
							Image b_ithird4=b_isecond4.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
						    ImageIcon b_last4 =new ImageIcon(b_ithird4);
						    JLabel b_img_label4=new JLabel();
						    b_img_label4=new JLabel(b_last4);
						    b_img_label4.setBounds(-3, 59, 100, 100);
						    panel2.add(b_img_label4);
							//end of images:
						    
						    b_img_label4.addMouseListener(new MouseListener() {
						    	public void mouseClicked(MouseEvent arg0) {
						    	
						    		if(b_text2.getText().equals("")) {b_text2.setText("  Chowmien");}
						    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chowmien");}
						    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chowmien");}
						    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chowmien");}
						    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chowmien");}
						    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chowmien");}
						    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chowmien");}
						    		else  {b_text9.setText("  Chowmien");}
						    		
				    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  130.00");}
						    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  130.00");}
						    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  130.00");}
						    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  130.00");}
						    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  130.00");}
						    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  130.00");}
						    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  130.00");}
						    		else  {b_tx9.setText("  130.00");}
						    		}
								public void mouseEntered(MouseEvent e) {}
								public void mouseExited(MouseEvent e) {}
								public void mousePressed(MouseEvent e) {}
								public void mouseReleased(MouseEvent e) {} });
						  //end of 4 item:
				    
						  //starting of  5 item:
							  //for images:
								ImageIcon b_img5= new ImageIcon("images/coca_cola.jpg");
								Image b_isecond5=b_img5.getImage();
								Image b_ithird5=b_isecond5.getScaledInstance(96, 73, Image.SCALE_SMOOTH);
							    ImageIcon b_last5 =new ImageIcon(b_ithird5);
							    JLabel b_img_label5=new JLabel();
							    b_img_label5=new JLabel(b_last5);
							    b_img_label5.setBounds(96, 59, 100, 100);
							    panel2.add(b_img_label5);
								//end of images:
							    
							    b_img_label5.addMouseListener(new MouseListener() {
							    	public void mouseClicked(MouseEvent arg0) {
							    	
							    		if(b_text2.getText().equals("")) {b_text2.setText("  Coca Cola");}
							    		else if(b_text3.getText().equals("")) {b_text3.setText("  Coca Cola");}
							    		else if(b_text4.getText().equals("")) {b_text4.setText("  Coca Cola");}
							    		else if(b_text5.getText().equals("")) {b_text5.setText("  Coca Cola");}
							    		else if(b_text6.getText().equals("")) {b_text6.setText("  Coca Cola");}
							    		else if(b_text7.getText().equals("")) {b_text7.setText("  Coca Cola");}
							    		else if(b_text8.getText().equals("")) {b_text8.setText("  Coca Cola");}
							    		else  {b_text9.setText("  Coca Cola");}
							    		
					    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
							    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  115.00");}
							    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  115.00");}
							    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  115.00");}
							    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  115.00");}
							    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  115.00");}
							    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  115.00");}
							    		else  {b_tx9.setText("  115.00");}
							    		}
									public void mouseEntered(MouseEvent e) {}
									public void mouseExited(MouseEvent e) {}
									public void mousePressed(MouseEvent e) {}
									public void mouseReleased(MouseEvent e) {} });
							  //end of 5 item:
							
							    
							    //starting of  6 item:
								  //for images:
									ImageIcon b_img6= new ImageIcon("images/fanta.jpg");
									Image b_isecond6=b_img6.getImage();
									Image b_ithird6=b_isecond6.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
								    ImageIcon b_last6=new ImageIcon(b_ithird6);
								    JLabel b_img_label6=new JLabel();
								    b_img_label6=new JLabel(b_last6);
								    b_img_label6.setBounds(195, 59, 100, 100);
								    panel2.add(b_img_label6);
									//end of images:
								    
								    b_img_label6.addMouseListener(new MouseListener() {
								    	public void mouseClicked(MouseEvent arg0) {
								    	
								    		if(b_text2.getText().equals("")) {b_text2.setText("  Fanta");}
								    		else if(b_text3.getText().equals("")) {b_text3.setText("  Fanta");}
								    		else if(b_text4.getText().equals("")) {b_text4.setText("  Fanta ");}
								    		else if(b_text5.getText().equals("")) {b_text5.setText("  Fanta");}
								    		else if(b_text6.getText().equals("")) {b_text6.setText("  Fanta");}
								    		else if(b_text7.getText().equals("")) {b_text7.setText("  Fanta");}
								    		else if(b_text8.getText().equals("")) {b_text8.setText("  Fanta");}
								    		else  {b_text9.setText("  Fanta");}
								    		
						    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  105.00");}
								    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  105.00");}
								    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  105.00");}
								    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  105.00");}
								    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  105.00");}
								    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  105.00");}
								    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  105.00");}
								    		else  {b_tx9.setText("  105.00");}
								    		}
										public void mouseEntered(MouseEvent e) {}
										public void mouseExited(MouseEvent e) {}
										public void mousePressed(MouseEvent e) {}
										public void mouseReleased(MouseEvent e) {} });
								  //end of 6 item:
								    
								    //starting of  7 item:
									  //for images:
										ImageIcon b_img7= new ImageIcon("images/burger.jpg");
										Image b_isecond7=b_img7.getImage();
										Image b_ithird7=b_isecond7.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
									    ImageIcon b_last7=new ImageIcon(b_ithird7);
									    JLabel b_img_label7=new JLabel();
									    b_img_label7=new JLabel(b_last7);
									    b_img_label7.setBounds(-3, 134, 100, 100);
									    panel2.add(b_img_label7);
										//end of images:
									    
									    b_img_label7.addMouseListener(new MouseListener() {
									    	public void mouseClicked(MouseEvent arg0) {
									    	
									    		if(b_text2.getText().equals("")) {b_text2.setText("  Burger");}
									    		else if(b_text3.getText().equals("")) {b_text3.setText("  Burger");}
									    		else if(b_text4.getText().equals("")) {b_text4.setText("  Burger ");}
									    		else if(b_text5.getText().equals("")) {b_text5.setText("  Burger");}
									    		else if(b_text6.getText().equals("")) {b_text6.setText("  Burger");}
									    		else if(b_text7.getText().equals("")) {b_text7.setText("  Burger");}
									    		else if(b_text8.getText().equals("")) {b_text8.setText("  Burger");}
									    		else  {b_text9.setText("  Burger");}
									    		
							    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
									    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  259.00");}
									    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  259.00");}
									    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  259.00");}
									    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  259.00");}
									    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  259.00");}
									    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  259.00");}
									    		else  {b_tx9.setText("  259.00");}
									    		}
											public void mouseEntered(MouseEvent e) {}
											public void mouseExited(MouseEvent e) {}
											public void mousePressed(MouseEvent e) {}
											public void mouseReleased(MouseEvent e) {} });
									  //end of 7 item:
									    
									    
									  //starting of  8 item:
										  //for images:
											ImageIcon b_img8= new ImageIcon("images/chicken_bucket.jpg");
											Image b_isecond8=b_img8.getImage();
											Image b_ithird8=b_isecond8.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
										    ImageIcon b_last8=new ImageIcon(b_ithird8);
										    JLabel b_img_label8=new JLabel();
										    b_img_label8=new JLabel(b_last8);
										    b_img_label8.setBounds(96, 134, 100, 100);
										    panel2.add(b_img_label8);
											//end of images:
										    
										    b_img_label8.addMouseListener(new MouseListener() {
										    	public void mouseClicked(MouseEvent arg0) {
										    	
										    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Bucket");}
										    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Bucket");}
										    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Bucket");}
										    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Bucket");}
										    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Bucket");}
										    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Bucket");}
										    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Bucket");}
										    		else  {b_text9.setText("  Chicken Bucket");}
										    		
								    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  115.00");}
										    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  889.00");}
										    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  889.00");}
										    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  889.00");}
										    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  889.00");}
										    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  889.00");}
										    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  889.00");}
										    		else  {b_tx9.setText("  889.00");}
										    		}
												public void mouseEntered(MouseEvent e) {}
												public void mouseExited(MouseEvent e) {}
												public void mousePressed(MouseEvent e) {}
												public void mouseReleased(MouseEvent e) {} });
										  //end of 8 item:
										    
										    //starting of  9 item:
											  //for images:
												ImageIcon b_img9= new ImageIcon("images/sausage.jpg");
												Image b_isecond9=b_img9.getImage();
												Image b_ithird9=b_isecond9.getScaledInstance(96, 73, Image.SCALE_SMOOTH);
											    ImageIcon b_last9=new ImageIcon(b_ithird9);
											    JLabel b_img_label9=new JLabel();
											    b_img_label9=new JLabel(b_last9);
											    b_img_label9.setBounds(195, 134, 100, 100);
											    panel2.add(b_img_label9);
												//end of images:
											    
											    b_img_label9.addMouseListener(new MouseListener() {
											    	public void mouseClicked(MouseEvent arg0) {
											    	
											    		if(b_text2.getText().equals("")) {b_text2.setText("  Sausage");}
											    		else if(b_text3.getText().equals("")) {b_text3.setText("  Sausage");}
											    		else if(b_text4.getText().equals("")) {b_text4.setText("  Sausage");}
											    		else if(b_text5.getText().equals("")) {b_text5.setText("  Sausage");}
											    		else if(b_text6.getText().equals("")) {b_text6.setText("  Sausage");}
											    		else if(b_text7.getText().equals("")) {b_text7.setText("  Sausage");}
											    		else if(b_text8.getText().equals("")) {b_text8.setText("  Sausage");}
											    		else  {b_text9.setText("  Sausage");}
											    		
									    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  340.00");}
											    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  340.00");}
											    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  340.00");}
											    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  340.00");}
											    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  340.00");}
											    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  340.00");}
											    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  340.00");}
											    		else  {b_tx9.setText("  340.00");}
											    		}
													public void mouseEntered(MouseEvent e) {}
													public void mouseExited(MouseEvent e) {}
													public void mousePressed(MouseEvent e) {}
													public void mouseReleased(MouseEvent e) {} });
											  //end of 9 item:
											    
											  //starting of  10 item:
												  //for images:
													ImageIcon b_img10= new ImageIcon("images/pizza.jpg");
													Image b_isecond10=b_img10.getImage();
													Image b_ithird10=b_isecond10.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
												    ImageIcon b_last10=new ImageIcon(b_ithird10);
												    JLabel b_img_label10=new JLabel();
												    b_img_label10=new JLabel(b_last10);
												    b_img_label10.setBounds(-3, 208, 100, 98);
												    panel2.add(b_img_label10);
													//end of images:
												    
												    b_img_label10.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    	
												    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Pizza");}
												    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Pizza");}
												    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Pizza");}
												    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Pizza");}
												    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Pizza");}
												    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Pizza");}
												    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Pizza");}
												    		else  {b_text9.setText("  Chicken Pizza");}
												    		
										    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  210.00");}
												    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  210.00");}
												    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  210.00");}
												    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  210.00");}
												    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  210.00");}
												    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  210.00");}
												    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  210.00");}
												    		else  {b_tx9.setText("  210.00");}
												    		}
														public void mouseEntered(MouseEvent e) {}
														public void mouseExited(MouseEvent e) {}
														public void mousePressed(MouseEvent e) {}
														public void mouseReleased(MouseEvent e) {} });
												  //end of 10 item:
												    
												    //starting of  11 item:
													  //for images:
														ImageIcon b_img11= new ImageIcon("images/drumstick.jpg");
														Image b_isecond11=b_img11.getImage();
														Image b_ithird11=b_isecond11.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
													    ImageIcon b_last11=new ImageIcon(b_ithird11);
													    JLabel b_img_label11=new JLabel();
													    b_img_label11=new JLabel(b_last11);
													    b_img_label11.setBounds(96,208, 100, 100);
													    panel2.add(b_img_label11);
														//end of images:
													    
													    b_img_label11.addMouseListener(new MouseListener() {
													    	public void mouseClicked(MouseEvent arg0) {
													    	
													    		if(b_text2.getText().equals("")) {b_text2.setText("  Drumstick      ");}
													    		else if(b_text3.getText().equals("")) {b_text3.setText("  Drumstick      ");}
													    		else if(b_text4.getText().equals("")) {b_text4.setText("  Drumstick      ");}
													    		else if(b_text5.getText().equals("")) {b_text5.setText("  Drumstick      ");}
													    		else if(b_text6.getText().equals("")) {b_text6.setText("  Drumstick      ");}
													    		else if(b_text7.getText().equals("")) {b_text7.setText("  Drumstick      ");}
													    		else if(b_text8.getText().equals("")) {b_text8.setText("  Drumstick      ");}
													    		else  {b_text9.setText("  Drumstick      ");}
													    		
											    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  175.00");}
													    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  175.00");}
													    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  175.00");}
													    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  175.00");}
													    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  175.00");}
													    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  175.00");}
													    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  175.00");}
													    		else  {b_tx9.setText("  175.00");}
													    		}
															public void mouseEntered(MouseEvent e) {}
															public void mouseExited(MouseEvent e) {}
															public void mousePressed(MouseEvent e) {}
															public void mouseReleased(MouseEvent e) {} });
													  //end of 11 item:
													    
													    //starting of  12 item:
														  //for images:
															ImageIcon b_img12= new ImageIcon("images/sandwich.jpg");
															Image b_isecond12=b_img12.getImage();
															Image b_ithird12=b_isecond12.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
														    ImageIcon b_last12=new ImageIcon(b_ithird12);
														    JLabel b_img_label12=new JLabel();
														    b_img_label12=new JLabel(b_last12);
														    b_img_label12.setBounds(195, 208, 100, 100);
														    panel2.add(b_img_label12);
															//end of images:
														    
														    b_img_label12.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Sandwich      ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Sandwich      ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Sandwich      ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Sandwich      ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Sandwich      ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Sandwich      ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Sandwich      ");}
														    		else  {b_text9.setText("  Sandwich      ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  95.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  95.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  95.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  95.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  95.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  95.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  95.00");}
														    		else  {b_tx9.setText("  95.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 12 item:
														    
														  //starting of  13 item:
															  //for images:
																ImageIcon b_img13= new ImageIcon("images/fish_curry.jpg");
																Image b_isecond13=b_img13.getImage();
																Image b_ithird13=b_isecond13.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last13=new ImageIcon(b_ithird13);
															    JLabel b_img_label13=new JLabel();
															    b_img_label13=new JLabel(b_last13);
															    b_img_label13.setBounds(-3, 281, 100, 100);
															    panel2.add(b_img_label13);
																//end of images:
														    
														    b_img_label13.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Fish Curry    ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Fish Curry    ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Fish Curry    ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Fish Curry    ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Fish Curry    ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Fish Curry    ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Fish Curry    ");}
														    		else  {b_text9.setText("  Fish Curry    ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  190.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  190.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  190.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  190.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  190.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  190.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  190.00");}
														    		else  {b_tx9.setText("  190.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 13 item:
														    
														  //starting of  14 item:
															  //for images:
																ImageIcon b_img14= new ImageIcon("images/coffee.jpg");
																Image b_isecond14=b_img14.getImage();
																Image b_ithird14=b_isecond14.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last14=new ImageIcon(b_ithird14);
															    JLabel b_img_label14=new JLabel();
															    b_img_label14=new JLabel(b_last14);
															    b_img_label14.setBounds(96, 281, 100, 100);
															    panel2.add(b_img_label14);
																//end of images:
														    
														    b_img_label14.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Coffee        ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Coffee        ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Coffee        ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Coffee        ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Coffee        ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Coffee        ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Coffee        ");}
														    		else  {b_text9.setText("  Coffee        ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  75.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  75.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  75.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  75.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  75.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  75.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  75.00");}
														    		else  {b_tx9.setText("  75.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 14 item:
												    
														    
														  //starting of  15 item:
															  //for images:
																ImageIcon b_img15= new ImageIcon("images/spring_roll.jpg");
																Image b_isecond15=b_img15.getImage();
																Image b_ithird15=b_isecond15.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last15=new ImageIcon(b_ithird15);
															    JLabel b_img_label15=new JLabel();
															    b_img_label15=new JLabel(b_last15);
															    b_img_label15.setBounds(195, 281, 100, 100);
															    panel2.add(b_img_label15);
																//end of images:
														    
														    b_img_label15.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Spring Roll   ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Spring Roll   ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Spring Roll   ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Spring Roll   ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Spring Roll   ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Spring Roll   ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Spring Roll   ");}
														    		else  {b_text9.setText("  Spring Roll   ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  400.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  400.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  400.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  400.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  400.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  400.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  400.00");}
														    		else  {b_tx9.setText("  400.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 15 item:
														    
														  //starting of  16 item:
															  //for images:
																ImageIcon b_img16= new ImageIcon("images/chicken_chilly.jpg");
																Image b_isecond16=b_img16.getImage();
																Image b_ithird16=b_isecond16.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last16=new ImageIcon(b_ithird16);
															    JLabel b_img_label16=new JLabel();
															    b_img_label16=new JLabel(b_last16);
															    b_img_label16.setBounds(-3, 355, 100, 100);
															    panel2.add(b_img_label16);
																//end of images:
														    
														    b_img_label16.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Chicken Chilly");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Chicken Chilly");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Chicken Chilly");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Chicken Chilly");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Chicken Chilly");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Chicken Chilly");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Chicken Chilly");}
														    		else  {b_text9.setText("  Chicken Chilly");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  290.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  290.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  290.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  290.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  290.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  290.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  290.00");}
														    		else  {b_tx9.setText("  290.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 16 item:
														    
														  //starting of  17 item:
															  //for images:
																ImageIcon b_img17= new ImageIcon("images/green_salad.jpg");
																Image b_isecond17=b_img17.getImage();
																Image b_ithird17=b_isecond17.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last17=new ImageIcon(b_ithird17);
															    JLabel b_img_label17=new JLabel();
															    b_img_label17=new JLabel(b_last17);
															    b_img_label17.setBounds(96, 355, 100, 100);
															    panel2.add(b_img_label17);
																//end of images:
														    
														    b_img_label17.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Green Salad   ");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Green Salad   ");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Green Salad   ");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Green Salad   ");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Green Salad   ");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Green Salad   ");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Green Salad   ");}
														    		else  {b_text9.setText("  Green Salad   ");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  210.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  210.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  210.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  210.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  210.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  210.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  210.00");}
														    		else  {b_tx9.setText("  210.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 17 item:
														    
														    //starting of  18 item:
															  //for images:
																ImageIcon b_img18= new ImageIcon("images/mixed_veg_curry.jpg");
																Image b_isecond18=b_img18.getImage();
																Image b_ithird18=b_isecond18.getScaledInstance(98, 73, Image.SCALE_SMOOTH);
															    ImageIcon b_last18=new ImageIcon(b_ithird18);
															    JLabel b_img_label18=new JLabel();
															    b_img_label18=new JLabel(b_last18);
															    b_img_label18.setBounds(195, 355, 100, 100);
															    panel2.add(b_img_label18);
																//end of images:
														    
														    b_img_label18.addMouseListener(new MouseListener() {
														    	public void mouseClicked(MouseEvent arg0) {
														    	
														    		if(b_text2.getText().equals("")) {b_text2.setText("  Mixed Veg Curry");}
														    		else if(b_text3.getText().equals("")) {b_text3.setText("  Mixed Veg Curry");}
														    		else if(b_text4.getText().equals("")) {b_text4.setText("  Mixed Veg Curry");}
														    		else if(b_text5.getText().equals("")) {b_text5.setText("  Mixed Veg Curry");}
														    		else if(b_text6.getText().equals("")) {b_text6.setText("  Mixed Veg Curry");}
														    		else if(b_text7.getText().equals("")) {b_text7.setText("  Mixed Veg Curry");}
														    		else if(b_text8.getText().equals("")) {b_text8.setText("  Mixed Veg Curry");}
														    		else  {b_text9.setText("  Mixed Veg Curry");}
														    		
												    	            if (b_tx2.getText().equals("")) {b_tx2.setText("  90.00");}
														    		else if (b_tx3.getText().equals("")) {b_tx3.setText("  90.00");}
														    		else if (b_tx4.getText().equals("")) {b_tx4.setText("  90.00");}
														    		else if (b_tx5.getText().equals("")) {b_tx5.setText("  90.00");}
														    		else if (b_tx6.getText().equals("")) {b_tx6.setText("  90.00");}
														    		else if (b_tx7.getText().equals("")) {b_tx7.setText("  90.00");}
														    		else if (b_tx8.getText().equals("")) {b_tx8.setText("  90.00");}
														    		else  {b_tx9.setText("  90.00");}
														    		}
																public void mouseEntered(MouseEvent e) {}
																public void mouseExited(MouseEvent e) {}
																public void mousePressed(MouseEvent e) {}
																public void mouseReleased(MouseEvent e) {} });
														  //end of 18 item:
												    
									//for reset button:
												    JButton reset_button=new JButton("Reset");
											        reset_button.setBounds(50, 330, 70, 20);
											        panel3.add(reset_button);
											        reset_button.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    		b_text2.setText(null);
												    		b_text3.setText(null);
												    		b_text4.setText(null);
												    		b_text5.setText(null);
												    		b_text6.setText(null);
												    		b_text7.setText(null);
												    		b_text8.setText(null);
												    		b_text9.setText(null);
												    		
												    		b_tx2.setText(null);
												    		b_tx3.setText(null);
												    		b_tx4.setText(null);
												    		b_tx5.setText(null);
												    		b_tx6.setText(null);
												    		b_tx7.setText(null);
												    		b_tx8.setText(null);
												    		b_tx9.setText(null);}
												    	
												    		public void mouseEntered(MouseEvent e) {}
															public void mouseExited(MouseEvent e) {}
															public void mousePressed(MouseEvent e) {}
															public void mouseReleased(MouseEvent e) {} });
												        
												    		
												    
								   //for total button:
											        JButton total_button=new JButton("Total");
											        total_button.setBounds(200, 330, 70, 20);
											        panel3.add(total_button);
											        total_button.addMouseListener(new MouseListener() {
												    	public void mouseClicked(MouseEvent arg0) {
												    		
												    		//for calculation:
												    	
															
														    JTextArea bill=new JTextArea();
														    bill.setBounds(5,5,318,290);
														    Color panel4c=new Color	(147,112,219);
														    bill.setBackground(panel4c);
														    
														    panel4.add(bill);
														    
														    bill.append("\n\n");
														    bill.append("----------------------------------------------------------------------------------------\n");
														    bill.append("Bill No. :006\n");
														    bill.append("Name : "+namet.getText()+"\t Date : \n");
														    bill.append("----------------------------------------------------------------------------------------\n");
														    bill.append("\n");
														    bill.append("    S.N."+"     Name of Item"+"\t  Price(Rs.)"+"       Remarks\n");
														    bill.append("     1       "+b_text2.getText()+"     "+b_tx2.getText()+"\n");
														    bill.append("     2       "+b_text3.getText()+"     "+b_tx3.getText()+"\n");
														    bill.append("     3       "+b_text4.getText()+"     "+b_tx4.getText()+"\n");
														    bill.append("     4       "+b_text5.getText()+"     "+b_tx5.getText()+"\n");
														    bill.append("     5       "+b_text6.getText()+"     "+b_tx6.getText()+"\n");
														    bill.append("     6       "+b_text7.getText()+"     "+b_tx7.getText()+"\n");
														    bill.append("     7       "+b_text8.getText()+"     "+b_tx8.getText()+"\n");
														    bill.append("     8       "+b_text9.getText()+"     "+b_tx9.getText()+"\n");
														
														    //for panel5:

															JLabel bill_amt=new JLabel("Bill Amount :");
															panel5.add(bill_amt);
															bill_amt.setBounds(10, 12, 150, 10);
															JLabel received=new JLabel("Payment Received :");
															panel5.add(received);
															received.setBounds(10, 32, 150, 10);
															JLabel service=new JLabel("Service Charges :");
															panel5.add(service);
															service.setBounds(10, 52, 150, 10);
															JLabel refund=new JLabel("Refund :");
															panel5.add(refund);
															refund.setBounds(10, 72, 150, 10);
															
															JTextField bill_amtt=new JTextField();
															panel5.add(bill_amtt);
															bill_amtt.setBounds(130,10,100,20);
															JTextField receivedt=new JTextField();
															panel5.add(receivedt);
															receivedt.setBounds(130,30,100,20);
															JTextField servicet=new JTextField();
															panel5.add(servicet);
															servicet.setBounds(130,50,100,20);
															JTextField refundt=new JTextField();
															panel5.add(refundt);
															refundt.setBounds(130,70,100,20);
															
											 //for final calculation:
															float t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0;
														if(!"".equals(b_tx2.getText())) {t2=Float.parseFloat(b_tx2.getText());}
														if(!"".equals(b_tx3.getText())) {t3=Float.parseFloat(b_tx3.getText());}
														if(!"".equals(b_tx4.getText())) {t4=Float.parseFloat(b_tx4.getText());}
														if(!"".equals(b_tx5.getText())) {t5=Float.parseFloat(b_tx5.getText());}
														if(!"".equals(b_tx6.getText())) {t6=Float.parseFloat(b_tx6.getText());}
														if(!"".equals(b_tx7.getText())) {t7=Float.parseFloat(b_tx7.getText());}
														if(!"".equals(b_tx8.getText())) {t8=Float.parseFloat(b_tx8.getText());}
														if(!"".equals(b_tx9.getText())) {t9=Float.parseFloat(b_tx9.getText());}
															
															float semi_total=t2+t3+t4+t5+t6+t7+t8+t9;
															String grand_total=Float.toString(semi_total);
															bill_amtt.setText(grand_total);
															
												
															
															
															
															
															
														
												
														    
														    
										    
												    		
												    	}
												    	public void mouseEntered(MouseEvent e) {}
														public void mouseExited(MouseEvent e) {}
														public void mousePressed(MouseEvent e) {}
														public void mouseReleased(MouseEvent e) {} });
											        

													
															

												    	
												    
						 	
						        	
				    		
				  
					
		
					    
				    
				    
				    
				  
				    
				      
																	    
				    
				    c.add(toppanel);
					c.add(buttompanel);
//end of Billing.java:
				    	}
				    	public void mouseEntered(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseReleased(MouseEvent e) {}});
				    

				    
				   
				    
		
			    
			    } else {
			    	
		
		JOptionPane.showMessageDialog(null, "Incorrect password or username!");
		al_pass1.setText(null);
			    }
					}});
			    
			    c.add(toppanel);
				c.add(buttompanel);
				
	
		
			}});
//end of actionlistener of admin login:
		


		
	

		

		
		
		
		
		
	
		
		

	}
	
	
		}

