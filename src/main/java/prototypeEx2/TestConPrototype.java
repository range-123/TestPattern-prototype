package main.java.prototypeEx2;

import java.util.Date;

public class TestConPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1
        PhotoMange pm = new PhotoMange();
        pm.setPhotoTime("2019-12-07  09:22:12");
        pm.setPhotoIds("1111,2222,1212");
        pm.setLoadUser("张笑天");
        pm.setPhotoName("张笑天的工作照.png");

        //2
        PhotoMange pm2 = pm.startClone();
        pm2.setLoadUser("张晓");
        pm2.setPhotoIds("12333312");

        //1
        User user =new User();
        user.setAddr("北京");
        user.setDeptId("12");
        user.setPhoneNum("1231,1232");
        user.setUserName("张笑天");

        //2
        User user2 = user.clone();
        user2.setUserName("张晓");
        user2.setAddr("深圳");

        //1
        WeekPlan weekPlan = new WeekPlan();
        weekPlan.setContext("周一至周五的工作");
        weekPlan.setLoadWork(3);
        weekPlan.setTime(new Date());
        weekPlan.setPhotoMange(pm);
        weekPlan.setUser(user);
        WeekPlan weekplans = weekPlan.clone(); //浅克隆

        //2
        WeekPlan weekplans2 = weekPlan.clone();//深克隆
        weekplans2.setUser(user2);
        weekplans2.setPhotoMange(pm2);
        weekplans2.setContext("周一至周五的工作");
        weekplans2.setLoadWork(3);
        weekplans2.setTime(new Date());

        System.out.println(weekplans.getUser().toString());
        System.out.println(weekplans.getPhotoMange().toString());
        System.out.println(weekplans.getContext().toString());

        System.out.println(weekplans2.getUser().toString());
        System.out.println(weekplans2.getPhotoMange().toString());
        System.out.println(weekplans2.getContext().toString());

        /*  ---------------------------------------------------------*/



    }
}
