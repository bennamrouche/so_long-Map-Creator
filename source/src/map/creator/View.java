
package map.creator;

import java.awt.Color;
import java.awt.Graphics;


public class View extends javax.swing.JFrame {

 private final Data data = new Data();
 private int map_w = 320;
 private int map_h = 320;
 private int row_len = 10;
 private int colum_len = 10;
 private String[] map;
  public View() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int inx = getInsets().left;
        int iny = getInsets().top;
        if(map_w > 0 && map_h > 0)
            this.setSize(map_w + inx, map_h + getInsets().top);
        if (map == null)
            return;
        int i = 0;
        int j = 0;
        String str;
         for(int y = iny; y < map_h; y += 32)
         {
             i = 0;
              str = map[j];
             for(int x = inx ; x < map_w; x += 32)
            {
                DrawImage(g, x , y , map[j].toCharArray()[i]);
                i++;
            }
            j++;
        }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

public void setMap(String[] map,int row_len, int colum_len)
{
    this.map = map;
    this.map_w = row_len * 32;
    this.map_h = colum_len * 32;
       repaint();

}

private void DrawImage(Graphics g, int x, int y, char C )
{
    g.drawImage(data.Floor, x, y, this);
    switch(C)
    {
        case 'P':g.drawImage(data.Player, x, y, this); break;
        case 'C':g.drawImage(data.Target, x, y, this); break;
        case 'E':g.drawImage(data.Exit, x, y, this); break;
        case '1':g.drawImage(data.Wall, x, y, this); break;
    
    }
 
}
}
