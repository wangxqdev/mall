package com.tec.anji.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/detail")
public class DetailController {

//    icon
//    http://s11.mogucdn.com/p1/160607/upload_ie4tkmbtgqztomjqhezdambqgqyde_44x44.png

    @GetMapping("/{id}")
    public Object getDetail(@PathVariable String id) {
        List<String> topImages = new ArrayList<>();
        topImages.add("http://localhost:8090/img/dress01.jpg");
        topImages.add("http://localhost:8090/img/dress02.jpg");
        topImages.add("http://localhost:8090/img/dress03.jpg");
        topImages.add("http://localhost:8090/img/dress04.jpg");

        Map<String, List<String>> topImagesMap = new HashMap<>();
        topImagesMap.put("topImages", topImages);

        Map<String, Map<String, List<String>>> itemInfoMap = new HashMap<>();
        itemInfoMap.put("itemInfo", topImagesMap);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("id", id);
        resultMap.put("result", itemInfoMap);

        return resultMap;
    }
}
