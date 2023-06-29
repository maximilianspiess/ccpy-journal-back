package net.ictcampus.yournal.web;

import net.ictcampus.yournal.model.Owner;
import net.ictcampus.yournal.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/getAllOwners")
    public List<Owner> getAllOwners() {
        return ownerService.getAllOwners();
    }

    @GetMapping("/getOwnerById/{id}")
    public Optional<Owner> getOwnerById(@PathVariable String id) {
        return ownerService.getOwnerById(id);
    }

    @GetMapping("/getOwnerByUsername/{username}")
    public Optional<Owner> getOwnerByUsername(@PathVariable String username){
        return ownerService.getOwnerByUsername(username);
    }

    @PostMapping("/saveOwner")
    public String saveOwner(@RequestBody Owner owner) {
        return ownerService.saveOwner(owner);
    }

    @DeleteMapping("/deleteOwnerById/{id}")
    public String deleteOwnerById(@PathVariable String id) {
        return ownerService.deleteOwnerById(id);
    }
}
