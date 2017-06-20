package com.example.administrator.treedemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20. 第三层
 */

public class Bean2 {
    private int id2;
    private String name2;
    private int parentId2;
    private List<Bean1> list_bean2;

    public int getLevel2() {
        return level2;
    }

    public void setLevel2(int level2) {
        this.level2 = level2;
    }

    private int level2;

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getParentId2() {
        return parentId2;
    }

    public void setParentId2(int parentId2) {
        this.parentId2 = parentId2;
    }

    public List<Bean1> getList_bean2() {
        return list_bean2;
    }

    public void setList_bean2(List<Bean1> list_bean2) {
        this.list_bean2 = list_bean2;
    }
}
