package com.example.administrator.treedemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20. 老板  第四级
 */

public class Bean3 {
    private int id3;
    private String name3;
    private int parentId3;
    private List<Bean2> list_bean3;
    private int level3;

    public int getLevel3() {
        return level3;
    }

    public void setLevel3(int level3) {
        this.level3 = level3;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public int getParentId3() {
        return parentId3;
    }

    public void setParentId3(int parentId3) {
        this.parentId3 = parentId3;
    }

    public List<Bean2> getList_bean3() {
        return list_bean3;
    }

    public void setList_bean3(List<Bean2> list_bean3) {
        this.list_bean3 = list_bean3;
    }
}
