package com.tec.anji.po.detail;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ItemInfo {

    private String title;

    private String desc;

    private double price;

    private double oldPrice;

    private double lowNowPrice;

    private String discountDesc;

    private List<String> topImages = new ArrayList<>();
}
