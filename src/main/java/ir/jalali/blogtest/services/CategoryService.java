package ir.jalali.blogtest.services;

import ir.jalali.blogtest.model.Category;
import ir.jalali.blogtest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> getCategory(){
        return  categoryRepository.findAll();
    }


}
