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

    @GetMapping("/api-v2")
    public ResponseEntity<?> searchApiV2(@RequestBody String query) {

        return ResponseEntity.ok("Search API V2");
    }

    @GetMapping("/api-v3")
    public ResponseEntity<?> searchApiV3(@RequestBody String query) {

        return ResponseEntity.ok("Search API V3");
    }
}
