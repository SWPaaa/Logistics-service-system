package com.swp.service;

import com.swp.model.condition.NewsListCondition;
import com.swp.model.condition.NewsSaveCondition;
import com.swp.model.dto.NewsDTO;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename NewsService
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/13 9:26</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Validated
public interface NewsService {

    /**
     * 获取新闻列表
     * @param condition
     * @return
     */
    List<NewsDTO> getAll(NewsListCondition condition);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 修改
     * @param id
     * @param condition
     */
    void update(Long id, @Valid NewsSaveCondition condition);

    /**
     * 新增
     * @param condition
     */
    void save(@Valid NewsSaveCondition condition);
}
