package projeto_web_service.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto_web_service.project.entities.Order;
import projeto_web_service.project.entities.User;
import projeto_web_service.project.repositories.OrderRepository;
import projeto_web_service.project.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = orderRepository.findById(id);
       return obj.get();
    }
}
