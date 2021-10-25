package com.myveg.myveg.vegmodel;

import javax.persistence.*;

@Entity
public class vuser {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column
    private String veg;
    @Column
    private String shopname;
    @Column
    private int qty;
    @Column
    private int price;

    public long getId() {
        return id;
    }

    public String getVeg() {
        return veg;
    }

    public String getShopname() {
        return shopname;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
