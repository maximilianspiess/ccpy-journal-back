package net.ictcampus.yournal.web;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {
    @Autowired
    private final FileService fileservice;

    public FileController(FileService fileservice) {
        this.fileservice = fileservice;
    }

    @GetMapping("/home")
    public String goHome(){
        return fileservice.getHome();
    }

    @GetMapping("/getAllFiles")
    public List<File> getAllFiles() {
        return fileservice.getAllFiles();
    }

    @GetMapping("/getFileById/{id}")
    public Optional<File> getFileById(@PathVariable String id) {
        return fileservice.getFileById(id);
    }

    @PostMapping("/saveFile")
    public String saveFile(@RequestBody File file) {
        return fileservice.saveFile(file);
    }

    @DeleteMapping("/deleteFileById/{id}")
    public String deleteFileById(@PathVariable String id) {
        return fileservice.deleteFileById(id);
    }


}
