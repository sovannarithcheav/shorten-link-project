package com.sovannarith.shortenlink.model;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.utility.RandomString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "url_shorten")
@Setter
@Getter
public class UrlShorten {

    public UrlShorten(String original) {
        this.original = original;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String original;
    private String shorten;
    private Date createdDate;
    private Boolean active;

    @PrePersist
    void prePersist() {
        if (createdDate == null) createdDate = new Date();
        if (shorten == null) {
            String key = RandomString.make(10);
            shorten = "http://localhost:8080/" + key;
        }
        if (active == null) active = true;
    }

}
