package com.swp.service.impl;

import com.swp.dao.NewsDao;
import com.swp.model.dto.NewsDTO;
import com.swp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanping.sheng
 * @Filename NewsServiceImpl
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/4/13 9:27</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao dao;


    @Override
    public List<NewsDTO> getAll() {
        return null;
    }
}
