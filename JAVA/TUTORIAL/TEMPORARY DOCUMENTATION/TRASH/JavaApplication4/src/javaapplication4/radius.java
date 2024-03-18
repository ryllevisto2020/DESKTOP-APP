/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author rylle
 */
public class radius extends javax.swing.JLabel{

    void border(Graphics g){
        Graphics2D login_border = (Graphics2D) g;
        Stroke login_stroke = new BasicStroke(2f);
        
        login_border.setColor(new Color(48, 216 ,60));
        login_border.fillRoundRect(0, 0, getWidth()-1, getHeight()-1,20,20);
        login_border.setStroke(login_stroke);
        
        login_border.setColor(Color.black);
        login_border.drawRoundRect(0, 0, getWidth()-1, getHeight()-1,20,20); 
    }
    @Override
    public void paint(Graphics g) {
        border(g);
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
