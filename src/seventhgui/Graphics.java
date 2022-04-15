/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventhgui;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Graphics extends JPanel {

    @Override
    protected void paintComponent(java.awt.Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(Color.cyan);
        grphcs.fill3DRect(20, 10, 100, 200, true);
        grphcs.setColor(Color.pink);
        grphcs.fill3DRect(135, 10, 100, 200, true);
        grphcs.setColor(Color.cyan);
        grphcs.fill3DRect(250, 10, 100, 200, true);
        grphcs.setColor(Color.pink);
        grphcs.fill3DRect(365, 10, 100, 200, true);
        grphcs.setColor(Color.cyan);
        grphcs.drawLine(20, 250, 120, 250);
        grphcs.setColor(Color.pink);
        grphcs.drawLine(135, 250, 235, 250);
        grphcs.setColor(Color.cyan);
        grphcs.drawLine(250, 250, 350, 250);
        grphcs.setColor(Color.pink);
        grphcs.drawLine(365, 250, 465, 250);
        grphcs.setColor(Color.cyan);
        grphcs.fillOval(90, 300, 100, 100);
        grphcs.setColor(Color.pink);
        grphcs.fillOval(290, 300, 100, 100);

//        grphcs.setColor(Color.cyan);
//        grphcs.drawLine(60, 450, 60, 600);
//        grphcs.setColor(Color.pink);
//        grphcs.drawLine(175, 450, 175, 600);
//        grphcs.setColor(Color.cyan);
//        grphcs.drawLine(290, 450, 290, 600);
//        grphcs.setColor(Color.pink);
//        grphcs.drawLine(405, 450, 405, 600);
        grphcs.setColor(Color.pink);
        for (int i = 60; i < this.getWidth(); i += 115) {
            grphcs.drawLine(i, 450, i, 600);
        }
//        grphcs.setColor(Color.cyan);
//        grphcs.drawLine(60, 450, 405, 450);
//        grphcs.setColor(Color.pink);
//        grphcs.drawLine(60, 480, 405, 480);
//        grphcs.setColor(Color.cyan);
//        grphcs.drawLine(60, 510, 405, 510);
//        grphcs.setColor(Color.pink);
//        grphcs.drawLine(60, 540, 405, 540);
        grphcs.setColor(Color.cyan);
        for (int i = 450; i < this.getHeight(); i += 30) {
            grphcs.drawLine(60, i, 405, i);
        }
        
        grphcs.setColor(Color.cyan);
        for (int i = 0; i < this.getHeight(); i += 20) {
            grphcs.drawLine(0, 0, this.getWidth(), i);
        }
        
        grphcs.setColor(Color.pink);
        for (int i = 0; i < this.getHeight(); i += 20) {
            grphcs.drawLine(0, 0, i ,this.getHeight());
        }
    }

}
