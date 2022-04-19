package com.example.enterprise.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Enterprise")
@Data
public class Enterprise {

    @Id
    @Transient
    public static final String SEQUENCE_NAME = "enterprise_sequence";
    private long id;

    private String name;
    private String lastname;
    private String email;
    private String dni;
    private int phone;
    private String clienttype;
    private String signer;
}
