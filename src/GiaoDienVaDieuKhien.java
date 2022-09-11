import java.awt.BorderLayout;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//
//import net.miginfocom.layout.DimConstraint;
//import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
 

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Insets;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Button;

import java.time.LocalDate;

public class GiaoDienVaDieuKhien extends JFrame {

	JPanel Top = new JPanel();
	private JTextField tfmdt;
	private JTextField tftdt;
	private JTextField tftcn;
	private JTextField tfsvnc;
	private JTextField tfcqct;
	private JTextField tfkpth;
	private JTextField tfnbd;
	private JTextField tfnhh;
	
	private JTextArea tflv;
	private JTextArea tflsp;
	private JTextArea tftynd;
	
	private JTextField tfmcn;
	private JTextField tftcncn;
	private JTextField tftnscn;
	private JTextField tfsdtcn;
	private JTextField tfemailcn;
	private JTextField tfqqcn;
	private JTextField tfcncn;
	private JTextField tftdcn;
	private JTextField tfdvct;
	
	public String dbURL;
	public Connection conn;
	public Statement ss;	
	JPanel CenterContent;
		
	JPanel CenterSouth;
	private JLabel lbsdtcn;
	int gtbit;
	int MaChuNhiemso;
	int MaDeTaiso;
    int kpdt;
	String gttext;
	int money;
	DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-d");
	DateFormat  defaults = new SimpleDateFormat();
	
	JPanel tdtcol1,tdtcol2,tdtcol3,tdtcol4;
	
	JLabel lbmdt,lbtdt,lbmcn,lbtcn,lbcdt,lbcqct,lbkpth,lbnbd,lbnhh,lblv,lblsp,lbtynd,lbsvnc,lbnscn,lbgtcn,lbsdt,lbemailcn,lbqqcn,lbcncn,lbtdcn,lbdvct;
	JComboBox cbcdt,cbkpth,cbmcn,cbgtcn;
	JDateChooser dcnbd,dcnhh,dcnscn;
	JLabel wnmdt,wntdt,wnmcn,wntcn,wncdt,wncqct,wnkpth,wnnbd,wnnhh,wnlv,wnlsp,wntynd,wnsvnc,wnmcncn;
	JLabel wntcncn,wnnscn,wngtcn,wnsdtcn,wnemailcn,wnqqcn,wncncn,wntdcn,wndvct;
	JLabel space_1,space_2,space_3,space_4,space_5,space_6,space_7,space_8,space_9,space_10,space_11,space_12,space_13,space_14,space_15,space_16,space_17,space_18,space_19;
	JPanel pnkpth,pntynd,pnlsp,pnnbd,pnnhh,pnlv;
	JPanel pnqqcn,pncncn;
	JPanel pntfnbd,pntfnhh,pntftynd,pntflsp,pntflv;
	JPanel pnwnnbd,pnwnnhh,pnwntynd,pnwnlsp,pnwnlv;
	JPanel pndvct,pntdcn;
	JPanel panel_29;
	String sql;
	JButton btexit;
	JTextField tfnscn; 
	Border border2;
	public GiaoDienVaDieuKhien() {
		super("Hệ Thống Quản Lí Đề Tài Khoa Học");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		    Top.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "\u0110\u1ED2 \u00C1N CU\u1ED0I K\u00CC ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		    Top.setBackground(Color.WHITE);	    	    
		  //Connect DataBase
		    dbURL = "jdbc:sqlserver://LAPTOP-LFQ4R5Q2\\SQLEXPRESS;databaseName=DuAnCuoiKi;user=sa;password=sa";	
		    try {		    
				conn = DriverManager.getConnection(dbURL);
				if (conn != null) {
					 System.out.println("Connection");
					}				 
		    } catch (SQLException eeee) {
				eeee.printStackTrace();
			}
		
/////Start Code JPanel Top
		    Top.setLayout(new BoxLayout(Top, BoxLayout.Y_AXIS));
		    JLabel jlb = new JLabel(new ImageIcon("iconuniversity.png"));
    		JLabel title = new JLabel("            HỆ THỐNG QUẢN LÍ ĐỀ TÀI KHOA HỌC");
    	    title.setFont(new Font("Sitka Text", Font.BOLD, 20));
    	    Top.add(jlb);
    	    Top.add(new JLabel(" "));
    	    Top.add(title);    	    
    	    
    	    Border border = BorderFactory.createLineBorder(Color.RED);
    		TitledBorder borderTitle=
    		BorderFactory.createTitledBorder(
    		border, "Hệ Thống Quản Lí Đề Tài Khoa Học");		    		    
		    Top.add(new JLabel(""));
		    add(Top,BorderLayout.NORTH);
/////End Code JPanel Top
		    
		    	    
		    
//Start Code JPanel Left
		    JPanel Left = new JPanel();
		    Left.setBorder(new LineBorder(Color.MAGENTA, 4, true));
		    Left.setBackground(Color.WHITE);
		    add(Left, BorderLayout.WEST);
		    Left.setLayout(new BorderLayout(0, 0));
		    
		    JPanel pnbtdm = new JPanel();
		    pnbtdm.setForeground(Color.WHITE);
		    pnbtdm.setBackground(Color.WHITE);
		    Left.add(pnbtdm, BorderLayout.CENTER);
		    pnbtdm.setLayout(new CardLayout(0, 0));
		    
		    JPanel trangchu = new JPanel();
		    trangchu.setBackground(Color.RED);
		    
		    trangchu.setLayout(new GridLayout(20, 1, 0, 0));
		    
		    JLabel lbDanhMuc = new JLabel("Trang Chủ");
    		lbDanhMuc.setAutoscrolls(true);
    		lbDanhMuc.setForeground(Color.BLUE);
    		lbDanhMuc.setBackground(Color.CYAN);
    		lbDanhMuc.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
    		trangchu.add(lbDanhMuc);    		
    		
    		JPanel pndetai = new JPanel();
		    pndetai.setBackground(Color.RED);
		    pndetai.setLayout(new GridLayout(20, 1, 0, 0));
		    
		    JLabel lbDanhMucdt = new JLabel("Đề Tài");
    		lbDanhMucdt.setAutoscrolls(true);
    		lbDanhMucdt.setForeground(Color.BLUE);
    		lbDanhMucdt.setBackground(Color.CYAN);
    		lbDanhMucdt.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
    		pndetai.add(lbDanhMucdt);		    
    		
    		JPanel pnchunhiem = new JPanel();
 		    pnchunhiem.setBackground(Color.RED);
 		  
 		    pnchunhiem.setLayout(new GridLayout(20, 0, 0, 0));
		    JLabel lbDanhMuccn = new JLabel("Chủ Nhiệm");
    		lbDanhMuccn.setAutoscrolls(true);
    		lbDanhMuccn.setForeground(Color.BLUE);
    		lbDanhMuccn.setBackground(Color.CYAN);
    		lbDanhMuccn.setFont(new Font("Segoe UI Black", Font.BOLD, 24));
    		pnchunhiem.add(lbDanhMuccn);

    		pnbtdm.add(trangchu, "a");
		    pnbtdm.add(pndetai, "b");
		    
		   
		    pndetai.add(new JLabel(""));
		    
		    JButton sktdtm = new JButton("Thêm Đề Tài Mới");
		    sktdtm.setBackground(Color.BLACK);
		    sktdtm.setForeground(Color.WHITE);
		    pndetai.add(sktdtm);
		    
		    sktdtm.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					CenterContent.removeAll();
					CenterSouth.removeAll();				
					TrangThemDeTai();
					setVisible(true);
					
				}
		    	
		    });		    		    
		   
		    pndetai.add(new JLabel(""));	    
		    JButton skdsdt = new JButton("Danh Sách Đề Tài");
		    skdsdt.setBackground(Color.BLACK);
		    skdsdt.setForeground(Color.WHITE);
		    pndetai.add(skdsdt);
		    
		    skdsdt.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					CenterContent.removeAll();
					CenterSouth.removeAll();					
					TrangDanhSachDeTai();
					setVisible(true);			
				}		    	
		    });
		    
		    
		    pndetai.add(new JLabel(""));
		    
		    JMenuBar jmenubartkdt = new JMenuBar();
		    jmenubartkdt.setLayout(new GridLayout(1,1));
		    pndetai.add(jmenubartkdt);	        
		    
		    JMenu jmenutkdt = new JMenu("        Thống Kê Đề Tài");
		    jmenutkdt.setForeground(Color.WHITE);
		    jmenutkdt.setBackground(Color.BLACK);
		    jmenutkdt.setOpaque(true);
		    jmenubartkdt.add(jmenutkdt);
		    
		    JMenuItem tkdtdd=new JMenuItem("Thống Kê Đê Tài Đã Duyệt");
		    jmenutkdt.add(tkdtdd);		    
		    tkdtdd.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterSouth.removeAll();
					CenterContent.removeAll();
					ThongKeDeTaiDaDuyet();
					setVisible(true);					
				}		    	
		    });
		    
		    JMenuItem tkdtcd=new JMenuItem("Thống Kê Đề Tài Chưa Duyệt");
		    jmenutkdt.add(tkdtcd);
		    tkdtcd.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterSouth.removeAll();
					CenterContent.removeAll();
					ThongKeDeTaiChuaDuyet();
					setVisible(true);				
				}
		    	
		    });
		    JMenuItem jmitkdtdht=new JMenuItem("Thống Kê Đề Tài Đã Hoàn Thành");
		    jmenutkdt.add(jmitkdtdht);		    
		    jmitkdtdht.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterSouth.removeAll();
					CenterContent.removeAll();
					ThongKeDeTaiDaHoanThanh();
					setVisible(true);					
				}		    	
		    });
		      
 		    pnchunhiem.add(new JLabel(""));		    
 		    JButton sktcnm = new JButton("Thêm Chủ Nhiệm Mới");
 		    sktcnm.setBackground(Color.BLACK);
 		    sktcnm.setForeground(Color.WHITE);
 		    pnchunhiem.add(sktcnm);		    
 		    sktcnm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterContent.removeAll();
					CenterSouth.removeAll();
					TrangThemChuNhiem();
					setVisible(true);					
				}		    	
 		    });
 		    pnchunhiem.add(new JLabel(""));		    
 		    JButton skdscn = new JButton("Danh Sách Chủ Nhiệm");
 		    skdscn.setBackground(Color.BLACK);
 		    skdscn.setForeground(Color.WHITE);
 		    pnchunhiem.add(skdscn);
		   	    
		    skdscn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterContent.removeAll();
					CenterSouth.removeAll();
					TrangDanhSachChuNhiem();
					setVisible(true);					
				}		    	
		    });	   
 		    pnchunhiem.add(new JLabel(""));
 		    JMenuBar menuBarcn = new JMenuBar();
		    menuBarcn.setLayout(new GridLayout(1,1));
		    pnchunhiem.add(menuBarcn);	    
 		    
 		   JMenu bttkcn = new JMenu("    Thống Kê Chủ Nhiệm");
		    bttkcn.setForeground(Color.WHITE);
		    bttkcn.setBackground(Color.BLACK);
		    bttkcn.setOpaque(true);
		    menuBarcn.add(bttkcn);
		    
		    JMenuItem tkdtcnsl=new JMenuItem("Thống kê số lượng đề tài của chủ nhiệm");
		    bttkcn.add(tkdtcnsl);
		    tkdtcnsl.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterContent.removeAll();
					CenterSouth.removeAll();
					ThongKeSoLuongDeTaiCuaChuNhiem();
					setVisible(true);				
				}	    	
		    });
		    	    
		    tkdtcnsl.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CenterSouth.removeAll();
					CenterContent.removeAll();
					ThongKeDeTaiDaDuyet();
					setVisible(true);					
				}		    	
		    });
		   
//End Code JPanel Left
    
//Start Code JPanel Left    		
		    	    		JPanel Center = new JPanel();
		    	    		Center.setBackground(Color.CYAN);
		    	    		add(Center, BorderLayout.CENTER);
		    	    		Center.setLayout(new BorderLayout());
		    	    		CenterContent = new JPanel();
		    	    		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
		    	    		    "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		    	    		CenterContent.setBackground(Color.CYAN);
		    	    		Center.add(CenterContent, BorderLayout.CENTER);
  		
		    	    		JLabel vku = new JLabel(new ImageIcon("VKU.jpg"));			    	    		
		    	    		CenterContent.add(vku);
		    	    				    	    		
		    	    		JPanel CenterWest = new JPanel();
		    	    		CenterWest.setBackground(Color.YELLOW);
		    	    		Center.add(CenterWest, BorderLayout.WEST);

		    	    		JPanel CenterEast = new JPanel();
		    	    		CenterEast.setBackground(Color.YELLOW);
		    	    		Center.add(CenterEast, BorderLayout.EAST);

		    	    		JPanel CenterNorth = new JPanel();
		    	    		CenterNorth.setBackground(Color.YELLOW);

		    	    		Center.add(CenterNorth, BorderLayout.NORTH);
		    	    		CenterNorth.setLayout(new BorderLayout(0, 0));

		    	    		JPanel buttondm = new JPanel();
		    	    		buttondm.setBackground(Color.YELLOW);
  	    		
		    	    		JButton btDeTai = new JButton("Đề Tài");
		    	    		btDeTai.setForeground(Color.WHITE);
		    	    		btDeTai.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
		    	    		btDeTai.setBackground(new Color(0, 0, 0));
		    	    		
		    	    		buttondm.add(btDeTai);

		    	    		JButton btChuNhiem = new JButton("Chủ  Nhiệm");
		    	    		btChuNhiem.setForeground(Color.WHITE);
		    	    		btChuNhiem.setFont(new Font("Segoe UI Semibold", Font.ITALIC, 15));
		    	    		btChuNhiem.setBackground(Color.BLACK);
		    	    		
		    	    		buttondm.add(btChuNhiem);
		    	    		btDeTai.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									pnbtdm.add(pndetai, "a");
									pnbtdm.add(trangchu, "b");
						 		    pnbtdm.add(pnchunhiem, "c");
								    							
								}
		    	    			
		    	    		});
		    	    		btChuNhiem.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									pnbtdm.add(pnchunhiem, "a");
									pnbtdm.add(trangchu, "b");
						 		    pnbtdm.add(pndetai, "c");
								    
									
								}
		    	    			
		    	    		});
		    	    		
		    	    		

		    	    		CenterNorth.add(buttondm, BorderLayout.CENTER);
		    	    		
		    	    		JPanel panel_21 = new JPanel();
		    	    		panel_21.setBackground(Color.YELLOW);
		    	    		CenterNorth.add(panel_21, BorderLayout.EAST);
	  	    		
		    	    	DangNhap DangNhap = new DangNhap();
		    	    		JButton tentaikhoan = new JButton("Tài Khoản:" + DangNhap.TenDangNhap);
		    	    		tentaikhoan.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		    	    		tentaikhoan.setForeground(Color.BLUE);
		    	    		tentaikhoan.setBackground(Color.YELLOW);
		    	    		tentaikhoan.setBorderPainted(false);
		    	    		tentaikhoan.setFocusPainted(false);
		    	    		panel_21.add(tentaikhoan);
		    	    		
		    	    		tentaikhoan.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									TaiKhoan taiKhoan = new TaiKhoan();
									taiKhoan.setVisible(true);								
								}
		    	    			
		    	    		});
		    	    		
		    	    		JButton dangxuat = new JButton("Đăng xuất");
		    	    		dangxuat.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		    	    		dangxuat.setBackground(Color.YELLOW);
		    	    		dangxuat.setForeground(Color.BLUE);
		    	    		dangxuat.setBorderPainted(false);
		    	    		dangxuat.setFocusPainted(false);
		    	    		panel_21.add(dangxuat);
		    	    		
		    	    		dangxuat.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent e) {
									int output = JOptionPane.showConfirmDialog(null, 
					                        "Bạn có chắc muốn đăng xuất tài khoản "+DangNhap.TenDangNhap + " ?","Thông Báo",
					                        JOptionPane.YES_NO_OPTION);
					                if (output == JOptionPane.YES_OPTION) {
					                	
					                	setVisible(false);
					                	DangNhap.TenDangNhap = null;
					                	DangNhap ssss = new DangNhap();
					                	ssss.setVisible(true);
					                	
					                } else if (output == JOptionPane.NO_OPTION) {
					                    
					                }
									
								}
		    	    			
		    	    		});

		    	    		CenterSouth = new JPanel();
		    	    		CenterSouth.setFont(UIManager.getFont("CheckBox.font"));
		    	    		CenterSouth.setBackground(Color.YELLOW);
		    	    		CenterSouth.setBorder(new LineBorder(Color.ORANGE, 2));
		    	    		Center.add(CenterSouth, BorderLayout.SOUTH);

		    	    		JPanel Bottom = new JPanel();
		    	    		Bottom.setBorder(new LineBorder(Color.BLUE));
		    	    		Bottom.setBackground(Color.BLUE);
		    	    		add(Bottom, BorderLayout.SOUTH);

		    	    		
		    	    		
	 //ThemDeTai 	    		
		    	    		
		    	    	    tdtcol1 = new JPanel();
		    	    	    lbmdt = new JLabel("Mã Đề Tài");
		    	    		lbtdt = new JLabel("Tên Đề Tài");
		    	    		lbmcn = new JLabel("Mã Chủ Nhiệm");
		    	    		lbtcn = new JLabel("Tên Chủ Nhiệm");
		    	    		lbsvnc = new JLabel("Họ Tên Sinh Viên Nguyên Cứu");
		    	    		lbcdt = new JLabel("Cấp Đề Tài");
		    	    		lbcqct = new JLabel("Cơ Quan Chủ Trì");
		    	    		lbkpth = new JLabel("Kinh Phí Thực Hiện");
		    	    		tdtcol2 = new JPanel();
		    	    		tfmdt = new JTextField();
		    	    		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		    	    		tftdt = new JTextField();
		    	    		tftdt.setBorder(border2);		    	    		
		    	    		tftdt.setColumns(10);		    	    		
		    	    		wntdt = new JLabel("");
		    	    				    	    		
		    	    		cbmcn = new JComboBox();
		    	    		cbmcn.setBackground(Color.WHITE);
		    	    		cbmcn.setBorder(border2);
		    	    		tftcn = new JTextField();
		    	    		tftcn.disable();
		    	    		tftcn.setDisabledTextColor(Color.BLACK);
		    	    		tftcn.setBorder(border2);		    	    		
		    	    		tftcn.setColumns(10);	
		    	    		wntcn = new JLabel("");
		    	    		wnmcn = new JLabel("");
		    	    		
		    	    		tfsvnc = new JTextField(10);
		    	    		tfsvnc.setBorder(border2);		    	    		
		    	    		tfsvnc.setColumns(10);		    	    		
		    	    		wnsvnc = new JLabel("");		    	    			    	    		
		    	    		cbcdt = new JComboBox(new String[] {"-Lua chon-","Cấp Nhà Nước","Cấp Bộ","Cấp Tỉnh","Cấp Huyện","Cấp Cơ Sở"});		    	    		
		    	    		cbcdt.setBackground(Color.WHITE);		    	    		
		    	    		wncdt = new JLabel("");
		    	    		tfcqct = new JTextField(10);
		    	    		tfcqct.setBorder(border2);
		    	    		wncqct =  new JLabel("");
		    	    		tfkpth = new JTextField();
		    	    		tfkpth.setBorder(border2);
		    	    		pnkpth = new JPanel();
		    	    		pnkpth.setLayout(new BoxLayout(pnkpth, BoxLayout.X_AXIS));
		    	    		cbkpth = new JComboBox(new String[] {"Lựa chọn","Triệu Đồng","Trăm Nghìn Đồng","Nghìn Đồng"});
		    	    		tfkpth.setColumns(10);
		    	    		wnkpth = new JLabel("");		    	    		
		    	    		
		    	    		tdtcol3 = new JPanel();
		    	    		tdtcol3.setBackground(Color.CYAN);
		    	    		tdtcol3.setLayout(new GridLayout(10, 1, 0, 3));
		    	    		pnnbd  = new JPanel();
		    	    		
		    	    		JLabel lbnbdspace =new JLabel("");
		    	    		pnnbd.add(lbnbdspace);
		    	    		
		    	    		
		    	    		lbnbd = new JLabel("Ngày Bắt Đầu (DD-MM-YYYY)");
		    	    		pnnbd.add(lbnbd);
		    	    		
		    	    		
		    	    		pnnhh  = new JPanel();
		    	    		lbnhh = new JLabel("Ngày Hết Hạn (DD-MM-YYYY)");
		    	    		pnlv  = new JPanel();
		    	    		pnlv.setBackground(Color.CYAN);
		    	    		lblv = new JLabel("Lĩnh Vực");		    	    				    	    		
		    	    		pnlsp  = new JPanel();
		    	    		pnlsp.setBackground(Color.CYAN);	    	    		
		    	    		pnlsp.setLayout(new GridLayout(2, 1, 0, 0));	    	    		
		    	    		lblsp = new JLabel("Loại Sản Phẩm");
		    	    		pntynd = new JPanel();
		    	    		pntynd.setBackground(Color.CYAN);		    	    		
		    	    		pntynd.setLayout(new GridLayout(2, 1, 0, 0));		    	    		
		    	    		lbtynd = new JLabel("Trích Yếu Nội Dung");
		    	    		tdtcol4 = new JPanel();
		    	    		tdtcol4.setBackground(Color.CYAN);
		    	    		tdtcol4.setLayout(new GridLayout(10, 1, 3, 0));
		    	    		pntfnbd = new JPanel();
		    	    		pntfnbd.setBackground(Color.CYAN);	    	    		
		    	    		pntfnbd.setLayout(new GridLayout(2, 1, 0, 0));
		    	    		dcnbd = new JDateChooser();
		    	    		dcnbd.setBorder(border2);		    	    				    	    		
		    	    		pnwnnbd = new JPanel();
		    	    		pnwnnbd.setBackground(Color.CYAN);		    	    		
		    	    		pnwnnbd.setLayout(new GridLayout(2, 1, 0, 0));		    	    		
		    	    		wnnbd = new JLabel("");		    	    		
		    	    		dcnhh = new JDateChooser();
		    	    		dcnhh.setBorder(border2);		    	    		
		    	    		pntfnhh = new JPanel();
		    	    		pntfnhh.setBackground(Color.CYAN);		    	    		
		    	    		pntfnhh.setLayout(new GridLayout(2, 1, 0, 0));		    	    		
		    	    		pnwnnhh = new JPanel();		
		    	    		wnnhh = new JLabel("");		
		    	    		JLabel lbnhhspace =new JLabel("");
		    	    		pnnhh.add(lbnhhspace);
		    	    		pnnhh.add(lbnhh);
		    	    	    pntflv = new JPanel();		    	    		
		    	    		pntflv.setLayout(new BoxLayout(pntflv, BoxLayout.X_AXIS));		    	    		
		    	    		tflv = new JTextArea(2,30);
		    	    		tflv.setBorder(border2);		    	    		
		    	    		tflv.setColumns(50);		    	    		
		    	    		pnwnlv = new JPanel();
		    	    		pnwnlv.setBackground(Color.CYAN);		    	    		
		    	    		pnwnlv.setLayout(new GridLayout(2, 1, 0, 0));		    	    		
		    	    		wnlv = new JLabel("");		    	    				    	    		
		    	    		pntflsp = new JPanel();		    	    		
		    	    		pntflsp.setLayout(new BoxLayout(pntflsp, BoxLayout.X_AXIS));		    	    		
		    	    		tflsp = new JTextArea(2,30);
		    	    		tflsp.setBorder(border2);		    	    		
		    	    		tflsp.setColumns(50);		    	    		
		    	    		pnwnlsp = new JPanel();
		    	    		pnwnlsp.setBackground(Color.CYAN);		    	    		
		    	    		pnwnlsp.setLayout(new GridLayout(2, 1, 0, 0));		    	    		
		    	    		wnlsp = new JLabel("");		    	   		    	    		
		    	    		pntftynd = new JPanel();		    	    		
		    	    		pntftynd.setLayout(new BoxLayout(pntftynd, BoxLayout.X_AXIS));		    	    		
		    	    		tftynd = new JTextArea(2,30);
		    	    		tftynd.setBorder(border2);
		    	    		pnwntynd = new JPanel();
		    	    		pnwntynd.setBackground(Color.CYAN);		    	    		
		    	    		pnwntynd.setLayout(new GridLayout(2, 1, 0, 0));	    	    		
		    	    		wntynd = new JLabel("");
	    	    		
		    	 //DSDT		    	    		
		    	    		JPanel tcncol1 = new JPanel();
		    	    		tcncol1.setBackground(Color.CYAN);
		    	    		CenterContent.add(tcncol1);
		    	    		tcncol1.setLayout(new GridLayout(20, 1, 0, 0));		    	    	
		    	    		lbmcn = new JLabel("Mã Chủ Nhiệm");		    	    		
		    	    		lbtcn = new JLabel("Họ Tên Chủ Nhiệm");	    	    		
		    	    		lbnscn = new JLabel("Ngày Sinh (DD-MM-YYYY)");	    	    		
		    	    		lbgtcn = new JLabel("Giới Tính");	    	    		
		    	    		lbsdtcn = new JLabel("Số Điện Thoại");		    	    		
		    	    		lbemailcn = new JLabel("Email");
		    	    		JPanel tcncol2 = new JPanel();
		    	    		tcncol2.setBackground(Color.CYAN);
		    	    		tcncol2.setLayout(new GridLayout(20, 1, 0, 0));
		    	    		
		    	    		tfmcn = new JTextField();
		    	    		tfmcn.setColumns(10);
		    	    		wnmcncn = new JLabel("");
		    	    		tftcncn = new JTextField();
		    	    		wntcncn = new JLabel("");
		    	    		dcnscn = new JDateChooser();
		    	    		wnnscn = new JLabel("");

		    	    	    cbgtcn = new JComboBox(new String[] {
		    	    		  "-Lựa Chọn-",
		    	    		  "Nam",
		    	    		  "Nữ"
		    	    		});

		    	    		wngtcn = new JLabel("");
		    	    		tfsdtcn = new JTextField();
		    	    		tfsdtcn.setColumns(10);
		    	    		wnsdtcn = new JLabel("");
		    	    		tfemailcn = new JTextField();
		    	    		tfemailcn.setColumns(10);
		    	    		wnemailcn = new JLabel("");
		    	    		JPanel tcncol3 = new JPanel();
		    	    		tcncol3.setBackground(Color.CYAN);
		    	    		CenterContent.add(tcncol3);
		    	    		tcncol3.setLayout(new GridLayout(20, 1, 0, 0));
		    	    		lbqqcn = new JLabel("Quê Quán");
		    	    		lbcncn = new JLabel("Chuyên ngành");
		    	    		lbtdcn = new JLabel("Học Vị");	    	 		    	    		
		    	    		lbdvct = new JLabel("Đơn vị công tác");
		    	    		JPanel tcncol4 = new JPanel();
		    	    		tcncol4.setBackground(Color.CYAN);
		    	    		CenterContent.add(tcncol4);
		    	    		tcncol4.setLayout(new GridLayout(10, 1, 0, 0));
		    	    		pnqqcn = new JPanel();
		    	    		pnqqcn.setLayout(new GridLayout(2, 1, 0, 0));
		    	    		JPanel toptfqqcn = new JPanel();
		    	    		toptfqqcn.setBackground(Color.CYAN);
		    	    		tfqqcn = new JTextField();
		    	    		tfqqcn.setColumns(10);
		    	    		pncncn = new JPanel();
		    	    		pncncn.setBackground(Color.CYAN);
		    	    		pncncn.setLayout(new GridLayout(2, 1, 0, 0));
		    	    		wnqqcn = new JLabel("");
		    	    		tfcncn = new JTextField();
		    	    		tfcncn.setColumns(10);
		    	    		pntdcn = new JPanel();
		    	    		pntdcn.setBackground(Color.CYAN);
		    	    		pntdcn.setLayout(new GridLayout(2, 1, 0, 0));
		    	    		wncncn = new JLabel("");
		    	    		wncncn.setBackground(Color.CYAN);
		    	    		tftdcn = new JTextField();
		    	    		tftdcn.setColumns(10);
		    	    		wntdcn = new JLabel("");
		    	    		wntdcn.setBackground(Color.CYAN);
		    	    		tfdvct = new JTextField();
		    	    		tfdvct.setColumns(10);
		    	    		pndvct = new JPanel();
		    	    		pndvct.setBackground(Color.CYAN);
		    	    		pndvct.setLayout(new BoxLayout(pndvct, BoxLayout.X_AXIS));
		    	    		wndvct = new JLabel("");
		    	    		wndvct.setBackground(Color.CYAN);

		    	    		JButton bttcn = new JButton("Thêm Chủ Nhiệm");
		    	    		bttcn.setForeground(Color.WHITE);
		    	    		bttcn.setBackground(Color.RED);
		    	    		bttcn.setFocusPainted(false);

		    	    		JButton btlmcn = new JButton("Làm Mới");
		    	    		btlmcn.setBackground(Color.ORANGE);
		    	    		btlmcn.setForeground(Color.WHITE);
		    	    		btlmcn.setFocusPainted(false);

		    	    		btexit = new JButton("Thoát");		    	    		
		    	    		btexit.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
								    		"Trang Chủ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
									pnbtdm.add(trangchu, "a");
								    pnbtdm.add(pndetai, "b");
						 		    pnbtdm.add(pnchunhiem, "c");
									CenterContent.removeAll();
									CenterSouth.removeAll();
									CenterContent.setLayout(new FlowLayout());
									JLabel vku = new JLabel(new ImageIcon("VKU.jpg"));			    	    		
				    	    		CenterContent.add(vku);
				    	    		setVisible(true);								
								}
		    	    			
		    	    		});
		    	    		
		    	    		
		    	    		
		    	 
		    	    		
		   space_1 = new JLabel("");
		   space_2 = new JLabel("");
		   space_3 = new JLabel("");
		   space_4 = new JLabel("");
		   space_5 = new JLabel("");
		   space_6 = new JLabel("");
		   space_7 = new JLabel("");
		   space_8 = new JLabel("");
		   space_9 = new JLabel("");
		   space_10 = new JLabel("");
		   space_11 = new JLabel("");
		   space_12 = new JLabel("");
		   space_13 = new JLabel("");
		   space_14 = new JLabel("");
		   space_15 = new JLabel("");
		   space_16 = new JLabel("");
		   space_17 = new JLabel("");
		   space_18 = new JLabel("");
		  
		   tfnscn = new JTextField();
	}

	

	public void TrangThemDeTai() {
		CenterContent.setLayout(new GridLayout(1, 4, 20, 0));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Thêm Đề Tài Khoa Học Mới", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JPanel tdtcol1 = new JPanel();
		tdtcol1.setBackground(Color.CYAN);
		tdtcol1.setLayout(new GridLayout(20, 1, 3, 0));		
		
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbmdt);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbtdt);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbmcn);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbtcn);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbsvnc);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbcdt);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbcqct);
		tdtcol1.add(new JLabel(""));
		tdtcol1.add(lbkpth);
		
		CenterContent.add(tdtcol1);

	    //Column2 CenterContent
		JPanel tdtcol2 = new JPanel();
		tdtcol2.setBackground(Color.CYAN);
		tdtcol2.setLayout(new GridLayout(20, 1, 0, 3));
		
		
		tdtcol2.add(new JLabel(""));
		tdtcol2.add(tfmdt);
		tdtcol2.add(new JLabel(""));
		tdtcol2.add(tftdt);
		tdtcol2.add(wntdt);

		
		cbmcn.addItem("-Lựa chọn-");
		
		try {
			Statement s = conn.createStatement();
			String sql = "Select MaChuNhiem FROM CHUNHIEM";
	        ResultSet rs = s.executeQuery(sql);
	      
	        while(rs.next()) {
	            cbmcn.addItem(rs.getString(1));
	       
	            
	        }
	    }
			
	        
		 catch (SQLException eeee) {
			// TODO Auto-generated catch block
			eeee.printStackTrace();
		}
		

		tdtcol2.add(cbmcn);
		tdtcol2.add(wnmcn);
		tftcn.disable();
		tftcn.setDisabledTextColor(Color.BLACK);
		tftcn.setBorder(border2);
		tdtcol2.add(tftcn);
		
		cbmcn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String c = cbmcn.getSelectedItem().toString();
				if(!(c.equals("-Lua Chon-"))) {
					try {
						Statement s = conn.createStatement();
						String sql = "Select TenChuNhiem FROM CHUNHIEM WHERE MaChuNhiem = "+ "'"+c+"'";
				        ResultSet rs = s.executeQuery(sql);
				        
				        while(rs.next()) {
			                tftcn.setText(rs.getString(1));
			                
			            }
				      
				         
				    }
						
				        
					 catch (SQLException eeee) {
						// TODO Auto-generated catch block
						eeee.printStackTrace();
					}
				}
				
				
			}
			
		});	
		tdtcol2.add(wntcn);
		tdtcol2.add(tfsvnc);
		tdtcol2.add(wnsvnc);
		tdtcol2.add(cbcdt);
		cbcdt.setBackground(Color.WHITE);
		tdtcol2.add(wncdt);
		tfcqct.setBorder(border2);
		tdtcol2.add(tfcqct);
		tdtcol2.add(wncqct);
		tfkpth.setBorder(border2);
		pnkpth.setLayout(new BoxLayout(pnkpth, BoxLayout.X_AXIS));
		pnkpth.add(tfkpth);
		pnkpth.add(cbkpth);
		tdtcol2.add(pnkpth);
		CenterContent.add(tdtcol2);
		tdtcol2.add(wnkpth);
		
		
		JPanel tdtcol3 = new JPanel();
		tdtcol3.setBackground(Color.CYAN);
		tdtcol3.setLayout(new GridLayout(10, 1, 0, 3));
		CenterContent.add(tdtcol3);
		
		
		pnnbd.setBackground(Color.CYAN);
		pnnbd.setLayout(new GridLayout(2, 1, 0, 0));
		
		tdtcol3.add(pnnbd);
		
		pnnhh.setBackground(Color.CYAN);
		pnnhh.setLayout(new GridLayout(2, 1, 0, 0));
		
		
		tdtcol3.add(pnnhh);
		
		
		tdtcol3.add(space_13);
		
		
		pnlv.setBackground(Color.CYAN);
		tdtcol3.add(pnlv);
		pnlv.setLayout(new GridLayout(2, 1, 0, 0));
		pnlv.add(lblv);
		
		
		tdtcol3.add(space_14);
	    pnlsp.setBackground(Color.CYAN);
	    pnlsp.add(lblsp);
		tdtcol3.add(pnlsp);
		tdtcol3.add(new JLabel(""));
		pntynd.setBackground(Color.CYAN);
		tdtcol3.add(pntynd);
		pntynd.setLayout(new GridLayout(2, 1, 0, 0));
		pntynd.add(lbtynd);
		
		
		JPanel tdtcol4 = new JPanel();
		tdtcol4.setBackground(Color.CYAN);
		tdtcol4.setLayout(new GridLayout(10, 1, 3, 0));
		CenterContent.add(tdtcol4);
		
		
		
		pntfnbd.setBackground(Color.CYAN);
		tdtcol4.add(pntfnbd);
		pntfnbd.setLayout(new GridLayout(2, 1, 0, 0));
		pntfnbd.add(space_15);
		dcnbd.setBorder(border2);
		pntfnbd.add(dcnbd);
		
		pntfnhh.setBackground(Color.CYAN);
		tdtcol4.add(pntfnhh);
		pntfnhh.setLayout(new GridLayout(2, 1, 0, 0));
		pntfnhh.add(wnnbd);
		dcnhh.setBorder(border2);
		pntfnhh.add(dcnhh);
		
		pnwnnhh.setBackground(Color.CYAN);
		tdtcol4.add(pnwnnhh);
		pnwnnhh.setLayout(new GridLayout(2, 1, 0, 0));
		pnwnnhh.add(wnnhh);
	    tdtcol4.add(pntflv);
		pntflv.setLayout(new BoxLayout(pntflv, BoxLayout.X_AXIS));
		tflv.setBorder(border2);
		pntflv.add(tflv);
		tflv.setColumns(50);
		pnwnlv.setBackground(Color.CYAN);
		tdtcol4.add(pnwnlv);
		pnwnlv.setLayout(new GridLayout(2, 1, 0, 0));
		pnwnlv.add(wnlv);
		tdtcol4.add(pntflsp);
		pntflsp.setLayout(new BoxLayout(pntflsp, BoxLayout.X_AXIS));
		
		
		tflsp.setBorder(border2);
		pntflsp.add(tflsp);
		tflsp.setColumns(50);
		pnwnlsp.setBackground(Color.CYAN);
		pnwnlsp.setLayout(new GridLayout(2, 1, 0, 0));
        pnwnlsp.add(wnlsp);
        tdtcol4.add(pnwnlsp);
        pntftynd.setLayout(new BoxLayout(pntftynd, BoxLayout.X_AXIS));
		tdtcol4.add(pntftynd);
		tftynd.setBorder(border2);
		pntftynd.add(tftynd);
		tftynd.setColumns(50);
		pnwntynd.setBackground(Color.CYAN);
		pnwntynd.setLayout(new GridLayout(2, 1, 0, 0));
		pnwntynd.add(wntynd);
		tdtcol4.add(pnwntynd);
		
		JButton bttdt = new JButton("Thêm Đề Tài");
		bttdt.setForeground(Color.WHITE);
		bttdt.setBackground(Color.RED);
		bttdt.setFocusPainted(false);
		CenterSouth.add(bttdt);
		
		JButton btlmdt = new JButton("Làm Mới");
		btlmdt.setBackground(Color.ORANGE);
		btlmdt.setForeground(Color.WHITE);
		btlmdt.setFocusPainted(false);
		CenterSouth.add(btlmdt);
		
		btexit.setBackground(Color.BLUE);
		btexit.setForeground(Color.WHITE);
		btexit.setFocusPainted(false);
		CenterSouth.add(btexit);
	
		tfmdt.disable();
   
		tfmdt.setText("");
		tftdt.setText("");
		tfsvnc.setText("");
		cbcdt.setSelectedIndex(0);
		tfcqct.setText("");
		tfkpth.setText("");
		cbkpth.setSelectedIndex(0);
		dcnbd.setCalendar(null);
		dcnhh.setCalendar(null);
		tflv.setText("");
		tflsp.setText("");
		tftynd.setText("");
		cbmcn.setSelectedIndex(0);
	
	    cbmcn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String mcn = cbmcn.getSelectedItem().toString();
		
				try {
					Statement s = conn.createStatement();
					String sql = "SELECT MaDeTaiSo FROM CHUCNANGTUDONG";
					ResultSet rs = s.executeQuery(sql);
					while(rs.next()) {
						MaDeTaiso = rs.getInt(1);
					}
				}   catch (SQLException eeee) {
					// TODO Auto-generated catch block
					eeee.printStackTrace();
				}
				String c = cbmcn.getSelectedItem().toString();
			    tfmdt.setDisabledTextColor(Color.BLACK);
			    if(MaDeTaiso/10==0) {
			    	tfmdt.setText(mcn+"00"+ MaDeTaiso);
			    }
			    if((MaDeTaiso/10)>=1 && (MaDeTaiso/10)<=9) {
			    	tfmdt.setText(mcn+"0"+ MaDeTaiso);
			    }
			    if((MaDeTaiso/10) >9) {
			    	tfmdt.setText(mcn+""+ MaDeTaiso);			   
			    }			    
			    if(mcn== "-Lựa chọn-") {
					tfmdt.setText("");
				}
			}		
		});  
	    cbkpth.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dvt;
				String string = tfkpth.getText();
				
				if(string.isEmpty()) {
					string  = "0";
				}
				money = Integer.parseInt(string);
				
				
				dvt = ""+cbkpth.getSelectedItem().toString();
				
				if(dvt.equals("Triệu Đồng")) {
					
					kpdt = 1000000*money;
					
					
				}
				if(dvt.equals("Trăm Nghìn Đồng")) {
					kpdt = 100000*money;
				}
				if(dvt.equals("Nghìn Đồng")) {
					kpdt = 1000*money;
				}
				
			}
			
	    	
	    });
  
		bttdt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nbd = null,nhh = null;
					int k = 0;
					if(tftdt.getText().isEmpty()) 
			    	{
			    	wntdt.setText("Bạn Chưa Nhập Tên Đề Tài!!!");
			    	wntdt.setForeground(Color.RED);
			    	k++;
			    	} else wntdt.setText("");
				
					if(cbmcn.getSelectedItem().toString().equals("-Lựa chọn-")) 
			    	{
						
					wnmcn.setText("Bạn Chưa Chọn Mã Chủ Nhiệm!!!");
					wnmcn.setForeground(Color.RED);
			    	k++;
			    	} 
					
					if(tfsvnc.getText().isEmpty()) 
			    	{
					wnsvnc.setText("Bạn Chưa Nhập Sinh Viên Nghiên Cứu!!!");
			    	wnsvnc.setForeground(Color.RED);
			    	k++;
			    	} else wnsvnc.setText("");
					
					if(cbcdt.getSelectedItem().toString().equals("-Lua chon-")) 
			    	{
			    	wncdt.setText("Bạn Chưa Chọn Cấp Đề Tài!!!");
			    	wncdt.setForeground(Color.RED);
			    	k++;
			    	} else wncdt.setText("");
					if(tfcqct.getText().isEmpty()) 
			    	{
			    	wncqct.setText("Bạn Chưa Nhập Cơ Quan Chủ Trì!!!");
			    	wncqct.setForeground(Color.RED);
			    	k++;
			    	} else wncqct.setText("");
					if(tflv.getText().isEmpty()) 
			    	{
			    	wnlv.setText("Bạn Chưa Nhập Lĩnh Vực!!!");
			    	wnlv.setForeground(Color.RED);
			    	k++;
			    	} else wnlv.setText("");
					if(cbkpth.getSelectedItem().toString() == "Lựa chọn") {
						wnkpth.setText("Bạn chưa chọn kinh phí thực hiện");
				    	wnkpth.setForeground(Color.RED);
				    	k++;
					} else wnkpth.setText("");
					if(tflsp.getText().isEmpty()) 
			    	{
			    	wnlsp.setText("Bạn Chưa Nhập Loại Sản Phẩm!!!");
			    	wnlsp.setForeground(Color.RED);
			    	k++;
			    	} else wnlsp.setText("");
					if(tftynd.getText().isEmpty()) 
			    	{
			    	wntynd.setText("Bạn Chưa Nhập Trích Yếu Nội Dung!!!");
			    	wntynd.setForeground(Color.RED);
			    	k++;
			    	} else wntynd.setText("");
					
					try {
			    		
					     nbd = ""+ dateFormat.format(dcnbd.getDate()); 
			    	} catch(Exception m) {
			    		wnnbd.setText("Bạn chưa nhập ngày bắt đầu!!!");
			    		k++;
			    		wnnbd.setForeground(Color.RED);
			    	}
					if(nbd!=null) {
						wnnbd.setText("");
					}
					
					try {
			    		
					     nhh = ""+dateFormat.format(dcnhh.getDate()); 
			    	} catch(Exception l) {
			    		wnnhh.setText("Bạn chưa nhập ngày kết thúc!!!");
			    		k++;
			    		wnnhh.setForeground(Color.RED);
			    	}
					if(nhh!=null) {
						wnnhh.setText("");
					}
					
					if(k==0) {
					int output = JOptionPane.showConfirmDialog(null, 
	                        "Bạn Có Chắc Muốn Thêm Đề Tài Này Không", "Thông Báo",
	                        JOptionPane.YES_NO_OPTION);
					    
					    if (output == JOptionPane.YES_OPTION) {
					    	Statement sc = conn.createStatement();
							String sql = "INSERT INTO DETAI VALUES("
									+ "'"+tfmdt.getText()+"'"+","
									+ "N'"+tftdt.getText()+"'"+","
									+  "N'"+tfsvnc.getText()+"'"+","
								    +  "N'"+ cbcdt.getSelectedItem().toString() +"'"+","
						            
						
										
									+ "N'"+tfcqct.getText()+"'"+","
									+"'"+ kpdt+"'"+","
									+ "'"+nbd+"'"+","
									+ "'"+nhh+"'"+","
									+ "N'"+tflv.getText()+"'"+","
									+ "N'"+tflsp.getText()+"'"+","
									+ "N'"+tftynd.getText()+"'"+","
		                          + "'"+cbmcn.getSelectedItem().toString()+"'"+","
		                          +"'"+"'"+","
		                          +"'"+"'"+","
		                          +"'"+"'"
		                          
		                         +")";
							int ii=sc.executeUpdate(sql);
							
							Statement sq = conn.createStatement();
							String mcncount = "UPDATE CHUCNANGTUDONG SET MaDeTaiSo=MaDeTaiSo+1";
						    int rs = sq.executeUpdate(mcncount);
							
							
							JOptionPane.showMessageDialog(null, "Đã Thêm Đề Tài");
							tfmdt.setText("");
							tftdt.setText("");
							tfsvnc.setText("");
							cbcdt.setSelectedIndex(0);
							tfcqct.setText("");
							tfkpth.setText("");
							cbkpth.setSelectedIndex(0);
							dcnbd.setCalendar(null);
							dcnhh.setCalendar(null);
							tflv.setText("");
							tflsp.setText("");
							tftynd.setText("");
							cbmcn.setSelectedIndex(0);
							
							
							
							
						    
		                } else if (output == JOptionPane.NO_OPTION) {
		                    
		                }
						
   				} else {
   					k = 0;
   				}
					
				}  catch (SQLException b) {
					// TODO Auto-generated catch block
					b.printStackTrace();
					
				}
				
			}
			
		});
		
		tfmdt.setBackground(Color.GRAY);
		tftcn.setBackground(Color.GRAY);
		btlmdt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tfmdt.setText("");
				tftdt.setText("");
				tfsvnc.setText("");
				cbcdt.setSelectedIndex(0);
				tfcqct.setText("");
				tfkpth.setText("");
				cbkpth.setSelectedIndex(0);
				dcnbd.setCalendar(null);
				dcnhh.setCalendar(null);
				tflv.setText("");
				tflsp.setText("");
				tftynd.setText("");
				cbmcn.setSelectedIndex(0);
				
			}
			
		});

	}
	
	public void TrangDanhSachDeTai()  {
		CenterContent.setLayout(new GridLayout(2,0));
		CenterContent.setBackground(Color.CYAN);
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Danh Sách Đề Tài", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DefaultTableModel dModeldsdt = new DefaultTableModel();
		dModeldsdt.addColumn("Mã Đề Tài");
		dModeldsdt.addColumn("Tên Đề Tài");
		dModeldsdt.addColumn("Mã Chủ Nhiệm");
		dModeldsdt.addColumn("Tên Chủ Nhiệm");
		dModeldsdt.addColumn("Tên Nhà Khoa Học");
		dModeldsdt.addColumn("Cấp Đề Tài");
		dModeldsdt.addColumn("Cơ Quan Chủ Trì");
		dModeldsdt.addColumn("Kinh Phí");
		dModeldsdt.addColumn("Ngày Bắt Đầu");
		dModeldsdt.addColumn("Ngày Kết Thúc");
		dModeldsdt.addColumn("Lĩnh Vực");
		dModeldsdt.addColumn("Loại Sản Phẩm");
		dModeldsdt.addColumn("Trích Yếu Nội Dung");
		dModeldsdt.addColumn("Trạng Thái");
	    
		JTable tabledsdt = new JTable(dModeldsdt);
		tabledsdt.setBackground(Color.CYAN);
		tabledsdt.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		tabledsdt.setBackground(Color.WHITE);
		JScrollPane sc =new JScrollPane(tabledsdt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sc.setBackground(Color.WHITE);
		tabledsdt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		JPanel information_dt = new JPanel();
		information_dt.setLayout(new BorderLayout());
		
		JPanel information_dt_north = new JPanel();
		information_dt_north.setBackground(Color.CYAN);
		information_dt_north.setLayout(new BorderLayout());
		information_dt.add(information_dt_north,BorderLayout.NORTH);
		
		JPanel information_dt_center = new JPanel();
		information_dt.add(information_dt_center,BorderLayout.CENTER);
		information_dt_center.setLayout(new GridLayout(0, 4, 20, 0));
		JPanel dsdtco1 = new JPanel();
		dsdtco1.setLayout(new GridLayout(10,0));
		
		dsdtco1.add(lbmdt);
		dsdtco1.add(tfmdt);
		dsdtco1.add(lbtdt);
		dsdtco1.add(tftdt);
		dsdtco1.add(lbmcn);
		JComboBox cbmcn = new JComboBox();
		try {
			Statement s = conn.createStatement();
			String sql = "Select MaChuNhiem FROM CHUNHIEM";
	        ResultSet rs = s.executeQuery(sql);
	      
	        while(rs.next()) {
	            cbmcn.addItem(rs.getString(1));
	       
	            
	        }
	    }
			
	        
		 catch (SQLException eeee) {
			// TODO Auto-generated catch block
			eeee.printStackTrace();
		}
		
		dsdtco1.add(cbmcn);
		dsdtco1.add(lbtcn);
		dsdtco1.add(tftcn);	
		dsdtco1.setBackground(Color.CYAN);
		information_dt_center.add(dsdtco1);
		
		JPanel dsdtco2 = new JPanel();
		dsdtco2.setLayout(new GridLayout(10,0));
		dsdtco2.setBackground(Color.CYAN);		
		dsdtco2.add(lbsvnc);
		dsdtco2.add(tfsvnc);
		dsdtco2.add(lbcdt);
		dsdtco2.add(cbcdt);
		dsdtco2.add(lbcqct);
		dsdtco2.add(tfcqct);
		dsdtco2.add(lbkpth);
		dsdtco2.add(tfkpth);	
		information_dt_center.add(dsdtco2);
		
		JPanel dsdtco3 = new JPanel();
		dsdtco3.setLayout(new GridLayout(10,0));
		dsdtco3.setBackground(Color.CYAN);
		tfnbd = new JTextField();
		tfnhh = new JTextField();
		dsdtco3.add(lbnbd);
		dsdtco3.add(tfnbd);
		dsdtco3.add(lbnhh);
		dsdtco3.add(tfnhh);
		dsdtco3.add(lblv);
		dsdtco3.add(tflv);
		dsdtco3.add(lblsp);
		dsdtco3.add(tflsp);
		
		information_dt_center.add(dsdtco3);
		information_dt_center.setBackground(Color.CYAN);
		JPanel dsdtco4 = new JPanel();
		dsdtco4.setLayout(new GridLayout(5,0));
		dsdtco4.setBackground(Color.CYAN);
		dsdtco4.add(lbtynd);
		dsdtco4.add(tftynd);	
		//Resert
		tfmdt.setText("");
		tftdt.setText("");
		tfsvnc.setText("");
		cbcdt.setSelectedIndex(0);
		tfcqct.setText("");
		tfkpth.setText("");
		cbkpth.setSelectedIndex(0);
		dcnbd.setCalendar(null);
		dcnhh.setCalendar(null);
		tflv.setText("");
		tflsp.setText("");
		tftynd.setText("");
		
		JTextField tfsearchtdt = new JTextField();
		TableRowSorter<TableModel> rowSorter
        = new TableRowSorter<>(dModeldsdt);
		tabledsdt.setRowSorter(rowSorter);
		tfsearchtdt.getDocument().addDocumentListener(new DocumentListener(){
            
            @Override
            public void insertUpdate(DocumentEvent e) {
    
                String text = tfsearchtdt.getText();

                if (text.length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }
                
     
                
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfsearchtdt.getText();

                if (text.length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }

        });
	    
	    
	    JPanel pnsearchtdt = new JPanel();
	    pnsearchtdt.setBackground(Color.CYAN);
	    pnsearchtdt.setBorder(new LineBorder(Color.YELLOW,5,true));
	    pnsearchtdt.setLayout(new GridLayout(0,2));
	    JLabel lbsearchtdt = new JLabel("Tìm kiếm theo tên đề tài");
	    pnsearchtdt.add(lbsearchtdt);
	    pnsearchtdt.add(tfsearchtdt);
		information_dt_center.add(dsdtco4);
		information_dt_north.add(pnsearchtdt,BorderLayout.EAST);		
		CenterContent.add(information_dt);
		CenterContent.add(sc);	
		tabledsdt.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int row = tabledsdt.getSelectedRow();
				tfmdt.setText((String)tabledsdt.getValueAt(row,0));
				tftdt.setText((String)tabledsdt.getValueAt(row,1));
				cbmcn.setSelectedItem((String)tabledsdt.getValueAt(row,2));
				tftcn.setText((String)tabledsdt.getValueAt(row,3));
				tfsvnc.setText((String)tabledsdt.getValueAt(row,4));
				cbcdt.setSelectedItem((String)tabledsdt.getValueAt(row,5));
				tfcqct.setText((String)tabledsdt.getValueAt(row,6));
				tfkpth.setText((String)tabledsdt.getValueAt(row,7));
				tfnbd.setText((String)tabledsdt.getValueAt(row,8));
				tfnhh.setText((String)tabledsdt.getValueAt(row,9));
				tflv.setText((String)tabledsdt.getValueAt(row,10));
				tflsp.setText((String)tabledsdt.getValueAt(row,11));
				tftynd.setText((String)tabledsdt.getValueAt(row,12));	
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {				
			}
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {								
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {								
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {								
			}			
		 });
		try {
			Statement s = conn.createStatement();
			String sql = "SELECT MADETAI,TENDETAI,d.MACHUNHIEM,TENCHUNHIEM,SVNC,CAPDETAI,COQUANCHUTRI,\r\n"
					+ "KINHPHITHUCHIEN,NGAYBATDAU,NGAYHETHAN,LINHVUC,LOAISANPHAM,TRICHYEUNOIDUNG,\r\n"
					+ " (CASE TINHTRANG WHEN 0 THEN N'Chưa Duyệt'\r\n"
					+ "ELSE N'Đã Duyệt' END) AS TINHTRANG\r\n"
					+ "FROM DETAI D INNER JOIN CHUNHIEM C ON D.MACHUNHIEM =C.MACHUNHIEM";
		    ResultSet rs = s.executeQuery(sql);		    
		    while(rs.next()) {
		    	dModeldsdt.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)
						,rs.getString(13),rs.getString(14)
				});
			}   
	    }        
		 catch (SQLException eeee) {
			// TODO Auto-generated catch block
			eeee.printStackTrace();
		}

		JButton bteditdt = new JButton("Sửa Đề Tài");
		bteditdt.setForeground(Color.WHITE);
		bteditdt.setBackground(Color.ORANGE);
		bteditdt.setFocusPainted(false);
		CenterSouth.add(bteditdt);
		
		JButton btdeletedt = new JButton("Xóa Đề Tài");
		btdeletedt.setBackground(Color.BLUE);
		btdeletedt.setForeground(Color.WHITE);
		btdeletedt.setFocusPainted(false);
		CenterSouth.add(btdeletedt);
		
		btexit.setBackground(Color.PINK);
		btexit.setForeground(Color.WHITE);
		btexit.setFocusPainted(false);
		CenterSouth.add(btexit);
	
		bteditdt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int k = 0;
				if(tfmdt.getText().isEmpty()) {
					k++;
				}
				if(tftdt.getText().isEmpty()) {
					k++;
				}				
				try {
					if(cbmcn.getSelectedItem().toString().isEmpty()) {
						
					}
				} catch(Exception sd) {
					k++;
				}
				if(tfsvnc.getText().isEmpty()) {
					k++;
				}
				try {
					if(cbcdt.getSelectedItem().toString().isEmpty()) {
						
					}
				} catch(Exception sd) {
					k++;
				}
				if(tfcqct.getText().isEmpty()) {
					k++;
				}
				if(tfkpth.getText().isEmpty()) {
					k++;
				}
				if(tfnbd.getText().isEmpty()) {
					k++;
				}
				if(tfnhh.getText().isEmpty()) {
					k++;
				}
				if(tflv.getText().isEmpty()) {
					k++;
				}
				if(tflsp.getText().isEmpty()) {
					k++;
				}
				if(tflsp.getText().isEmpty()) {
					k++;
				}
				if(tftynd.getText().isEmpty()) {
					k++;
				}
				if(k ==13 ) {
					JOptionPane.showMessageDialog(null,"Vui Lòng Chọn Dòng Để Thực Hiện");
				} else if(k!=0) {
					JOptionPane.showMessageDialog(null,"Bạn Chưa Nhập Đủ Yêu Cầu");
				} else if(k==0) {
					
					try {
						Statement s = conn.createStatement();
						String insert = "UPDATE DETAI SET "+
								" MaDeTai="+"'" +tfmdt.getText()+"'"+ ","+
								" TenDeTai="+"N'" +tftdt.getText()+"'"+ ","+
								" MaChuNhiem="+"'" +cbmcn.getSelectedItem().toString()+"'"+ ","+
							
								" SVNC ="+"N'" +tfsvnc.getText()+"'"+ ","+
								" CAPDETAI="+"N'" +cbcdt.getSelectedItem().toString()+"'"+ ","+
								" COQUANCHUTRI="+"N'" +tfcqct.getText()+"'"+ ","+
								" KINHPHITHUCHIEN="+"'" +tfkpth.getText()+"'"+ ","+
								" NGAYBATDAU="+"'" +tfnbd.getText() +"'"+ ","+
								" NGAYHETHAN="+"'" +tfnhh.getText()+"'"+ ","+
								" LINHVUC="+"N'" +tflv.getText()+"'"+ ","+
								" LOAISANPHAM="+"N'" +tflsp.getText()+"'"+ ","+
								" TRICHYEUNOIDUNG="+"N'" +tftynd.getText()+"'"+
								" WHERE MaDeTai =" + tfmdt.getText()
								;
						System.out.println(insert);
						
						int r = s.executeUpdate(insert);
						int row = tabledsdt.getSelectedRow();
						
						dModeldsdt.setValueAt(tfmdt.getText(), row, 0);
						dModeldsdt.setValueAt(tftdt.getText(), row, 1);
						dModeldsdt.setValueAt(cbmcn.getSelectedItem().toString(), row, 2);
						dModeldsdt.setValueAt(tftcn.getText(), row, 3);
						dModeldsdt.setValueAt(tfsvnc.getText(), row, 4);
						dModeldsdt.setValueAt(cbcdt.getSelectedItem().toString(), row, 5);
						dModeldsdt.setValueAt(tfcqct.getText(), row, 6);
						dModeldsdt.setValueAt(tfkpth.getText(), row, 7);
						dModeldsdt.setValueAt(tfnbd.getText(), row, 8);
						dModeldsdt.setValueAt(tfnhh.getText(), row, 9);
						dModeldsdt.setValueAt(tflv.getText(), row, 10);
						dModeldsdt.setValueAt(tflsp.getText(), row, 11);
						dModeldsdt.setValueAt(tftynd.getText(), row, 12);						
						JOptionPane.showMessageDialog(null,"Sửa Đề Tài Thành Công");
			} catch (SQLException ee) {
					// TODO Auto-generated catch block
					ee.printStackTrace();
				}
			}				
		}		 
	 });
	
	btdeletedt.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {		
			try {			
				Statement s = conn.createStatement();
				String insert = "DELETE FROM DETAI WHERE MaDeTai=" + tfmdt.getText();
		
				int output = JOptionPane.showConfirmDialog(null, 
                        "Bạn có chắc muốn xóa đề Tài "+tftdt.getText(),"Thông Báo",
                        JOptionPane.YES_NO_OPTION);
                if (output == JOptionPane.YES_OPTION) {
                	dModeldsdt.removeRow(tabledsdt.getSelectedRow());
                	int r = s.executeUpdate(insert);
                	JOptionPane.showMessageDialog(null,"Đã Xóa Đề Tài "+tftdt.getText());
                } else if (output == JOptionPane.NO_OPTION) {
                    
                }
	
		} catch (SQLException ete) {
			// TODO Auto-generated catch block
			ete.printStackTrace();
		}			
			}			
		});
}
	
	public void TrangThemChuNhiem() {
		CenterContent.setLayout(new GridLayout(0, 4, 20, 0));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	     "Thêm Chủ Nhiệm Mới", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel tcncol1 = new JPanel();
		tcncol1.setBackground(Color.CYAN);
		CenterContent.add(tcncol1);
		tcncol1.setLayout(new GridLayout(20, 1, 0, 0));
			
		tcncol1.add(space_1);
		tcncol1.add(lbmcn);
		tcncol1.add(space_2);
		tcncol1.add(lbtcn);
		tcncol1.add(space_3);
		tcncol1.add(lbnscn);
		tcncol1.add(space_4);
		tcncol1.add(lbgtcn);
		tcncol1.add(space_5);
		tcncol1.add(lbsdtcn);
		tcncol1.add(space_6);		
		tcncol1.add(lbemailcn);
		
		JPanel tcncol2 = new JPanel();
		tcncol2.setBackground(Color.CYAN);
		CenterContent.add(tcncol2);
		tcncol2.setLayout(new GridLayout(20, 1, 0, 0));
		tcncol2.add(space_7);
		tcncol2.add(tfmcn);
		tfmcn.setColumns(10);
		tcncol2.add(wnmcncn);
		tcncol2.add(tftcncn);
		tcncol2.add(wntcncn);
		tcncol2.add(dcnscn);
		tcncol2.add(wnnscn);
		tcncol2.add(cbgtcn);
		tcncol2.add(wngtcn);
		tcncol2.add(tfsdtcn);
		tcncol2.add(wnsdtcn);
		tcncol2.add(tfemailcn);
		tcncol2.add(wnemailcn);
		
		JPanel tcncol3 = new JPanel();
		tcncol3.setBackground(Color.CYAN);
		CenterContent.add(tcncol3);
		tcncol3.setLayout(new GridLayout(20, 1, 0, 0));
		tcncol3.add(space_8);
		tcncol3.add(lbqqcn);
		tcncol3.add(space_9);
		tcncol3.add(lbcncn);
		tcncol3.add(space_10);
		tcncol3.add(lbtdcn);
		tcncol3.add(space_11);
		tcncol3.add(space_12);
		tcncol3.add(lbdvct);
		
		JPanel tcncol4 = new JPanel();
		tcncol4.setBackground(Color.CYAN);
		CenterContent.add(tcncol4);
		tcncol4.setLayout(new GridLayout(10, 1, 0, 0));
		tcncol4.add(pnqqcn);
		pnqqcn.setLayout(new GridLayout(2, 1, 0, 0));
		pnqqcn.add(space_13);
		pnqqcn.setBackground(Color.CYAN);
		
		pnqqcn.add(tfqqcn);
		tfqqcn.setColumns(10);
		tcncol4.add(pncncn);
		pncncn.setBackground(Color.CYAN);
		pncncn.setLayout(new GridLayout(2, 1, 0, 0));
		pncncn.add(wnqqcn);
		pncncn.add(tfcncn);
		tfcncn.setColumns(10);
		tcncol4.add(pntdcn);
		pntdcn.setBackground(Color.CYAN);
		pntdcn.setLayout(new GridLayout(2, 1, 0, 0));
		wncncn.setBackground(Color.CYAN);
		pntdcn.add(wncncn);
		pntdcn.add(tftdcn);
		tftdcn.setColumns(10);
		
		JPanel pnbttdcn = new JPanel();
		pnbttdcn.setBackground(Color.CYAN);
		tcncol4.add(pnbttdcn);
		pnbttdcn.setLayout(new BoxLayout(pnbttdcn, BoxLayout.X_AXIS));
		
		JLabel wntdcn = new JLabel("");
		wntdcn.setBackground(Color.CYAN);
		pnbttdcn.add(wntdcn);

		tcncol4.add(tfdvct);
		tfdvct.setColumns(10);	
		pndvct.setBackground(Color.CYAN);
		tcncol4.add(pndvct);
		pndvct.setLayout(new BoxLayout(pndvct, BoxLayout.X_AXIS));		
		
		wndvct.setBackground(Color.CYAN);
		pndvct.add(wndvct);
		
		JButton bttcn = new JButton("Thêm Chủ Nhiệm");
		bttcn.setForeground(Color.WHITE);
		bttcn.setBackground(Color.RED);
		bttcn.setFocusPainted(false);
		CenterSouth.add(bttcn);
		
		JButton btlmcn = new JButton("Làm Mới");
		btlmcn.setBackground(Color.ORANGE);
		btlmcn.setForeground(Color.WHITE);
		btlmcn.setFocusPainted(false);
		CenterSouth.add(btlmcn);		
		
		btexit.setBackground(Color.BLUE);
		btexit.setForeground(Color.WHITE);
		btexit.setFocusPainted(false);
		CenterSouth.add(btexit);
		
		//Resert
		tfmcn.setText("0"+MaChuNhiemso);
		tftcncn.setText("");
		cbgtcn.setSelectedIndex(0);
		tfsdtcn.setText("");
		tfemailcn.setText("");
		tfqqcn.setText("");
		tfcncn.setText("");
		tftdcn.setText("");
		tfdvct.setText("");
	    
	    wntcncn.setText("");
	    wngtcn.setText("");
	    wnnscn.setText("");
	    wnsdtcn.setText("");
	    wnemailcn.setText("");
	    wnqqcn.setText("");
	    wncncn.setText("");
	    wntdcn.setText("");
	    wndvct.setText("");
		
		//SuKien 	
			try {
				Statement s = conn.createStatement();
				String sql = "SELECT MChuNhiemSo FROM CHUCNANGTUDONG";
				ResultSet rs = s.executeQuery(sql);
				while(rs.next()) {
					MaChuNhiemso = rs.getInt(1);
				}
			}  catch(Exception b) {				
			}
		    
			tfmcn.disable();
		    tfmcn.setDisabledTextColor(Color.BLACK);
		    if(MaChuNhiemso/10==0) {
		    	tfmcn.setText("00"+ MaChuNhiemso);
		    }
		    if((MaChuNhiemso/10)>=1 && (MaChuNhiemso/10)<=9) {
		    	tfmcn.setText("0"+ MaChuNhiemso);
		    }
		    if((MaChuNhiemso/10) >9) {
		    	tfmcn.setText(""+ MaChuNhiemso);		   
		    }
		    bttcn.addActionListener(new ActionListener( ) {
			@Override
			public void actionPerformed(ActionEvent e) {		
				gttext = cbgtcn.getSelectedItem().toString();
				if(gttext == "Nam") {
					gtbit = 0;
				}else if(gttext == "Nữ") {
					gtbit = 1;
				}
				try {	    
				    int k = 0;	    
				    	if(tftcncn.getText().isEmpty()) 
				    	{
				    	wntcncn.setText("Bạn Chưa Nhập Họ Tên!!!");
				    	wntcncn.setForeground(Color.RED);
				    	k++;
				    	} else wntcncn.setText("");	    	
				    	gttext = cbgtcn.getSelectedItem().toString();
				    	System.out.println(gttext);
				    	if(gttext == "-Lựa Chọn-") 
				    	{			    		 
				    	wngtcn.setText("Hãy Lựa Chọn Giới Tính!!!");
				    	wngtcn.setForeground(Color.RED);
				    	k++;			    	
				    	} else { System.out.println(gttext);
				    		wngtcn.setText("");
				    	}
				    	try {
				    		System.out.println(dcnscn.getDate());
						     String nscn = dateFormat.format(dcnscn.getDate());
						     System.out.println(nscn);
						     wnnscn.setText("");
						     
				    	} catch(Exception a) {
				    		wnnscn.setText("Bạn chưa nhập ngày sinh!!!");
				    		k++;
				    		wnnscn.setForeground(Color.RED);
				    	}
				    	
				    	
				    	
				    	if(tfsdtcn.getText().isEmpty()) 
				    	{
				    	wnsdtcn.setText("Bạn Chưa Nhập Số Điện Thoại!!!");
				    	wnsdtcn.setForeground(Color.RED);
				    	k++;
				    	} else wnsdtcn.setText("");
				    	if(tfemailcn.getText().isEmpty()) 
				    	{
				    	wnemailcn.setText("Bạn Chưa Nhập Email!!!");
				    	wnemailcn.setForeground(Color.RED);
				    	k++;
				    	} else wnemailcn.setText("");
				    	if(tftcncn.getText().isEmpty()) 
				    	{
				    	wnqqcn.setText("Bạn Chưa Nhập Quê Quán!!!");
				    	wnqqcn.setForeground(Color.RED);
				    	k++;
				    	} else wnqqcn.setText("");
				    	if(tftcncn.getText().isEmpty()) 
				    	{
				    	wncncn.setText("Bạn Chưa Nhập Chuyên Ngành!!!");
				    	wncncn.setForeground(Color.RED);
				    	k++;
				    	} else wncncn.setText("");
				    	if(tftdcn.getText().isEmpty()) 
				    	{
				    	wntdcn.setText("Bạn Chưa Nhập Trình Độ!!!");
				    	wntdcn.setForeground(Color.RED);
				    	k++;
				    	} else wntdcn.setText("");
				    	if(tfdvct.getText().isEmpty()) 
				    	{
				    	wndvct.setText("Bạn Chưa Nhập Đơn Vị Công Tác!!!");
				    	wndvct.setForeground(Color.RED);
				    	k++;
				    	} else wndvct.setText("");
				    	
				    if(k==0) {				    	
				    	Statement sc = conn.createStatement();
				    	String sql;
						try {							
							sql = "INSERT INTO CHUNHIEM VALUES("
									+ "'"+tfmcn.getText()+"'"+","
									+ "N'"+tftcncn.getText()+"'"+","
									+  gtbit+","
									+ "'"+dateFormat.format(dcnscn.getDate())+"'"+","
									+ "'"+tfsdtcn.getText()+"'"+","
									+ "'"+tfemailcn.getText()+"'"+","
									+ "N'"+tfqqcn.getText()+"'"+","
									+ "N'"+tfcncn.getText()+"'"+","
									+ "N'"+tftdcn.getText()+"'"+","
									+ "N'"+tfdvct.getText()+"'"+")";
							System.out.println(sql);
							int ii=sc.executeUpdate(sql);
							
							JOptionPane.showMessageDialog(null, "Đã Thêm Chủ Nhiệm Thành Công");
							Statement sq = conn.createStatement();
						    String mcncount = "UPDATE CHUCNANGTUDONG SET MChuNhiemSo=MChuNhiemSo+1";
						    int rs = sq.executeUpdate(mcncount);
						    
						    MaChuNhiemso++;
							tfmcn.setText("0"+MaChuNhiemso);
							tftcncn.setText("");
							cbgtcn.setSelectedIndex(0);
							tfsdtcn.setText("");
							tfemailcn.setText("");
							tfqqcn.setText("");
							tfcncn.setText("");
							tftdcn.setText("");
							tfdvct.setText("");
				    
						    wntcncn.setText("");
						    wngtcn.setText("");
						    wnnscn.setText("");
						    wnsdtcn.setText("");
						    wnemailcn.setText("");
						    wnqqcn.setText("");
						    wncncn.setText("");
						    wntdcn.setText("");
						    wndvct.setText("");						    
						}  catch (SQLException b) {
							// TODO Auto-generated catch block
							b.printStackTrace();							
						}				    
				    } else {
				    	k = 0;
				    }       
			    }
		  catch (SQLException eeee) {
					// TODO Auto-generated catch block
					eeee.printStackTrace();
				}				
			}
	});
		
    btlmcn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tfmcn.setText("0"+MaChuNhiemso);
			tftcncn.setText("");
			cbgtcn.setSelectedIndex(0);
			tfsdtcn.setText("");
			tfemailcn.setText("");
			tfqqcn.setText("");
			tfcncn.setText("");
			tftdcn.setText("");
			tfdvct.setText("");
			
		    wntcncn.setText("");
		    wngtcn.setText("");
		    wnnscn.setText("");
		    wnsdtcn.setText("");
		    wnemailcn.setText("");
		    wnqqcn.setText("");
		    wncncn.setText("");
		    wntdcn.setText("");
		    wndvct.setText("");		
		} 	
    });
		tfmcn.setBackground(Color.GRAY);
	}

	public void TrangDanhSachChuNhiem() {
		CenterContent.setLayout(new GridLayout(2,1));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Danh Sách Chủ Nhiệm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DefaultTableModel dModelcn = new DefaultTableModel();
		
		JPanel row1dscn = new JPanel();
		row1dscn.setLayout(new GridLayout(1,4));
		
		JPanel row1dscncol1 = new JPanel();
		row1dscncol1.setLayout(new GridLayout(7,0,0,15));
		row1dscncol1.setBackground(Color.CYAN);
		row1dscncol1.add(lbmcn);
		row1dscncol1.add(lbtcn);
		row1dscncol1.add(lbnscn);
		row1dscncol1.add(lbgtcn);
		row1dscncol1.add(lbsdtcn);
		row1dscncol1.add(lbemailcn);		
		
		row1dscn.add(row1dscncol1);
		
		JPanel row1dscncol2 = new JPanel();
		row1dscncol2.setLayout(new GridLayout(7,0,0,15));
		row1dscncol2.setBackground(Color.CYAN);
		row1dscncol2.add(tfmcn);
		row1dscncol2.add(tftcncn);
		row1dscncol2.add(tfnscn);
		row1dscncol2.add(cbgtcn);
		row1dscncol2.add(tfsdtcn);
		row1dscncol2.add(tfemailcn);
		row1dscn.add(row1dscncol2);
		JPanel row1dscncol3 = new JPanel();
		row1dscncol3.setLayout(new GridLayout(7,0,0,15));
		row1dscncol3.setBackground(Color.CYAN);
		row1dscncol3.add(lbqqcn);
		row1dscncol3.add(lbcncn);
		row1dscncol3.add(lbtdcn);
		row1dscncol3.add(lbdvct);
		row1dscn.add(row1dscncol3);
		
		JPanel row1dscncol4 = new JPanel();
		row1dscncol4.setLayout(new GridLayout(7,0,0,15));
		row1dscncol4.setBackground(Color.CYAN);
		row1dscncol4.add(tfqqcn);
		row1dscncol4.add(tfcncn);
		row1dscncol4.add(tftdcn);
		row1dscncol4.add(tfdvct);
		row1dscn.add(row1dscncol4);
		
		JPanel row2dscn = new JPanel();
		row2dscn.setLayout(new BoxLayout(row2dscn,BoxLayout.Y_AXIS));
		
		CenterContent.add(row1dscn);	
		CenterContent.add(row2dscn);
		
		dModelcn.addColumn("Mã Chủ Nhiệm");
		dModelcn.addColumn("Tên Chủ Nhiệm");
		dModelcn.addColumn("Giới Tính");
		dModelcn.addColumn("Ngày Sinh");
		dModelcn.addColumn("Số Điện Thoại");
		dModelcn.addColumn("Email");
		dModelcn.addColumn("Quê Quán");
		dModelcn.addColumn("Chuyên Ngành");
		dModelcn.addColumn("Trình Độ");
		dModelcn.addColumn("Đơn Vị Công Tác");
			
		JTable tabledscn = new JTable(dModelcn);
		tabledscn.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		tabledscn.setBackground(Color.WHITE);
		JScrollPane sccn =new JScrollPane(tabledscn, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sccn.setBackground(Color.WHITE);
		row2dscn.add(sccn);
		tabledscn.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			
		tfmcn.setText("0"+MaChuNhiemso);
		tftcncn.setText("");
		cbgtcn.setSelectedIndex(0);
		tfsdtcn.setText("");
		tfemailcn.setText("");
		tfqqcn.setText("");
		tfcncn.setText("");
		tftdcn.setText("");
		tfdvct.setText("");
  
	    wntcncn.setText("");
	    wngtcn.setText("");
	    wnnscn.setText("");
	    wnsdtcn.setText("");
	    wnemailcn.setText("");
	    wnqqcn.setText("");
	    wncncn.setText("");
	    wntdcn.setText("");
	    wndvct.setText("");	    
		try {
		Statement s = conn.createStatement();	    
		String sql = "SELECT * FROM CHUNHIEM";
	    ResultSet rs = s.executeQuery(sql);	    
	    while(rs.next()) {
	    	String a = "";	    	
	    	if(rs.getString(3).equals("1")) {
	    		a = "Nữ";
	    	} else if(rs.getString(3).equals("0")){
	    		a = "Nam";
	    	}
	    	dModelcn.addRow(new String[] { rs.getString(1),rs.getString(2),a,
					rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
					rs.getString(8),rs.getString(9),rs.getString(10)
			});
		}  
    }        
	 catch (SQLException eeee) {
		// TODO Auto-generated catch block
		eeee.printStackTrace();
	}
		tabledscn.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int row = tabledscn.getSelectedRow();
				tfmcn.setText((String)tabledscn.getValueAt(row,0));
				tftcncn.setText((String)tabledscn.getValueAt(row,1));
				tfnscn.setText((String)tabledscn.getValueAt(row,3));
				cbgtcn.setSelectedItem((String)tabledscn.getValueAt(row,2));
				tfsdtcn.setText((String)tabledscn.getValueAt(row,4));
				tfemailcn.setText((String)tabledscn.getValueAt(row,5));
				tfqqcn.setText((String)tabledscn.getValueAt(row,6));
				tfcncn.setText((String)tabledscn.getValueAt(row,7));
				tftdcn.setText((String)tabledscn.getValueAt(row,8));
				tfdvct.setText((String)tabledscn.getValueAt(row,9));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {								
			}
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {	
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {	
			}		
		 });
		JButton bteditcn = new JButton("Sửa Chủ Nhiệm");
		bteditcn.setForeground(Color.WHITE);
		bteditcn.setBackground(Color.ORANGE);
		bteditcn.setFocusPainted(false);
		CenterSouth.add(bteditcn);
		
		JButton btdeletecn = new JButton("Xóa Chủ Nhiệm");
		btdeletecn.setBackground(Color.BLUE);
		btdeletecn.setForeground(Color.WHITE);
		btdeletecn.setFocusPainted(false);
		CenterSouth.add(btdeletecn);
		
		btexit.setBackground(Color.PINK);
		btexit.setForeground(Color.WHITE);
		btexit.setFocusPainted(false);
		CenterSouth.add(btexit);
			
		bteditcn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 int k = 0;		    
			    	if(tftcncn.getText().isEmpty()) 
			    	{
			    	wntcncn.setText("Bạn Chưa Nhập Họ Tên!!!");
			    	wntcncn.setForeground(Color.RED);
			    	k++;
			    	} else wntcncn.setText("");
			    	
			    	gttext = cbgtcn.getSelectedItem().toString();
			    	if(gttext == "-Lựa Chọn-") 
			    	{		    		 
			    	wngtcn.setText("Hãy Lựa Chọn Giới Tính!!!");
			    	wngtcn.setForeground(Color.RED);
			    	k++;			    	
			    	} else { System.out.println(gttext);
			    		wngtcn.setText("");
			    	}
			    	String nscn = null;			    	
			    	if(tfnscn.getText().isEmpty()) 
			    	{			    	
			    	k++;
			    	}			    				    	
			    	if(tfsdtcn.getText().isEmpty()) 
			    	{
			    	wnsdtcn.setText("Bạn Chưa Nhập Số Điện Thoại!!!");
			    	wnsdtcn.setForeground(Color.RED);
			    	k++;
			    	} else wnsdtcn.setText("");
			    	if(tfemailcn.getText().isEmpty()) 
			    	{
			    	wnemailcn.setText("Bạn Chưa Nhập Email!!!");
			    	wnemailcn.setForeground(Color.RED);
			    	k++;
			    	} else wnemailcn.setText("");
			    	if(tfqqcn.getText().isEmpty()) 
			    	{
			    	wnqqcn.setText("Bạn Chưa Nhập Quê Quán!!!");
			    	wnqqcn.setForeground(Color.RED);
			    	k++;
			    	} else wnqqcn.setText("");
			    	if(tftcncn.getText().isEmpty()) 
			    	{
			    	wncncn.setText("Bạn Chưa Nhập Chuyên Ngành!!!");
			    	wncncn.setForeground(Color.RED);
			    	k++;
			    	} else wncncn.setText("");
			    	if(tftdcn.getText().isEmpty()) 
			    	{
			    	wntdcn.setText("Bạn Chưa Nhập Trình Độ!!!");
			    	wntdcn.setForeground(Color.RED);
			    	k++;
			    	} else wntdcn.setText("");
			    	if(tfdvct.getText().isEmpty()) 
			    	{
			    	wndvct.setText("Bạn Chưa Nhập Đơn Vị Công Tác!!!");
			    	wndvct.setForeground(Color.RED);
			    	k++;
			    	} else wndvct.setText("");
				
				if(k==0) {
					try {
						int gtcnkq = 0;
						if(cbgtcn.getSelectedItem().toString().equals("Nam")) {
							gtcnkq = 0;
						}
						if(cbgtcn.getSelectedItem().toString().equals("Nữ")) {
							gtcnkq = 1;
						}
						Statement s = conn.createStatement();
							String insert = "UPDATE CHUNHIEM SET "+
									" MaChuNhiem="+"'" +tfmcn.getText()+"'"+ ","+
									" TenChuNhiem="+"N'" +tftcncn.getText()+"'"+ ","+
									" GioiTinh="+gtcnkq+ ","+
								
									" NgaySinh ="+"N'" +
									tfnscn.getText()+"'"+ ","+
									" SoDienThoai="+"N'" +tfsdtcn.getText()+"'"+ ","+
									" Email="+"N'" +tfemailcn.getText()+"'"+ ","+
									" QueQuan="+"N'" +tfqqcn.getText()+"'"+ ","+
									" ChuyenNganh="+"N'" +tfcncn.getText() +"'"+ ","+
									" TrinhDo="+"N'" +tftdcn.getText()+"'"+ ","+
									" DonViCongTac="+"N'" +tfdvct.getText()+"'"+"WHERE MACHUNHIEM =" +"'"+ tfmcn.getText()+"'";								
							int r = s.executeUpdate(insert);    
					} catch (SQLException ee) {
						// TODO Auto-generated catch block
						ee.printStackTrace();
					}
					int row = tabledscn.getSelectedRow();
					
					dModelcn.setValueAt(tfmcn.getText(), row, 0);
					dModelcn.setValueAt(tftcncn.getText(), row, 1);
					dModelcn.setValueAt(cbgtcn.getSelectedItem().toString(), row, 2);
					dModelcn.setValueAt(tfnscn.getText(), row, 3);
					dModelcn.setValueAt(tfsdtcn.getText(), row, 4);
					dModelcn.setValueAt(tfemailcn.getText(), row, 5);
					dModelcn.setValueAt(tfqqcn.getText(), row, 6);
					dModelcn.setValueAt(tfcncn.getText(), row, 7);
					dModelcn.setValueAt(tftdcn.getText(), row, 8);
					dModelcn.setValueAt(tfdvct.getText(), row, 9);
					
					JOptionPane.showMessageDialog(null,"Bạn đã cập nhật thành công");
					
				}else {
					JOptionPane.showMessageDialog(null,"Bạn đã nhập sai hoặc thiếu thông tin");
				}		
				k=0;			
				setVisible(true); 				
			}			
		 });
		
		btdeletecn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				try {			
					Statement s = conn.createStatement();
					String insert = "DELETE FROM DETAI WHERE MaChuNhiem="+"'"+ tfmcn.getText()+"'"
							+ " DELETE FROM CHUNHIEM WHERE MaChuNhiem=" + tfmcn.getText();		
					int output = JOptionPane.showConfirmDialog(null, 
	                        "Bạn có chắc muốn xóa chủ nhiệm "+tftcn.getText(),"Thông Báo",
	                        JOptionPane.YES_NO_OPTION);
	                if (output == JOptionPane.YES_OPTION) {
	                	dModelcn.removeRow(tabledscn.getSelectedRow());
	                	int r = s.executeUpdate(insert);
	                	JOptionPane.showMessageDialog(null,"Đã Xóa Chủ Nhiệm "+tftcn.getText());
	                } else if (output == JOptionPane.NO_OPTION) {           	
	                }
				} catch (SQLException ete) {
				// TODO Auto-generated catch block
				ete.printStackTrace();
			}				
			}			
		});		
	}
	
	public void ThongKeDeTaiChuaDuyet() {	
		CenterContent.setLayout(new GridLayout(2, 1, 0, 0));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Thống Kê Đề Tài Chưa Duyệt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel row1tkdtdd = new JPanel();
		row1tkdtdd.setBackground(Color.CYAN);
		row1tkdtdd.setLayout(new BorderLayout());
		CenterContent.add(row1tkdtdd);
	
		JPanel row1tkdtddbottom = new JPanel();
		row1tkdtddbottom.setBorder(new LineBorder(Color.BLACK, 2));
		row1tkdtddbottom.setBackground(Color.CYAN);	
		row1tkdtdd.add(row1tkdtddbottom,BorderLayout.SOUTH);
		row1tkdtddbottom.setLayout(new BorderLayout(0, 0));	
		panel_29 = new JPanel();
		panel_29.setBackground(Color.CYAN);
		row1tkdtddbottom.add(panel_29, BorderLayout.EAST);
		
		JButton btlmdtt = new JButton("Làm Mới");
		btlmdtt.setForeground(Color.WHITE);
		btlmdtt.setBackground(Color.BLACK);
		panel_29.add(btlmdtt);
		
		JButton btddt = new JButton("Xác Nhận");
		btddt.setForeground(Color.WHITE);
		btddt.setBackground(Color.BLACK);
		panel_29.add(btddt);

		JPanel row1tkdtddcenter = new JPanel();
		row1tkdtddcenter.setLayout(new GridLayout(1, 4, 0, 0));
		row1tkdtdd.add(row1tkdtddcenter,BorderLayout.CENTER);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_22);
		panel_22.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmdt2 = new JLabel("Mã Đề Tài");
		panel_22.add(lbmdt2);
		
		JLabel lbtdt2 = new JLabel("Tên Đề Tài");
		panel_22.add(lbtdt2);
		
		JLabel lbnth2 = new JLabel("Người Thực Hiện");
		panel_22.add(lbnth2);
		
		JLabel lbnbd2 = new JLabel("Ngày Bắt Đầu");
		panel_22.add(lbnbd2);
		
		JLabel lbnhh2 = new JLabel("Ngày Kết Thúc");
		panel_22.add(lbnhh2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmdt = new JLabel("");
		panel_23.add(lbkqmdt);
		
		JLabel lbkqtdt = new JLabel("");
		panel_23.add(lbkqtdt);
		
		JLabel lbkqnth = new JLabel("");
		panel_23.add(lbkqnth);
		
		JLabel lbkqnbd = new JLabel("");
		panel_23.add(lbkqnbd);
		
		JLabel lbkqnhh = new JLabel("");
		panel_23.add(lbkqnhh);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_24);
		panel_24.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmcn2 = new JLabel("Mã Chủ Nhiệm");
		panel_24.add(lbmcn2);
		
		JLabel lbtcn2 = new JLabel("Tên Chủ Nhiệm");
		panel_24.add(lbtcn2);
		
		JLabel lbcqct2 = new JLabel("Cơ Quan Chủ Trì");
		panel_24.add(lbcqct2);
		
		JLabel lbkpth2 = new JLabel("Kinh Phí Thực Hiện");
		panel_24.add(lbkpth2);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_28);
		panel_28.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmcn = new JLabel("");
		panel_28.add(lbkqmcn);
		
		JLabel lbkqtcn = new JLabel("");
		panel_28.add(lbkqtcn);
		
		JLabel lbkqcqct = new JLabel("");
		panel_28.add(lbkqcqct);
		
		JLabel lbkqkpth = new JLabel("");
		panel_28.add(lbkqkpth);
		
		JPanel ddtnork = new JPanel();
		ddtnork.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		ddtnork.setBackground(Color.CYAN);
		row1tkdtdd.add(ddtnork, BorderLayout.NORTH);
		
		
		
		JPanel row2ttdtcd = new JPanel();
		row2ttdtcd.setBackground(Color.CYAN);
		CenterContent.add(row2ttdtcd);
		
		DefaultTableModel dModel = new DefaultTableModel();
		dModel.addColumn("Mã Đề Tài");
		dModel.addColumn("Tên Đề Tài");
		dModel.addColumn("Mã Chủ Nhiệm");
		dModel.addColumn("Tên Chủ Nhiệm");
		dModel.addColumn("Tên Nhà Khoa Học");
		dModel.addColumn("Cấp Đề Tài");
		dModel.addColumn("Cơ Quan Chủ Trì");
		dModel.addColumn("Kinh Phí");
		dModel.addColumn("Ngày Bắt Đầu");
		dModel.addColumn("Ngày Kết Thúc");
		dModel.addColumn("Lĩnh Vực");
		dModel.addColumn("Loại Sản Phẩm");
		dModel.addColumn("Trích Yếu Nội Dung");
		dModel.addColumn("Trạng Thái");
		row2ttdtcd.setLayout(new BoxLayout(row2ttdtcd, BoxLayout.Y_AXIS));		
		
		JTable tabletkdtdd = new JTable(dModel);
		
		JTextField tfsearchtdt = new JTextField();
		TableRowSorter<TableModel> rowSorter
        = new TableRowSorter<>(tabletkdtdd.getModel());
		tabletkdtdd.setRowSorter(rowSorter);

	    tfsearchtdt.getDocument().addDocumentListener(new DocumentListener(){       
            @Override
            public void insertUpdate(DocumentEvent e) {
            	tfsearchtdt.setForeground(Color.BLACK);
                String text = tfsearchtdt.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }             
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfsearchtdt.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
	    ddtnork.setLayout(new BorderLayout(0, 0));
	    
	    JPanel pnsearchtdt = new JPanel();
	    pnsearchtdt.setBackground(Color.CYAN);
	    pnsearchtdt.setBorder(new LineBorder(Color.YELLOW,5,true));
	    pnsearchtdt.setLayout(new GridLayout(0,2));
	    JLabel lbsearchtdt = new JLabel("Tìm kiếm theo tên đề tài");
	    pnsearchtdt.add(lbsearchtdt);
	    pnsearchtdt.add(tfsearchtdt);
	    ddtnork.add(pnsearchtdt,BorderLayout.EAST);	    
	
		tabletkdtdd.setGridColor(Color.WHITE);
		tabletkdtdd.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		tabletkdtdd.setBackground(Color.WHITE);
		JScrollPane sck =new JScrollPane(tabletkdtdd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sck.setBackground(Color.WHITE);		
		tabletkdtdd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		row2ttdtcd.add(sck);
		
		tabletkdtdd.addMouseListener(new MouseListener() {
			@Override			
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int row = tabletkdtdd.getSelectedRow();
				lbkqmdt.setText((String)tabletkdtdd.getValueAt(row,0));
				lbkqtdt.setText((String)tabletkdtdd.getValueAt(row,1));
				lbkqnth.setText((String)tabletkdtdd.getValueAt(row,4));
				lbkqnbd.setText((String)tabletkdtdd.getValueAt(row,8));
				lbkqnhh.setText((String)tabletkdtdd.getValueAt(row,9));
				lbkqmcn.setText((String)tabletkdtdd.getValueAt(row,2));
				lbkqtcn.setText((String)tabletkdtdd.getValueAt(row,3));
				lbkqcqct.setText((String)tabletkdtdd.getValueAt(row,6));
				lbkqkpth.setText((String)tabletkdtdd.getValueAt(row,7));
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {		
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {	
			}		
		 });	
		try {
			Statement s = conn.createStatement();
			sql = "SELECT MADETAI,TENDETAI,d.MACHUNHIEM,TENCHUNHIEM,SVNC,CAPDETAI,COQUANCHUTRI,\r\n"
					+ "KINHPHITHUCHIEN,NGAYBATDAU,NGAYHETHAN,LINHVUC,LOAISANPHAM,TRICHYEUNOIDUNG,\r\n"
					+ " (CASE TINHTRANG WHEN 0 THEN N'Chưa Duyệt'\r\n"
					+ "ELSE N'Đã Duyệt' END) AS TINHTRANG\r\n"
					+ "FROM DETAI D INNER JOIN CHUNHIEM C ON D.MACHUNHIEM =C.MACHUNHIEM"
					+" WHERE TINHTRANG = 0";
		    ResultSet rs = s.executeQuery(sql);
		    
		    while(rs.next()) {
		    	dModel.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)
						,rs.getString(13),rs.getString(14)
				});
			} 
	    } catch (SQLException eeee) {
			eeee.printStackTrace();
		}
		
		btddt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {	
		        	 int row = tabletkdtdd.getSelectedRow(); 	
		        	 if(row != -1) {
							Statement s = conn.createStatement();
							String insert = "UPDATE DETAI SET TINHTRANG=" + "'"+"1"+"'"+",NGAYDUYET="+"GETDATE()"+ " WHERE MADETAI= '"+(String) tabletkdtdd.getModel().getValueAt(row, 0)+"'";
							System.out.println(insert);
							int output = JOptionPane.showConfirmDialog(null, 
			                        "Bạn có chắc muốn duyệt đề tài này? "+tftdt.getText(),"Thông Báo",
			                        JOptionPane.YES_NO_OPTION);
			                if (output == JOptionPane.YES_OPTION) {
			                	String trangthai = (String) tabletkdtdd.getModel().getValueAt(row, 13);
			                	if(trangthai.equals("Chưa Duyệt")) {
			                		int r = s.executeUpdate(insert);
				                	JOptionPane.showMessageDialog(null,"Đã Duyệt Đề Tài ");
				                	dModel.removeRow(row);
			                	} else {
			                		JOptionPane.showMessageDialog(null,"Đề Tài Này Đã Được Duyệt Rồi!! ");
			                	}	                	
			                } else if (output == JOptionPane.NO_OPTION) {		                    
			                }
			                tabletkdtdd.setVisible(true);			
		        	 } else {
		        		 JOptionPane.showMessageDialog(null,"Vui Lòng Chọn Đề Tài Để Duyệt! ");
		        	 }			        
					} catch (SQLException ete) {
						// TODO Auto-generated catch block
						ete.printStackTrace();
					}					
			}			
		});
	}
	
	public void ThongKeDeTaiDaDuyet() {
	CenterContent.setLayout(new GridLayout(2, 1, 0, 0));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Thống Kê Đề Tài Đã Duyệt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	
		JPanel row1tkdtdd = new JPanel();
		row1tkdtdd.setBackground(Color.CYAN);
		row1tkdtdd.setLayout(new BorderLayout());
		CenterContent.add(row1tkdtdd);
		
		JPanel row1tkdtddbottom = new JPanel();
		row1tkdtddbottom.setBorder(new LineBorder(Color.BLACK, 2));
		row1tkdtddbottom.setBackground(Color.CYAN);	
		row1tkdtdd.add(row1tkdtddbottom,BorderLayout.SOUTH);
		row1tkdtddbottom.setLayout(new BorderLayout());
		
		panel_29 = new JPanel();
		panel_29.setBackground(Color.CYAN);
		row1tkdtddbottom.add(panel_29, BorderLayout.EAST);
		
		JButton btlmdtt = new JButton("Làm Mới");
		btlmdtt.setForeground(Color.WHITE);
		btlmdtt.setBackground(Color.BLACK);
		panel_29.add(btlmdtt);
		
		JButton btcntd = new JButton("Cập Nhập Tiến Độ");
		btcntd.setForeground(Color.WHITE);
		btcntd.setBackground(Color.BLACK);
		panel_29.add(btcntd);

		JPanel row1tkdtddcenter = new JPanel();
		row1tkdtddcenter.setLayout(new GridLayout(1, 4, 0, 0));
		row1tkdtdd.add(row1tkdtddcenter,BorderLayout.CENTER);

		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_22);
		panel_22.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmdt2 = new JLabel("Mã Đề Tài");
		panel_22.add(lbmdt2);
		
		JLabel lbtdt2 = new JLabel("Tên Đề Tài");
		panel_22.add(lbtdt2);
		
		JLabel lbnth2 = new JLabel("Người Thực Hiện");
		panel_22.add(lbnth2);
		
		JLabel lbnbd2 = new JLabel("Ngày Bắt Đầu");
		panel_22.add(lbnbd2);
		
		JLabel lbnhh2 = new JLabel("Ngày Kết Thúc");
		panel_22.add(lbnhh2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmdt = new JLabel("");
		panel_23.add(lbkqmdt);
		
		JLabel lbkqtdt = new JLabel("");
		panel_23.add(lbkqtdt);
		
		JLabel lbkqnth = new JLabel("");
		panel_23.add(lbkqnth);
		
		JLabel lbkqnbd = new JLabel("");
		panel_23.add(lbkqnbd);
		
		JLabel lbkqnhh = new JLabel("");
		panel_23.add(lbkqnhh);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_24);
		panel_24.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmcn2 = new JLabel("Mã Chủ Nhiệm");
		panel_24.add(lbmcn2);
		
		JLabel lbtcn2 = new JLabel("Tên Chủ Nhiệm");
		panel_24.add(lbtcn2);
		
		JLabel lbcqct2 = new JLabel("Cơ Quan Chủ Trì");
		panel_24.add(lbcqct2);
		
		JLabel lbkpth2 = new JLabel("Kinh Phí Thực Hiện");
		panel_24.add(lbkpth2);
		
		JLabel lbnddt = new JLabel("Ngày Duyệt Đề Tài");
		panel_24.add(lbnddt);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_28);
		panel_28.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmcn = new JLabel("");
		panel_28.add(lbkqmcn);
		
		JLabel lbkqtcn = new JLabel("");
		panel_28.add(lbkqtcn);
		
		JLabel lbkqcqct = new JLabel("");
		panel_28.add(lbkqcqct);
		
		JLabel lbkqkpth = new JLabel("");
		panel_28.add(lbkqkpth);
		
		JLabel lbkqnddt = new JLabel("");
		panel_28.add(lbkqnddt);

		JComboBox cbcndt = new JComboBox(new String[] {"0","10","20","30","40","50","60","70","80","90","100"});
		panel_28.add(cbcndt);

		JPanel ddtnork = new JPanel();
		ddtnork.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		ddtnork.setBackground(Color.CYAN);
		row1tkdtdd.add(ddtnork, BorderLayout.NORTH);
		
		JPanel row2ttdtcd = new JPanel();
		row2ttdtcd.setBackground(Color.CYAN);
		CenterContent.add(row2ttdtcd);
		
		DefaultTableModel dModel = new DefaultTableModel();
		dModel.addColumn("Mã Đề Tài");
		dModel.addColumn("Tên Đề Tài");
		dModel.addColumn("Mã Chủ Nhiệm");
		dModel.addColumn("Tên Chủ Nhiệm");
		dModel.addColumn("Tên Nhà Khoa Học");
		dModel.addColumn("Cấp Đề Tài");
		dModel.addColumn("Cơ Quan Chủ Trì");
		dModel.addColumn("Kinh Phí");
		dModel.addColumn("Ngày Bắt Đầu");
		dModel.addColumn("Ngày Kết Thúc");
		dModel.addColumn("Lĩnh Vực");
		dModel.addColumn("Loại Sản Phẩm");
		dModel.addColumn("Trích Yếu Nội Dung");
		dModel.addColumn("Tiến Độ");
		dModel.addColumn("Ngày Duyệt");
		row2ttdtcd.setLayout(new BoxLayout(row2ttdtcd, BoxLayout.Y_AXIS));
		
		JTable tabletkdtdd = new JTable(dModel);
		TableRowSorter<TableModel> rowSorter
        = new TableRowSorter<>(tabletkdtdd.getModel());
		tabletkdtdd.setRowSorter(rowSorter);
		JTextField tfsearchtdt = new JTextField();
		
	    tfsearchtdt.getDocument().addDocumentListener(new DocumentListener(){     
            @Override
            public void insertUpdate(DocumentEvent e) {
            	tfsearchtdt.setForeground(Color.BLACK);
                String text = tfsearchtdt.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }
           }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfsearchtdt.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter(text,1));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); 
            }
        });
	    ddtnork.setLayout(new BorderLayout(0, 0));
	    JPanel pnsearchtdt = new JPanel();
	    pnsearchtdt.setBackground(Color.CYAN);
	    pnsearchtdt.setBorder(new LineBorder(Color.YELLOW,5,true));
	    pnsearchtdt.setLayout(new GridLayout(0,2));
	    JLabel lbsearchtdt = new JLabel("Tìm kiếm theo tên đề tài");
	    pnsearchtdt.add(lbsearchtdt);
	    pnsearchtdt.add(tfsearchtdt);
	    ddtnork.add(pnsearchtdt,BorderLayout.EAST);	    
	
		tabletkdtdd.setGridColor(Color.WHITE);
		tabletkdtdd.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		tabletkdtdd.setBackground(Color.WHITE);
		JScrollPane sck =new JScrollPane(tabletkdtdd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sck.setBackground(Color.WHITE);
		
		tabletkdtdd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		row2ttdtcd.add(sck);
		
		tabletkdtdd.addMouseListener(new MouseListener() {
			@Override
			
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int row = tabletkdtdd.getSelectedRow();
				lbkqmdt.setText((String)tabletkdtdd.getValueAt(row,0));
				lbkqtdt.setText((String)tabletkdtdd.getValueAt(row,1));
				lbkqnth.setText((String)tabletkdtdd.getValueAt(row,4));
				lbkqnbd.setText((String)tabletkdtdd.getValueAt(row,8));
				lbkqnhh.setText((String)tabletkdtdd.getValueAt(row,9));
				lbkqmcn.setText((String)tabletkdtdd.getValueAt(row,2));
				lbkqtcn.setText((String)tabletkdtdd.getValueAt(row,3));
				lbkqcqct.setText((String)tabletkdtdd.getValueAt(row,6));
				lbkqkpth.setText((String)tabletkdtdd.getValueAt(row,7));
				cbcndt.setSelectedItem((String)tabletkdtdd.getValueAt(row,13));
				lbkqnddt.setText((String)tabletkdtdd.getValueAt(row,14));	
			}
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				}		
		 });
		try {
			Statement s = conn.createStatement();
			sql = "SELECT MADETAI,TENDETAI,d.MACHUNHIEM,TENCHUNHIEM,SVNC,CAPDETAI,COQUANCHUTRI,\r\n"
					+ "KINHPHITHUCHIEN,NGAYBATDAU,NGAYHETHAN,LINHVUC,LOAISANPHAM,TRICHYEUNOIDUNG,\r\n"
					+ " TIENDO,NGAYDUYET\r\n"
					+ "FROM DETAI D INNER JOIN CHUNHIEM C ON D.MACHUNHIEM =C.MACHUNHIEM"
					+" WHERE TINHTRANG = 1";
		    ResultSet rs = s.executeQuery(sql);
		    //(CASE TINHTRANG WHEN 0 THEN N'Chưa Duyệt'\r\n"
			//+ "ELSE N'Đã Duyệt' END) AS TINHTRANG
		    while(rs.next()) {
		    	dModel.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8) + "đ",rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)
						,rs.getString(13),rs.getString(14),rs.getString(15)
				});
			}
		} catch (SQLException eeee) {
			// TODO Auto-generated catch block
			eeee.printStackTrace();
		}
		btcntd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {				
					int row = tabletkdtdd.getSelectedRow();				
					if(row != -1) {
					Statement s = conn.createStatement();			    
					sql = "UPDATE DETAI SET TIENDO = " +"'"+cbcndt.getSelectedItem().toString()+"'"
							+" WHERE MADETAI =" +"'"+lbkqmdt.getText()+"'";
				    int rs = s.executeUpdate(sql);
				    int x = Integer.parseInt(cbcndt.getSelectedItem().toString());
				    if( x == 100) {
				    	JOptionPane.showMessageDialog(null,"Đề Tài Này Đã Được Hoàn Thành!! ");
				    	dModel.removeRow(row);			    				    	
				    } else if(x != 0){
				    	JOptionPane.showMessageDialog(null,"Cập Nhật Tiến Độ Thành Công ");
				    	dModel.setValueAt(cbcndt.getSelectedItem().toString(), row, 13);			    	
				    }
					} else {
						JOptionPane.showMessageDialog(null,"Vui Lòng Chọn Dòng Để Cập Nhật Tiến Độ!! ");
					}
					setVisible(true);			   
			    } catch (SQLException eeee) {
					eeee.printStackTrace();
				}			
			}
});
	}

	
public void ThongKeDeTaiDaHoanThanh() {
	CenterContent.setLayout(new GridLayout(2, 1, 0, 0));
		CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
	    		"Thống Kê Đề Tài Chưa Duyệt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel row1tkdtdd = new JPanel();
		row1tkdtdd.setBackground(Color.CYAN);
		row1tkdtdd.setLayout(new BorderLayout());
		CenterContent.add(row1tkdtdd);
		
		JPanel row1tkdtddbottom = new JPanel();
		row1tkdtddbottom.setBorder(new LineBorder(Color.BLACK, 2));
		row1tkdtddbottom.setBackground(Color.CYAN);		
		row1tkdtdd.add(row1tkdtddbottom,BorderLayout.SOUTH);
		row1tkdtddbottom.setLayout(new BorderLayout(0, 0));

		JPanel row1tkdtddcenter = new JPanel();
		row1tkdtddcenter.setLayout(new GridLayout(1, 4, 0, 0));
		row1tkdtdd.add(row1tkdtddcenter,BorderLayout.CENTER);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_22);
		panel_22.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmdt2 = new JLabel("Mã Đề Tài");
		panel_22.add(lbmdt2);
		
		JLabel lbtdt2 = new JLabel("Tên Đề Tài");
		panel_22.add(lbtdt2);
		
		JLabel lbnth2 = new JLabel("Người Thực Hiện");
		panel_22.add(lbnth2);
		
		JLabel lbnbd2 = new JLabel("Ngày Bắt Đầu");
		panel_22.add(lbnbd2);
		
		JLabel lbnhh2 = new JLabel("Ngày Kết Thúc");
		panel_22.add(lbnhh2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		panel_23.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_23);
		panel_23.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmdt = new JLabel("");
		panel_23.add(lbkqmdt);
		
		JLabel lbkqtdt = new JLabel("");
		panel_23.add(lbkqtdt);
		
		JLabel lbkqnth = new JLabel("");
		panel_23.add(lbkqnth);
		
		JLabel lbkqnbd = new JLabel("");
		panel_23.add(lbkqnbd);
		
		JLabel lbkqnhh = new JLabel("");
		panel_23.add(lbkqnhh);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_24);
		panel_24.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbmcn2 = new JLabel("Mã Chủ Nhiệm");
		panel_24.add(lbmcn2);
		
		JLabel lbtcn2 = new JLabel("Tên Chủ Nhiệm");
		panel_24.add(lbtcn2);
		
		JLabel lbcqct2 = new JLabel("Cơ Quan Chủ Trì");
		panel_24.add(lbcqct2);
		
		JLabel lbkpth2 = new JLabel("Kinh Phí Thực Hiện");
		panel_24.add(lbkpth2);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.CYAN);
		row1tkdtddcenter.add(panel_28);
		panel_28.setLayout(new GridLayout(6, 1, 0, 7));
		
		JLabel lbkqmcn = new JLabel("");
		panel_28.add(lbkqmcn);
		
		JLabel lbkqtcn = new JLabel("");
		panel_28.add(lbkqtcn);
		
		JLabel lbkqcqct = new JLabel("");
		panel_28.add(lbkqcqct);
		
		JLabel lbkqkpth = new JLabel("");
		panel_28.add(lbkqkpth);
		
		JPanel ddtnork = new JPanel();
		ddtnork.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		ddtnork.setBackground(Color.CYAN);
		row1tkdtdd.add(ddtnork, BorderLayout.NORTH);
	
		JPanel row2ttdtcd = new JPanel();
		row2ttdtcd.setBackground(Color.CYAN);
		CenterContent.add(row2ttdtcd);
		
		DefaultTableModel dModel = new DefaultTableModel();
		dModel.addColumn("Mã Đề Tài");
		dModel.addColumn("Tên Đề Tài");
		dModel.addColumn("Mã Chủ Nhiệm");
		dModel.addColumn("Tên Chủ Nhiệm");
		dModel.addColumn("Tên Nhà Khoa Học");
		dModel.addColumn("Cấp Đề Tài");
		dModel.addColumn("Cơ Quan Chủ Trì");
		dModel.addColumn("Kinh Phí");
		dModel.addColumn("Ngày Bắt Đầu");
		dModel.addColumn("Ngày Kết Thúc");
		dModel.addColumn("Lĩnh Vực");
		dModel.addColumn("Loại Sản Phẩm");
		dModel.addColumn("Trích Yếu Nội Dung");
		dModel.addColumn("Tiến Độ");
		row2ttdtcd.setLayout(new BoxLayout(row2ttdtcd, BoxLayout.Y_AXIS));
		
		JTable tabletkdtdd = new JTable(dModel);
		
		JTextField tfsearchtdt = new JTextField();
		TableRowSorter<TableModel> rowSorter
        = new TableRowSorter<>(tabletkdtdd.getModel());
		tabletkdtdd.setRowSorter(rowSorter);
		tfsearchtdt.getDocument().addDocumentListener(new DocumentListener(){      
            @Override
            public void insertUpdate(DocumentEvent e) {
            	tfsearchtdt.setForeground(Color.BLACK);
                String text = tfsearchtdt.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
           }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfsearchtdt.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        });
		ddtnork.setLayout(new BorderLayout(0, 0));
		JPanel pnsearchtdt = new JPanel();
	    pnsearchtdt.setBackground(Color.CYAN);
	    pnsearchtdt.setBorder(new LineBorder(Color.YELLOW,5,true));
	    pnsearchtdt.setLayout(new GridLayout(0,2));
	    JLabel lbsearchtdt = new JLabel("Tìm kiếm theo tên đề tài");
	    pnsearchtdt.add(lbsearchtdt);
	    pnsearchtdt.add(tfsearchtdt);
	    ddtnork.add(pnsearchtdt,BorderLayout.EAST);
	    tabletkdtdd.setGridColor(Color.WHITE);
		tabletkdtdd.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		tabletkdtdd.setBackground(Color.WHITE);
		JScrollPane sck =new JScrollPane(tabletkdtdd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sck.setBackground(Color.WHITE);
		
		tabletkdtdd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		row2ttdtcd.add(sck);
		
		tabletkdtdd.addMouseListener(new MouseListener() {
			@Override	
			public void mouseClicked(java.awt.event.MouseEvent e) {
				int row = tabletkdtdd.getSelectedRow();

				lbkqmdt.setText((String)tabletkdtdd.getValueAt(row,0));
				lbkqtdt.setText((String)tabletkdtdd.getValueAt(row,1));
				lbkqnth.setText((String)tabletkdtdd.getValueAt(row,4));
				lbkqnbd.setText((String)tabletkdtdd.getValueAt(row,8));
				lbkqnhh.setText((String)tabletkdtdd.getValueAt(row,9));
				lbkqmcn.setText((String)tabletkdtdd.getValueAt(row,2));
				lbkqtcn.setText((String)tabletkdtdd.getValueAt(row,3));
				lbkqcqct.setText((String)tabletkdtdd.getValueAt(row,6));
				lbkqkpth.setText((String)tabletkdtdd.getValueAt(row,7));
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
			}
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
			}
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				}
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				}		
		 });
		try {
			Statement s = conn.createStatement();
			sql = "SELECT MADETAI,TENDETAI,d.MACHUNHIEM,TENCHUNHIEM,SVNC,CAPDETAI,COQUANCHUTRI,\r\n"
					+ "KINHPHITHUCHIEN,NGAYBATDAU,NGAYHETHAN,LINHVUC,LOAISANPHAM,TRICHYEUNOIDUNG,\r\n"
					+ " TIENDO,NGAYDUYET\r\n"
					+ "FROM DETAI D INNER JOIN CHUNHIEM C ON D.MACHUNHIEM =C.MACHUNHIEM"
					+" WHERE TINHTRANG = 1 AND TIENDO = 100";
		    ResultSet rs = s.executeQuery(sql);
		    while(rs.next()) {
		    	dModel.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8) + "đ",rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)
						,rs.getString(13),rs.getString(14)
				});
			}
		} catch (SQLException eeee) {
			// TODO Auto-generated catch block
			eeee.printStackTrace();
		}
	}

public void ThongKeSoLuongDeTaiCuaChuNhiem() {
	CenterContent.setLayout(new GridLayout(2, 1, 0, 0));
	CenterContent.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 6, true),
    		"Thống Kê Số Lượng Đề Tài Chủ Nhiệm Hướng Dẫn", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	
	JLabel lbkqmcn = new JLabel();
	JLabel lbkqtcn = new JLabel();
	JLabel lbkqsdtcn = new JLabel();
	JLabel lbkqemailcn = new JLabel();
	JLabel lbkqcncn = new JLabel();
	JLabel lbkqsldt = new JLabel();
	
	JPanel row1tkdtdd = new JPanel();
	row1tkdtdd.setBackground(Color.CYAN);
	row1tkdtdd.setLayout(new BorderLayout());
	CenterContent.add(row1tkdtdd);
	
	JPanel row1tkdtddbottom = new JPanel();
	row1tkdtddbottom.setBorder(new LineBorder(Color.BLACK, 2));
	row1tkdtddbottom.setBackground(Color.CYAN);
	
	row1tkdtdd.add(row1tkdtddbottom,BorderLayout.SOUTH);
	row1tkdtddbottom.setLayout(new BorderLayout(0, 0));
	
	JPanel row1tkdtddcenter = new JPanel();
	row1tkdtddcenter.setLayout(new GridLayout(1, 2, 0, 0));
	row1tkdtdd.add(row1tkdtddcenter,BorderLayout.CENTER);
	
	JPanel panel_22 = new JPanel();
	panel_22.setBackground(Color.CYAN);
	panel_22.setLayout(new GridLayout(6, 1, 0, 7));
	
	JLabel lbsldt = new JLabel("Số Lượng Đề Tài");
	panel_22.add(lbmcn);
	panel_22.add(lbtcn);
	panel_22.add(lbsdtcn);
	panel_22.add(lbemailcn);
	panel_22.add(lbcncn);
	panel_22.add(lbsldt);
	
	JPanel panel_23 = new JPanel();
	panel_23.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
	panel_23.setBackground(Color.CYAN);
	
	panel_23.setLayout(new GridLayout(6, 1, 0, 7));
	
	panel_23.add(lbkqmcn);
	panel_23.add(lbkqtcn);
	panel_23.add(lbkqsdtcn);
	panel_23.add(lbkqemailcn);
	panel_23.add(lbkqcncn);
	panel_23.add(lbkqsldt);
	
	JPanel pntt = new JPanel();
	pntt.setLayout(new GridLayout(1, 2, 0, 0));
	pntt.add(panel_22);
	pntt.add(panel_23);
	row1tkdtddcenter.add(pntt);
	JPanel pnbang = new JPanel();
	pnbang.setLayout(new BoxLayout(pnbang,BoxLayout.Y_AXIS));
	row1tkdtddcenter.add(pnbang);
	
	DefaultTableModel dModel = new DefaultTableModel();
	dModel.addColumn("Mã Chủ Nhiệm");
	dModel.addColumn("Tên Chủ Nhiệm");
	dModel.addColumn("Số Điện Thoại");
	dModel.addColumn("Email");
	dModel.addColumn("Chuyên ngành");
	dModel.addColumn("Số Lượng Đề Tài Hướng Dẫn");
	JTable tabletkdtdd = new JTable(dModel);

	JPanel ddtnork = new JPanel();
	ddtnork.setBackground(Color.CYAN);
	row1tkdtdd.add(ddtnork, BorderLayout.NORTH);	
	
	JPanel row2ttdtcd = new JPanel();
	row2ttdtcd.setLayout(new GridLayout(1,2));
	row2ttdtcd.setBackground(Color.CYAN);
	CenterContent.add(row2ttdtcd);
	
	DefaultTableModel dModels = new DefaultTableModel();
	dModels.addColumn("Mã Đề Tài");
	dModels.addColumn("Tên Đề Tài");
	dModels.addColumn("Trạng Thái");
	dModels.addColumn("Tiến Độ");
	
JTextField tfsearchtdt = new JTextField(); 
	JTable tables = new JTable(dModels);
	JScrollPane scv =new JScrollPane(tables, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	pnbang.add(scv);
	TableRowSorter<TableModel> rowSorter
    = new TableRowSorter<>(tabletkdtdd.getModel());
	tabletkdtdd.setRowSorter(rowSorter);
    tfsearchtdt.getDocument().addDocumentListener(new DocumentListener(){       
        @Override
        public void insertUpdate(DocumentEvent e) {
        	tfsearchtdt.setForeground(Color.BLACK);
            String text = tfsearchtdt.getText();
            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }    
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            String text = tfsearchtdt.getText();

            if (text.trim().length() == 0) {
                rowSorter.setRowFilter(null);
            } else {
                rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    });

    
    ddtnork.setLayout(new BorderLayout());
    JPanel pnsearchtdt = new JPanel();
    pnsearchtdt.setBackground(Color.CYAN);
    pnsearchtdt.setBorder(new LineBorder(Color.YELLOW,5,true));
    pnsearchtdt.setLayout(new GridLayout(0,2));
    JLabel lbsearchtdt = new JLabel("Tìm kiếm theo tên đề tài");
    pnsearchtdt.add(lbsearchtdt);
    pnsearchtdt.add(tfsearchtdt);
    ddtnork.add(new JLabel(""),BorderLayout.EAST);

	tabletkdtdd.setGridColor(Color.WHITE);
	tabletkdtdd.setFont(new Font("Segoe UI", Font.PLAIN, 10));
	tabletkdtdd.setBackground(Color.WHITE);
	JScrollPane sck =new JScrollPane(tabletkdtdd, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	sck.setBackground(Color.WHITE);
	
	tabletkdtdd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	
	JPanel row2col1 = new JPanel();
	row2col1.add(sck);
	row2col1.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
	row2col1.setLayout(new GridLayout(1,0));
	row2ttdtcd.add(row2col1);
	JPanel row2col2 = new JPanel();
	row2col2.setBackground(Color.CYAN);
	row2col2.setLayout(new GridLayout(0,2));
	JPanel row2col2col1 = new JPanel();
	row2col2col1.setLayout(new GridLayout(6,0,0,20));
	row2col2col1.setBackground(Color.CYAN);
	row2col2col1.add(lbmdt);
	row2col2col1.add(lbtdt);
	JLabel lbttdt = new JLabel("Trạng Thái");
	row2col2col1.add(lbttdt);
	
	JLabel lbtddt = new JLabel("Tiến Độ");
	row2col2col1.add(lbtddt);
	
	row2col2.add(row2col2col1);
	JPanel row2col2col2 = new JPanel();
	row2col2col2.setBackground(Color.CYAN);
	row2col2col2.setLayout(new GridLayout(6,0,0,20));
	row2col2.add(row2col2col2);
	
	JLabel lbkqmdt = new JLabel("");
	JLabel lbkqtdt = new JLabel("");
	JLabel lbkqttdt = new JLabel("");
	JLabel lbkqtddt = new JLabel("");
	row2col2col2.add(lbkqmdt);
	row2col2col2.add(lbkqtdt);
	row2col2col2.add(lbkqttdt);
	row2col2col2.add(lbkqtddt);	
	row2ttdtcd.add(row2col2);
	
	tabletkdtdd.addMouseListener(new MouseListener() {
		@Override	
		public void mouseClicked(java.awt.event.MouseEvent e) {		
			int row = tabletkdtdd.getSelectedRow();
			int rowCount = dModels.getRowCount();
            if( rowCount == 0) {			
			} else {
				
				for (int i = rowCount -1; i >= 0; i--) {
					
				    dModels.removeRow(i);
				}
			}
			lbkqmcn.setText((String)tabletkdtdd.getValueAt(row,0));
			lbkqtcn.setText((String)tabletkdtdd.getValueAt(row,1));
			lbkqsdtcn.setText((String)tabletkdtdd.getValueAt(row,2));
			lbkqemailcn.setText((String)tabletkdtdd.getValueAt(row,3));
			lbkqcncn.setText((String)tabletkdtdd.getValueAt(row,4));
			lbkqsldt.setText((String)tabletkdtdd.getValueAt(row,5));
			try {
				Statement s = conn.createStatement();			   			    
				sql = 
						 "SELECT MADETAI,TENDETAI,(CASE TINHTRANG WHEN 0 THEN N'Chưa Duyệt' \r\n"
						+ "ELSE N'Đã Duyệt' END),(CASE TINHTRANG WHEN 0 THEN 'None' ELSE \r\n"
						+ "CONVERT(VARCHAR,TIENDO)+'%' END)\r\n"
						+ "FROM CHUNHIEM C INNER JOIN DETAI D ON C.MACHUNHIEM = D.MACHUNHIEM WHERE D.MACHUNHIEM ="+ "'"+(String)tabletkdtdd.getValueAt(row,0)+"'" ;
			    ResultSet rs = s.executeQuery(sql);		    
			    while(rs.next()) {
			    	dModels.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
							rs.getString(4)
					});
				}
		    }catch (SQLException eeee) {
				// TODO Auto-generated catch block
				eeee.printStackTrace();
			}
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {		
		}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {		
		}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {		
		}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {		
		}		
	 });

	tables.addMouseListener(new MouseListener() {
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {	
			int row = tables.getSelectedRow();
			lbkqmdt.setText((String)tables.getValueAt(row,0));
			lbkqtdt.setText((String)tables.getValueAt(row,1));
			lbkqttdt.setText((String)tables.getValueAt(row,2));
			lbkqtddt.setText((String)tables.getValueAt(row,3));	
		}

		@Override
		public void mousePressed(MouseEvent e) {	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
	 });
	try {
		Statement s = conn.createStatement();   
		sql = "SELECT CCHA.MACHUNHIEM,TENCHUNHIEM,SODIENTHOAI,EMAIL,CHUYENNGANH,(SELECT COUNT(MADETAI)\r\n"
				+ "FROM DETAI D INNER JOIN CHUNHIEM C ON D.MACHUNHIEM= C.MACHUNHIEM WHERE C.MACHUNHIEM = CCHA.MACHUNHIEM ) AS SOLUONGDETAI\r\n"
				+ "				FROM CHUNHIEM CCHA\r\n"
				+ "				GROUP BY MACHUNHIEM,TENCHUNHIEM,SODIENTHOAI,EMAIL,CHUYENNGANH\r\n"
				+ "ORDER BY SOLUONGDETAI DESC,CONVERT(INT,MACHUNHIEM) ASC";
	    ResultSet rs = s.executeQuery(sql);
	    while(rs.next()) {
	    	dModel.addRow(new String[] { rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getString(4),rs.getString(5),rs.getString(6)
			});
		}
    }catch (SQLException eeee) {
    	eeee.printStackTrace();
	}	
}
}
