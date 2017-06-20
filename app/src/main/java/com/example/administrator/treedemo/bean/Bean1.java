package com.example.administrator.treedemo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20. 第二级
 */

public class Bean1 {
    private int id1;
    private String name1;
    private int parentId1;
    private List<Bean> list_bean1;
    private int level1;

    public int getLevel1() {

        return level1;
    }

    public void setLevel1(int level1) {
        this.level1 = level1;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getParentId1() {
        return parentId1;
    }

    public void setParentId1(int parentId1) {
        this.parentId1 = parentId1;
    }

    public List<Bean> getList_bean1() {
        return list_bean1;
    }

    public void setList_bean1(List<Bean> list_bean1) {
        this.list_bean1 = list_bean1;
    }
}
