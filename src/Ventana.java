import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.desktop.SystemEventListener;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 554, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		List<String> valores = Arrays.asList("1","2","3","4","5","6", "7", "8", "9","10","11","12","13","14","15"," ");
		JButton[] botones = new JButton[16];
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		Collections.shuffle(valores);
		
		for (int i = 0; i < botones.length; i++) {

			int posicion = i;
			JButton tmp = new JButton(valores.get(i));
			botones[i] = tmp;

			
			panel.add(botones[i]);
            
		}
		
        
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(138, 100, 72));
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("      ");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(138, 100, 72));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(138, 100, 72));
		contentPane.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("      ");
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(138, 100, 72));
		contentPane.add(panel_4, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("      ");
		panel_4.add(lblNewLabel_1);
		
		JButton btnNewButton_16 = new JButton("Reiniciar");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Collections.shuffle(valores);
				
				for (int i = 0; i <botones.length; i++) {
					String tmp = valores.get(i);
					botones[i].setText(tmp);
					panel.add(botones[i]);
					
				}
				
			}
		});
		panel_2.add(btnNewButton_16);
		
		
		
		
		
	}

}