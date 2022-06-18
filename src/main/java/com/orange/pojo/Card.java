package com.orange.pojo;

public class Card {

   private Integer id;
   private String cname;
   private String ename;
   private String jname;
   private String pic;

    public Card() {
        this.id = id;
        this.cname = cname;
        this.ename = ename;
        this.jname = jname;
        this.pic = pic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", ename='" + ename + '\'' +
                ", jname='" + jname + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
