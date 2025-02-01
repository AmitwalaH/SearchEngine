package com.searchengine.demo.controller;

import com.searchengine.demo.model.Documentation;
import com.searchengine.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/")
    public String index(String query, Model model) {
        List<Documentation> results = searchService.search(query);
        model.addAttribute("results", results);
        model.addAttribute("query", query != null ? query : "");
        return "index";
    }
}
