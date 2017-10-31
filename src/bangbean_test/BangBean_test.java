

package bangbean;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;






public class BangBean extends JPanel implements Serializable{
    private int xm, ym;
    private int cSize = 20; // Circle Size
    private String text = "Fang";//
    private int fontSize = 48;
    private Color tColor = Color.RED;
    private ActionListener actionListener;
    public BangBean() {
        addMouseListener( new ML());
        addMouseMotionListener( new MML());
    }
    public void setCircleSize(int newSize){
        cSize = newSize;
    }
    public int getCircleSize() {
        return cSize;
    }
    public void setFangText(String newText) {
        text = newText;
    }
    public String getFangText() {return text;}
    public void setFontSize(int newSize) {
        fontSize = newSize;
    }
    public int getFontSize() {return fontSize;}
    public void setTextColor(Color newColor) {
        tColor = newColor;
    }
    public Color getTextColor() {return tColor;}
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawOval(xm - cSize/2, ym - cSize/2, cSize, cSize)
    }


    public void addActionListener(ActionListener 1)
    throws TooManyListenersException {
        if(actionListener != null)
            throw new TooManyListenersException();
        actionListener = 1;
    }
    public void removeActionListener(ActionListener 1) {
        actionListener = null;
    }
    class ML extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics();
            g.setColor(tColor);
            g.setFont(
            new Font("TimesRoman", Font.BOLD, fontSize));
            int width = g.getFontMetrics().stringWidth(text);
            g.drawString(text, (getSize().width - width)/2,
            getSize().height/2);
            g.dispose();
            //Call the Listener's method:
            if(actionListener != null){
                actionListener.actionPerformed(
                new ActionEvent(BangBean.this,
                ActionEvent.ACTION_PERFORMED, null));
            }
        }
    }
    class MML extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            xm = e.getX();
            ym = e.getY();
            repaint();
        }
    }
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
