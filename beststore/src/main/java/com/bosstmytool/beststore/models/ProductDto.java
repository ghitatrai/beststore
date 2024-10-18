package com.bosstmytool.beststore.models;

import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.*;

public class ProductDto {
	
    @NotEmpty(message = "The Name is required")
    private String name;
    
    @NotEmpty(message = "The Brand is required")
    private String brand;
    
    @NotEmpty(message = "The Category is required")
    private String category;
    
    @Min(0)
    private double price;
    
    @Size(min=10, max=2000, message = "The description should be between 10 and 2000 characters")
    private String description;
    
    private MultipartFile imageFile;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
