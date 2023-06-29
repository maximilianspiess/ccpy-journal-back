package net.ictcampus.yournal.web;

import net.ictcampus.yournal.model.Group;
import net.ictcampus.yournal.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GroupController {
    @Autowired
    private GroupService groupService;

    public GroupController (GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/getAllGroups")
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/getGroupById/{id}")
    public Optional<Group> getGroupById(@PathVariable String id) {
        return groupService.getGroupById(id);
    }

    @PostMapping("/saveGroup")
    public String saveGroup(@RequestBody Group group) {
        return groupService.saveGroup(group);
    }

    @DeleteMapping("/deleteGroupById/{id}")
    public String deleteGroupById(@PathVariable String id) {
        return groupService.deleteGroupById(id);
    }
}
