package com.jd.arithmetic;

import java.util.*;

/**
 * Created by lichunran on 2017/12/19.
 */
public class InsuranceCount {

    public static void main(String[] args) {
        List<Long> insurances = new ArrayList<Long>();
        insurances.add(20L);
        insurances.add(30L);
        insurances.add(50L);
        insurances.add(30L);
        insurances.add(50L);
        insurances.add(50L);
        Map<Long, Integer> insuranceCount = count(insurances);
        for(Map.Entry<Long, Integer> insuranceEntry : insuranceCount.entrySet()) {
            System.out.println("key = " + insuranceEntry.getKey() + ",value = " + insuranceEntry.getValue());
        }
    }

    private static Map<Long, Integer> count(List<Long> insurances) {
        Map<Long, Integer> insuranceCount = new HashMap<Long, Integer>();
        for(Long insurance : insurances) {
            if(insuranceCount.containsKey(insurance)) {
                Integer count = insuranceCount.get(insurance);
                insuranceCount.put(insurance, ++count);
            } else {
                insuranceCount.put(insurance, 1);
            }
        }
        return insuranceCount;
    }
}
