package bolyai.pizza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Long id;

    // Column annotáció opcionális
    @Column(unique = true, nullable = false)
    private String nev;

    @Column(nullable = false)
    private PizzaMeret meret;

    private int ar;

    private boolean vegan;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public PizzaMeret getMeret() {
        return meret;
    }

    public void setMeret(PizzaMeret meret) {
        this.meret = meret;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
}
