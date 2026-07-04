package com.java.examples.controller;

import com.java.examples.service.IWordCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api")
public class WordCountController {

    @Autowired
    private IWordCountService wordCountService;

    @GetMapping("/wordCounts")
    @ResponseBody
    public ResponseEntity<Map<String, Integer>> wordCount() {
        return new ResponseEntity<>(wordCountService.getWordsCount(), HttpStatus.OK);
    }
}
