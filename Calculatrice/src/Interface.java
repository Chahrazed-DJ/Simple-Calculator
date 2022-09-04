import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Panel;
import java.awt.Color;
import java.awt.ScrollPane;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Component;
import java.awt.Insets;
import java.awt.Point;



@SuppressWarnings({ "unused", "serial" })
public class Interface extends JFrame {
     private JPanel contentPane;
     private JTextField textDisplay;
     String operations;
     String answer;
     double firstnum;
     double secondnum;
     double result;
     private JTextField textField;
     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try
		{ 
		 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 
		 //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
		 // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		// UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			 UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		
		}
		catch(Exception e)
		{
		 JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBorder(null);
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(0, 0, 292, 101);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textDisplay = new JTextField();
		textDisplay.setAlignmentY(1.0f);
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textDisplay.setBorder(null);
		textDisplay.setForeground(new Color(0, 0, 0));
		textDisplay.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		textDisplay.setBackground(new Color(255, 255, 255));
		textDisplay.setBounds(0, 74, 292, 85);
		contentPane.add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btnBS = new JButton("\uF04A");
		btnBS.setForeground(new Color(255, 255, 255));
		btnBS.setFocusTraversalKeysEnabled(false);
		btnBS.setFocusPainted(false);
		btnBS.setBorder(null);
		btnBS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBS.setBorderPainted(false);
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace=null;
				if(textDisplay.getText().length()>0)
				{
					StringBuilder strB =new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					backspace =strB.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnBS.setBackground(new Color(51, 51, 51));
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 23));
		btnBS.setBounds(0, 158, 70, 75);
		contentPane.add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setFocusTraversalKeysEnabled(false);
		btnC.setFocusPainted(false);
		btnC.setBorder(null);
		btnC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC.setBorderPainted(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDisplay.setText(null); 
				textField.setText(null);
			}
		});
		btnC.setBackground(new Color(51, 51, 51));
		btnC.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		btnC.setBounds(67, 158, 70, 75);
		contentPane.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.setForeground(new Color(255, 255, 255));
		button_1.setFocusTraversalKeysEnabled(false);
		button_1.setFocusPainted(false);
		button_1.setBorder(null);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(51, 51, 51));
		button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().equals(""))
				{
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				textField.setText(firstnum +" %"); 
				operations = "%";
				}
				
			}
		});
		button_1.setBounds(135, 158, 70, 75);
		contentPane.add(button_1);
		
	    final JButton button_3 = new JButton("7");
	    button_3.setForeground(new Color(255, 255, 255));
	    button_3.setFocusTraversalKeysEnabled(false);
	    button_3.setFocusPainted(false);
	    button_3.setBorder(null);
	    button_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    button_3.setBorderPainted(false);
		button_3.setBackground(new Color(51, 51, 51));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_3.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		button_3.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_3.setBounds(0, 231, 70, 75);
		contentPane.add(button_3);
		
		final JButton button_4 = new JButton("8");
		button_4.setForeground(new Color(255, 255, 255));
		button_4.setFocusTraversalKeysEnabled(false);
		button_4.setFocusPainted(false);
		button_4.setBorder(null);
		button_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_4.setBorderPainted(false);
		button_4.setBackground(new Color(51, 51, 51));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_4.setBounds(67, 231, 70, 75);
		contentPane.add(button_4);
		
		final JButton button_5 = new JButton("9");
		button_5.setRequestFocusEnabled(false);
		button_5.setRolloverEnabled(false);
		button_5.setForeground(new Color(255, 255, 255));
		button_5.setFocusTraversalKeysEnabled(false);
		button_5.setFocusPainted(false);
		button_5.setBorder(null);
		button_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_5.setBorderPainted(false);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_5.setBackground(new Color(51, 51, 51));
		button_5.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_5.setBounds(135, 231, 70, 75);
		contentPane.add(button_5);
		
		final JButton button_7 = new JButton("4");
		button_7.setForeground(new Color(255, 255, 255));
		button_7.setFocusTraversalKeysEnabled(false);
		button_7.setFocusPainted(false);
		button_7.setBorder(null);
		button_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_7.setBorderPainted(false);
		button_7.setBackground(new Color(51, 51, 51));
		button_7.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_7.setBounds(0, 304, 70, 75);
		contentPane.add(button_7);
		
		final JButton button_8 = new JButton("5");
		button_8.setForeground(new Color(255, 255, 255));
		button_8.setFocusTraversalKeysEnabled(false);
		button_8.setFocusPainted(false);
		button_8.setBorder(null);
		button_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_8.setBorderPainted(false);
		button_8.setBackground(new Color(51, 51, 51));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_8.setBounds(67, 304, 70, 75);
		contentPane.add(button_8);
		
		final JButton button_9 = new JButton("6");
		button_9.setForeground(new Color(255, 255, 255));
		button_9.setFocusTraversalKeysEnabled(false);
		button_9.setFocusPainted(false);
		button_9.setBorder(null);
		button_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_9.setBorderPainted(false);
		button_9.setBackground(new Color(51, 51, 51));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_9.setBounds(135, 304, 70, 75);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setForeground(new Color(255, 255, 255));
		button_10.setFocusTraversalKeysEnabled(false);
		button_10.setFocusPainted(false);
		button_10.setBorder(null);
		button_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_10.setBorderPainted(false);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().equals(""))
				{
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				textField.setText(firstnum+" *"); 
				operations = "*";
				}
			}
		});
		button_10.setBackground(new Color(51, 51, 51));
		button_10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		button_10.setBounds(203, 306, 70, 73);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setForeground(new Color(255, 255, 255));
		button_11.setFocusTraversalKeysEnabled(false);
		button_11.setFocusPainted(false);
		button_11.setBorder(null);
		button_11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_11.setBorderPainted(false);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().equals(""))
				{
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				textField.setText(firstnum+" /"); 
				operations = "/";
				}
			}
		});
		button_11.setBackground(new Color(51, 51, 51));
		button_11.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		button_11.setBounds(205, 376, 68, 75);
		contentPane.add(button_11);
		
		final JButton button_12 = new JButton("3");
		button_12.setForeground(new Color(255, 255, 255));
		button_12.setFocusTraversalKeysEnabled(false);
		button_12.setFocusPainted(false);
		button_12.setBorder(null);
		button_12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_12.setBorderPainted(false);
		button_12.setBackground(new Color(51, 51, 51));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_12.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_12.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_12.setBounds(135, 376, 70, 75);
		contentPane.add(button_12);
		
		final JButton button_13 = new JButton("2");
		button_13.setForeground(new Color(255, 255, 255));
		button_13.setFocusTraversalKeysEnabled(false);
		button_13.setFocusPainted(false);
		button_13.setBorder(null);
		button_13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_13.setBorderPainted(false);
		button_13.setBackground(new Color(51, 51, 51));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_13.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_13.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_13.setBounds(67, 376, 70, 75);
		contentPane.add(button_13);
		
		final JButton button_14 = new JButton("1");
		button_14.setForeground(new Color(255, 255, 255));
		button_14.setFocusTraversalKeysEnabled(false);
		button_14.setFocusPainted(false);
		button_14.setBorder(null);
		button_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_14.setBorderPainted(false);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_14.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_14.setBackground(new Color(51, 51, 51));
		button_14.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_14.setBounds(0, 376, 70, 75);
		contentPane.add(button_14);
		
		final JButton button_15 = new JButton("0");
		button_15.setForeground(new Color(255, 255, 255));
		button_15.setFocusTraversalKeysEnabled(false);
		button_15.setFocusPainted(false);
		button_15.setBorder(null);
		button_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_15.setBorderPainted(false);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textDisplay.getText() + button_15.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		button_15.setBackground(new Color(51, 51, 51));
		button_15.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		button_15.setBounds(0, 449, 70, 75);
		contentPane.add(button_15);
		
		final JButton button_16 = new JButton(".");
		button_16.setForeground(new Color(255, 255, 255));
		button_16.setFocusTraversalKeysEnabled(false);
		button_16.setFocusPainted(false);
		button_16.setBorder(null);
		button_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_16.setBorderPainted(false);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().contains("."))
				{
					textDisplay.setText(textDisplay.getText()+ button_16.getText() );
				}
			}
		});
		button_16.setBackground(new Color(51, 51, 51));
		button_16.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		button_16.setBounds(67, 449, 70, 75);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("+/-");
		button_17.setForeground(new Color(255, 255, 255));
		button_17.setFocusTraversalKeysEnabled(false);
		button_17.setFocusPainted(false);
		button_17.setBorder(null);
		button_17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_17.setBorderPainted(false);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().equals(""))
				{
				double ops= Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops* (-1);
				textDisplay.setText("= "+String.valueOf(ops));
				}
			}
		});
		button_17.setBackground(new Color(51, 51, 51));
		button_17.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		button_17.setBounds(135, 449, 70, 75);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setForeground(new Color(255, 255, 255));
		button_18.setFocusTraversalKeysEnabled(false);
		button_18.setFocusPainted(false);
		button_18.setBorder(null);
		button_18.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_18.setBorderPainted(false);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textDisplay.getText().equals(""))
				{
				secondnum = Double.parseDouble(textDisplay.getText());
				
				if(operations=="+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(firstnum+" + "+secondnum); 
					textDisplay.setText("= "+answer);
					
				}
				else if(operations=="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(firstnum+" - "+secondnum); 
					textDisplay.setText("= "+answer);
				}
				else if(operations=="*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(firstnum+" * "+secondnum); 
					textDisplay.setText("= "+answer);
				}
				else if(operations=="/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(firstnum+" / "+secondnum); 
					textDisplay.setText("= "+answer);
				}
				else if(operations=="%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(firstnum+" % "+secondnum); 
					textDisplay.setText("= "+answer);
				}
				}
			}
		});
		button_18.setBackground(new Color(51, 51, 51));
		button_18.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		button_18.setBounds(203, 449, 70, 75);
		contentPane.add(button_18);
		
		JButton button_2 = new JButton("+");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFocusTraversalKeysEnabled(false);
		button_2.setFocusPainted(false);
		button_2.setBorder(null);
		button_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_2.setBorderPainted(false);
		button_2.setBounds(203, 158, 70, 75);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				textField.setText(firstnum +" + ");
				operations = "+";
			}
		});
		button_2.setBackground(new Color(51, 51, 51));
		button_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		JButton button_6 = new JButton("-");
		button_6.setAlignmentY(Component.TOP_ALIGNMENT);
		button_6.setForeground(new Color(255, 255, 255));
		button_6.setFocusTraversalKeysEnabled(false);
		button_6.setFocusPainted(false);
		button_6.setBorder(null);
		button_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_6.setBorderPainted(false);
		button_6.setBounds(203, 233, 70, 75);
		contentPane.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				textField.setText(firstnum +" - ");
				operations = "-";
			}
		});
		button_6.setBackground(new Color(51, 51, 51));
		button_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 153, 153));
		panel.setBounds(268, 158, 24, 366);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uF085");
		lblNewLabel.setBackground(new Color(255, 153, 153));
		lblNewLabel.setBounds(4, 162, 16, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Wingdings 3", Font.PLAIN, 20));
	}
}
