package ir.jalali.blogtest.controller;

import ir.jalali.blogtest.model.Category;
import ir.jalali.blogtest.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService=categoryService;
    }


    @PostMapping(value = {"/",""})
    public Category saveCategory(@RequestBody Category category){
        return  categoryService.saveCategory(category);
    }
    @GetMapping(value = {"/",""})
    public List<Category> getCategory(){
        return  categoryService.getCategory();
    }

}
