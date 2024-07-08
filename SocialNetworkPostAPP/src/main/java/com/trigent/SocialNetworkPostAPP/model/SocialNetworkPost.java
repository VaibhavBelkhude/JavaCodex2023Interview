package com.trigent.SocialNetworkPostAPP.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialNetworkPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date postDate;

    private String postCategory;

    private String author;

    @Column(length = 1000)
    private String content;

    private Long viewCount;
}
