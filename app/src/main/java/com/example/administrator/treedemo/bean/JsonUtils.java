package com.example.administrator.treedemo.bean;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/20. 解析工具类
 */

public class JsonUtils {
    public List<Bean3> getJson(String json1) {
        List<Bean3> list = null;
        try {
            JSONObject json = new JSONObject(json1);
            if (json.has("data")) {
                JSONObject json_1 = json.getJSONObject("data");
                list = new ArrayList<>();
                Bean3 bean3 = new Bean3();
                if (json_1.has("id")) {
                    String id33 = json_1.getString("id");
                    int id3 = Integer.parseInt(id33);
                    bean3.setId3(id3);
                }
                if (json_1.has("name")) {
                    String name3 = json_1.getString("name");
                    bean3.setName3(name3);
                }
                if (json_1.has("parentId")) {
                    String parentId33 = json_1.getString("parentId");
                    int parentId3 = Integer.parseInt(parentId33);
                    bean3.setParentId3(parentId3);
                }
                if (json_1.has("level")) {
                    String level33 = json_1.getString("level");
                    int level3 = Integer.parseInt(level33);
                    bean3.setLevel3(level3);

                }
                if (json_1.has("children")) {
                    JSONArray array_1 = json_1.getJSONArray("children");
                    List<Bean2> list1 = new ArrayList<>();
                    for (int i = 0; i < array_1.length(); i++) {
                        Bean2 bean2 = new Bean2();
                        JSONObject json_2 = array_1.getJSONObject(i);
                        if (json_2.has("id")) {
                            String id22 = json_2.getString("id");
                            int id2 = Integer.parseInt(id22);
                            bean2.setId2(id2);
                        }
                        if (json_2.has("name")) {
                            String name2 = json_2.getString("name");
                            bean2.setName2(name2);
                        }
                        if (json_2.has("parentId")) {
                            String parentId22 = json_2.getString("parentId");
                            int parentId2 = Integer.parseInt(parentId22);
                            bean2.setParentId2(parentId2);
                        }
                        if (json_2.has("level")) {
                            String level22 = json_2.getString("level");
                            int level2 = Integer.parseInt(level22);
                            bean2.setLevel2(level2);
                        }
                        if (json_2.has("children")) {
                            JSONArray array_2 = json_2.getJSONArray("children");
                            List<Bean1> list2 = new ArrayList<>();
                            for (int k = 0; k < array_2.length(); k++) {
                                Bean1 bean1 = new Bean1();
                                JSONObject json_3 = array_2.getJSONObject(k);
                                if (json_3.has("id")) {
                                    String id33 = json_3.getString("id");
                                    int id3 = Integer.parseInt(id33);
                                    bean1.setId1(id3);
                                }
                                if (json_3.has("name")) {
                                    String name3 = json_3.getString("name");
                                    bean1.setName1(name3);
                                }
                                if (json_3.has("parentId")) {
                                    String parentId33 = json_3.getString("parentId");
                                    int parentId3 = Integer.parseInt(parentId33);
                                    bean1.setParentId1(parentId3);
                                }
                                if (json_3.has("level")) {
                                    String level33 = json_3.getString("level");
                                    int level3 = Integer.parseInt(level33);
                                    bean1.setLevel1(level3);
                                }
                                if (json_3.has("children")) {
                                    JSONArray array_3 = json_3.getJSONArray("children");
                                    List<Bean> list3 = new ArrayList<>();
                                    for (int j = 0; j < array_3.length(); j++) {
                                        Bean bean = new Bean();
                                        JSONObject json_4 = array_3.getJSONObject(j);
                                        if (json_4.has("id")) {
                                            String id44 = json_4.getString("id");
                                            int id4 = Integer.parseInt(id44);
                                            bean.setId(id4);
                                        }
                                        if (json_4.has("name")) {
                                            String name4 = json_4.getString("name");
                                            bean.setName(name4);
                                        }
                                        if (json_4.has("parentId")) {
                                            String parentId44 = json_4.getString("parentId");
                                            int parentId4 = Integer.parseInt(parentId44);
                                            bean.setParentId(parentId4);
                                        }
                                        if (json_4.has("level")) {
                                            String level44 = json_4.getString("level");
                                            int level4 = Integer.parseInt(level44);
                                            bean.setLevel(level4);
                                        }
                                        list3.add(bean);
                                    }
                                    bean1.setList_bean1(list3);
                                }
                                list2.add(bean1);
                            }
                            bean2.setList_bean2(list2);
                        }
                        list1.add(bean2);
                    }
                    bean3.setList_bean3(list1);
                }
                //TODO 添加老板那一层数据
                list.add(bean3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

}
