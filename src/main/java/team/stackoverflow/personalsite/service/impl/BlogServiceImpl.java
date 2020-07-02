package team.stackoverflow.personalsite.service.impl;

import org.springframework.stereotype.Service;
import team.stackoverflow.personalsite.mapper.BlogMapper;
import team.stackoverflow.personalsite.pojo.Blog;
import team.stackoverflow.personalsite.service.BlogService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BlogServiceImpl
 * @Description TODO
 * @Author ASUS
 * @Date 2020/7/2 8:35
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogMapper blogMapper;

    @Override
    public List<Blog> getBlogsListByConditionPages(Map<String, Object> blogMap) {
        return blogMapper.getBlogsListByConditionPages(blogMap);
    }

    @Override
    public int getCount(Map<String, Object> blogMap) {
        return 0;
    }

    @Override
    public int saveBlog(Blog blog) {
        return 0;
    }

    @Override
    public int updateBlog(Blog blog) {
        return 0;
    }

    @Override
    public int updateState(Map<String, Object> stateMap) {
        return 0;
    }
}
