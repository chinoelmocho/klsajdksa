/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evalucacion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Niko
 */
public class Figura extends JFrame {

  private int clickCount = 0;
  private int[] xPoints = new int[4];
  private int[] yPoints = new int[4];

  public Figura() {
    setTitle("Dibujar");
    setSize(700, 700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    

    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 4) {
          Graphics g = getGraphics();
          g.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
          g.drawLine(xPoints[1], yPoints[1], xPoints[2], yPoints[2]);
          g.drawLine(xPoints[2], yPoints[2], xPoints[3], yPoints[3]);
          g.drawLine(xPoints[3], yPoints[3], xPoints[0], yPoints[0]);
         
        }
      }
    });
  }}
    

