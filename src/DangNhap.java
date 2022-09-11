import java.awt.BorderLayout;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class DangNhap extends JFrame {
	int k;
    public static String TenDangNhap;
    public static String MatKhau;
    public static String HoTen;
    public static String NgaySinh;
    public static String QueQuan;
    public static String PhuTrach;
    public static String NoiCongTac;
    public static String Email;
    private JTextField ttkdn;
    private JPasswordField mkdn;

	public DangNhap() {
		super("Hệ Thống Quản Lí Đề Tài Khoa Học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.CYAN);
		setSize(400,275);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JPanel Center = new JPanel();
		Center.setBackground(Color.CYAN);
		add(Center);
		Center.setLayout(new BorderLayout());
		
		JPanel CenterCenter = new JPanel();
		CenterCenter.setBackground(Color.CYAN);
		Center.add(CenterCenter);
		CenterCenter.setLayout(new BorderLayout(0, 5));
		
		JLabel lbdisplaydn = new JLabel("Đăng Nhập");
		lbdisplaydn.setForeground(Color.RED);
		lbdisplaydn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		CenterCenter.add(lbdisplaydn,BorderLayout.NORTH);
		
		JPanel pncenter = new JPanel();
		CenterCenter.add(pncenter, BorderLayout.CENTER);
		pncenter.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pnlbdn = new JPanel();
		pnlbdn.setBackground(Color.CYAN);
		pncenter.add(pnlbdn);
		pnlbdn.setLayout(new GridLayout(4, 1, 0, 7));
		
		JLabel lbttkdn = new JLabel("Tên Tài Khoản");
		pnlbdn.add(lbttkdn);
		
		JLabel lbmkdn = new JLabel("Mật Khẩu");
		pnlbdn.add(lbmkdn);
		
		JPanel pntfdn = new JPanel();
		pntfdn.setBackground(Color.CYAN);
		pncenter.add(pntfdn);
		pntfdn.setLayout(new GridLayout(4, 0, 0, 7));
		
		ttkdn = new JTextField();
		pntfdn.add(ttkdn);
		ttkdn.setColumns(10);
		
		mkdn = new JPasswordField();
	
		pntfdn.add(mkdn);
		
		JCheckBox hienmatkhau = new JCheckBox("Hiện Mật Khẩu");
		hienmatkhau.setBackground(Color.CYAN);
		hienmatkhau.setFocusPainted(false);
		pntfdn.add(hienmatkhau);
		
		hienmatkhau.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                	mkdn.setEchoChar((char)0);
                } else {
                	mkdn.setEchoChar('*');
                }
            }
        });
		
		JButton btdn = new JButton("Đăng Nhập");
		btdn.setFont(new Font("Arial", Font.BOLD, 13));
		btdn.setBackground(Color.CYAN);
		btdn.setForeground(Color.RED);
		btdn.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		btdn.setBorderPainted(true);
		btdn.setFocusPainted(false);
		pntfdn.add(btdn);
		
		JPanel Top = new JPanel();
		Top.setBackground(Color.CYAN);
		add(Top, BorderLayout.NORTH);
		
		JPanel Bottom = new JPanel();
		Bottom.setBackground(Color.CYAN);
		add(Bottom, BorderLayout.SOUTH);
		
		JButton godk = new JButton("Đăng Kí!");
		godk.setBorderPainted(false);
		godk.setFocusPainted(false);
		godk.setBackground(Color.CYAN);
		Bottom.add(godk);
		
		JPanel Left = new JPanel();
		Left.setBackground(Color.CYAN);
		add(Left, BorderLayout.WEST);
		
		JPanel RIght = new JPanel();
		RIght.setBackground(Color.CYAN);
		add(RIght, BorderLayout.EAST);
		
		godk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				DangKi dk = new DangKi();
				dk.setVisible(true);
				
			}
			
		});
		
	    btdn.addActionListener(new ActionListener() {
	    	
			@Override
			public void actionPerformed(ActionEvent e) {
				TenDangNhap = ttkdn.getText();
				if(ttkdn.getText().isEmpty() && mkdn.getText().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "Chưa nhập Tên Tài Khoản và Mật Khẩu");
				} else 
				if(ttkdn.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Chưa nhập Tên Tài Khoản");
				} else
				if(mkdn.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Chưa nhập Mật Khẩu");
				
				} else {
					String dbURL = "jdbc:sqlserver://LAPTOP-LFQ4R5Q2\\SQLEXPRESS;databaseName=DUANCUOIKI;user=sa;password=sa";
					k = 0;
					Connection conn;
					try {
						conn = DriverManager.getConnection(dbURL);
						if (conn != null) {
							 System.out.println("Connected");
							}
					    
						Statement s = conn.createStatement();
			            String sql = "Select * FROM NguoiDung";
			            ResultSet rs = s.executeQuery(sql);
			                
			            while(rs.next()) {
			               if(ttkdn.getText().equals(rs.getString(1))) {
			            	   TenDangNhap = rs.getString(1);
			            	   if(mkdn.getText().equals(rs.getString(2))) {
			            		   k++;
			            		   MatKhau = rs.getString(2);
			            		   HoTen = rs.getString(3);
			            		   NgaySinh = rs.getString(4);
			            		   QueQuan = rs.getString(5);
			            		   PhuTrach = rs.getString(6);
			            		   NoiCongTac = rs.getString(7);
			            		   Email = rs.getString(8);			            		   
			            	   }
			               }
			                
			            }
			            
			            if(k!=0) {
			            	GiaoDienVaDieuKhien frame = new GiaoDienVaDieuKhien();
			            	frame.setVisible(true);
			            	setVisible(false);
			            	JOptionPane.showMessageDialog(null, "Đã Đăng Nhập Thành Công");
			            } else {
			            	JOptionPane.showMessageDialog(null, "Sai Tài Khoản Hoặc Mật Khẩu");
			            }			    	
					} catch (SQLException l) {
						// TODO Auto-generated catch block
						l.printStackTrace();
					}			
				}			
			}	    	
	    });
}
}
