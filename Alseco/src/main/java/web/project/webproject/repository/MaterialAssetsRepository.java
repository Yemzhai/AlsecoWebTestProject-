package web.project.webproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.project.webproject.entity.MaterialAssets;

import java.util.List;

public interface MaterialAssetsRepository extends JpaRepository<MaterialAssets, Integer> {
}
