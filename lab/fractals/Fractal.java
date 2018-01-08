

/**
 * This program draws a picture of nested triangles
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fractal extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    drawTriangles(g, 400, 320, 256);
  }

  /**
   * Draws a picture made of triangles in Graphics g
   * with the base midpoint at (x, y) and base half-length r
   */
  public void drawTriangles(Graphics g, int x, int y, int r) {
    g.drawLine(x-r, y, x+r, y);
    g.drawLine(x-r, y, x, y-r);
    g.drawLine(x+r, y, x, y-r);
    if (r < 2) {
      return;
    } else {
      r /= 2;
      drawTriangles(g, x + r, y, r);
      drawTriangles(g, x - r, y, r);
    }
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Triangles");
    w.setBounds(300, 300, 800, 480);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Fractal panel = new Fractal();
    panel.setBackground(Color.WHITE);
    Container c = w.getContentPane();
    c.add(panel);
    w.setResizable(false);
    w.setVisible(true);
  }
}
