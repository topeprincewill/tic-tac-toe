import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener{

  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JLabel l1 = new JLabel("Two players");
  JButton[][] t = new JButton[3][3];
  String player = "X";
  boolean done = true;

  void addToPanel2() {
    for(int i = 0;i<=2;i++){
      for(int j = 0;j<=2;j++){
        t[i][j] = new JButton("_");
        t[i][j].addActionListener(this);
        t[i][j].setFont(new Font("Arial", Font.PLAIN, 64));
        p2.add(t[i][j]);
      
       }
    }
    
  }
 boolean wins(String player){
    if(t[0][0].getText().equals(player) && t[1][1].getText().equals(player) && t[2][2].getText().equals(player)){
      return true;
       }
    else
    if(t[0][2].getText().equals(player) && t[1][1].getText().equals(player) && t[2][0].getText().equals(player)){
      return true;
       }
    else
   if(t[0][0].getText().equals(player) && t[0][1].getText().equals(player) && t[0][2].getText().equals(player)){
      return true;
       }
    else
   if(t[1][0].getText().equals(player) && t[1][1].getText().equals(player) && t[1][2].getText().equals(player)){
      return true;
       }
     else
   if(t[2][0].getText().equals(player) && t[2][1].getText().equals(player) && t[2][2].getText().equals(player)){
      return true;
       }
     else
   if(t[0][0].getText().equals(player) && t[1][0].getText().equals(player) && t[2][0].getText().equals(player)){
      return true;
       }
     else
   if(t[0][1].getText().equals(player) && t[1][1].getText().equals(player) && t[2][1].getText().equals(player)){
      return true;
       }
   else
   if(t[0][2].getText().equals(player) && t[1][2].getText().equals(player) && t[2][2].getText().equals(player)){
      return true;
       }
    return false;
  }

  Main(){
    this.setTitle("Tic Tac Toe app");
    this.setSize(400, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = this.getContentPane();
    c.setLayout(new BorderLayout());
    p1.add(l1);
    c.add(p1, BorderLayout.NORTH);
    p2.setLayout(new GridLayout(3,3));
    addToPanel2();
    c.add(p2, BorderLayout.CENTER);

    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {  
    JButton gb = (JButton) ae.getSource();
   // do{   
      
       if (gb.getText().equals("_")) {
         gb.setText(player);
         /*if(wins(player)){
           System.out.println("player " + player + " won");
           done = true;
         }*/
         if (player.equals("X")){
           player = "O";
         }
         else{
           player = "X";
         }
       }
       else
       {
         System.out.print("Cell is taken");
       }
     
  }
    /*  while(!done);
  }*/


  public static void main(String[] args) {
    new Main();
  }
  }