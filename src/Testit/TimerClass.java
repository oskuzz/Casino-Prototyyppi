/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author s1601396
 */
public class TimerClass extends JFrame {

    private Timer ajastin;
    private int laskuri = 0;
    private JLabel numero = new JLabel("0");

    public TimerClass() {
        ajastin = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paivitanumero();
            }
        });
        ajastin.setInitialDelay(0);
        this.add(numero);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocationRelativeTo(null);
        ajastin.start();
    }

    private void paivitanumero() {
        laskuri ++;
        numero.setText("" + laskuri);
        if(laskuri == 20){
            ajastin.stop();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimerClass().setVisible(true);
            }
        });
    }
}
