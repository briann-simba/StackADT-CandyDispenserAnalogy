import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


import java.util.*;


public class DequeFunctionality implements ActionListener {
    static DequeItem babadook;

    Deque<DequeItem> deque = new LinkedList<DequeItem>();
    int numClicks = 0;

    JButton addLastBtn;
    JButton addFirstBtn;

    JButton removeLastBtn;
    JButton removeFirstBtn;
    JButton lastBtn;
    JButton firstBtn;
    JButton isEmptyBtn;
    JButton sizeBtn;

    JLabel displayReturn;



    public void setList(Deque<DequeItem> deque){

        this.deque = deque;



    }
    public Deque<DequeItem> getList(){

        System.out.println(deque);

        return this.deque;
    }


    public DequeFunctionality(){
        addLastBtn = new JButton("addLast(e)");
        addLastBtn.setFocusable(false);
        addLastBtn.addActionListener(this);

        addFirstBtn = new JButton("addFirst(e)");
        addFirstBtn.setFocusable(false);
        addFirstBtn.addActionListener(this);



        removeLastBtn = new JButton("removeLast()");
        removeLastBtn.setFocusable(false);
        removeLastBtn.addActionListener(this);

        removeFirstBtn = new JButton("removeFirst()");
        removeFirstBtn.setFocusable(false);
        removeFirstBtn.addActionListener(this);

        lastBtn = new JButton("last()");
        lastBtn.setFocusable(false);
        lastBtn.addActionListener(this);


        firstBtn = new JButton("first()");
        firstBtn.setFocusable(false);
        firstBtn.addActionListener(this);



        isEmptyBtn = new JButton("isEmpty()");
        isEmptyBtn.setFocusable(false);
        isEmptyBtn.addActionListener(this);

        sizeBtn = new JButton("size()");
        sizeBtn.setFocusable(false);
        sizeBtn.addActionListener(this);


        displayReturn = new JLabel();
        displayReturn.setFont(new Font("Arial", Font.BOLD,20));
    }



    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DequeFunctionality buttons = new DequeFunctionality();
        if(actionEvent.getSource() == addLastBtn){
            
            addLast();
            
        }
        else if (actionEvent.getSource() == addFirstBtn){

            addFirst();
            

        }
        else if(actionEvent.getSource()==removeLastBtn){
            if (deque.isEmpty()){
                JOptionPane.showMessageDialog(null, "The queue is empty. No customer can be removed");}
            else{
            String outgoing=last();
            removeLast();
            JOptionPane.showMessageDialog(null,"The customer removed is:" +outgoing);}

        }


        else if(actionEvent.getSource()==removeFirstBtn){
            if (deque.isEmpty())
                JOptionPane.showMessageDialog(null, "The queue is empty. No customer can be removed");
                else{
            String outgoing=first();
            removeFirst();
            JOptionPane.showMessageDialog(null,"The customer removed is:" +outgoing);
            }

        }

        else if(actionEvent.getSource()==lastBtn){

            JOptionPane.showMessageDialog(null,"The last customer is  : " + last());



        }
        else if(actionEvent.getSource()==firstBtn){

            JOptionPane.showMessageDialog(null,"The first customer is  : " + first());




        }


        else if(actionEvent.getSource()==isEmptyBtn){

            if(isEmpty()){
                JOptionPane.showMessageDialog(null, "True");
            }
            else{
                JOptionPane.showMessageDialog(null, "False");
            }

        }
        else if(actionEvent.getSource()==sizeBtn){

            JOptionPane.showMessageDialog(null,"Size of the queue : " + size() + "");
        }
        else{ //do nothing

        }

    }






    public Deque<DequeItem> addLast(){




    String item=JOptionPane.showInputDialog(null,"Enter customer number");
    if (deque.size()==0)
    deque.addLast(new DequeItem(440,550,60,60,item));
    else
    deque.addLast(new DequeItem(deque.peekLast().getX()+60,550, 60,60,item));
      
        DequeFunctionality buttons = new DequeFunctionality();
        buttons.setList(deque);


        return deque;
    }












    public Deque<DequeItem> addFirst(){
        String item=JOptionPane.showInputDialog(null,"Enter customer number");
        if (deque.size()==0)
        deque.addFirst(new DequeItem(440,550, 60,60,item));
        else
        deque.addFirst(new DequeItem(deque.peekFirst().getX()-60,550, 60,60,item));
          
            DequeFunctionality buttons = new DequeFunctionality();
            buttons.setList(deque);
    
    
            return deque;

        
     }























    public Deque<DequeItem> removeLast(){
        if (!deque.isEmpty()) 
        
        deque.removeLast();

        

       
        


        DequeFunctionality buttons = new DequeFunctionality();
        buttons.setList(deque);


        return deque;

    }

    public Deque<DequeItem> removeFirst(){
        if (!deque.isEmpty()) 
        deque.removeFirst();

        

       
        



    DequeFunctionality buttons = new DequeFunctionality();
    buttons.setList(deque);


    return deque;

}




    public String last(){
        if (deque.isEmpty()) return null;
         return deque.peekLast().gettext();

    }

    public String first(){
        if (deque.isEmpty()) return null;
         return deque.peekFirst().gettext();

    }

    public boolean isEmpty(){
        if(deque.isEmpty()){
            return true;
        }
        return false;
    }

    public int size(){
        int size = deque.size();
        return size;
    }



}
