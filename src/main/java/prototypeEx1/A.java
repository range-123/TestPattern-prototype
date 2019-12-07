package main.java.prototypeEx1;

public class A   {
      private String aa;
      private String bb;
      private int    cc;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "A{" +
                "aa='" + aa + '\'' +
                ", bb='" + bb + '\'' +
                ", cc=" + cc +
                '}';
    }


}
