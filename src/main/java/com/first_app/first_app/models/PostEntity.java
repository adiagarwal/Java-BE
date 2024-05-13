package com.first_app.first_app.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "SpringBoot")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostEntity {
    @Id
    private String _id;
    private String profile;
    private String desc;
    private int exp;
    private String tech[];
}
