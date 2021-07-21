
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.*;

public class MyJavaDeque extends JPanel{

    static DequeFunctionality buttons = new DequeFunctionality();
    Deque<DequeItem> deque = buttons.getList();

    public void paintComponent(Graphics g){
        super.paintComponent(g);




        if(deque == null){
            System.out.println("There is an error of null");
        }
        else if(deque.isEmpty()){
            //do nothing
        }
        else{
            for (DequeItem p: deque){
                p.draw(g);
            }
        }
      
        repaint();



    }

        
    public static void main(String[] args){

        System.out.println(buttons.getList());





        MyJavaDeque dispenser = new MyJavaDeque();
        dispenser.setBackground(Color.WHITE);
        JFrame app = new JFrame("Java Open Ended Queue Implementation");
        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.WHITE);


        btnPanel.setLayout(new GridLayout(3, 1, 0, 0));

        btnPanel.add(buttons.addLastBtn);
        btnPanel.add(buttons.addFirstBtn);
        btnPanel.add(buttons.removeLastBtn);
        btnPanel.add(buttons.removeFirstBtn);
        btnPanel.add(buttons.lastBtn);
        btnPanel.add(buttons.firstBtn);
        btnPanel.add(buttons.isEmptyBtn);
        btnPanel.add(buttons.sizeBtn);


        

        





        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(new FlowLayout());


        
        panel1.add(btnPanel);




        app.setLayout(new BorderLayout());


        /*dispenser.candy1.setText("");
        dispenser.candy2.setText("");
        dispenser.candy3.setText("");
        dispenser.candy4.setText("");
        dispenser.candy5.setText("");

         */


        app.getContentPane().setBackground(Color.BLUE);
        app.add(dispenser);
        app.add(panel1, BorderLayout.NORTH);







        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(1000, 800);
        app.setVisible(true);

        }



}