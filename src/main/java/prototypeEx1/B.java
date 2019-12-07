package main.java.prototypeEx1;

public class B {
    private String aaa ;
    private String bbb;
    private int    ccc;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public int getCcc() {
        return ccc;
    }

    public void setCcc(int ccc) {
        this.ccc = ccc;
    }

    public B startClone(A  a){
        B b = new B();
        b.setAaa(a.getAa());
        b.setBbb(a.getBb());
        b.setCcc(a.getCc());
        return b;
    }
}
