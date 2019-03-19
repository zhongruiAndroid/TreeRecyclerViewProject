package com.github.treeview;

import java.io.Serializable;
import java.util.List;

/***
 *   created by zhongrui on 2019/3/19
 */
public class TreeNode implements Serializable{
    /*自身id*/
    protected String uid;
    /*父id*/
    protected String pid;
    /*层级*/
    protected int level;
    /*是否展开*/
    protected boolean expand;
    /*子级*/
    protected List<TreeNode> treeNodeList;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<TreeNode> getTreeNodeList() {
        return treeNodeList;
    }

    public void setTreeNodeList(List<TreeNode> treeNodeList) {
        this.treeNodeList = treeNodeList;
    }

    public boolean isExpand() {
        return expand;
    }
    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
