import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temperature  implements ActionListener{
    JFrame frame=new JFrame("termperature converter");
    JLabel c=new JLabel("celsius");
    JTextField cl=new JTextField(10);
    JLabel f=new JLabel("fahrenheit");
    JTextField fh=new JTextField(10); 
    JButton ctof=new JButton("convert c to f");
    JButton ftoc=new JButton("convert f to c");
  Temperature()
    {
      gui();
      action();
    }
    public void  gui()
    {
             c.setForeground(Color.white);
             f.setForeground(Color.white);
             frame.setSize(150,200);
             frame.setLayout(new FlowLayout());
             frame.setVisible(true);
             frame.getContentPane().setBackground(Color.black);
             frame.add(c);
             frame.add(cl);
             frame.add(f);
             frame.add(fh);
             frame.add(ctof);
             frame.add(ftoc);
             ctof.setBackground(new Color(255,69,0));
             ctof.setForeground(Color.white);
             ftoc.setBackground(new Color(255,69,0));
             ftoc.setForeground(Color.white);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void action()
    {
      ctof.addActionListener(this);
      ftoc.addActionListener(this);      
    }
    public static void main(String[] args) {
      Temperature t=new Temperature();  
    }
    public void actionPerformed(ActionEvent e)
    {
       Object o=e.getSource();
       if(o==ctof)
       {
          String p=cl.getText();
          double l=Double.parseDouble(p);
          double i=(l * 9/5 )+32;
          fh.setText(String.valueOf(i));
        }
       else if(o==ftoc)
       {
        String p=fh.getText();
        double l=Double.parseDouble(p);
        double i=(l-32) *5/9;
        cl.setText(String.valueOf(i));
       }
    }
}
  