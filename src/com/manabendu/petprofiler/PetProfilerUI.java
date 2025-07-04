package com.manabendu.petprofiler;
import com.manabendu.pets.*;
import com.manabendu.memebership.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetProfilerUI implements MouseListener, ActionListener {
    JFrame frame;
    JPanel head, body, tail;
    JTextField nameField, ageField;
    JTextArea description;
    JButton cat, dog, goldFish;
    JButton exit, reset, delux, basic, addMember;
    JLabel titleBar, l1, a1, l2, m1;
    Font myFont = new Font("FreeMono", Font.BOLD, 34);
    Font myFont2 = new Font("FreeMono", Font.PLAIN, 21);
    Font myFont3 = new Font("FreeMono", Font.BOLD, 27);

    String msg;
    Member member;

    PetProfilerUI(){
        frame = new JFrame("Pet Profiler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 945);
        frame.setResizable(false);
        frame.setLocation(0, 100);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);

        titleBar = new JLabel("Pet Profiler");
        titleBar.setBounds(180, 20, 600, 50);
        titleBar.setFont(myFont);
        titleBar.setBackground(Color.BLACK);
        titleBar.setForeground(new Color(169, 124, 234));
        titleBar.setOpaque(true);

        head = new JPanel();
        head.setBackground(Color.black);
        head.setBounds(0,100,frame.getWidth(),200);
        head.setLayout(null);
        head.setBorder(BorderFactory.createLineBorder(new Color(169, 124, 234)));

        l1 = new JLabel("Name:");
        l1.setForeground(new Color(86, 86, 254));
        l1.setFont(myFont);
        l1.setBackground(Color.black);
        l1.setBounds(10,10,200,50);
        head.add(l1);

        a1 = new JLabel("Age:");
        a1.setForeground(new Color(215, 86, 254));
        a1.setFont(myFont);
        a1.setBackground(Color.black);
        a1.setBounds(10,125,200,50);
        head.add(a1);

        nameField = new JTextField("Enter the pet name here.....");
        nameField.setBackground(Color.black);
        nameField.setForeground(new Color(49, 247, 177, 255));
        nameField.setFont(myFont2);
        nameField.setBorder(BorderFactory.createLineBorder(new Color(202, 254, 81)));
        nameField.setBounds(10,65,500,50);
        nameField.addMouseListener(this);
        nameField.setFocusable(false);
        head.add(nameField);

        ageField = new JTextField("Enter pet age.....");
        ageField.setBackground(Color.black);
        ageField.setForeground(new Color(49, 247, 177, 255));
        ageField.setFont(myFont2);
        ageField.setBorder(BorderFactory.createLineBorder(new Color(202, 254, 81)));
        ageField.setBounds(120,125,300,50);
        ageField.addMouseListener(this);
        ageField.setFocusable(false);
        head.add(ageField);


        body = new JPanel();
        body.setBackground(Color.black);
        body.setBounds(0,300,frame.getWidth(),350);
        body.setLayout(null);
        body.setBorder(BorderFactory.createLineBorder(new Color(62, 83, 246)));

        l2 = new JLabel("Pet Category");
        l2.setForeground(new Color(255, 63, 155));
        l2.setFont(myFont3);
        l2.setBackground(Color.black);
        l2.setBounds(200,10,250,50);
        body.add(l2);

        cat = new JButton("CAT");
        cat.setBackground(new Color(15, 9, 9));
        cat.setFont(myFont3);
        cat.setForeground(new Color(240, 247, 87));
        cat.setFocusable(false);
        cat.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(240, 247, 87), new Color(122,0,89)));
        cat.setBounds(50+20,80,100,60);
        cat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cat.addMouseListener(this);
        cat.addActionListener(this);
        body.add(cat);

        dog = new JButton("DOG");
        dog.setBackground(new Color(15, 9, 9));
        dog.setFont(myFont3);
        dog.setForeground(new Color(240, 247, 87));
        dog.setFocusable(false);
        dog.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(70, 255, 57), new Color(29, 39, 240)));
        dog.setBounds(190+20,80,100,60);
        dog.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dog.addMouseListener(this);
        dog.addActionListener(this);
        body.add(dog);

        goldFish = new JButton("GOLD FISH");
        goldFish.setBackground(new Color(15, 9, 9));
        goldFish.setFont(myFont3);
        goldFish.setForeground(new Color(240, 247, 87));
        goldFish.setFocusable(false);
        goldFish.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(255, 88, 15), new Color(67, 0, 204)));
        goldFish.setBounds(330+20,80,200,60);
        goldFish.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        goldFish.addMouseListener(this);
        goldFish.addActionListener(this);
        body.add(goldFish);

        description = new JTextArea();
        description.setForeground(new Color(160, 99, 246));
        description.setFont(myFont3);
        description.setBackground(Color.black);
        description.setBounds(30,200,550,200);
        description.setFocusable(false);
        body.add(description);

        tail = new JPanel();
        tail.setBackground(Color.black);
        tail.setBounds(0,650,frame.getWidth(),200);
        tail.setLayout(null);
        tail.setBorder(BorderFactory.createLineBorder(new Color(255, 45, 180)));

        m1 = new JLabel("Membership Type");
        m1.setForeground(new Color(204, 255, 47));
        m1.setFont(myFont3);
        m1.setBackground(Color.black);
        m1.setBounds(170,10,250,50);
        tail.add(m1);

        basic = new JButton("BASIC");
        basic.setBackground(new Color(67, 136, 220));
        basic.setFont(myFont3);
        basic.setForeground(new Color(10, 10, 59));
        basic.setFocusable(false);
        basic.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(67, 136, 220), new Color(240, 247, 87)));
        basic.setBounds(25,80,100,50);
        basic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        basic.addMouseListener(this);
        basic.addActionListener(this);
        tail.add(basic);

        delux = new JButton("DELUX");
        delux.setBackground(new Color(235, 158, 5));
        delux.setFont(myFont3);
        delux.setForeground(new Color(15, 9, 9));
        delux.setFocusable(false);
        delux.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(246, 171, 7), new Color(62, 83, 246)));
        delux.setBounds(475,80,100,50);
        delux.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        delux.addMouseListener(this);
        delux.addActionListener(this);
        tail.add(delux);

        reset = new JButton("RESET");
        reset.setBackground(new Color(15, 9, 9));
        reset.setFont(myFont2);
        reset.setForeground(new Color(72, 249, 211));
        reset.setFocusable(false);
        reset.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(240, 247, 87), new Color(240, 29, 36)));
        reset.setBounds(10,860,100,40);
        reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        reset.addActionListener(this);
        frame.add(reset);

        addMember = new JButton("ADD PET");
        addMember.setBackground(new Color(120, 205, 30));
        addMember.setFont(myFont3);
        addMember.setForeground(new Color(4, 11, 183));
        addMember.setFocusable(false);
        addMember.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(5, 21, 118), new Color(109, 178, 19)));
        addMember.setBounds(225,150,150,40);
        addMember.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addMember.addActionListener(this);
        addMember.addMouseListener(this);
        tail.add(addMember);

        exit = new JButton("EXIT");
        exit.setBackground(new Color(235, 2, 2));
        exit.setFont(myFont3);
        exit.setForeground(new Color(204, 215, 212));
        exit.setFocusable(false);
        exit.setBorder(BorderFactory.createSoftBevelBorder(1, new Color(240, 247, 87), new Color(240, 29, 36)));
        exit.setBounds(480,860,100,40);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.addActionListener(this);
        frame.add(exit);

        frame.add(titleBar);
        frame.add(head);
        frame.add(body);
        frame.add(tail);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PetProfilerUI();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        if(mouseEvent.getSource() == nameField){
            nameField.setBackground(new Color(160, 99, 246));
            nameField.setForeground(new Color(6, 6, 33));
            nameField.setFocusable(true);
            if (nameField.getText().equals("Enter the pet name here.....")) {
                nameField.setFont(myFont3);
                nameField.setText("");
            }
        }
        if(mouseEvent.getSource() == ageField){
            ageField.setBackground(new Color(160, 99, 246));
            ageField.setForeground(new Color(6, 6, 33));
            ageField.setFocusable(true);
            if (ageField.getText().equals("Enter pet age.....")) {
                ageField.setFont(myFont3);
                ageField.setText("");
            }
        }
        if(mouseEvent.getSource() == cat){
            cat.setForeground(new Color(87, 23, 57));
            cat.setBackground(new Color(240, 247, 87));
        }
        if(mouseEvent.getSource() == dog){
            dog.setForeground(new Color(29, 39, 240));
            dog.setBackground(new Color(70, 255, 57));
        }
        if(mouseEvent.getSource() == goldFish){
            goldFish.setBackground(new Color(136, 52, 255));
            goldFish.setForeground(new Color(240, 247, 87));
        }
        if(mouseEvent.getSource() == basic){
            basic.setBackground(new Color(10, 10, 59));
            basic.setForeground(new Color(240, 247, 87));
        }
        if(mouseEvent.getSource() == delux){
            delux.setBackground(new Color(202, 254, 81));
            delux.setForeground(new Color(10, 10, 59));
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        if(mouseEvent.getSource() == nameField){
            nameField.setBackground(Color.black);
            nameField.setForeground(new Color(49, 247, 177, 255));
            nameField.setFocusable(false);
            if (nameField.getText().isEmpty()){
                nameField.setFont(myFont2);
                nameField.setText("Enter the pet name here.....");
            }
        }
        if(mouseEvent.getSource() == ageField){
            ageField.setBackground(Color.black);
            ageField.setForeground(new Color(49, 247, 177, 255));
            ageField.setFocusable(false);
            if (ageField.getText().isEmpty()){
                ageField.setFont(myFont2);
                ageField.setText("Enter pet age.....");
            }
        }
        if(mouseEvent.getSource() == cat){
            cat.setForeground(new Color(240, 247, 87));
            cat.setBackground(new Color(15, 9, 9));
        }
        if(mouseEvent.getSource() == dog){
            dog.setForeground(new Color(240, 247, 87));
            dog.setBackground(new Color(15, 9, 9));
        }
        if(mouseEvent.getSource() == goldFish){
            goldFish.setForeground(new Color(240, 247, 87));
            goldFish.setBackground(new Color(15, 9, 9));
        }
        if(mouseEvent.getSource() == basic){
            basic.setBackground(new Color(67, 136, 220));
            basic.setForeground(new Color(10, 10, 59));
        }
        if(mouseEvent.getSource() == delux){
            delux.setBackground(new Color(235, 158, 5));
            delux.setForeground(new Color(15, 9, 9));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cat){
            cat.setForeground(new Color(87, 23, 57));
            cat.setBackground(new Color(240, 247, 87));
            cat.removeMouseListener(this);
            dog.removeActionListener(this);
            goldFish.removeActionListener(this);

            Cat ct = new Cat(nameField.getText(), Integer.parseInt(String.valueOf(ageField.getText())));
            msg = ct.describe();
            description.setText(msg);
        }
        if(e.getSource() == dog){
            dog.setForeground(new Color(29, 39, 240));
            dog.setBackground(new Color(70, 255, 57));
            cat.removeActionListener(this);
            dog.removeMouseListener(this);
            goldFish.removeActionListener(this);

            Dog dg = new Dog(nameField.getText(), Integer.parseInt(String.valueOf(ageField.getText())));
            msg = dg.describe();
            description.setText(msg);
        }
        if(e.getSource() == goldFish){
            goldFish.setBackground(new Color(136, 52, 255));
            goldFish.setForeground(new Color(240, 247, 87));
            cat.removeActionListener(this);
            dog.removeActionListener(this);
            goldFish.removeMouseListener(this);

            GoldFish gf = new GoldFish(nameField.getText(), Integer.parseInt(String.valueOf(ageField.getText())));
            msg = gf.describe();
            description.setText(msg);
        }
        if(e.getSource() == reset){
            frame.dispose();
            new PetProfilerUI();
        }
        if(e.getSource() == exit){
            frame.dispose();
        }
        if(e.getSource() == basic){
            basic.setBackground(new Color(10, 10, 59));
            basic.setForeground(new Color(240, 247, 87));
            basic.setForeground(new Color(240, 247, 87));
            basic.removeMouseListener(this);
            delux.removeActionListener(this);
            delux.removeMouseListener(this);

            member = new BasicMember(nameField.getText(),  description.getText(), frame);

        }
        if(e.getSource() == delux){
            delux.setBackground(new Color(202, 254, 81));
            delux.setForeground(new Color(10, 10, 59));
            delux.removeMouseListener(this);
            basic.removeActionListener(this);
            basic.removeMouseListener(this);

            member = new DeluxMember(nameField.getText(), description.getText(), frame);
        }
        if(e.getSource() == addMember){
            if(member == null){
                JOptionPane.showMessageDialog(frame, "Please Select a Membership Type!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                member.show();
            }
        }
    }
}
