package com.example.demo.until;

import com.example.demo.entity.Clazz;

public class Page extends Clazz {
    //	数据总条数
    private int totalCount;
    //	总页数
    private int pageCount;
    //	当前页数
    private int pageIndex = 1;
    //	每页数据条数
    private int pageSize = 3;
    //	起始值
    private int startPos;
    //  分页的标识符
    private int flag;
    //计算方法

    public void calculatePage() {
        //计算总页数
        if (totalCount % pageSize == 0 ) {
            pageCount = totalCount/pageSize;
        }else {
            pageCount = (totalCount/pageSize)+1;
        }
        //计算起始值
        startPos = (pageIndex-1) * pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
