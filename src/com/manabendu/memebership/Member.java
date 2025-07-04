package com.manabendu.memebership;

import javax.swing.JFrame;

interface renewal{
    public void renew();
}

interface showMember{
    public void show();
}

public abstract class Member implements renewal, showMember {
    public Long memberId;
    public String memberName;
    public String profileDescreption;
    protected int daysRemain;
    JFrame frame;

    public Member(String name, String desp, JFrame frame){
        memberId = Helper.generateIds();
        this.memberName = name;
        this.profileDescreption = desp;
        this.frame = frame;

        renew();
//        show();
    }

    public abstract String memberDesp();

}
