package web.project.webproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.project.webproject.entity.MaterialAssets;
import web.project.webproject.entity.MaterialAssetsDTO;
import web.project.webproject.entity.Person;
import web.project.webproject.repository.MaterialAssetsRepository;
import web.project.webproject.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MaterialAssetsController {
    @Autowired
    private MaterialAssetsRepository materialAssetsRepository;
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/materialAssets/new/{id}")
    public String createMaterialAssets(@PathVariable("id") Integer id, Model model){
        Person person = personRepository.findById(id).get();
        model.addAttribute("person", person);
        List<MaterialAssets> materialAssetsAll = materialAssetsRepository.findAll();

        List<MaterialAssets> materialAssetsList = new ArrayList<>();
        for(MaterialAssets materialAsset : materialAssetsAll){
            if(materialAsset.getPerson() == person){
                materialAssetsList.add(materialAsset);
            }
        }

        model.addAttribute("materialAssetsList", materialAssetsList);
        model.addAttribute("materialAssets", new MaterialAssetsDTO());
        return "create_materialAssets";
    }

    @PostMapping("/materialAssets/save")
    public String saveMaterialAssets(MaterialAssetsDTO materialAssetsDTO){
        MaterialAssets materialAssets = new MaterialAssets();
        materialAssets.setName(materialAssetsDTO.getName());
        materialAssets.setPrice(materialAssetsDTO.getPrice());

        materialAssets.setPerson(personRepository.getById(materialAssetsDTO.getPerson_id()));
        System.out.println(materialAssetsDTO);
        materialAssetsRepository.save(materialAssets);
        return "redirect:/";
    }
}

// series layer
// modal Mapper

