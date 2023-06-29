package net.ictcampus.yournal.web;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class FileController {
    @Autowired
    private final FileService fileService;

    public FileController(FileService fileservice) {
        this.fileService = fileservice;
    }

    @GetMapping("/home")
    public String goHome(){
        return fileService.getHome();
    }

    @GetMapping("/getAllFiles")
    public List<File> getAllFiles() {
        return fileService.getAllFiles();
    }

    @GetMapping("/getFileById/{id}")
    public Optional<File> getFileById(@PathVariable String id) {
        return fileService.getFileById(id);
    }

    @PostMapping("/saveFile")
    public String saveFile(@RequestBody File file) {
        return fileService.saveFile(file);
    }

    @DeleteMapping("/deleteFileById/{id}")
    public String deleteFileById(@PathVariable String id) {
        return fileService.deleteFileById(id);
    }


}
