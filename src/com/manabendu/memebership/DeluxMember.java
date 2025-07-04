package com.manabendu.memebership;

import javax.swing.*;

public class DeluxMember extends Member{

    public DeluxMember(String name, String desp, JFrame frame){
        super(name, desp, frame);
    }

    @Override
    public void renew(){
        daysRemain = 9999999;
    }
    @Override
    public void show(){
        String msg = "";

        msg += "ID: " + memberId +"\n";
        msg += "Name: " + memberName + "\n";
        msg += "BIO: " + profileDescreption + "\n";
        msg += "\nMembership Type: DELUX" + "\n***Membership Doesn't Expire ***" +"\n";

        msg += "\n" + Helper.copyrights + "\n";

        javax.swing.JOptionPane.showMessageDialog(null, msg);
    }
    @Override
    public String memberDesp(){
        return "DELUX MEMBER";
    }
}
