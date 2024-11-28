package pe.edu.vallegrande.tranformacion.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "goal")
public class Goal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_goal;

        private LocalDateTime first_date;
        private LocalDateTime last_date;
        private String name;
        private String description;
        private String objetive;
        private String time;
        private String state;

        @ManyToOne
        @JoinColumn(name = "action_id")
        private Action action;

        @Transient
        private String name_action;
        
    }


