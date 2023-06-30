package net.ictcampus.yournal.service;

import net.ictcampus.yournal.model.Group;
import net.ictcampus.yournal.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class GroupService {
    @Autowired
    private GroupRepository repository;

    public List<Group> getAllGroups() {
        return repository.findAll();
    }

    public Optional<Group> getGroupById(String id) {
        return repository.findById(id);
    }

    public List<String> getAllGroupNames() {
        List<Group> groups = repository.findAll();
        List<String> groupnames = new ArrayList<>();
        for (Group group : groups) {
            groupnames.add(group.getGroup_name());
        }

        return groupnames;
    }

    public String saveGroup(Group group) {
        repository.save(group);
        return "Add group with id: " + group.getId();
    }

    public String deleteGroupById(String id) {
        repository.deleteById(id);
        return "Delete group" +
                " with id: " + id;
    }
}
