package com.spring.cloud.api.springcloudstreamconsumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book {

    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
