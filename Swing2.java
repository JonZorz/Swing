import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Swing2 extends JFrame implements ActionListener {

	JComboBox cboAnimales;
	String animales []={"gato","perro","caballo"};
	JList lsTAnimales;
	JLabel lblImagen;
	ImageIcon imgGato,imgPerro, imgCaballo;

	Swing2 (){
	setLayout (new GridLayout(0,1));
	cboAnimales= new JComboBox(animales);
	lsTAnimales=new JList(animales);
	cboAnimales.addActionListener(this);

	imgGato= new ImageIcon ("d:\\imagenes\\gato.jpg");
	imgPerro= new ImageIcon ("d:\\imagenes\\perro.jpg");
	imgCaballo= new ImageIcon ("d:\\imagenes\\caballo.jpg");
	
	lblImagen=new JLabel();

	add(cboAnimales);
	add(lblImagen);

	setTitle("Swing");
	setSize(400,400);
	setVisible(true);

	}
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "seleccionado:"+cboAnimales.getSelectedItem());

		if(cboAnimales.getSelectedItem()=="gato")
		lblImagen.setIcon(imgGato);
		if(cboAnimales.getSelectedItem()=="perro")
		lblImagen.setIcon(imgPerro);
		if(cboAnimales.getSelectedItem()=="caballo")
		lblImagen.setIcon(imgCaballo);
	}

	public static void main(String[] args) {
		new Swing2();
	}

}
