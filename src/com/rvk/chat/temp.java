JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);
        jf.setVisible(true);

        // создаем  панель. 
        JPanel p = new JPanel();
        jf.add(p);

        // к панели добавляем менеджер GridLayout и устанавливаем размеры таблицы 3*3. 
        p.setLayout(new GridLayout(2,1));

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение. 
        JPanel panel1 =new JPanel( );

        JPanel panel2 =new JPanel( );
        panel1.setBackground(Color.cyan);
        panel2.setBackground(Color.YELLOW);

        panel1.setLayout(new BorderLayout());
        JPanel panel3 =new JPanel( );
        JLabel label =new JLabel("Список доступных юзеров: ");
        JTextArea textArea = new JTextArea();
        textArea.setSize(200,200);
        textArea.setBackground(Color.black);
        textArea.append("Test !!!!!!!!!!");
        //panel3.add(textArea );
        panel3.add(label,BorderLayout.NORTH);


        panel2.setLayout(new BorderLayout());
        JPanel panel4 =new JPanel( );
        panel4.setLayout(new FlowLayout());


        panel4.add(new JButton("Кнопка 3")  );
        panel4.add(new JButton("Кнопка 4"),FlowLayout.RIGHT );

        panel2.add(panel4, BorderLayout.SOUTH);

        panel3.setBackground(Color.RED);
        panel4.setBackground(Color.GREEN);



        panel2.add(new JTextArea(), BorderLayout.CENTER);
        panel1.add(panel3,BorderLayout.EAST);


        p.add(panel1);
        p.add(panel2) ;






//  p.add(new JButton("start 3"));
// p.add(new JButton("start 4"));
//  p.add(new JButton("start 5"));
//  p.add(new JButton("start 6"));
//  p.add(new JButton("Okay"));