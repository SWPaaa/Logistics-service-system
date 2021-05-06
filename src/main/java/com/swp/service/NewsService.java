package com.swp.service;

import com.swp.model.dto.NewsDTO;

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
public interface NewsService {


    List<NewsDTO> getAll();
}
