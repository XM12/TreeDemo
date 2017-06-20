package com.example.administrator.treedemo.bean;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.treedemo.R;
import com.zhy.tree.bean.Node;
import com.zhy.tree.bean.TreeListViewAdapter;

public class SimpleTreeAdapter<T> extends TreeListViewAdapter<T> {
    private List<T> datas;

    public SimpleTreeAdapter(ListView mTree, Context context, List<T> datas,
                             int defaultExpandLevel) throws IllegalArgumentException,
            IllegalAccessException {
        super(mTree, context, datas, defaultExpandLevel);
        this.datas = datas;
    }

    @Override
    public View getConvertView(Node node, int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.icon = (TextView) convertView
                    .findViewById(R.id.id_treenode_icon);
            viewHolder.label = (TextView) convertView
                    .findViewById(R.id.id_treenode_label);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //if (node.getIcon() == -1) {
        //viewHolder.icon.setVisibility(View.INVISIBLE);
        //} else {
        viewHolder.icon.setVisibility(View.VISIBLE);
        //	viewHolder.icon.setImageResource(node.getIcon());
        int level = node.getLevel();
        viewHolder.icon.setText("" + level + 1);
        // }
        viewHolder.label.setText(node.getName());

        return convertView;
    }
   
    private final class ViewHolder {
        TextView icon;
        TextView label;
    }

}
