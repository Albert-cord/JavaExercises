




package bangbean;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TooManyListenersException;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import static net.mindview.util.SwingConsole.*;
//什么鬼东西  很多都不能import进来
public class BangBeanTest extends JFrame {
    private JTextField text = new JTextField(20);
    //During testing, report actions:
    class BBL implements ActionListener {
        private int count = 0;
        public void actionPerformed(ActionEvent e) {
            txt.setText("BangBean action " + count++);
        }
    }
    public BangBeanTest() {
        BangBean bb = new BangBean();
        try {
            bb.addActionListener(new BBL());
        } catch(TooManyListenersException e) {
            txt.setText("Too many listeners");
        }
        add(bb);
        add(BorderLayout.SOUTH, txt);
    }
    public static void main(String[] args) {
        run(new BangBeanTest(), 400, 500);
    }
    private static void run(BangBeanTest bangBeanTest, int i, int j) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              f.setTitle(f.getClass().getSimpleName());
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              f.setSize(width, height);
              f.setVisible(true);
            }
          });
        }
    }
}
