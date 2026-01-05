package projeto_web_service.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_web_service.project.entities.Order;
import projeto_web_service.project.entities.User;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
