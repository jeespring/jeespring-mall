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
}
