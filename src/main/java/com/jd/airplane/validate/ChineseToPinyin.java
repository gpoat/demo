package com.jd.airplane.validate;

import com.alibaba.fastjson.JSON;
import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;
import org.junit.Test;

import java.util.*;

/**
 * Created by lichunran on 2018/3/23.
 */
public class ChineseToPinyin {

    @Test
    public void transform() throws PinyinException {
        /*String s0 = "陈冠希";
        String s1 = "黄渤";
        String s0Pinyin = PinyinHelper.convertToPinyinString(s0, "", PinyinFormat.WITHOUT_TONE);
        String s1Pinyin = PinyinHelper.convertToPinyinString(s1, "", PinyinFormat.WITHOUT_TONE);
        System.out.println(s0Pinyin);
        System.out.println(s1Pinyin);
        System.out.println(s0Pinyin.equals(s1Pinyin));*/
        System.out.println(checkSpell());
    }

    public Map<String, String> checkSpellNew() {
        /*String s1 = "陈冠希";
        String s2 = "周星驰";
        String s3 = "谢霆锋";
        String s4 = "晨灌西";
        List<String> passengerNames = new ArrayList<String>();
        passengerNames.add(s1);
        passengerNames.add(s2);
        passengerNames.add(s3);
        passengerNames.add(s4);
        System.out.println(JSON.toJSONString(passengerNames));
        int size = passengerNames.size();
        String[] spells = new String[size];

        for (int i = 0; i < size; i++) {
//            spells[i] = PinyinHelper.convertToPinyinString(passengerNames.get(i),)
        }

        return null;*/

        return null;
    }

    public boolean checkSpell() throws PinyinException {

        /*String s1 = "陈冠希";
        String s2 = "周星驰";
        String s3 = "谢霆锋";
        String s4 = "晨灌西";
        List<String> passengerNames = new ArrayList<String>();
        passengerNames.add(s1);
        passengerNames.add(s2);
        passengerNames.add(s3);
        passengerNames.add(s4);
        System.out.println(JSON.toJSONString(passengerNames));
        String[] names = new String[4];
        names[0] = s2;
        names[1] = s1;
        names[2] = s3;
        names[3] = s4;
        String[] spells = new String[4];
        for (int i = 0; i < names.length; i++) {
            spells[i] = PinyinHelper.convertToPinyinString(names[i], "", PinyinFormat.WITHOUT_TONE);
        }
        Set<String> spellSet = new HashSet<String>();

        for(String spell : spells) {
            spellSet.add(spell);
        }
        return spellSet.size() >= spells.length;*/
        return false;
    }



}
