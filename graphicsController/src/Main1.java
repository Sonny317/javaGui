import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main1 extends JFrame {
    public Main1() {
        Container contentPane = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 450);
        setTitle("Graphics");

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);



        String [] files = {"src/circle.png", "src/square.png"};
        for(int i=0; i<files.length; i++) {
            ImageIcon icon = new ImageIcon(files[i]);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance( 20, 20,  java.awt.Image.SCALE_SMOOTH );
            icon = new ImageIcon( newimg );
            JButton button = new JButton(icon);
            toolbar.add(button);
            toolbar.addSeparator();
        }





/*

        toolbar.add(new JButton("button 2"));

        toolbar.add(new JComboBox(new String[]{"A","B","C"}));*/


        contentPane.add(toolbar, BorderLayout.NORTH);
        createMenu();
        createToolBar();


        setVisible(true);
    }
    public static void main(String [] args) {
    new Main1();

    }

    public void createMenu() {
        JMenuBar jm = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenu editMenu = new JMenu("편집");

        jm.add(fileMenu);
        jm.add(editMenu);

        this.setJMenuBar(jm);
    }

    public void createToolBar() {
        JToolBar toolBar = new JToolBar();
    }


}
