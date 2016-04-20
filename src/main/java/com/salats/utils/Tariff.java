package com.salats.utils;

import java.util.List;

/**
 * Created by paradise on 19.04.16.
 */
public class Tariff {

    private String name;

    private Integer price;

    private List<String> features;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }
}
