package com.rvk.chat;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**

 */
public class MainForm extends JFrame {
    private static final Insets insets = new Insets(0, 0, 0, 0);

    public static void createGUI() {


        final JFrame frame = new JFrame("GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        JButton button;
        // Row One - Three Buttons
        JPanel panel = new JPanel();
        // panel.setBackground(Color.RED);

        panel.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panel, 0, 0, 5, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 350, 500);


        panel = new JPanel();
        //panel.setBackground(Color.green);
        panel.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panel, 6, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 10, 500);

        panel = new JPanel();
        //panel.setBackground(Color.BLUE);
        panel.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panel, 0, 1, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0, 150);

        panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBorder(new LineBorder(Color.black, 1));
        addComponent(frame, panel, 0, 2, 10, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0, 30);


        // button = new JButton("Two");
        // addComponent(frame, button, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);

        //  button = new JButton("Three");
        //  addComponent(frame, button, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);

        // Row Two - Two Buttons
        //  button = new JButton("Four");
        //   addComponent(frame, button, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        //   button = new JButton("Five");
        //   addComponent(frame, button, 2, 1, 1, 2, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        // Row Three - Two Buttons
        //   button = new JButton("Six");
        //   addComponent(frame, button, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        //   button = new JButton("Seven");
        //   addComponent(frame, button, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
        frame.setSize(500, 200);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Verdana", Font.PLAIN, 11);

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

        JPanel panelHeader = new JPanel();
        panelHeader.setBackground(Color.RED);

        panelHeader.setSize(500, 500);


        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = (int) (sSize.height * 0.85);
        int width = (int) (sSize.width * 0.4);

        frame.setPreferredSize(new Dimension(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
// main form

    }

    private static void addComponent(Container container, Component component, int gridx, int gridy,
                                     int gridwidth, int gridheight, int anchor, int fill, int weightx, int weighty) {
        GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
                anchor, fill, insets, weightx, weighty);
        container.add(component, gbc);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();


            }
        });
    }

}
