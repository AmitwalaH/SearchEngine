package com.searchengine.demo.service;

import com.searchengine.demo.model.Documentation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    // List of default coding documentation URLs.
    private final List<Documentation> docs = new ArrayList<>();

    public SearchService() {
        docs.add(new Documentation("GeeksforGeeks - Java", "https://www.geeksforgeeks.org/java/", "Java tutorials and examples."));
        docs.add(new Documentation("W3Schools - HTML", "https://www.w3schools.com/html/", "HTML tutorials for beginners."));
        docs.add(new Documentation("W3Schools - CSS", "https://www.w3schools.com/css/", "CSS tutorials and examples."));
        docs.add(new Documentation("TutorialsPoint - Java", "https://www.tutorialspoint.com/java/index.htm", "Comprehensive Java tutorials."));
        docs.add(new Documentation("Oracle Java Documentation", "https://docs.oracle.com/en/java/", "Official Java documentation."));
        // You can add more documentation links here...
    }

    /**
     * If the query is empty, return all docs; otherwise, filter by name or description.
     */
    public List<Documentation> search(String query) {
        if (query == null || query.trim().isEmpty()) {
            return docs;
        }
        String lowerQuery = query.toLowerCase();
        return docs.stream()
                .filter(doc -> doc.getName().toLowerCase().contains(lowerQuery)
                        || doc.getDescription().toLowerCase().contains(lowerQuery))
                .collect(Collectors.toList());
    }
}
