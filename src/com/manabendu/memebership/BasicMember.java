package com.manabendu.memebership;

import javax.swing.*;

public class BasicMember extends Member {

    public BasicMember(String name, String desp, JFrame frame){
        super(name, desp, frame);
    }
    @Override
    public String memberDesp(){
        return "BASIC";
    }

    @Override
    public void renew(){
        daysRemain = 30;
    }

    @Override
    public void show(){
        String msg = "";

        msg += "ID: " + memberId +"\n";
        msg += "Name: " + memberName + "\n";
        msg += "BIO: " + profileDescreption + "\n";
        msg += "\nMembership Type: " + memberDesp() +"\n";
        msg += "Days Remaining: " + daysRemain +"\n";
        msg += "\n" + Helper.copyrights + "\n";

        javax.swing.JOptionPane.showMessageDialog(frame, msg);
    }

}
