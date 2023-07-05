package net.ictcampus.yournal.web;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.model.FileNameAndId;
import net.ictcampus.yournal.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5555"})

public class FileController {
    @Autowired
    private final FileService fileService;

    public FileController(FileService fileservice) {
        this.fileService = fileservice;
    }

    @GetMapping("/home")
    public String goHome() {
        return "You're home :D";
    }

    @GetMapping("/getAllFiles")
    public List<File> getAllFiles() {
        return fileService.getAllFiles();
    }

    @GetMapping("/getFileNameAndGroupId")
    public List<FileNameAndId> getFileNameAndGroupId() {
        return fileService.getAllFileNameAndGroupId();
    }

    @GetMapping("/getFilesByGroupId/{group_id}")
    public List<FileNameAndId> getFilesByGroupId(@PathVariable String group_id) {
        return fileService.getFilesByGroupId(group_id);
    }

    @GetMapping("/getFileById/{id}")
    public Optional<File> getFileById(@PathVariable String id) {
        return fileService.getFileById(id);
    }

    @PostMapping(value = "/saveFile", consumes = "application/json")
    public String saveFile(@RequestBody File file) {
        return fileService.saveFile(file);
    }

    @DeleteMapping("/deleteFileById/{id}")
    public String deleteFileById(@PathVariable String id) {
        return fileService.deleteFileById(id);
    }


}
