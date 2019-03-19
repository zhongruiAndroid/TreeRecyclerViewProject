package com.github.treeview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/***
 *   created by zhongrui on 2019/3/19
 */
public class TreeViewAdapter<T extends TreeNode> extends RecyclerView.Adapter{
    private List<T> data;
    private List<View>treeView;
    private Context context;
    private int layoutId;
    private LayoutInflater inflater;
    /*是否需要展开全部层级*/
    private boolean expandAll;
    /*需要展开的层级*/
    private SparseBooleanArray expandLevel;

    public TreeViewAdapter(Context context,int layoutId) {
        this.context=context;
        this.layoutId=layoutId;
        inflater=LayoutInflater.from(context);
        treeView=new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int position) {
        switch (getItemViewType(position)){
            case 0:

            break;
        }
        TreeHolder treeHolder=new TreeHolder(inflater.inflate(layoutId,viewGroup,false));
        return treeHolder;
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder viewHolder, int position) {

    }

    public static class TreeHolder extends RecyclerView.ViewHolder{
        public TreeHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public int getItemViewType(int position) {
        T t = data.get(position);
        return super.getItemViewType(position);
    }

    /****************************************************************************/
    @Override
    public int getItemCount() {
        return data==null?0:data.size();
    }
    public List<T> getData() {
        return data;
    }
    public void setData(List<T> data) {
        this.data = data;
    }

    public List<View> getTreeView() {
        return treeView;
    }
    public void setTreeView(List<View> treeView) {
        this.treeView = treeView;
    }
    public void addTreeView(int index,View view){
        treeView.add(index,view);
    }
    public void setTreeView(int index,View view){
        treeView.set(index,view);
    }
    public void addTreeView(View view){
        treeView.add(view);
    }

    public boolean isExpandAll() {
        return expandAll;
    }

    public void setExpandAll(boolean expandAll) {
        this.expandAll = expandAll;
    }

    public SparseBooleanArray getExpandLevel() {
        return expandLevel;
    }
    public void setExpandLevel(SparseBooleanArray expandLevel) {
        if(this.expandLevel==null&&expandLevel==null){
            expandLevel=new SparseBooleanArray();
        }
        this.expandLevel = expandLevel;
    }
    public void setExpandLevel(int index,boolean expand) {
        if(this.expandLevel==null){
            expandLevel=new SparseBooleanArray();
        }
        this.expandLevel.put(index,expand);
    }
}
