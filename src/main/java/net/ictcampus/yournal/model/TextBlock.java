package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class TextBlock {

    private String block_id;
    private String block_type;
    private String block_content;
}
