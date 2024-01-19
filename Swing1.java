import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Swing1 extends JFrame implements ActionListener {

	JPasswordField pwdContrasena;
    JButton btnBoton;
	JLabel lblResultado;
	JTextField txtName;	

	

	Swing1(){

		setLayout(new FlowLayout());


		pwdContrasena=new JPasswordField("admin1234");
		
		lblResultado=new JLabel();
		txtName= new JTextField("Admin");

		btnBoton=new JButton("Mostrar");
		btnBoton.addActionListener(this);

		add(txtName);
		add(pwdContrasena);
		add(btnBoton);
		add(lblResultado);   	

		setTitle("Contra Admin");
		setSize(500,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String valor=new String(pwdContrasena.getPassword());
		if(txtName.getText().equals("Admin") && pwdContrasena.getText().equals("admin1234"))
			lblResultado.setText("El usuario y la contraseña son correctos");
		else
			lblResultado.setText("El usuario y/o la contraseña son incorrectas");
		
		
	}
	public static void main(String[] args) {
		new Swing1();
	}

}
