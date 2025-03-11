
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
   public  Image Enemy;
   
   
 public   Data()
{
   try
   {
       
        this.Wall = ImageIO.read(getClass().getResource("/src/wall.png"));
        this.Exit = ImageIO.read(getClass().getResource("/src/exit.png"));
        this.Player = ImageIO.read(getClass().getResource("/src/player.png"));
        this.Enemy = ImageIO.read(getClass().getResource("/src/enemy.png"));
        this.Target = ImageIO.read(getClass().getResource("/src/target.png"));

        
   }   catch(IOException ex)
   {
       JOptionPane.showMessageDialog(null, "Error : messing resource  !",null, JOptionPane.WARNING_MESSAGE);
       System.exit(1);
   }
       
       
       
   }
   
}
