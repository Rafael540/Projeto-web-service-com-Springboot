package projeto_web_service.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto_web_service.project.entities.Category;
import projeto_web_service.project.entities.User;
import projeto_web_service.project.repositories.CategoryRepository;
import projeto_web_service.project.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj= repository.findById(id);
       return obj.get();
    }
}
