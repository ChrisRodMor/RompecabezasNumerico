import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
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
		setBounds(700, 200, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		List<String> valores = Arrays.asList("1","2","3","4","5","6", "7", "8", "9","10","11","12","13","14","15"," ");
		String[] valoresnum = new String[16];
		JButton[] botones = new JButton[16];
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));
		
		
		
		Collections.shuffle(valores);
		
		for (int i = 0; i < valoresnum.length; i++) {
			valoresnum[i] = valores.get(i);
		}
		
		for (int i = 0; i < botones.length; i++) {

			int posicion = i;

			JButton tmp = new JButton(valoresnum[i]);

			tmp.setFocusPainted(false);
			tmp.setBorder(BorderFactory.createLineBorder(new Color(40, 40, 40), 2));
			tmp.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
			tmp.setForeground(new Color(200, 170, 80));
			UIManager.put("Button.select", new Color(200, 240, 250));

			
			if(posicion == 0 || posicion == 2 || posicion == 4 || posicion == 6 || posicion == 8 || posicion == 10 || posicion == 12 || posicion == 14 ){
				tmp.setBackground(new Color(255, 255, 255));
			}
			else if(posicion == 1 || posicion == 3 || posicion == 5 || posicion == 7 || posicion == 9 || posicion == 11 || posicion == 13 || posicion == 15 ){
				tmp.setBackground(new Color(220, 30, 40));
			}

			botones[i] = tmp;
			

            tmp.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                    
					

					if (botones[posicion].getText() != " ") {

						if(posicion == 0 || posicion == 1 || posicion == 2 || posicion == 4 || posicion == 5 || posicion == 6 || posicion == 8 || posicion == 9 || posicion == 10 || posicion == 12 ||posicion == 13 ||posicion == 14){
							if(botones[posicion+1].getText().equals(" ")){
								botones[posicion+1].setText(tmp.getText());
								botones[posicion].setText(" ");
								
							}
							
						}

						if(posicion == 1 || posicion == 2 || posicion == 3 || posicion == 9 || posicion == 5 || posicion == 6 || posicion == 7 || posicion == 10 || posicion == 11 || posicion == 13 ||posicion == 14 ||posicion == 15){
							
							if(botones[posicion-1].getText().equals(" ")){
								botones[posicion-1].setText(tmp.getText());
								botones[posicion].setText(" ");
								
							}
							
						}

						if(posicion == 0 || posicion == 1 || posicion == 2 || posicion == 3 || posicion == 4 || posicion == 5 || posicion == 6 || posicion == 7 || posicion == 8 || posicion == 9 ||posicion == 10 ||posicion == 11){
							if(botones[posicion+4].getText().equals(" ")){
								botones[posicion+4].setText(tmp.getText());
								botones[posicion].setText(" ");
								
							}
							
						}
						if(posicion == 4 || posicion == 5 || posicion == 6 || posicion == 7 || posicion == 8 || posicion == 9 || posicion == 10 || posicion == 11 || posicion == 12 || posicion == 13 ||posicion == 14 ||posicion == 15){
							if(botones[posicion-4].getText().equals(" ")){
								botones[posicion-4].setText(tmp.getText());
								botones[posicion].setText(" ");
								
							}
						}

						if(botones[0].getText() == "1" && botones[1].getText() == "2" && botones[2].getText() == "3" && botones[3].getText() == "4" && botones[4].getText() == "5" && botones[5].getText() == "6" && botones[6].getText() == "7" && botones[7].getText() == "8" && botones[8].getText() == "9" && botones[9].getText() == "10" && botones[10].getText() == "11" && botones[11].getText() == "12" && botones[12].getText() == "13" && botones[13].getText() == "14" && botones[14].getText() == "15" && botones[15].getText() == " "){
							
							JOptionPane.showMessageDialog(rootPane, "Felicidades, has ganado!", "Bravo!!!", 1, null);
						}

						
						
					}
					
				}
				
				
			});
			
			panel.add(botones[i]);
            
		}
		
		
        
		JPanel panel_1 = new JPanel();
		panel_1.setBackground((new Color(16, 9, 16)));
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("      ");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel(new FlowLayout());
		panel_2.setBackground((new Color(16, 9, 16)));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground((new Color(16, 9, 16)));
		contentPane.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("ROMPECABEZAS NUMÉRICO");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblNewLabel_2.setForeground((new Color(200, 170, 80)));
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground((new Color(16, 9, 16)));
		contentPane.add(panel_4, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("      ");
		panel_4.add(lblNewLabel_1);
		
		JButton btnNewButton_16 = new JButton("       Reiniciar       ");
		btnNewButton_16.setFocusPainted(false);
		btnNewButton_16.setBorder(BorderFactory.createLineBorder(new Color(215, 160, 50), 1));
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_16.setForeground((new Color(200, 170, 80)));
		btnNewButton_16.setBackground(null);			
		UIManager.put("Button.select", new Color(197, 148, 9));
		
		
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