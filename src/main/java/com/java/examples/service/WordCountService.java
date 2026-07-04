package com.java.examples.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WordCountService implements IWordCountService {

    String str = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.\n" +
            "\n" +
            "Java gained popularity shortly after its release, and has been a very popular programming language since then.[18] Java was the third most popular programming language in 2022 according to GitHub.[19] Although still widely popular, there has been a gradual decline in use of Java in recent years with other languages using JVM gaining popularity.[20]";

    @Override
    public Map<String, Integer> getWordsCount() {

        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] strArray = str.split("\\s");

        for (String s : strArray) {
            if (wordCountMap.containsKey(s)) {
                wordCountMap.put(s, wordCountMap.get(s) + 1);
            } else {
                wordCountMap.put(s, 1);
            }
        }
        return wordCountMap;
    }
}
