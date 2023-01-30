package org.example.model;

public enum Category {
    BOOKS("Books"),TOYS("Toys"),BABY("Baby");
    private String nameCategory;

    Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
