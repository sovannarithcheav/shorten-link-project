package com.sovannarith.shortenlink.model;

import com.sovannarith.shortenlink.model.component.Links;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.utility.RandomString;
//
//import javax.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "url_shorten")
@Setter
@Getter
@NoArgsConstructor
public class UrlShorten {

    public UrlShorten(String original) {
        this.original = original;
        if (this.Id == null) {
            this.Id = Links.urls.size() + 1;
            prePersist();
        }
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String original;
    private String shorten;
    private Date createdDate;
    private Boolean active;

//    @PrePersist
    void prePersist() {
        if (createdDate == null) createdDate = new Date();
        if (shorten == null) {
            String key = RandomString.make(10);
//            shorten = "http://localhost:8080/" + key;
            shorten = key;
        }
        if (active == null) active = true;
    }

}
