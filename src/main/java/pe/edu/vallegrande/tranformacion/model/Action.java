package pe.edu.vallegrande.tranformacion.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "action")
public class Action {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String description;
    }

