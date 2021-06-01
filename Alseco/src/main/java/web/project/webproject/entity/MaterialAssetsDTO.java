package web.project.webproject.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class MaterialAssetsDTO {
    private String name;
    private int price;
    private int person_id;
}
