package net.ictcampus.yournal.service;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FileService {

    @Autowired
    private FileRepository repository;

    public String getHome() {
        return "You're home";
    }

    public List<File> getAllFiles() {
        return repository.findAll();
    }

    public Optional<File> getFileById(String id) {
        return repository.findById(id);
    }

    public String saveFile(File file) {
        repository.save(file);
        return "Add file with id: " + file.getId();
    }

    public String deleteFileById(String id) {
        repository.deleteById(id);
        return "Delete file with id: " + id;
    }
}
