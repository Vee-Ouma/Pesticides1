package com.example.pesticide;

public class Values {
    private int image;
    private String parent_name,disease_name;

    public Values(int image, String parent_name, String disease_name) {
        this.image = image;
        this.parent_name = parent_name;
        this.disease_name = disease_name;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
