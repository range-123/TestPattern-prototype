package main.java.prototypeEx2;

// 浅克隆   --自定义
public class PhotoMange {

    private String photoName;

    private String loadUser; //上传人

    private String photoIds; //上传图片id

    private String photoTime;//上传时间

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public String getLoadUser() {
        return loadUser;
    }

    public void setLoadUser(String loadUser) {
        this.loadUser = loadUser;
    }

    public String getPhotoIds() {
        return photoIds;
    }

    public void setPhotoIds(String photoIds) {
        this.photoIds = photoIds;
    }

    public String getPhotoTime() {
        return photoTime;
    }

    public void setPhotoTime(String photoTime) {
        this.photoTime = photoTime;
    }

    @Override
    public String toString() {
        return "PhotoMange{" +
                "photoName='" + photoName + '\'' +
                ", loadUser='" + loadUser + '\'' +
                ", photoIds='" + photoIds + '\'' +
                ", photoTime='" + photoTime + '\'' +
                '}';
    }

    public PhotoMange startClone(){
        PhotoMange photoMange = new PhotoMange();
        photoMange.setPhotoName(this.photoName);
        photoMange.setLoadUser(this.loadUser);
        photoMange.setPhotoTime(this.photoTime);
        photoMange.setPhotoIds(this.photoIds);
        return photoMange;

    }
}
