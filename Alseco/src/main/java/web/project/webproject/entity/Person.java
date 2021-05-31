package web.project.webproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String patronymic;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<MaterialAssets> materialAssetsList;

    public Person() {}

    public Person(String first_name, String last_name, String patronymic) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
    }

    public int countOfMaterialAssets(){
        return materialAssetsList.size();
    }

    public int totalPrice(){
        int result = 0;
        for (MaterialAssets materialAssets : materialAssetsList) {
            result += materialAssets.getPrice();
        }
        return result;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirst_name() { return first_name; }
    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }
    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getPatronymic() { return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public List<MaterialAssets> getMaterialAssetsList() { return materialAssetsList; }
    public void setMaterialAssetsList(List<MaterialAssets> materialAssetsList) { this.materialAssetsList = materialAssetsList; }
}
