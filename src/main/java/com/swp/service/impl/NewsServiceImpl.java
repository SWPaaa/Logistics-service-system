package com.swp.service.impl;

import com.swp.dao.NewsDao;
import com.swp.model.condition.NewsListCondition;
import com.swp.model.condition.NewsSaveCondition;
import com.swp.model.dto.NewsDTO;
import com.swp.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.time.LocalDateTime;
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

    /**
     * 获取新闻列表
     * @param condition
     * @return
     */
    @Override
    public List<NewsDTO> getAll(NewsListCondition condition) {
        List<NewsDTO> list = dao.getAll(condition.getTitle(), condition.getIndex(), condition.getCount());
        for(NewsDTO dto : list){
            if(dto.getContent().length()>30){
                dto.setShortContent(dto.getContent().substring(0,30));
            }else{
                dto.setShortContent(dto.getContent());
            }
        }
        return list;
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    /**
     * 修改
     * @param id
     * @param condition
     */
    @Override
    public void update(Long id, NewsSaveCondition condition) {
        dao.update(id, condition.getTitle(), condition.getContent());
    }

    /**
     * 新增
     * @param condition
     */
    @Override
    public void save(NewsSaveCondition condition) {

        dao.save(condition.getTitle(), condition.getContent());
    }
}
