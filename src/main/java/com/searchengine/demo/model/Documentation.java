package com.searchengine.demo.model;

public class Documentation {
    private String name;
    private String url;
    private String description;

    public Documentation(String name, String url, String description) {
        this.name = name;
        this.url = url;
        this.description = description;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    
    public String getDescription() {
        return description;
    }
}
