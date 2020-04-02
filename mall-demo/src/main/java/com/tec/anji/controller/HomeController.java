package com.tec.anji.controller;

import com.tec.anji.po.home.Banner;
import com.tec.anji.po.home.Goods;
import com.tec.anji.po.home.Recommend;
import com.tec.anji.vo.MultiData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/multidata")
    public Object getHomeMultiData() {
        /* Banner */
        Banner banner1 = new Banner();
        banner1.setImage("https://s10.mogucdn.com/mlcdn/c45406/180926_45fkj8ifdj4l824l42dgf9hd0h495_750x390.jpg");
        banner1.setLink("https://act.mogujie.com/huanxin0001?acm=3.mce.2_10_1jhwa.43542.0.ccy5br4OlfK0Q.pos_0-m_454801-sd_119");
        banner1.setTitle("焕新女装节");

        Banner banner2 = new Banner();
        banner2.setImage("https://s10.mogucdn.com/mlcdn/c45406/180926_31eb9h75jc217k7iej24i2dd0jba3_750x390.jpg");
        banner2.setLink("https://act.mogujie.com/ruqiu00001?acm=3.mce.2_10_1ji16.43542.0.ccy5br4OlfK0R.pos_1-m_454889-sd_119");
        banner2.setTitle("入秋穿搭指南");

        Banner banner3 = new Banner();
        banner3.setImage("https://s10.mogucdn.com/mlcdn/c45406/180919_3f62ijgkj656k2lj03dh0di4iflea_750x390.jpg");
        banner3.setLink("https://act.mogujie.com/huanji001?acm=3.mce.2_10_1jfj8.43542.0.ccy5br4OlfK0S.pos_2-m_453270-sd_119");
        banner3.setTitle("秋季护肤大作战");

        Banner banner4 = new Banner();
        banner4.setImage("https://s10.mogucdn.com/mlcdn/c45406/180917_18l981g6clk33fbl3833ja357aaa0_750x390.jpg");
        banner4.setLink("https://act.mogujie.com/liuxing00001?acm=3.mce.2_10_1jepe.43542.0.ccy5br4OlfK0T.pos_3-m_452733-sd_119");
        banner4.setTitle("流行抢先一步");

        List<Banner> banners = new ArrayList<>();
        banners.add(banner1);
        banners.add(banner2);
        banners.add(banner3);
        banners.add(banner4);

        Map<String, List<Banner>> bannersMap = new HashMap<>();
        bannersMap.put("list", banners);

        /* Recommend */
        Recommend recommend1 = new Recommend();
        recommend1.setImage("https://s10.mogucdn.com/mlcdn/c45406/180913_036dli57aah85cb82l1jj722g887g_225x225.png");
        recommend1.setLink("http://act.meilishuo.com/10dianlingquan?acm=3.mce.2_10_1dggc.13730.0.ccy5br4OlfK0U.pos_0-m_313898-sd_119");
        recommend1.setTitle("十点抢券");

        Recommend recommend2 = new Recommend();
        recommend2.setImage("https://s10.mogucdn.com/mlcdn/c45406/180913_25e804lk773hdk695c60cai492111_225x225.png");
        recommend2.setLink("https://act.mogujie.com/tejiazhuanmai09?acm=3.mce.2_10_1dgge.13730.0.ccy5br4OlfK0V.pos_1-m_313899-sd_119");
        recommend2.setTitle("好物特卖");

        Recommend recommend3 = new Recommend();
        recommend3.setImage("https://s10.mogucdn.com/mlcdn/c45406/180913_387kgl3j21ff29lh04181iek48a6h_225x225.png");
        recommend3.setLink("http://act.meilishuo.com/neigouful001?acm=3.mce.2_10_1b610.13730.0.ccy5br4OlfK0W.pos_2-m_260486-sd_119");
        recommend3.setTitle("内购福利");

        Recommend recommend4 = new Recommend();
        recommend4.setImage("https://s10.mogucdn.com/mlcdn/c45406/180913_8d4e5adi8llg7c47lgh2291akiec7_225x225.png");
        recommend4.setLink("http://act.meilishuo.com/wap/yxzc1?acm=3.mce.2_10_1dggg.13730.0.ccy5br4OlfK0X.pos_3-m_313900-sd_119");
        recommend4.setTitle("初秋上新");

        List<Recommend> recommends = new ArrayList<>();
        recommends.add(recommend1);
        recommends.add(recommend2);
        recommends.add(recommend3);
        recommends.add(recommend4);

        Map<String, List<Recommend>> recommendsMap = new HashMap<>();
        recommendsMap.put("list", recommends);

        MultiData multiData = new MultiData();
        multiData.setBanner(bannersMap);
        multiData.setRecommend(recommendsMap);

        Map<String, MultiData> ret = new HashMap<>();
        ret.put("data", multiData);

        return ret;
    }

    @GetMapping("/data")
    public Object getHomeData(String type, int page) {
        List<Goods> goodsList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Goods goods = new Goods();
            String uuid = UUID.randomUUID().toString();
            goods.setId(uuid.substring(uuid.lastIndexOf("-") + 1));
            goods.setImage("http://localhost:8090/img/timg.png");
            goods.setLink("#");
            goods.setTitle(String.format("%s女装女装女装女装女装女装女装女装女装女装%d%d", type, page, i));
            goods.setPrice(120.78);
            goods.setCollect(7680);
            goodsList.add(goods);
        }

        Map<String, List<Goods>> listMap = new HashMap<>();
        listMap.put("list", goodsList);

        Map<String, Map<String, List<Goods>>> dataMap = new HashMap<>();
        dataMap.put("data", listMap);

        return dataMap;
    }
}
