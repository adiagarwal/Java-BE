package com.first_app.first_app.constants;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post{
    @Id
    private String _id;
    
    private String profile;
    private String desc;
    private int exp;
    private String tech[];
}
