package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class FileNameAndId {
    private String id;
    private String group_id;
    private String file_name;

    public FileNameAndId (File file) {
        this.id = file.getId();
        this.group_id = file.getGroup_id();
        this.file_name = file.getFile_name();
    }
}
