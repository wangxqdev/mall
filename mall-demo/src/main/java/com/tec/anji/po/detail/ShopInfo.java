package com.tec.anji.po.detail;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShopInfo {

    private String shopLogo;

    private String name;

    private int cSells;

    private int cGoods;

    private int cFans;

    private List<Score> score = new ArrayList<>();

    private List<Service> services = new ArrayList<>();

    public ShopInfo(String... sNames) {
        for (String name : sNames) {
            Service service = new Service();
            service.setIcon("http://s11.mogucdn.com/p1/160607/upload_ie4tkmbtgqztomjqhezdambqgqyde_44x44.png");
            service.setName(name);
            services.add(service);
        }

        Score score1 = new Score();
        score1.setBetter(false);
        score1.setName("描述相符");
        score1.setScore(4.64);

        Score score2 = new Score();
        score2.setBetter(true);
        score2.setName("价格合理");
        score2.setScore(5);

        Score score3 = new Score();
        score3.setBetter(false);
        score3.setName("质量满意");
        score3.setScore(4.62);

        score.add(score1);
        score.add(score2);
        score.add(score3);
    }

    @Data
    private class Service {

        private String icon = "http://s11.mogucdn.com/p1/160607/upload_ie4tkmbtgqztomjqhezdambqgqyde_44x44.png";

        private String name;
    }

    @Data
    private class Score {

        private boolean isBetter;

        private String name;

        private double score;
    }
}
