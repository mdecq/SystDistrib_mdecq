package fr.i.demo1210.web.controller;

import fr.i.demo1210.web.controller.web.Product;
import fr.i.demo1210.web.controller.web.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao metier;

    @RequestMapping(value="/test",method= RequestMethod.GET)
    public String afficher(){

        return "Cours d'intro à Spring";
    }

    @RequestMapping(value="/unsimul", method= RequestMethod.GET)
    public Product tous(){
        return new Product(1,"ordinateur",1200);
    }

    @RequestMapping(value="/tous", method=RequestMethod.GET)
    public List<Product> afficherTousLesProduits(){
        return this.metier.findAll();
    }
    /*
    @PostMapping(value="/ajouterunproduit")
    public ResponseEntity<Void> ajouterUnProduit()
        if(==null)
            return
       return null;

     */
}

