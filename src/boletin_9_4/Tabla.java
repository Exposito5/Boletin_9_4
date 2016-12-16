package boletin_9_4;

import javax.swing.JOptionPane;

public class Tabla {

    public Tabla() {

    }

    public void Maultip() {
        int e = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número"));
        int i = 1;

        while (i > 0) {
            System.out.println(e + "*" + i + " = " + (e * i));
            i++;
        }
    }
}
