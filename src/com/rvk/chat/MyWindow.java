package com.rvk.chat;


import sun.applet.AppletIllegalArgumentException;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame implements Runnable {
    JPanel panelChat=new JPanel();
    JPanel panelListUsers=new JPanel();
    JPanel panelMenu=new JPanel();
    JPanel panelAnswer=new JPanel();
    final JFrame frame = new JFrame("Чат");
    private static final Insets insets = new Insets(0, 0, 0, 0);
    JMenuBar menuBar = new JMenuBar();
    Font font = new Font("Verdana", Font.PLAIN, 11);

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
         CreateGui();
    }
    public void CreateGui ()
    {

            setPanels();
          
         setFrameParams();

        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) (sSize.height * 0.85);
        int width = (int) (sSize.width * 0.4);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


private void setFrameParams()
{
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridBagLayout());
    frame.setSize(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font font = new Font("Verdana", Font.PLAIN, 11);

}

    private void setPanels ()
    {

        //panelChat.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panelChat, 0, 0, 5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 350, 500);

       // panelListUsers.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panelListUsers, 6, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 10, 500);

       // panelAnswer.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panelAnswer, 0, 1, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0, 150);

      //  panelMenu.setBackground(Color.yellow);
       // panelMenu.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panelMenu, 0, 2, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0, 30);
    }

    private   void addComponent(Container container, Component component, int gridx, int gridy,
                                     int gridwidth, int gridheight, int anchor, int fill, int weightx, int weighty) {


            GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
                    anchor, fill, insets, weightx, weighty);
            container.add(component, gbc);




    }

 /*   private void createMenu ()
    {

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);

        JMenu newMenu = new JMenu("New");
        newMenu.setFont(font);
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Text file");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        JMenuItem imgFileItem = new JMenuItem("Image file");
        imgFileItem.setFont(font);
        newMenu.add(imgFileItem);

        JMenuItem folderItem = new JMenuItem("Folder");
        folderItem.setFont(font);
        newMenu.add(folderItem);

        JMenuItem openItem = new JMenuItem("Open");
        openItem.setFont(font);
        fileMenu.add(openItem);

        JMenuItem closeItem = new JMenuItem("Close");
        closeItem.setFont(font);
        fileMenu.add(closeItem);

        JMenuItem closeAllItem = new JMenuItem("Close all");
        closeAllItem.setFont(font);
        fileMenu.add(closeAllItem);

        fileMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        fileMenu.add(exitItem);



        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);
          frame.setJMenuBar(menuBar);
    }
    */
}
