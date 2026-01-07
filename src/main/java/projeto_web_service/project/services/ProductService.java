package projeto_web_service.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto_web_service.project.entities.Product;
import projeto_web_service.project.entities.User;
import projeto_web_service.project.repositories.ProductRepository;
import projeto_web_service.project.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj= repository.findById(id);
       return obj.get();
    }
}
