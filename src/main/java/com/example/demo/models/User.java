package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.annotation.Generated;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Id
    private String id;
    private String name;
    private String email;
}
