package com.kgc.utils;

/**
 * 在页面上显示的分页信息
 */
public class PageBean {
    private int currentPage;
    private int pageSize=5;
    private int rows;//总记录数
    private int totalPage;//总页面数

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        if(currentPage<1){
            this.currentPage=1;
        }else if(currentPage>this.totalPage){
            this.currentPage=this.totalPage;
        }else {
            this.currentPage = currentPage;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRows() {
        return rows;
    }
//根据总行数与pageSize计算总页数
    public void setRows(int rows) {
        this.rows = rows;
        if(this.rows % this.pageSize==0){
            this.totalPage=this.rows/this.pageSize;
        }else{
            this.totalPage=this.rows/this.pageSize+1;
        }
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
