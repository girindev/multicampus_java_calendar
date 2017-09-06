package member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import calendar.MemoCalendar;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField idTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("�α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		
		// ���̵� �Է�
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel lbLabel = new JLabel("ID:  ");
		lbLabel.setFont(new Font("����", Font.PLAIN, 58));
		lbLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lbLabel);

		idTextField = new JTextField();// ���̵��Է� �ؽ�Ʈ�ʵ�
		idTextField.setFont(new Font("����", Font.PLAIN, 23));
		idTextField.setForeground(Color.BLUE);
		idTextField.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(idTextField);
		idTextField.setColumns(10);

		
		// ��й�ȣ �Է�
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_1);

		JLabel lblPw = new JLabel("PW:");
		lblPw.setFont(new Font("����", Font.PLAIN, 58));
		panel_1.add(lblPw);

		passwordField = new JPasswordField();// ó�� ��й�ȣ�Է�
		passwordField.setFont(new Font("����", Font.PLAIN, 23));
		passwordField.setColumns(9);
		passwordField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(passwordField);

		
		// ���̵�/��й�ȣ ã��
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
		
		JButton idFindButton = new JButton("���̵� ã��");
		idFindButton.setFont(new Font("����", Font.PLAIN, 10));
		panel_2.add(idFindButton);
		idFindButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login.this.setVisible(false);
				new IdFind();
				
			}
		});
		
		JButton pwFindButton = new JButton("��й�ȣ ã��");
		pwFindButton.setFont(new Font("����", Font.PLAIN, 10));
		panel_2.add(pwFindButton);
		pwFindButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login.this.setVisible(false);
				new Pwfind();
				
			}
		});
		
		// �α��ι�ư �� ȸ�����Թ�ư
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setVgap(15);
		flowLayout_1.setHgap(10);
		panel_3.setBackground(Color.WHITE);
		contentPane.add(panel_3);

		JButton logButton = new JButton("�α���");// �α���
		logButton.setFont(new Font("����", Font.PLAIN, 23));
		
				
//				�α��δ������� �޷� â�ߴºκ�
				
//				if(idTextField==����Ͼ��̵�&&passwordField==����Ϻ�й�ȣ) {
					logButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Login.this.setVisible(false);
							SwingUtilities.invokeLater(new Runnable(){
								public void run(){
									new MemoCalendar();
								}
							});
						}
					});
//				
//				
//				}
//				
				
				
			
		panel_3.add(logButton);// ȸ������
		JButton signButton = new JButton("ȸ������");
		signButton.setFont(new Font("����", Font.PLAIN, 23));
		panel_3.add(signButton);
		signButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Login.this.setVisible(false);
				new Sign();
			}
		});
		setVisible(true);
	}

}