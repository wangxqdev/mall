package com.tec.anji.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@lombok.Data
public class MultiData {

    private Map<String, List<Data>> banner = new HashMap<>();

    private Map<String, List<Data>> recommend = new HashMap<>();
}
