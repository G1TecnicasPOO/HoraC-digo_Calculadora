package CalculadoraS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btn_Sum;
	private JButton btn_Reset;
	private JButton btn_Multi;
	private JScrollPane scrollPane;
	private JButton btnNewButton;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1er número");
		lblNewLabel.setBounds(122, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2do número");
		lblNewLabel_1.setBounds(243, 11, 125, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(103, 36, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(231, 36, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		btn_Sum = new JButton("Suma +");
		btn_Sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtS.setText("");
				try {
				//try {
					double num1 = Double.parseDouble(txtNum1.getText());
					double num2 = Double.parseDouble(txtNum2.getText());
					//double resultado = num1+num2;
					//txtS.setText("Resultado: "+ resultado);	
					Calculadora sum=new Calculadora(num1, num2);
					txtS.setText("El resultado de la suma es: "+ "\n"+sum.sumar(num1, num2));	
				//} catch(NumberFormatException ex) {
					//txtS.setText("Ingrese valores numéricos válidos");
				// 
					//}
				}catch (Exception e2) {
					MostrarError();
				}
			}
		});
		btn_Sum.setBounds(27, 67, 130, 23);
		contentPane.add(btn_Sum);
		
		JButton btn_Res = new JButton("Resta -");
		btn_Res.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtS.setText("");
					Calculadora calc_rest=new Calculadora(txtNum1.getText(), txtNum2.getText());
					txtS.append("La resta de los números es: "+"\n"+calc_rest.restar());
					} catch (Exception e2) {
						MostrarError();
					}
			}
		});
		btn_Res.setBounds(27, 101, 130, 23);
		contentPane.add(btn_Res);
		
		btn_Multi = new JButton("Multiplicación x");
		btn_Multi.addActionListener(this);
		btn_Multi.setBounds(27, 135, 130, 23);
		contentPane.add(btn_Multi);
		
		JButton btn_Divi = new JButton("División /");
		btn_Divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtS.setText("");
					Calculadora calc_div=new Calculadora(txtNum1.getText(), txtNum2.getText());
					txtS.append("La división de los números es: "+"\n"+calc_div.dividir());
					} catch (Exception e2) {
						MostrarError();
					}
			}
		});
		btn_Divi.setBounds(27, 169, 130, 23);
		contentPane.add(btn_Divi);
		{
			btn_Reset = new JButton("Reset");
			btn_Reset.addActionListener(this);
			btn_Reset.setBounds(167, 227, 89, 23);
			contentPane.add(btn_Reset);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(167, 67, 257, 152);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Salir");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(335, 227, 89, 23);
			contentPane.add(btnNewButton);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Reset) {
			do_btn_Reset_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btn_Multi) {
			do_btn_Multi_actionPerformed(e);
		}
	}
	protected void do_btn_Multi_actionPerformed(ActionEvent e) {
		try {
		txtS.setText("");
		Calculadora calc_mult=new Calculadora(txtNum1.getText(), txtNum2.getText());
		txtS.append("La multiplicación de los números es: "+"\n"+calc_mult.multiplicar());
		} catch (Exception e2) {
			MostrarError();
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		 System.exit(0);
	}
	private void MostrarError() {
		JOptionPane.showMessageDialog(this, "Digite dos números reales");
	}
	protected void do_btn_Reset_actionPerformed(ActionEvent e) {
		txtNum1.setText("");
		txtNum2.setText("");
		txtS.setText("");
		txtNum1.grabFocus();
	}
}
