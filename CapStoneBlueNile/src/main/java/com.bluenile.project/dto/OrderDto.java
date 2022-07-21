package com.bluenile.project.dto;

import org.springframework.lang.NonNull;

public class OrderDto {

    private Long id;
    private @NonNull String name;
    private @NonNull String imageURL;
    private @NonNull double price;
    private @NonNull String description;


    public OrderDto() {
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(@NonNull String imageURL) {
        this.imageURL = imageURL;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }
}
