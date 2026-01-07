package projeto_web_service.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_web_service.project.entities.Product;
import projeto_web_service.project.entities.User;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
