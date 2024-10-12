package com.binarydesign.techledgerapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private int id;
    private String title;
    private String content;
    private int userId;
    private boolean status;
}
