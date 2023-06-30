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

    public FileNameAndId (String id, String group_id, String file_name) {
        this.id = id;
        this.group_id = group_id;
        this.file_name = file_name;
    }
}
