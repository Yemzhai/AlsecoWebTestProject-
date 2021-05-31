package web.project.webproject.entity;

import javax.persistence.*;

@Entity
public class MaterialAssets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public MaterialAssets() { }

    public MaterialAssets(String name, int price, Person person) {
        this.name = name;
        this.price = price;
        this.person = person;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
