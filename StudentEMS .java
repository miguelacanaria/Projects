import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class StudentEMS{
	
	
	
	public static void main (String [] args) {
		

			JFrame front = new JFrame("Login");
			front.setSize(350,380);
			front.setResizable(false);
			front.setLayout(null);
			JLabel user,pass,logpage,logpage1,logpage2,img,img1;
			JTextField user1;
			JPasswordField pass1;
		
		img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive - Tarlac State University\\Desktop\\CaseStudy\\IMAGE\\tsulogo.jpg"));
		img.setBounds(0,0,350,350);
		img.setOpaque(false);
		
		
		
		
		
		
				logpage = new JLabel("ENROLLMENT");
				front.add(logpage);
				logpage.setBounds(85,10,250,50);
				logpage.setFont(new Font("SansSerif", Font.BOLD, 25));
				logpage.setForeground(new Color(11, 156, 143));
				
				
				logpage1 = new JLabel("MANAGEMENT");
				front.add(logpage1);
				logpage1.setBounds(85,50,350,50);
				logpage1.setFont(new Font("SansSerif", Font.BOLD, 24));
				logpage1.setForeground(new Color(11, 156, 143));
				
				
				logpage2 = new JLabel("SYSTEM");
				front.add(logpage2);
				logpage2.setBounds(130,80,150,50);
				logpage2.setFont(new Font("SansSerif", Font.BOLD, 24));
				logpage2.setForeground(new Color(11, 156, 143));
		
		
		
							user = new JLabel("USERNAME: ");
							front.add(user);
							user.setBounds(20,150,150,50);
							user.setFont(new Font("SansSerif", Font.BOLD, 18));
							user.setForeground(new Color(11, 156, 143));
							
							pass = new JLabel("PASSWORD: ");
							front.add(pass);
							pass.setBounds(20,190,150,50);
							pass.setFont(new Font("SansSerif", Font.BOLD, 18));
							pass.setForeground(new Color(11, 156, 143));
					
							user1 = new JTextField();
							front.add(user1);
							user1.setBounds(135,160,150,30);
							user1.setFont(new Font("SansSerif", Font.ITALIC, 17));
							
					
					
							pass1 = new JPasswordField();
							front.add(pass1);
							pass1.setBounds(135,200,150,30);
							pass1.setFont(new Font("SansSerif", Font.ITALIC, 17));
							
					
			
		
		
		
		JButton login = new JButton("LOGIN");
		login.setOpaque(false);
		login.setContentAreaFilled(false);
		login.setFont(new Font("SansSerif", Font.BOLD, 20));
		front.add(login);
		login.setBounds(127,260,100,20);
		
		front.add(img);
			login.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					String pass2 = String.valueOf(pass1.getPassword());
					String user2 = user1.getText();
			
					
			

			
				JFrame frame = new JFrame("Register");
				frame.setSize(1090,800);
				frame.setResizable(false);
				frame.setLayout(null);
				frame.getContentPane().setBackground(new Color(3, 109, 128));	
				
				
				boolean state=false;
					
				JLabel head,stud_id,f_name,last_name,addrs,m_num,e_addrs,gend,sub_enr,img1;
					
				JTextField stud_id1,f_name1,last_name1,m_num1,e_addrs1,addrs1;
					
				JRadioButton male,female;
				
				JCheckBox math,science,english,history,economics,earthsci,filipino,arts,music,physed;
					
				JButton reg,reset,reglist;
				
		img1 = new JLabel("");
		img1.setIcon(new ImageIcon("C:\\Users\\user\\OneDrive - Tarlac State University\\Desktop\\CaseStudy\\IMAGE\\ccsBack.jpg"));
		img1.setBounds(0,0,1200,1000);
		img1.setOpaque(false);
				
			if (user2.equals("") && pass2.equals("")){
					JOptionPane.showMessageDialog(null, "INPUT USERNAME OR PASSWORD ");
			
						}else if (user2.equals("Admin") && pass2.equals("Admin")){
							
								front.dispose();
								
								
								head = new JLabel("Student Enrollment Management System ");
								frame.add(head);
								head.setBounds(130,10,890,50);
								head.setFont(new Font("SansSerif", Font.BOLD, 45));
								head.setOpaque(true);
							
								gend = new JLabel("GENDER");
								frame.add(gend);
								gend.setBounds(800,150,100,50);
								gend.setFont(new Font("Serif", Font.BOLD, 20));
								gend.setOpaque(true);
								
								
								sub_enr = new JLabel("SUBJECTS ENROLLED");
								frame.add(sub_enr);
								sub_enr.setBounds(750,300,230,50);
								sub_enr.setFont(new Font("Serif", Font.BOLD, 20));
								sub_enr.setOpaque(true);
								
								
								stud_id = new JLabel("STUDENT ID:");
								frame.add(stud_id);
								stud_id.setBounds(100,150,150,50);
								stud_id.setFont(new Font("Serif", Font.BOLD, 20));
								stud_id.setOpaque(true);
								
								
								f_name = new JLabel("FIRST NAME:");
								frame.add(f_name);
								f_name.setBounds(100,230,150,50);
								f_name.setFont(new Font("Serif", Font.BOLD, 20));
								f_name.setOpaque(true);

								
								last_name = new JLabel("lAST NAME:");
								frame.add(last_name);
								last_name.setBounds(100,310,150,50);
								last_name.setFont(new Font("Serif", Font.BOLD, 20));
								last_name.setOpaque(true);
							
								
								
								addrs = new JLabel("ADDRESS:");
								frame.add(addrs);
								addrs.setBounds(100,390,150,50);
								addrs.setFont(new Font("Serif", Font.BOLD, 20));
								addrs.setOpaque(true);
								
								
								m_num = new JLabel("MOBILE NUMBER:");
								frame.add(m_num);
								m_num.setBounds(100,470,180,50);
								m_num.setFont(new Font("Serif", Font.BOLD, 20));
								m_num.setOpaque(true);
								
								
								e_addrs = new JLabel("EMAIL ADDRESS:");
								frame.add(e_addrs);
								e_addrs.setBounds(100,550,180,50);
								e_addrs.setFont(new Font("Serif", Font.BOLD, 20));
								e_addrs.setOpaque(true);
								
							
								stud_id1 = new JTextField();
								frame.add(stud_id1);
								stud_id1.setBounds(300,165,250,32);
								stud_id1.setFont(new Font("SansSerif", Font.PLAIN, 20));
								
							
							
								f_name1 = new JTextField();
								frame.add(f_name1);
								f_name1.setBounds(300,245,250,32);
								f_name1.setFont(new Font("SansSerif", Font.PLAIN, 20));
								
								
								last_name1 = new JTextField();
								frame.add(last_name1);
								last_name1.setBounds(300,325,250,32);
								last_name1.setFont(new Font("SansSerif", Font.PLAIN, 20));
								
								
								addrs1 = new JTextField();
								frame.add(addrs1);
								addrs1.setBounds(300,405,250,32);
								addrs1.setFont(new Font("SansSerif", Font.PLAIN, 20));
								
								
								m_num1 = new JTextField();
								frame.add(m_num1);
								m_num1.setBounds(300,485,250,32);
								m_num1.setFont(new Font("SansSerif", Font.PLAIN, 20));
								
								
								e_addrs1 = new JTextField();
								frame.add(e_addrs1);
								e_addrs1.setBounds(300,565,250,32);
								e_addrs1.setFont(new Font("SansSerif", Font.PLAIN, 20));
										
										
										
								male = new JRadioButton("Male");		
								female = new JRadioButton("Female");
								frame.add(male);
								frame.add(female);
								ButtonGroup gend_grp = new ButtonGroup();
								gend_grp.add(male);
								gend_grp.add(female);
								male.setBounds(650,200,150,50);
								male.setFont(new Font("Serif", Font.BOLD, 40));
								female.setBounds(900,200,160,50);
								female.setFont(new Font("Serif", Font.BOLD, 40));
								
								
								math = new JCheckBox("MATHEMATICS");
								science = new JCheckBox("SCIENCE");
								english = new JCheckBox("ENGLISH");
								filipino = new JCheckBox("FILIPINO");
								earthsci = new JCheckBox("EARTH SCIENCE");
								physed = new JCheckBox("PHYSICAL EDUCATION");
								arts = new JCheckBox("ARTS AND CRAFTS");
								music = new JCheckBox("MUSIC AND THEATRE ARTS");
								history = new JCheckBox("HISTORY");
								economics = new JCheckBox("ECONOMICS");
									frame.add(math);
									frame.add(science);
									frame.add(english);
									frame.add(filipino);
									frame.add(earthsci);
									frame.add(physed);
									frame.add(arts);
									frame.add(music);
									frame.add(history);
									frame.add(economics);
								
										math.setBounds(640,350, 150,50);
										math.setFont(new Font("Serif", Font.BOLD, 15));
										science.setBounds(640,400, 150,50);
										science.setFont(new Font("Serif", Font.BOLD, 15));
										english.setBounds(640,450, 150,50);
										english.setFont(new Font("Serif", Font.BOLD, 15));
										filipino.setBounds(640,500, 150,50);
										filipino.setFont(new Font("Serif", Font.BOLD, 15));
										earthsci.setBounds(640,550, 150,50);
										earthsci.setFont(new Font("Serif", Font.BOLD, 15));
										
											physed.setBounds(820,350, 250,50);
											physed.setFont(new Font("Serif", Font.BOLD, 15));
											arts.setBounds(820,400, 250,50);
											arts.setFont(new Font("Serif", Font.BOLD, 15));
											music.setBounds(820,450, 250,50);
											music.setFont(new Font("Serif", Font.BOLD, 15));
											history.setBounds(820,500, 250,50);
											history.setFont(new Font("Serif", Font.BOLD, 15));
											economics.setBounds(820,550, 250,50);
											economics.setFont(new Font("Serif", Font.BOLD, 15));
										
								
								reg = new JButton("REGISTER STUDENT");
								frame.add(reg);
								reg.setBounds(270,650, 150,50);
								reset = new JButton("RESET");
								frame.add(reset);
								reset.setBounds(450,650, 100,50);
								reglist = new JButton("REGISTERED LIST");
								frame.add(reglist);
								reglist.setBounds(100,650, 150,50);
							
							frame.add(img1);
							
							reset.addActionListener(new ActionListener() { 
							public void actionPerformed(ActionEvent e) { 
							f_name1.setText(null);
							stud_id1.setText(null);
							last_name1.setText(null);
							e_addrs1.setText(null);
							addrs1.setText(null);
							m_num1.setText(null);
							physed.setSelected(state);
							math.setSelected(state);
							science.setSelected(state);
							english.setSelected(state);
							history.setSelected(state);
							economics.setSelected(state);
							earthsci.setSelected(state);
							filipino.setSelected(state);
							arts.setSelected(state);
							music.setSelected(state);
							gend_grp.clearSelection();
							
							} 
							} );
							
							reg.addActionListener(new ActionListener() { 
							public void actionPerformed(ActionEvent e) { 

							 JOptionPane.showMessageDialog(frame,"Successfully REGISTERED.","REGISTER",JOptionPane.WARNING_MESSAGE);   
					
							} 
							} );
					
							
							reglist.addActionListener(new ActionListener() { 
							public void actionPerformed(ActionEvent e) { 
							
								
							JFrame frame1 = new JFrame("Student");
							frame1.setSize(1200,800);
							frame1.setResizable(false);
							frame1.setLayout(null);
								
							frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							frame1.setLocationRelativeTo(null);
							frame1.setVisible(true);
								

							
							
							} 
							} );
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
						
					}else
							
						JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD ");

						
						}
						} );
						
						
						
							
						front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						front.setLocationRelativeTo(null);
						front.setVisible(true);
					
	
	}
	}
	