
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class TaiKhoan extends JFrame {
	private JPasswordField matkhaucu;
	private JPasswordField matkhaumoi;
	private JPasswordField nhaplaimatkhaumoi;

	

	
	public TaiKhoan() {
		super("Hệ Thống Quản Lí Đề Tài Khoa Học");
		setBackground(new Color(255, 250, 205));
		setSize(1000,700);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		
		
		JPanel lbtttk = new JPanel();
		lbtttk.setBackground(new Color(255, 250, 205));
		getContentPane().add(lbtttk, BorderLayout.NORTH);
		
		JLabel lblNewLabel_24 = new JLabel("THÔNG TIN TÀI KHOẢN");
		lblNewLabel_24.setFont(new Font("Arial", Font.BOLD, 25));
		lbtttk.add(lblNewLabel_24);
		
		JPanel left = new JPanel();
		left.setBackground(new Color(255, 250, 205));
		getContentPane().add(left, BorderLayout.WEST);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(255, 250, 205));
		getContentPane().add(bottom, BorderLayout.SOUTH);
		
		JPanel right = new JPanel();
		right.setBackground(new Color(255, 250, 205));
		
		getContentPane().add(right, BorderLayout.EAST);
		
		JPanel center = new JPanel();
		getContentPane().add(center, BorderLayout.CENTER);
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
		
		JPanel centerrow1 = new JPanel();
		centerrow1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Thông Tin Cá Nhân", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		center.add(centerrow1);
		centerrow1.setLayout(new GridLayout(1, 4, 0, 0));
		
		JPanel centerrow1pn1 = new JPanel();
		centerrow1pn1.setBackground(new Color(255, 250, 205));
		centerrow1.add(centerrow1pn1);
		
		JPanel centerrow1pn2 = new JPanel();
		centerrow1pn2.setBackground(new Color(255, 250, 205));
		centerrow1.add(centerrow1pn2);
		centerrow1pn2.setLayout(new GridLayout(7, 0, 0, 20));
		
		JLabel lbtdn = new JLabel("Tên Đăng Nhập:");
		centerrow1pn2.add(lbtdn);
		
		JLabel lbht = new JLabel("Họ Tên:");
		centerrow1pn2.add(lbht);
		
		JLabel lbns = new JLabel("Ngày Sinh:");
		centerrow1pn2.add(lbns);
		
		JLabel lbqq = new JLabel("Quê Quán:");
		centerrow1pn2.add(lbqq);
		
		JLabel lbpt = new JLabel("Phụ Trách:");
		centerrow1pn2.add(lbpt);
		
		JLabel lbnct = new JLabel("Nơi Công Tác:");
		centerrow1pn2.add(lbnct);
		
		JLabel lbemail = new JLabel("Email:");
		centerrow1pn2.add(lbemail);
		
		JPanel centerrow1pn3 = new JPanel();
		centerrow1pn3.setBackground(new Color(255, 250, 205));
		centerrow1.add(centerrow1pn3);
		centerrow1pn3.setLayout(new GridLayout(7, 1, 0, 20));
		
		DangNhap tk = new DangNhap();
		JLabel tttk = new JLabel(""+tk.TenDangNhap);
		centerrow1pn3.add(tttk);
		
		JLabel ht = new JLabel("" + tk.HoTen);
		centerrow1pn3.add(ht);
		
		JLabel ns = new JLabel(""+tk.NgaySinh);
		centerrow1pn3.add(ns);
		
		JLabel qq = new JLabel(""+tk.QueQuan);
		centerrow1pn3.add(qq);
		
		JLabel pt = new JLabel(""+tk.PhuTrach);
		centerrow1pn3.add(pt);
		
		JLabel nct = new JLabel(""+tk.NoiCongTac);
		centerrow1pn3.add(nct);
		
		JLabel email = new JLabel(""+tk.Email);
		centerrow1pn3.add(email);
		
		JPanel centerrow1pn4 = new JPanel();
		centerrow1pn4.setBackground(new Color(255, 250, 205));
		centerrow1.add(centerrow1pn4);
		
		JPanel centerrow2 = new JPanel();
		centerrow2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Thay Đổi Mật Khẩu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		center.add(centerrow2);
		centerrow2.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel centerrow2pn1 = new JPanel();
		centerrow2pn1.setBackground(new Color(255, 250, 205));
		centerrow2.add(centerrow2pn1);
		
		JPanel centerrow2pn2 = new JPanel();
		centerrow2pn2.setBackground(new Color(255, 250, 205));
		centerrow2.add(centerrow2pn2);
		centerrow2pn2.setLayout(new GridLayout(10, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		centerrow2pn2.add(lblNewLabel);
		
		JLabel lbnmkc = new JLabel("Nhập Mật Khẩu Cũ");
		centerrow2pn2.add(lbnmkc);
		
		JLabel lblNewLabel_2 = new JLabel("");
		centerrow2pn2.add(lblNewLabel_2);
		
		JLabel lbnmkm = new JLabel("Nhập Mật Khẩu Mới");
		centerrow2pn2.add(lbnmkm);
		
		JLabel lblNewLabel_4 = new JLabel("");
		centerrow2pn2.add(lblNewLabel_4);
		
		JLabel lbnlmkm = new JLabel("Nhập Lại Mật Khẩu Mới");
		centerrow2pn2.add(lbnlmkm);
		
		JPanel centerrow2pn3 = new JPanel();
		centerrow2pn3.setBackground(new Color(255, 250, 205));
		centerrow2.add(centerrow2pn3);
		centerrow2pn3.setLayout(new GridLayout(10, 1, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("");
		centerrow2pn3.add(lblNewLabel_6);
		
		matkhaucu = new JPasswordField();
		centerrow2pn3.add(matkhaucu);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		centerrow2pn3.add(lblNewLabel_7);
		
		matkhaumoi = new JPasswordField();
		centerrow2pn3.add(matkhaumoi);
		
		JLabel lblNewLabel_8 = new JLabel("");
		centerrow2pn3.add(lblNewLabel_8);
		
		nhaplaimatkhaumoi = new JPasswordField();
		centerrow2pn3.add(nhaplaimatkhaumoi);
		
		JCheckBox hienmatkhau = new JCheckBox("Hiện Mật Khẩu");
		hienmatkhau.setBackground(new Color(255, 250, 205));
		centerrow2pn3.add(hienmatkhau);
		
		hienmatkhau.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == 1) {
                	matkhaucu.setEchoChar((char)0);
                	matkhaumoi.setEchoChar((char)0);
                	nhaplaimatkhaumoi.setEchoChar((char)0);
                } else {
                	matkhaucu.setEchoChar('*');
                	matkhaumoi.setEchoChar('*');
                	nhaplaimatkhaumoi.setEchoChar('*');
                }
            }
        });
		
		JButton btthaydoimatkhau = new JButton("Thay Đổi");
		centerrow2pn3.add(btthaydoimatkhau);
		
		btthaydoimatkhau.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dbURL = "jdbc:sqlserver://LAPTOP-LFQ4R5Q2\\SQLEXPRESS;databaseName=DUANCUOIKI;user=sa;password=sa";
				Connection conn;
				
				if(matkhaucu.getText().equals(tk.MatKhau)) {
					if(matkhaumoi.getText().equals(nhaplaimatkhaumoi.getText())) {
						try {
						conn = DriverManager.getConnection(dbURL);
						if (conn != null) {
							 System.out.println("Connected");
							}
					    
						Statement s = conn.createStatement();
			            String sql = "UPDATE NGUOIDUNG SET MATKHAU = '" +matkhaumoi.getText()+"'"+" WHERE TenTaiKhoan = '"+tk.TenDangNhap+"'";
			            
			            int rs = s.executeUpdate(sql);
			           
			            JOptionPane.showMessageDialog(null, "Thành Công");
			            matkhaucu.setText("");
			            matkhaumoi.setText("");
			            nhaplaimatkhaumoi.setText("");
			            
			           
			            
						
						
					} catch (SQLException l) {
						// TODO Auto-generated catch block
						l.printStackTrace();
					}
					} else {
						JOptionPane.showMessageDialog(null, "Bạn Nhập Mật Khẩu Chưa Trùng Khớp");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Sai Mật Khẩu Cũ");
				}
			}
			
		});
		
		JPanel centerrow2pn4 = new JPanel();
		centerrow2pn4.setBackground(new Color(255, 250, 205));
		centerrow2.add(centerrow2pn4);
	}

}
