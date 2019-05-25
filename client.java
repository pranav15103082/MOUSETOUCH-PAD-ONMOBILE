import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class s
{
 //public int connected=0;
 public static void main(String args[]) throws Exception
  {
    
   try{
      InetAddress addr=InetAddress.getByName("192.168.137.1");
      ServerSocket server=new ServerSocket(5000,10,addr);
      //connected=1;
      while(true)
       {
      Socket client=server.accept();
       System.out.println("accepted");
       while(true)
      {
      DataInputStream instream=new DataInputStream(client.getInputStream());
      //BufferedReader br=new BufferedReader( new InputStreamReader(instream));
      String input=(String)instream.readUTF();
//String input=(String )br.readLine();
      String[] value=input.split(" ");
      float x=Float.parseFloat(value[1]);
      float y=Float.parseFloat(value[2]);
      String type=value[0];
      System.out.println(x);
      System.out.println(y);
      System.out.println(type);
           
        //client.close();
      Robot robot=new Robot();
  Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
  //robot.delay(2000);
 if(type.equalsIgnoreCase("close"))
       {
         client.close();
         break;
        }
  else if(type.equalsIgnoreCase("click"))
       {
        
        robot.mousePress(InputEvent.BUTTON1_MASK); 
        robot.mouseRelease(InputEvent.BUTTON1_MASK); 
       }
 else if(type.equalsIgnoreCase("move"))
       {
        float curx=(float)MouseInfo.getPointerInfo().getLocation().getX();
        float cury=(float)MouseInfo.getPointerInfo().getLocation().getY();
       //robot.mouseMove((int)(screen.getWidth()*x),(int)(screen.getHeight()*y));  
        robot.mouseMove((int)(curx+x),(int)(cury+y));

      }
else if(type.equalsIgnoreCase("key"))
      {
       System.out.println("keypressed");
        int k1=(int)x;
        int k2=(int)y;
        robot.keyPress(k1);
        robot.keyRelease(k1);
       // if(k2!=-1)
         //robot.keypress(k2);
      }

    
      //robot.mouseMove((int)(screen.getWidth()*x),(int)(screen.getHeight()*y));  
      
      //System.out.println(input);
   /*
      DataOutputStream outstream=new DataOutputStream(client.getOutputStream());
      outstream.writeUTF("djfdjf");
      //System.out.println(input);
      outstream.flush();
      outstream.close();
    */
      }
      // client.close();
        
       }
    }
   catch(Exception e)
   {
    System.out.println(e);
   }





  }


}