import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class FirstFrame1 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField tf_user;
	private JTextField tf_password;
	private JTextField tf_first;
	private JTextField tf_last;
	private JTextField tf_contact;
	private JTextField tf_pass;
	JLayeredPane layeredPane;
	private final JPanel crop_sug = new JPanel();
	private JTextField tf_region;
	private JTextField tf_soilph;
	private JTextField tf_irri;
	private JTextField textField;

static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/Farmers_buddy"; // without database
    // Database credentials
    static final String USER = "root";
    static final String PASS = "harshini_24706";
    private JTextField tf_season;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame1 frame = new FirstFrame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public FirstFrame1() {
		setBackground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 847);
		setSize(1000,600);
		setResizable(false);
		getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 79, 986, 484);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel home_p = new JPanel();
		home_p.setBackground(new Color(255, 255, 255));
		layeredPane.add(home_p, "name_1248776176816100");
		
		JPanel services_p = new JPanel();
		services_p.setBounds(634, 0, 352, 484);
		services_p.setBackground(new Color(255, 255, 255));
		services_p.setLayout(null);
		services_p.setPreferredSize(new Dimension(300, 520));
		
		JLabel services_lb = new JLabel("SERVICES WE PROVIDE");
		services_lb.setForeground(new Color(0, 128, 64));
		services_lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		services_lb.setBounds(40, 35, 214, 30);
		services_p.add(services_lb);
		
		JButton crop_btn = new JButton("CROP SUGGESTION");
		crop_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(crop_sug);
			}
		});
		crop_btn.setForeground(new Color(0, 128, 64));
		crop_btn.setBackground(new Color(255, 255, 255));
		crop_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		crop_btn.setBounds(40, 111, 254, 41);
		services_p.add(crop_btn);
		
		
		JButton back_btn = new JButton("BACK");
		back_btn.setBackground(new Color(255, 255, 255));
		back_btn.setForeground(new Color(0, 128, 64));
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(home_p);
			}
		});
		home_p.setLayout(null);
		
		JLabel welcome_l = new JLabel("WELCOME BUDDYS");
		welcome_l.setForeground(new Color(0, 128, 64));
		welcome_l.setFont(new Font("Tahoma", Font.PLAIN, 22));
		welcome_l.setBounds(44, 99, 198, 42);
		home_p.add(welcome_l);
		
		JLabel text_1 = new JLabel("Farmers Buddy is your ultimate farming companion, providing ");
		text_1.setForeground(new Color(0, 128, 64));
		text_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_1.setBounds(44, 163, 495, 24);
		home_p.add(text_1);
		
		JLabel text_2 = new JLabel("essential guidance for crop management and fertilizer insights. ");
		text_2.setForeground(new Color(0, 128, 64));
		text_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_2.setBounds(44, 186, 508, 24);
		home_p.add(text_2);
		
		JLabel text_3 = new JLabel("With this tool, you can optimize your farming practices, ");
		text_3.setForeground(new Color(0, 128, 64));
		text_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_3.setBounds(44, 210, 444, 24);
		home_p.add(text_3);
		
		JLabel text_4 = new JLabel("from crop selection to precise fertilizer usage, ensuring");
		text_4.setForeground(new Color(0, 128, 64));
		text_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_4.setBounds(44, 235, 444, 24);
		home_p.add(text_4);
		
		JLabel text_5 = new JLabel("better yields and a sustainable future for your farm.");
		text_5.setForeground(new Color(0, 128, 64));
		text_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text_5.setBounds(44, 259, 414, 24);
		home_p.add(text_5);
				
		JPanel user_p = new JPanel();
		user_p.setBackground(new Color(255, 255, 255));
		layeredPane.add(user_p, "name_1248727509582600");
		user_p.setLayout(null);
		
		JPanel login_p = new JPanel();
		login_p.setBackground(new Color(255, 255, 255));
		login_p.setBounds(0, 0, 489, 484);
		user_p.add(login_p);
		login_p.setLayout(null);
		
		JLabel login_l = new JLabel("LOGIN");
		login_l.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login_l.setBounds(218, 29, 66, 22);
		login_p.add(login_l);
		
		JLabel user_l = new JLabel("USERNAME : ");
		user_l.setFont(new Font("Tahoma", Font.PLAIN, 16));
		user_l.setBounds(109, 113, 95, 30);
		login_p.add(user_l);
		
		tf_user = new JTextField();
		tf_user.setBounds(218, 113, 154, 31);
		login_p.add(tf_user);
		tf_user.setColumns(10);
		
		JLabel pass_l = new JLabel("PASSWORD :");
		pass_l.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass_l.setBounds(109, 174, 95, 30);
		login_p.add(pass_l);
		
		tf_password = new JTextField();
		tf_password.setColumns(10);
		tf_password.setBounds(218, 174, 154, 31);
		login_p.add(tf_password);
		
		JButton login_b = new JButton("LOGIN");
		login_b.setForeground(new Color(255, 255, 255));
		login_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tf_user.getText();
				String password = tf_password.getText();
				if (user.isEmpty() && password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Enter valid username and password");
} else {
	Connection conn = null;
        Statement state;
        ResultSet result1;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            state = conn.createStatement();
            String query1; 
            query1 = "SELECT username, password FROM users WHERE username='"+user+"' AND password='"+password+"'";
result1 = state.executeQuery(query1);
if (!result1.next()) {
    JOptionPane.showMessageDialog(null, "Invalid username or password");
} else {
    JOptionPane.showMessageDialog(null, "Welcome Back!");
    switchPanels(services_p);
}}
    catch (Exception et) {
            et.printStackTrace();
        }}}
		});
		login_b.setBackground(new Color(0, 128, 64));
		login_b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		login_b.setBounds(112, 247, 105, 30);
		login_p.add(login_b);
		
		JButton back_home = new JButton("BACK");
		back_home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(home_p);
			}
		});
		back_home.setFont(new Font("Tahoma", Font.PLAIN, 14));
		back_home.setBackground(new Color(192, 192, 192));
		back_home.setBounds(236, 247, 105, 30);
		login_p.add(back_home);
		
		JLabel dont_l = new JLabel("Don't have any account?");
		dont_l.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dont_l.setBounds(77, 320, 179, 30);
		login_p.add(dont_l);
		
		JPanel signup_p = new JPanel();
		signup_p.setBackground(new Color(255, 255, 255));
		signup_p.setBounds(490, 0, 496, 484);
		user_p.add(signup_p);
		signup_p.setLayout(null);

		JButton btnNewButton_1 = new JButton("Join Us");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 128, 64));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(signup_p);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(369, 309, 112, 34);
		home_p.add(btnNewButton_1);
		back_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		back_btn.setBounds(202, 421, 95, 30);
		services_p.add(back_btn);
		layeredPane.add(services_p);
		
		JButton signup_to = new JButton("SIGN - UP");
		signup_to.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(signup_p);
			}
		});
		signup_to.setForeground(new Color(255, 255, 255));
		signup_to.setFont(new Font("Tahoma", Font.PLAIN, 14));
		signup_to.setBackground(new Color(0, 128, 64));
		signup_to.setBounds(267, 320, 105, 30);
		login_p.add(signup_to);
		
		JLabel signup_l = new JLabel("SIGN - UP");
		signup_l.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signup_l.setBounds(202, 26, 89, 25);
		signup_p.add(signup_l);
		
		JLabel first_s = new JLabel("FIRST NAME : ");
		first_s.setFont(new Font("Tahoma", Font.PLAIN, 16));
		first_s.setBounds(115, 114, 105, 25);
		signup_p.add(first_s);
		
		tf_first = new JTextField();
		tf_first.setBounds(239, 112, 157, 32);
		signup_p.add(tf_first);
		tf_first.setColumns(10);
		
		JLabel last_s = new JLabel("LAST NAME : ");
		last_s.setFont(new Font("Tahoma", Font.PLAIN, 16));
		last_s.setBounds(115, 176, 105, 25);
		signup_p.add(last_s);
		
		tf_last = new JTextField();
		tf_last.setColumns(10);
		tf_last.setBounds(239, 174, 157, 32);
		signup_p.add(tf_last);
		
		JLabel contact_s = new JLabel("CONTACT :");
		contact_s.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contact_s.setBounds(126, 232, 94, 25);
		signup_p.add(contact_s);
		
		tf_contact = new JTextField();
		tf_contact.setColumns(10);
		tf_contact.setBounds(239, 230, 157, 32);
		signup_p.add(tf_contact);
		
		JLabel pass_s = new JLabel("PASSWORD :");
		pass_s.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass_s.setBounds(115, 288, 105, 25);
		signup_p.add(pass_s);
		
		tf_pass = new JTextField();
		tf_pass.setColumns(10);
		tf_pass.setBounds(239, 286, 157, 32);
		signup_p.add(tf_pass);
		
		JButton signup_b = new JButton("SIGN-UP");
		signup_b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String first = tf_first.getText();
        String last = tf_last.getText();
        String contact = tf_contact.getText();
        String password = tf_pass.getText();
        String username = first + last;
        if (first.isEmpty() || last.isEmpty() || contact.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all inputs");
        } else {
            Connection conn = null;
            Statement state = null;
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                state = conn.createStatement();
                String query1 = "INSERT INTO users (first_name, last_name, contact, password, username) VALUES('" + first + "','" + last + "','" + contact + "','" + password + "','" + username + "')";
                int rowsAffected = state.executeUpdate(query1);

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "You have successfully registered. Welcome to Farmer's Buddy!");
                    switchPanels(home_p);
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred during registration.");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database driver not found.");
            } finally {
                try {
                    if (state != null) {
                        state.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }}}}
});
		signup_b.setForeground(new Color(255, 255, 255));
		signup_b.setBackground(new Color(0, 128, 64));
		signup_b.setFont(new Font("Tahoma", Font.PLAIN, 14));
		signup_b.setBounds(202, 340, 89, 25);
		signup_p.add(signup_b);
		
		JLabel already_l = new JLabel("Already have an account?");
		already_l.setFont(new Font("Tahoma", Font.PLAIN, 16));
		already_l.setBounds(85, 390, 182, 25);
		signup_p.add(already_l);
		
		JButton login_back = new JButton("LOGIN");
		login_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(login_p);
			}
		});
		login_back.setForeground(new Color(255, 255, 255));
		login_back.setBackground(new Color(0, 128, 64));
		login_back.setFont(new Font("Tahoma", Font.PLAIN, 14));
		login_back.setBounds(282, 390, 105, 28);
		signup_p.add(login_back);
		
		JPanel farmer_p = new JPanel();
		farmer_p.setBackground(new Color(0, 128, 64));
		farmer_p.setBounds(0, 0, 402, 80);
		getContentPane().add(farmer_p);
		farmer_p.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FARMER'S BUDDY");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(56, 26, 164, 31);
		farmer_p.add(lblNewLabel);
		crop_sug.setForeground(new Color(255, 255, 255));
		crop_sug.setBackground(new Color(255, 255, 255));
		crop_sug.setBounds(0, 79, 985, 485);
		layeredPane.add(crop_sug);
		crop_sug.setLayout(null);
		
		JLabel crop_suggestion = new JLabel("CROP SUGGESTION");
		crop_suggestion.setForeground(new Color(0, 128, 64));
		crop_suggestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		crop_suggestion.setBounds(379, 35, 185, 34);
		crop_sug.add(crop_suggestion);
		
		JLabel season_l = new JLabel("SEASON : ");
		season_l.setForeground(new Color(0, 128, 64));
		season_l.setFont(new Font("Tahoma", Font.PLAIN, 18));
		season_l.setBounds(320, 110, 83, 34);
		crop_sug.add(season_l);
		
		JLabel region_l = new JLabel("REGION : ");
		region_l.setForeground(new Color(0, 128, 64));
		region_l.setFont(new Font("Tahoma", Font.PLAIN, 18));
		region_l.setBounds(320, 165, 83, 34);
		crop_sug.add(region_l);
		
		tf_region = new JTextField();
		tf_region.setBounds(420, 168, 179, 31);
		crop_sug.add(tf_region);
		tf_region.setColumns(10);
		
		JLabel soilph_l = new JLabel("SOIL PH :");
		soilph_l.setForeground(new Color(0, 128, 64));
		soilph_l.setFont(new Font("Tahoma", Font.PLAIN, 18));
		soilph_l.setBounds(320, 225, 83, 34);
		crop_sug.add(soilph_l);
		
		tf_soilph = new JTextField();
		tf_soilph.setColumns(10);
		tf_soilph.setBounds(420, 230, 179, 31);
		crop_sug.add(tf_soilph);
		
		JLabel soilph_l_1 = new JLabel("IRRIGATION : ");
		soilph_l_1.setForeground(new Color(0, 128, 64));
		soilph_l_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		soilph_l_1.setBounds(283, 291, 122, 34);
		crop_sug.add(soilph_l_1);
		
		tf_irri = new JTextField();
		tf_irri.setColumns(10);
		tf_irri.setBounds(420, 296, 179, 31);
		crop_sug.add(tf_irri);
		
		tf_season = new JTextField();
		tf_season.setColumns(10);
		tf_season.setBounds(420, 113, 179, 31);
		crop_sug.add(tf_season);
		
		JButton crop_sug_b = new JButton("SUGGEST");
		crop_sug_b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String region = tf_region.getText();
        String soilph = tf_soilph.getText();
        String irrigat = tf_irri.getText();
        double soil_ph = Double.parseDouble(soilph);
        int irrigation = Integer.parseInt(irrigat);
        String season = tf_season.getText();
		        String seasons = season.toUpperCase();
      // Initialize the Statement
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement state = conn.createStatement()) {

            String query;
            if (seasons.equals("KHARIF")) {
                query = "SELECT crop, soil_s FROM season_kharif WHERE District = '" + region
                        + "' AND (soil_s <= '" + soil_ph + "' AND soil_e > '" + (soil_ph + 0.9)
                        + "') AND (irrigation_s <= '" + irrigation + "' AND irrigation_e > '" + (irrigation + 150) + "')";
            } else if (seasons.equals("SUMMER")) {
                query = "SELECT crop, soil_s FROM season_summer WHERE District = '" + region
                        + "' AND (soil_s <= '" + soil_ph + "' AND soil_e > '" + (soil_ph + 0.9)
                        + "') AND (irrigation_s <= '" + irrigation + "' AND irrigation_e > '" + (irrigation + 150) + "')";
            } else if (seasons.equals("PERENNIAL")) {
                query = "SELECT crop, soil_s FROM season_perennial WHERE District = '" + region
                        + "' AND (soil_s <= '" + soil_ph + "' AND soil_e > '" + (soil_ph + 0.9)
                        + "') AND (irrigation_s <= '" + irrigation + "' AND irrigation_e > '" + (irrigation + 150) + "')";
            } else {
                query = "SELECT crop, soil_s FROM season_rabi WHERE District = '" + region
                        + "' AND (soil_s <= '" + soil_ph + "' AND soil_e > '" + (soil_ph + 0.9)
                        + "') AND (irrigation_s <= '" + irrigation + "' AND irrigation_e > '" + (irrigation + 150) + "')";
            }

            try (ResultSet result = state.executeQuery(query)) {
                List<String> crops = new ArrayList<>();
                List<String> soil_phs = new ArrayList<>();
                while (result.next()) {
                    String crop = result.getString("Crop");
                    String soil_s = result.getString("soil_s");
                    if (crop != null && soil_s!=null) {
                        crops.add(crop);
                        soil_phs.add(soil_s);
                    }
                }

                if (!crops.isEmpty()) {
                        StringBuilder cropMessage = new StringBuilder("You can Grow Crops:\n");
                        for (String crop : crops) {
                        	for (String soil_s : soil_phs)
                            cropMessage.append("Crop: ").append(crop).append("| Soil PH : ").append(soil_s).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, cropMessage.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "According to our Statistics, you cannot grow any crop.");
                    }
            }
            catch (SQLException sx) {
            sx.printStackTrace();
        }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
});
		crop_sug_b.setFont(new Font("Tahoma", Font.PLAIN, 16));
		crop_sug_b.setForeground(new Color(255, 255, 255));
		crop_sug_b.setBackground(new Color(0, 128, 64));
		crop_sug_b.setBounds(320, 364, 127, 29);
		crop_sug.add(crop_sug_b);
		
		JButton reset_crop = new JButton("RESET ");
		reset_crop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_region.setText("");
				tf_season.setText("");
				tf_soilph.setText("");
				tf_irri.setText("");
			}
		});
		reset_crop.setForeground(Color.WHITE);
		reset_crop.setFont(new Font("Tahoma", Font.PLAIN, 16));
		reset_crop.setBackground(new Color(0, 128, 64));
		reset_crop.setBounds(457, 364, 127, 29);
		crop_sug.add(reset_crop);
		
		JButton btn_back_1 = new JButton("Back");
		btn_back_1.setBackground(new Color(255, 255, 255));
		btn_back_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(services_p);
			}
		});
		btn_back_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_back_1.setBounds(839, 414, 102, 31);
		crop_sug.add(btn_back_1);
		
		JPanel schemes_p = new JPanel();
		schemes_p.setLayout(null);
		schemes_p.setForeground(Color.WHITE);
		schemes_p.setBackground(Color.WHITE);
		schemes_p.setBounds(0, 0, 986, 484);
		layeredPane.add(schemes_p);
		
		JButton schemes_btn = new JButton("SCHEMES");
		schemes_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(schemes_p);
			}
		});
		schemes_btn.setForeground(new Color(0, 128, 64));
		schemes_btn.setBackground(new Color(255, 255, 255));
		schemes_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		schemes_btn.setBounds(40, 256, 254, 41);
		services_p.add(schemes_btn);
		
		JLabel schemes_lb = new JLabel("SCHEMES FOR FARMERS");
		schemes_lb.setBackground(new Color(255, 255, 255));
		schemes_lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		schemes_lb.setBounds(352, 28, 221, 33);
		schemes_p.add(schemes_lb);
		
		JLayeredPane schemes_layered = new JLayeredPane();
		schemes_layered.setBounds(0, 72, 986, 412);
		schemes_p.add(schemes_layered);
		schemes_layered.setLayout(new CardLayout(0, 0));
		
		JPanel crop_schemes_p = new JPanel();
		crop_schemes_p.setBackground(new Color(255, 255, 255));
		schemes_layered.add(crop_schemes_p, "name_1375951256359700");
		crop_schemes_p.setLayout(null);
		
		JButton scheme_2 = new JButton("AGRI CLINIC AND AGRIBUSINESS CENTRES SCHEME (ACABC SCHEME)");
		scheme_2.setBackground(new Color(255, 255, 255));
		scheme_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_2.setBounds(126, 73, 718, 29);
		crop_schemes_p.add(scheme_2);
		
		JButton scheme_3 = new JButton("FINANCIAL ASSISTANCE SCHEME FOR EXPANDING ETHANOL PRODUCTION IN SUGAR MILLS");
		scheme_3.setBackground(new Color(255, 255, 255));
		scheme_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_3.setBounds(126, 128, 718, 29);
		crop_schemes_p.add(scheme_3);
		
		JButton scheme_4 = new JButton("INTEREST SUBVENTION SCHEME");
		scheme_4.setBackground(new Color(255, 255, 255));
		scheme_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_4.setBounds(126, 179, 718, 29);
		crop_schemes_p.add(scheme_4);
		
		JButton scheme_5 = new JButton("PRADHAN MANTRI KISAN SAMMAN NIDHI (PM-KISAN)");
		scheme_5.setBackground(new Color(255, 255, 255));
		scheme_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_5.setBounds(126, 239, 718, 29);
		crop_schemes_p.add(scheme_5);
		
		JButton scheme_6 = new JButton("FARMER PRODUCER ORGANIZATIONS (FPOs)");
		scheme_6.setBackground(new Color(255, 255, 255));
		scheme_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_6.setBounds(126, 297, 718, 29);
		crop_schemes_p.add(scheme_6);
		
		JButton scheme_7 = new JButton("AGRICULTURE INFRASTRUCTURE FUND (AIF)");
		scheme_7.setBackground(new Color(255, 255, 255));
		scheme_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_7.setBounds(126, 354, 718, 29);
		crop_schemes_p.add(scheme_7);
		
		JPanel scheme_1_p = new JPanel();
		scheme_1_p.setBackground(new Color(255, 255, 255));
		schemes_layered.add(scheme_1_p, "name_1375951272029800");
		scheme_1_p.setLayout(null);
		
		JButton scheme_1 = new JButton("AGRICULTURAL MARKETING INFRASTRUCTURE(AMI) SUB- SCHEME OF (ISAM)");
		scheme_1.setBackground(new Color(255, 255, 255));
		scheme_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(scheme_1_p);
			}
		});
		scheme_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scheme_1.setBounds(126, 23, 718, 29);
		crop_schemes_p.add(scheme_1);
		
		JButton back_to_ser = new JButton("Back");
		back_to_ser.setBackground(new Color(255, 255, 255));
		back_to_ser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(services_p);
			}
		});
		back_to_ser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		back_to_ser.setBounds(864, 359, 89, 23);
		crop_schemes_p.add(back_to_ser);
		
		JLabel lblNewLabel_2 = new JLabel("NEW AGRICULTURAL MARKETING INFRASTRUCTURE(AMI) SUB- SCHEME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(25, 23, 657, 36);
		scheme_1_p.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("OF INTEGRATED SCHEME FOR AGRICULTURAL MARKETING (ISAM)");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(25, 58, 657, 36);
		scheme_1_p.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("The Agricultural Marketing Infrastructure (AMI) sub-scheme of ISAM is being implemented by the Ministry of Agriculture and ");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(25, 119, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Farmers’ Welfare, Government of India.");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(25, 148, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("The AMI sub-scheme of ISAM is applicable for new credit linked projects, where term loan has been sanctioned by eligible");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_1.setBounds(25, 179, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("financial institutions from 22.10.2018 onwards. NABARD is the channelising agency for release of subsidy @ 25% to 33.33%");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_2.setBounds(25, 208, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("of the capital cost for institutions eligible for refinance by NABARD or any other FI such as State Financial Corporations (SFCs) ");
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_2_1.setBounds(25, 239, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_2 = new JLabel(" approved by DAC&FW.");
		lblNewLabel_2_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_2_2.setBounds(25, 270, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_2_2);
		
		JLabel lblNewLabel_2_1_1_1_2_3 = new JLabel("The Ministry of Agriculture & Farmers’ Welfare, Govt. of India, have approved the continuation of AMI sub-scheme of");
		lblNewLabel_2_1_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_2_3.setBounds(25, 301, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_2_3);
		
		JLabel lblNewLabel_2_1_1_1_2_4 = new JLabel("ISAM up to 31st March 2023.");
		lblNewLabel_2_1_1_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1_2_4.setBounds(25, 330, 921, 20);
		scheme_1_p.add(lblNewLabel_2_1_1_1_2_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(crop_schemes_p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(849, 341, 97, 36);
		scheme_1_p.add(btnNewButton);
		
		JPanel fert_sug = new JPanel();
		fert_sug.setLayout(null);
		fert_sug.setForeground(Color.WHITE);
		fert_sug.setBackground(Color.WHITE);
		fert_sug.setBounds(0, 0, 986, 484);
		layeredPane.add(fert_sug);
		
		JButton fert_btn = new JButton("FERTILIZER SUGGESTION");
		fert_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(fert_sug);
			}
		});
		fert_btn.setForeground(new Color(0, 128, 64));
		fert_btn.setBackground(new Color(255, 255, 255));
		fert_btn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fert_btn.setBounds(40, 181, 254, 41);
		services_p.add(fert_btn);
		
		JLabel fert_suggestion = new JLabel("FERTILIZER SUGGESTION");
		fert_suggestion.setForeground(new Color(0, 128, 64));
		fert_suggestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fert_suggestion.setBounds(370, 35, 233, 34);
		fert_sug.add(fert_suggestion);
		
		JLabel region_l_1 = new JLabel("CROP :");
		region_l_1.setForeground(new Color(0, 128, 64));
		region_l_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		region_l_1.setBounds(321, 109, 83, 34);
		fert_sug.add(region_l_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(414, 114, 179, 31);
		fert_sug.add(textField);

		
		JLabel sug_fert_lb = new JLabel("Suggested Fertilizer :");
		sug_fert_lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sug_fert_lb.setBounds(381, 248, 200, 34);
		fert_sug.add(sug_fert_lb);
		
		JLabel organic_l = new JLabel("Organic :");
		organic_l.setFont(new Font("Tahoma", Font.PLAIN, 20));
		organic_l.setBounds(339, 306, 83, 34);
		fert_sug.add(organic_l);
		
		JLabel non_organic_l = new JLabel("Non Organic :");
		non_organic_l.setFont(new Font("Tahoma", Font.PLAIN, 20));
		non_organic_l.setBounds(295, 362, 127, 34);
		fert_sug.add(non_organic_l);
		
		JLabel organic_lb = new JLabel(" ");
		organic_lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		organic_lb.setBounds(432, 306, 308, 34);
		fert_sug.add(organic_lb);
		
		JLabel non_organic_lb = new JLabel(" ");
		non_organic_lb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		non_organic_lb.setBounds(432, 362, 308, 34);
		fert_sug.add(non_organic_lb);
		JButton fert_sug_btn = new JButton("SUGGEST");
		fert_sug_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
        Statement state;
        ResultSet result, result1, result2;
        try {
            // STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);
            // STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            state = conn.createStatement();
            String query = ""; 
            String crop_l = textField.getText();
            if(crop_l.equals('\0')){
            	JOptionPane.showMessageDialog(null,"Enter Crop name!!");
            } else{
				query = "SELECT organic, non_organic FROM crop_fertilizer WHERE crop = '"+crop_l+"'";
            }
        result2 = state.executeQuery(query);
        while (result2.next())
                  {
        String organic = result2.getString("organic");
        String non_organic = result2.getString("non_organic");
        organic_lb.setText(organic);
        non_organic_lb.setText(non_organic);
    }}
    catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception ex) {
            // Handle errors for Class.forName
            ex.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
			}
		});
		fert_sug_btn.setForeground(Color.WHITE);
		fert_sug_btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fert_sug_btn.setBackground(new Color(0, 128, 64));
		fert_sug_btn.setBounds(321, 187, 127, 29);
		fert_sug.add(fert_sug_btn);

		JButton rest_fert_btn = new JButton("RESET");
		rest_fert_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				organic_lb.setText("");
				non_organic_lb.setText("");
			}
		});
		rest_fert_btn.setForeground(Color.WHITE);
		rest_fert_btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rest_fert_btn.setBackground(new Color(0, 128, 64));
		rest_fert_btn.setBounds(465, 187, 116, 29);
		fert_sug.add(rest_fert_btn);

		JButton back_btn_2 = new JButton("Back");
		back_btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(services_p);
			}
		});
		back_btn_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		back_btn_2.setBackground(new Color(255, 255, 255));
		back_btn_2.setBounds(838, 421, 103, 29);
		fert_sug.add(back_btn_2);
		
		JPanel menu_op = new JPanel();
		menu_op.setBackground(new Color(0, 128, 64));
		menu_op.setBounds(400, 0, 586, 80);
		getContentPane().add(menu_op);
		menu_op.setLayout(null);
		
		JButton home_btn = new JButton("HOME");
		home_btn.setForeground(new Color(255, 255, 255));
		home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(home_p);
			}
		});
		home_btn.setBackground(new Color(0, 128, 64));
		home_btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		home_btn.setBounds(65, 21, 121, 33);
		menu_op.add(home_btn);
		
		JButton services_btn = new JButton("SERVICES");
		services_btn.setForeground(new Color(255, 255, 255));
		services_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(services_p);
			}
		});
		services_btn.setBackground(new Color(0, 128, 64));
		services_btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		services_btn.setBounds(234, 21, 149, 33);
		menu_op.add(services_btn);
		
		JButton login_btn = new JButton("LOGIN");
		login_btn.setForeground(new Color(255, 255, 255));
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(login_p);
			}
		});
		login_btn.setBackground(new Color(0, 128, 64));
		login_btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login_btn.setBounds(413, 21, 121, 33);
		menu_op.add(login_btn);
	}
}
