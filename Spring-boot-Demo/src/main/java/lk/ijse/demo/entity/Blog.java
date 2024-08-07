package lk.ijse.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.PathVariable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Blog {
    @Id
    private int id;
    private String title;
    private String content;
}