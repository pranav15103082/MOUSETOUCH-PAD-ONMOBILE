import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class sss implements MouseListener
{

 public static void main(String args[]) throws Exception
  {
//Socket client=new Socket("127.0.0.1",7890);
    
   try
   {   
      while(true)
       {
      Socket client=new Socket("127.0.0.1",7890);
       Robot robot=new Robot();
       //System.out.println("djfdfj");
   Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
   int xp=MouseInfo.getPointerInfo().getLocation().x;
   int yp=MouseInfo.getPointerInfo().getLocation().y;
   float x=(float)(xp/screen.getWidth());
   float y=(float)(yp/screen.getHeight());
  String out=Float.toString(x)+" "+Float.toString(y);
robot.delay(2000);
      DataOutputStream outstream=new DataOutputStream(client.getOutputStream());
      outstream.writeUTF(out);
      //System.out.println(input);
      outstream.flush();
      outstream.close();

      /*DataInputStream instream=new DataInputStream(client.getInputStream());
      String input=(String)instream.readUTF();
      System.out.println(input);*/

       client.close();
       //robot.delay(2000);
       }
    }
   catch(Exception e)
   {
    System.out.println(e);
    // client.close();
   }
       




  }

    public void mousePressed(MouseEvent e) 
     {
     }
    public void mouseEntered(MouseEvent e) 
     {
     }
     public void mouseExited(MouseEvent e) 
     {
     }
      public void mouseReleased(MouseEvent e)
       {
       }
     public void mouseClicked(MouseEvent e) 
     {
      
     if(e.getButton()==MouseEvent.BUTTON1)
      {
        System.out.println("first");
      }
      if(e.getButton()==MouseEvent.BUTTON2)
      {
        System.out.println("second");
      }
       if(e.getButton()==MouseEvent.BUTTON3)
      {
        System.out.println("third");
      }
      
     }



}