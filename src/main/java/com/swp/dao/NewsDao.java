package com.swp.dao;

import com.swp.model.condition.NewsListCondition;
import com.swp.model.condition.NewsSaveCondition;
import com.swp.model.dto.NewsDTO;
import org.apache.ibatis.annotations.Param;

import javax.validation.Valid;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename NewsDao
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/13 9:28</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public interface NewsDao {

    /**
     * 获取新闻列表
     * @param title
     * @param index
     * @param count
     * @return
     */
    List<NewsDTO> getAll(@Param("title") String title,
                         @Param("index") Integer index,
                         @Param("count") Integer count);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

    /**
     * 修改
     * @param id
     * @param title
     * @param content
     */
    void update(@Param("id") Long id,
                @Param("title") String title,
                @Param("content") String content);

    /**
     * 新增
     * @param title
     * @param content
     */
    void save(@Param("title") String title,
              @Param("content") String content);
}
