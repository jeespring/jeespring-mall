package com.jeespring.common.request;

import lombok.Data;

/**
 * PageRequest
 *
 * @author 张朝阳
 * @date 2022/10/18 22:36:36
 */
@Data
public class PageRequest {

    private Long pageNumber;

    private Long pageSize;
}
