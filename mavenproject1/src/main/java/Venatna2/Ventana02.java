/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Venatna2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Niko
 */
public class Ventana02 extends JFrame {
    
    private List <JPanel> jPanelList;
    public Ventana02() throws HeadlessException{
    this.setTitle("Grid Layout");
    this.setSize(600, 200);
    this.setLocation(800, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
    }
    
    public void iniciarPaneles(){
    
    this.jPanelList= new ArrayList<>();
    this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(0).setLayout(new GridLayout(3,2));
        this.jPanelList.get(0).setBackground(Color.LIGHT_GRAY);
        
        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(1).add(new JLabel("Button 1"));
         this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
         
         this.jPanelList.get(2).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(2).add(new JLabel("2"));
         this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
         
         this.jPanelList.get(3).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(3).add(new JLabel("Button 3"));
         this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));
         
         this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(4).add(new JLabel("Long-Named Button 4"));
         this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));
         
         this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(5).add(new JLabel("Button 5"));
         this.jPanelList.get(5).setBorder(new BevelBorder(BevelBorder.RAISED));
         
         
         
         this.jPanelList.get(0).add(this.jPanelList.get(1));
         this.jPanelList.get(0).add(this.jPanelList.get(2));
         this.jPanelList.get(0).add(this.jPanelList.get(3));
         this.jPanelList.get(0).add(this.jPanelList.get(4));
         this.jPanelList.get(0).add(this.jPanelList.get(5));
        
        
        
    }
    
    
    
}
