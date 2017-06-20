package com.example.administrator.treedemo.bean;

/**
 * Created by Administrator on 2017/4/20. 最底层的员工 第一级
 */

public class Bean {
    private int id;
    private String name;
    private int parentId;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
