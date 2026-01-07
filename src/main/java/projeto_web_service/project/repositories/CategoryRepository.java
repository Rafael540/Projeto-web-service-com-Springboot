package projeto_web_service.project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import projeto_web_service.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {


}
