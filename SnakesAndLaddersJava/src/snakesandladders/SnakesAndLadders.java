/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
//to fix flicker put stuff in jpanel


public class SnakesAndLadders extends JFrame /*implements ActionListener*/{

    public SnakesAndLadders(){
        setTitle("Snakes And Ladders!"); //title
        getContentPane().setBackground(Color.white); //backgroud color
        setSize(600, 600); //Width/Height of box, couldn't stop it from being resized...
        setDefaultCloseOperation(EXIT_ON_CLOSE); //close when exit
        
        //show panel
        setVisible(true);
    }
    
    public void paint(Graphics g){
        super.paint(g);

        //blue reference bars - outside zone
        g.setColor(Color.blue);
        g.drawLine(50,50,50,550); //left
        g.drawLine(50,550,550,550); //bottom
        g.drawLine(550,550,550,50); //right
        g.drawLine(550,50,50,50); //top
        
        //red reference bars - columns
        g.setColor(Color.red);
        g.drawLine(150,50,150,550);
        g.drawLine(250,50,250,550);
        g.drawLine(350,50,350,550);
        g.drawLine(450,50,450,550);
        
        //green reference bars - rows
        g.setColor(Color.green);
        g.drawLine(50,150,550,150);
        g.drawLine(50,250,550,250);
        g.drawLine(50,350,550,350);
        g.drawLine(50,450,550,450);
    }
    
    /*
    public void actionPerformed(ActionEvent e){
        repaint();
    }*/
    
    public static void main(String[] args) {
        new SnakesAndLadders();
    }
    
}
