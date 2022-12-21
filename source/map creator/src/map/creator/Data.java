
package map.creator;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Data
{
   public  Image Wall;
   public  Image Floor;
   public  Image Target;
   public  Image Exit;
   public  Image Player;
   
 public   Data()
{
   try
   {
        this.Wall = ImageIO.read(getClass().getResourceAsStream("./src/wall.png"));
        this.Exit = ImageIO.read(getClass().getResourceAsStream("./src/exit.png"));
        this.Floor = ImageIO.read(getClass().getResourceAsStream("./src/floor.png"));
        this.Player = ImageIO.read(getClass().getResourceAsStream("./src/player.png"));
        this.Target = ImageIO.read(getClass().getResourceAsStream("./src/target.png"));
               }
   catch(Exception ex)
   {
       JOptionPane.showMessageDialog(null, "Error : messing resource  !",null, JOptionPane.WARNING_MESSAGE);
       System.exit(1);
   }
       
       
       
   }
   
}
