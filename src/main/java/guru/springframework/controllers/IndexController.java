package guru.springframework.controllers;

<<<<<<< HEAD
import guru.springframework.domain.Category;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
=======
import guru.springframework.services.RecipeService;
>>>>>>> starting_from_jpa_query
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Slf4j
=======
/**
 * Created by jt on 6/1/17.
 */
>>>>>>> starting_from_jpa_query
@Controller
public class IndexController {

    private final RecipeService recipeService;
<<<<<<< HEAD
    private CategoryRepository categoryRepository;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;

=======

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
>>>>>>> starting_from_jpa_query
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
<<<<<<< HEAD
        log.debug("Getting Index page");

//        Optional<Category> categoryOptional = categoryRepository.findByDescription("America");
=======
>>>>>>> starting_from_jpa_query

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
