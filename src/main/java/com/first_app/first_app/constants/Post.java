package com.first_app.first_app.constants;
import org.bson.types.ObjectId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post{
    private ObjectId _id;
    private String profile;
    private String desc;
    private int exp;
    private String tech[];
}
