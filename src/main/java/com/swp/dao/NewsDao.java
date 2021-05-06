package com.swp.dao;

import com.swp.model.dto.NewsDTO;

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
    List<NewsDTO> getAll();
}
