package main.java.prototypeEx2;

import java.io.*;
import java.util.Date;

/*
     业务场景：每个人都要写周报与上传文件 均是需要一个实例模板
     设计模式：原型模式   深克隆
     why：每个人都可以写自己的设计模板在相应的界面中，不过每个界面需要有不同的数据
     如：时间 :now 姓名 ：xx 电话：xx 部门 ：xx
 */
public class WeekPlan implements Cloneable,Serializable{
    //上传图片信息
    private  PhotoMange photoMange;
    //用户                                                                              ，
    private  User user;
    //时间
    private Date time;
    //内容
    private String context;
    //加班时长
    private float loadWork;

    public PhotoMange getPhotoMange() {
        return photoMange;
    }

    public void setPhotoMange(PhotoMange photoMange) {
        this.photoMange = photoMange;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public float getLoadWork() {
        return loadWork;
    }

    public void setLoadWork(float loadWork) {
        this.loadWork = loadWork;
    }
    // 深克隆 --序列化
    //思路：将复杂组合对象转化字节流   outPutStream从磁盘读出 inputStream 将对象读入内存


    @Override
    protected WeekPlan clone() throws CloneNotSupportedException {
        WeekPlan weekPlan = new WeekPlan();
        try {
            ByteArrayOutputStream    bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(weekPlan);

            ByteArrayInputStream     bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            ois.readObject();

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (WeekPlan)super.clone();
    }
}
