package com.example.administrator.treedemo.bean;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.treedemo.R;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;
import com.zhy.tree.bean.TreeListViewAdapter.OnTreeNodeClickListener;

public class MainActivity extends Activity {
    private List<FileBean> mDatas = new ArrayList<FileBean>();
    private ListView mTree;
    private TreeListViewAdapter mAdapter;
    private List<Bean3> list;
    private String json1 = "{\"data\":{\"id\":\"1\",\"name\":\"1\",\"parentId\":\"0\",\"children\":[{\"id\":\"17\",\"name\":\"1222222\",\"parentId\":\"1\",\"children\":[]},{\"id\":\"18\",\"name\":\"12222333344\",\"parentId\":\"1\",\"children\":[]},{\"id\":\"19\",\"name\":\"1222444555666\",\"parentId\":\"1\",\"children\":[]},{\"id\":\"28\",\"name\":null,\"parentId\":\"1\",\"children\":[{\"id\":\"5\",\"name\":\"1\",\"parentId\":\"28\",\"children\":[]},{\"id\":\"29\",\"name\":null,\"parentId\":\"28\",\"children\":[{\"id\":\"6\",\"name\":\"1\",\"parentId\":\"29\",\"children\":[{\"id\":\"6\",\"name\":\"1\",\"parentId\":\"6\",\"children\":null},{\"id\":\"7\",\"name\":\"1\",\"parentId\":\"6\",\"children\":null}]},{\"id\":\"7\",\"name\":\"1\",\"parentId\":\"29\",\"children\":[{\"id\":\"6\",\"name\":\"1\",\"parentId\":\"7\",\"children\":null},{\"id\":\"7\",\"name\":\"1\",\"parentId\":\"7\",\"children\":null}]}]}]}]},\"resultcode\":\"200\",\"message\":\"登陆成功\"}";
    private String json2 = "{\"data\":{\"id\":\"1\",\"name\":\"sdfafasfsda\",\"parentId\":\"0\",\"level\":\"0\",\"children\":[{\"id\":\"17\",\"name\":\"1222222\",\"parentId\":\"1\",\"level\":\"1\",\"children\":[]},{\"id\":\"18\",\"name\":\"12222333344\",\"parentId\":\"1\",\"level\":\"1\",\"children\":[]},{\"id\":\"19\",\"name\":\"1222444555666\",\"parentId\":\"1\",\"level\":\"1\",\"children\":[]},{\"id\":\"28\",\"name\":\"杜丽芳\",\"parentId\":\"1\",\"level\":\"1\",\"children\":[{\"id\":\"5\",\"name\":\"sdfafasfsda\",\"parentId\":\"28\",\"level\":\"2\",\"children\":[]},{\"id\":\"32\",\"name\":null,\"parentId\":\"28\",\"level\":\"2\",\"children\":[{\"id\":\"6\",\"name\":\"1\",\"parentId\":\"32\",\"level\":\"3\",\"children\":null}]},{\"id\":\"16\",\"name\":\"11111\",\"parentId\":\"28\",\"level\":\"2\",\"children\":[]},{\"id\":\"33\",\"name\":null,\"parentId\":\"28\",\"level\":\"2\",\"children\":[]}]}]},\"resultcode\":\"200\",\"message\":\"登陆成功\"}\n";
    private JsonUtils utils;
    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  initDatas();
        initList();
        mTree = (ListView) findViewById(R.id.id_tree);
        try {
            mAdapter = new SimpleTreeAdapter<FileBean>(mTree, this, mDatas, 10);
            mAdapter.setOnTreeNodeClickListener(new OnTreeNodeClickListener() {
                @Override
                public void onClick(Node node, int position) {
                    if (node.isLeaf()) {
                        Toast.makeText(getApplicationContext(), node.getName(),
                                Toast.LENGTH_SHORT).show();
                    }
                }

            });

            mTree.setAdapter(mAdapter);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    //初始化数据源
    private void initList() {
        utils = new JsonUtils();
        list = utils.getJson(json2);
        //第一层

        mDatas.add(new FileBean(list.get(0).getId3(), list.get(0).getParentId3(), list.get(0).getName3(), 1));
        for (int i = 0; i < list.get(0).getList_bean3().size(); i++) {
            String name = list.get(0).getList_bean3().get(i).getName2();
            mDatas.add(new FileBean(list.get(0).getList_bean3().get(i).getId2(), list.get(0).getList_bean3().get(i).getParentId2(), name, 2));

            for (int k = 0; k < list.get(0).getList_bean3().get(i).getList_bean2().size(); k++) {
                String name1 = list.get(0).getList_bean3().get(i).getList_bean2().get(k).getName1();
                mDatas.add(new FileBean(list.get(0).getList_bean3().get(i).getList_bean2().get(k).getId1(), list.get(0).getList_bean3().get(i).getList_bean2().get(k).getParentId1(), name1, 3));
                for (int j = 0; j < list.get(0).getList_bean3().get(i).getList_bean2().get(k).getList_bean1().size(); j++) {
                    String name2 = list.get(0).getList_bean3().get(i).getList_bean2().get(k).getList_bean1().get(j).getName();
                    mDatas.add(new FileBean(list.get(0).getList_bean3().get(i).getList_bean2().get(k).getList_bean1().get(j).getId(), list.get(0).getList_bean3().get(i).getList_bean2().get(k).getList_bean1().get(j).getParentId(), name2, 4));
                }
            }
        }
    }

//    private void initDatas() {
//
//        // id , pid , label , 其他属性
//        mDatas.add(new FileBean(1, 0, "文件管理系统"));
//        mDatas.add(new FileBean(2, 1, "游戏"));
//
//        mDatas.add(new FileBean(4, 1, "程序"));
//
//        mDatas.add(new FileBean(6, 2, "刀塔传奇"));
//
//        mDatas.add(new FileBean(7, 4, "面向对象"));
//        mDatas.add(new FileBean(8, 4, "非面向对象"));
//        mDatas.add(new FileBean(5, 2, "war3"));
//        mDatas.add(new FileBean(9, 7, "C++"));
//        mDatas.add(new FileBean(20, 7, "JAVA"));
//        mDatas.add(new FileBean(3, 1, "文档"));
//        mDatas.add(new FileBean(21, 7, "Javascript"));
//        mDatas.add(new FileBean(32, 8, "C语言"));
//
//    }

}
