package com.exempledeprojet.Userservice.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "app_user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;
        String nom;
        String prenom;
        String dateNais;

}
