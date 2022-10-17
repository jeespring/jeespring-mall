package com.jeespring.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * PageVO
 *
 * @author 张朝阳
 * @date 2022/10/13 23:30:30
 */
public class PageVO<T> implements Serializable {

    /**
     * 当前页
     */
    private long pageNo;

    /**
     * 每页的数量
     */
    private long pageSize;

    /**
     * 总页数
     */
    private long pages;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 分页查询结果
     */
    private List<T> rows;

    public long getPageNo() {
        return pageNo;
    }

    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }


}
