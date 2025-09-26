package com.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {

    @JsonProperty(value = "userid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @JsonProperty(value = "username")
    private String uname;

    @JsonProperty(value = "useraddress")
    private String uaddress;

    @JsonProperty(value = "userage")
    private int uage;

}
