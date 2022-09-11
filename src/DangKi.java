import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DangKi extends JFrame {	
	private JTextField tfht;
	private JTextField tfns;
	private JTextField tfqq;
	private JTextField tfnct;
	private JTextField tfemail;
	private JTextField tftdn;
	private JPasswordField pfmk;
	private JPasswordField pfnlmk;
	
	public DangKi() {
		super("Hệ Thống Quản Lí Đề Tài Khoa Học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.CYAN);
		setSize(600,500);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel Center = new JPanel();
		Center.setBackground(Color.CYAN);
		add(Center);
		Center.setLayout(new BorderLayout(0, 0));
		
		JPanel Centercenter = new JPanel();
		Centercenter.setBackground(Color.CYAN);
		Center.add(Centercenter);
		Centercenter.setLayout(new BorderLayout(0, 0));
		
		JLabel lbdisplaydktk = new JLabel("Đăng Kí Tài Khoản");
		lbdisplaydktk.setForeground(Color.RED);
		lbdisplaydktk.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		Centercenter.add(lbdisplaydktk,BorderLayout.NORTH);
		
		JPanel partdk = new JPanel();
		Centercenter.add(partdk, BorderLayout.CENTER);
		partdk.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel lbdk = new JPanel();
		lbdk.setBackground(Color.CYAN);
		partdk.add(lbdk);
		lbdk.setLayout(new GridLayout(12, 0, 0, 7));
		
		JLabel lbhtdk = new JLabel("Họ Tên");
		lbdk.add(lbhtdk);
		
		JLabel lbnsdk = new JLabel("Ngày Sinh");
		lbdk.add(lbnsdk);
		
		JLabel lbqqdk = new JLabel("Quê Quán");
		lbdk.add(lbqqdk);
		
		JLabel lbnctdk = new JLabel("Nơi Công Tác");
		lbdk.add(lbnctdk);
		
		JLabel lbemaildk = new JLabel("Email");
		lbdk.add(lbemaildk);
		
		JLabel lbtdndk = new JLabel("Tên Đăng Nhập");
		lbdk.add(lbtdndk);
		
		JLabel lbmkdk = new JLabel("Mật Khẩu");
		lbdk.add(lbmkdk);
		
		JLabel lbnlmkdk = new JLabel("Nhập Lại Mật Khẩu");
		lbdk.add(lbnlmkdk);
		
		JPanel tfdk = new JPanel();
		tfdk.setBackground(Color.CYAN);
		partdk.add(tfdk);
		tfdk.setLayout(new GridLayout(12, 1, 0, 7));
		
		ButtonGroup pt = new ButtonGroup();
		
		tfht = new JTextField();
		tfdk.add(tfht);
		tfht.setColumns(10);
		
		tfns = new JTextField();
		tfdk.add(tfns);
		tfns.setColumns(10);
		
		tfqq = new JTextField();
		tfdk.add(tfqq);
		tfqq.setColumns(10);
		
		tfnct = new JTextField();
		tfdk.add(tfnct);
		tfnct.setColumns(10);
		
		tfemail = new JTextField();
		tfdk.add(tfemail);
		tfemail.setColumns(10);
		
		tftdn = new JTextField();
		tfdk.add(tftdn);
		tftdn.setColumns(10);
		
		pfmk = new JPasswordField();
		tfdk.add(pfmk);
		
		pfnlmk = new JPasswordField();
		tfdk.add(pfnlmk);
		

		
		JButton btdk = new JButton("Đăng Kí");
		btdk.setFont(new Font("Arial", Font.BOLD, 13));
		btdk.setBackground(Color.CYAN);
		btdk.setForeground(Color.RED);
		btdk.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		btdk.setBorderPainted(true);
		btdk.setFocusPainted(false);
		tfdk.add(btdk);
		
		JPanel Top = new JPanel();
		Top.setBackground(Color.CYAN);
		add(Top, BorderLayout.NORTH);
		
		JPanel Bottom = new JPanel();
		Bottom.setBackground(Color.CYAN);
		add(Bottom, BorderLayout.SOUTH);
		
		JButton godn = new JButton("Đã Có Tài Khoản? Hãy Đăng Nhập"
				+ "!");
		godn.setFocusPainted(false);
		godn.setBorderPainted(false);
		Bottom.add(godn);
		godn.setBackground(Color.CYAN);
		
		godn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				DangNhap dangNhap = new DangNhap();
				dangNhap.setVisible(true);
				
			}
			
		});
		
		JPanel Left = new JPanel();
		Left.setBackground(Color.CYAN);
		add(Left, BorderLayout.WEST);
		
		JPanel RIght = new JPanel();
		RIght.setBackground(Color.CYAN);
		add(RIght, BorderLayout.EAST);
		
		btdk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dbURL = "jdbc:sqlserver://LAPTOP-LFQ4R5Q2\\SQLEXPRESS;databaseName=DUANCUOIKI;user=sa;password=sa";
				Connection conn;
				int k = 0;
				if(pfmk.getText().equals(pfnlmk.getText())) {
try {
						
						conn = DriverManager.getConnection(dbURL);
						try {
							
							
							if(tftdn.getText().isEmpty()) {
								k++;
							}
							if(pfmk.getText().isEmpty()) {
								k++;
							}
							if(tfht.getText().isEmpty()) {
								k++;
							}
							if(tfns.getText().isEmpty()) {
								k++;
							}
							if(tfqq.getText().isEmpty()) {
								k++;
							}
							if(tfnct.getText().isEmpty()) {
								k++;
							}
							if(tfemail.getText().isEmpty()) {
								k++;
							}
							if(pfnlmk.getText().isEmpty()) {
								k++;
							}
							if(k==0) {
								java.sql.Statement s = conn.createStatement();
								String sql = "INSERT INTO NGUOIDUNG VALUES("+
								"'"+tftdn.getText()+"'"+","+
								"'"+pfmk.getText()+"'"+","+
								"'"+tfht.getText()+"'"+","+
								"'"+tfns.getText()+"'"+","+
								"'"+tfqq.getText()+"'"+","+
								"'"+"admin"+"'"+","+
								"'"+tfnct.getText()+"'"+","+					
								"'"+tfemail.getText()+"'"+")";
								int rs = s.executeUpdate(sql);
						
								
							} else {
								JOptionPane.showMessageDialog(null, "Thất bại");
							}
							
						}
							
							catch(Exception fdss) {
								JOptionPane.showMessageDialog(null, "Thất bại");
							}
					
						}
				         
				
		    
						
				        
					 catch (SQLException eeee) {
						// TODO Auto-generated catch block
						eeee.printStackTrace();
					}
					
				} else  {
					JOptionPane.showMessageDialog(null, "Nhập Lại Mật Khẩu Không Trùng Khớp.");
				}
				
				
				
			}
			
			
			
		});
		}



}
