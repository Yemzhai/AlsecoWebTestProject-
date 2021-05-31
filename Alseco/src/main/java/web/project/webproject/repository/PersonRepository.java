package web.project.webproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.project.webproject.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
