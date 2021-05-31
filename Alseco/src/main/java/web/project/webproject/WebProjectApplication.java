package web.project.webproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import web.project.webproject.entity.MaterialAssets;
import web.project.webproject.entity.Person;
import web.project.webproject.repository.PersonRepository;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class WebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

}

//@SpringBootApplication
//public class WebProjectApplication implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(WebProjectApplication.class, args);
//    }
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @Override
//    public void run(String... args) throws Exception{
//        Person isa = new Person("Yemzhai", "Islam", "Bolat");
//        MaterialAssets ma1 = new MaterialAssets("AAAAA", 123456);
//        MaterialAssets ma2 = new MaterialAssets("<<<<<", 5432);
//        isa.setMaterialAssetsList(Arrays.asList(ma1, ma2));
//        personRepository.save(isa);
//    }
//}
