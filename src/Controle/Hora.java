/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.Date;
import javax.swing.JLabel;
import java.text.SimpleDateFormat;

/**
 *
 * @author Lucas
 */
public class Hora extends Thread {

    private JLabel hora;
    private boolean mostra;

    public Hora(JLabel hora) {
        this.hora = hora;
    }

    public void AtualizaHora(boolean mostra) {
        if (mostra) {
            this.mostra = true;
        } else {
            this.mostra = false;
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Date data = new Date();
                StringBuffer data2 = new StringBuffer();
                if (mostra) {
                    SimpleDateFormat simples = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    data2.append(simples.format(data));
                }
                
                this.hora.setText(data2.toString());
                Thread.sleep(1000);
                this.hora.revalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
