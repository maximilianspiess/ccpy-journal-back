package net.ictcampus.yournal.service;

import net.ictcampus.yournal.model.Owner;
import net.ictcampus.yournal.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OwnerService {
    @Autowired
    private OwnerRepository repository;

    public List<Owner> getAllOwners() {
        return repository.findAll();
    }

    public Optional<Owner> getOwnerById(String id) {
        return repository.findById(id);
    }

    public Optional<Owner> getOwnerByUsername(String username) {
        return repository.findByUsername(username);
    }

    public String saveOwner(Owner owner) {
        repository.save(owner);
        return "Save owner with id: " + owner.getId();
    }

    public String deleteOwnerById(String id) {
        repository.deleteById(id);
        return "Delete owner with id: " + id;
    }
}
