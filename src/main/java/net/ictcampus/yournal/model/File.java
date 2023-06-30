package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@ToString

@Document(collection = "files")
public class File {
    @Id
    private String id;
    private String owner_id;
    private String file_name;
    private String creation_date = LocalDateTime.now().toString();
    private ArrayList<TextBlock> text_blocks;
}
