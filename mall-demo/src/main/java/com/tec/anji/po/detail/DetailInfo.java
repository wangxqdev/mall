package com.tec.anji.po.detail;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DetailInfo {

    private String desc;

    private List<DetailImage> detailImage = new ArrayList<>();

    public DetailInfo() {
        DetailImage detailImage1 = new DetailImage();
        detailImage1.setKey("穿着效果");
        List<String> list1 = detailImage1.getList();
        list1.add("http://s5.mogucdn.com/mlcdn/c45406/180818_5e3i5b115fgbg7j7592bc8kf1j0fa_750x793.jpg");
        list1.add("http://s11.mogucdn.com/mlcdn/c45406/180818_4j655fk36dj1ci194k0e9d4j91ca0_750x1200.jpg");
        list1.add("http://s11.mogucdn.com/mlcdn/c45406/180818_07018bi4fb1e056889e046068ai9l_750x733.jpg");

        DetailImage detailImage2 = new DetailImage();
        detailImage2.setKey("衣着质地");
        List<String> list2 = detailImage2.getList();
        list2.add("http://img14.360buyimg.com/imgzone/jfs/t1/76847/26/6486/372223/5d48f7f6E99a4edb2/2702a1add7b85862.jpg");
        list2.add("http://img13.360buyimg.com/imgzone/jfs/t1/43204/5/11064/343523/5d48f7f7E038f3283/32bca024524db635.jpg");
        list2.add("http://img14.360buyimg.com/imgzone/jfs/t1/62522/15/6475/286132/5d48f7f9E684eccf1/2282889c76be4a82.jpg");

        detailImage.add(detailImage1);
        detailImage.add(detailImage2);
    }

    @Data
    private class DetailImage {

        private String key;

        private List<String> list = new ArrayList<>();
    }
}
