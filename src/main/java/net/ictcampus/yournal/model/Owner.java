package net.ictcampus.yournal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString

public class Owner {
    @Id
    private String id;
    private String firstName;
    private String last_name;
    private String user_name;
    private String password;
}
