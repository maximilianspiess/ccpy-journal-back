package net.ictcampus.yournal.service;

import net.ictcampus.yournal.model.File;
import net.ictcampus.yournal.model.FileNameAndId;
import net.ictcampus.yournal.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class FileService {

    @Autowired
    private FileRepository repository;

    public List<File> getAllFiles() {
        return repository.findAll();
    }

    public Optional<File> getFileById(String id) {
        return repository.findById(id);
    }

    public List<FileNameAndId> getAllFileNameAndGroupId() {
        List<File> files = repository.findAll();
        List<FileNameAndId> nameAndIds= new ArrayList<>();
        for (File file : files) {
            nameAndIds.add(new FileNameAndId(file.getId(), file.getGroup_id(), file.getFile_name()));
        }
        return nameAndIds;
    }

    public List<FileNameAndId> getFilesByGroupId(String group_id) {
        List<File> files = repository.findAll();
        List<FileNameAndId> filesByGroupId = new ArrayList<>();
        for (File file : files) {
            if (file.getGroup_id().equals(group_id)) {
                filesByGroupId.add(new FileNameAndId(file.getId(), file.getGroup_id(), file.getFile_name()));
            }
        }

        return filesByGroupId;
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
