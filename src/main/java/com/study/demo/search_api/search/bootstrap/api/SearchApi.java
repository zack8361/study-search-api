package com.study.demo.search_api.search.bootstrap.api;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchApi {

    @GetMapping("/api-v1")
    public ResponseEntity<?> searchApiV1(@RequestBody String query) {

        return ResponseEntity.ok("Search API V1");
    }
}
