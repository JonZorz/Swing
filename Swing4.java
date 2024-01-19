import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing4 extends JFrame implements ActionListener {

    JButton btnBoton;
    Random random = new Random();
    JLabel etiquetas[] = new JLabel[3];
    JLabel lblResultado;

    Swing4() {
        setLayout(new GridLayout(5, 2));

        btnBoton = new JButton("Pulsar");
        add(btnBoton);

        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i] = new JLabel();
            add(etiquetas[i]);
            etiquetas[i].setVisible(false);
        }
        lblResultado = new JLabel();
        add(lblResultado);

        btnBoton.addActionListener(this);

        setTitle("Etiquetas");
        setSize(500, 500);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < etiquetas.length; i++) {
            int valor = (int) Math.floor(Math.random() * 9)+1;
            etiquetas[i].setText(String.valueOf(valor));
            etiquetas[i].setVisible(true);

        }
        int valor1 = random.nextInt(9);
        int valor2 = random.nextInt(9);
        int valor3 = random.nextInt(9);
        
        if (valor1 != valor2 && valor2 != valor3 && valor3 != valor1) {
            lblResultado.setText("Los tres valores son iguales");
        } else if (valor1 != valor2 || valor2 != valor3 || valor3 != valor1) {
            lblResultado.setText("Hay dos valores iguales");
        } else {
            lblResultado.setText("Los tres valores son diferentes");
        }
    }

    public static void main(String[] args) {
        new Swing4();

    }

}

