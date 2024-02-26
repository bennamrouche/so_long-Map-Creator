
package map.creator;

import java.awt.Image;
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
       
        this.Wall = ImageIO.read(getClass().getResource("/src/wall.png"));
        this.Exit = ImageIO.read(getClass().getResource("/src/exit.png"));
        this.Floor = ImageIO.read(getClass().getResource("/src/floor.png"));
        this.Player = ImageIO.read(getClass().getResource("/src/player.png"));
        this.Target = ImageIO.read(getClass().getResource("/src/target.png"));

        
               }
   catch(Exception ex)
   {
       JOptionPane.showMessageDialog(null, "Error : messing resource  !",null, JOptionPane.WARNING_MESSAGE);
       System.exit(1);
   }
       
       
       
   }
   
}
