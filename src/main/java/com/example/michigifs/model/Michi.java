package com.example.michigifs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Michi")
public class Michi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gif_id;

    @Column(name = "gif_name")
    private String gif_name;
    @Column(name = "gif_url")
    private String gif_url;
    @Column(name = "gif_dimensions")
    private String gif_dimensions;
}
