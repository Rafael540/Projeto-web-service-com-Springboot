package projeto_web_service.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_web_service.project.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
