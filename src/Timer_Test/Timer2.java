/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timer_Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author osku0
 */
public class Timer2 {
    private javax.swing.Timer ajastin;
    private int laskuri = 0;
    private Timer2(){
    ajastin = new javax.swing.Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paivitanumero();
            }
        });
        ajastin.setInitialDelay(0);

        ajastin.start();
    }

    private void paivitanumero() {
        laskuri++;
        System.out.println(laskuri);
        if (laskuri == 20) {
            ajastin.stop();
        }
    }
}
