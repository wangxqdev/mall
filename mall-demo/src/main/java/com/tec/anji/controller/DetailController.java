package com.tec.anji.controller;

import com.tec.anji.po.detail.ItemInfo;
import com.tec.anji.po.detail.ShopInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/detail")
public class DetailController {

    @GetMapping("/{id}")
    public Object getDetail(@PathVariable String id) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.setTitle("【仲陌美】2018春秋季新款原宿风长袖T恤女bf潮学生韩版拼接白色复古港味宽松百搭上衣打底");
        itemInfo.setDesc("新款上市");
        itemInfo.setPrice(38.50);
        itemInfo.setOldPrice(69.00);
        itemInfo.setLowNowPrice(38.50);
        itemInfo.setDiscountDesc("活动价");
        List<String> topImages = Stream.of("http://localhost:8090/img/dress01.jpg",
                "http://localhost:8090/img/dress02.jpg",
                "http://localhost:8090/img/dress03.jpg",
                "http://localhost:8090/img/dress04.jpg")
                .collect(Collectors.toList());
        itemInfo.getTopImages().addAll(topImages);
        List<String> columns = Stream.of("销售 1580", "收藏33人", "默认快递").collect(Collectors.toList());
        ShopInfo shopInfo = new ShopInfo("退货补运费", "全国包邮", "7天无理由退货", "72小时发货");
        shopInfo.setShopLogo("http://s11.mogucdn.com/mlcdn/c45406/170714_0cg7e9a3ldij28dikejaef50ih38g_300x300.jpg");
        shopInfo.setName("仲陌美");
        shopInfo.setCSells(57876);
        shopInfo.setCGoods(99);
        shopInfo.setCFans(17145);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("itemInfo", itemInfo);
        resultMap.put("columns", columns);
        resultMap.put("shopInfo", shopInfo);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("result", resultMap);
        responseMap.put("id", id);

        return responseMap;
    }
}
