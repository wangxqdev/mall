package com.tec.anji.vo;

import com.tec.anji.po.Banner;
import com.tec.anji.po.Recommend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@lombok.Data
public class MultiData {

    private Map<String, List<Banner>> banner = new HashMap<>();

    private Map<String, List<Recommend>> recommend = new HashMap<>();
}
