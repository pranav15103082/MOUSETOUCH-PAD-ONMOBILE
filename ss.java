import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class ss 
{

 public static void main(String args[]) throws Exception
  {
    
   try{
      
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
      DataOutputStream outstream=new DataOutputStream(client.getOutputStream());
      outstream.writeUTF(out);
      //System.out.println(input);
      outstream.flush();
      outstream.close();

      /*DataInputStream instream=new DataInputStream(client.getInputStream());
      String input=(String)instream.readUTF();
      System.out.println(input);*/
       System.out.println("dfjksfj");
       client.close();
       }
    }
   catch(Exception e)
   {
    System.out.println(e);
   }





  }

}