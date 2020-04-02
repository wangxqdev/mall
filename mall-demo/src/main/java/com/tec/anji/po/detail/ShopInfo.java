package com.tec.anji.po.detail;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShopInfo {

    private List<Service> services = new ArrayList<>();

    public ShopInfo(String[] names) {
        for (String name : names) {
            Service service = new Service();
            service.setIcon("http://s11.mogucdn.com/p1/160607/upload_ie4tkmbtgqztomjqhezdambqgqyde_44x44.png");
            service.setName(name);
            services.add(service);
        }
    }

    @Data
    public class Service {

        private String icon;

        private String name;
    }
}
