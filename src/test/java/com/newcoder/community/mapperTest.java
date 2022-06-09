package com.newcoder.community;

import com.newcoder.community.dao.AlphaDao;
import com.newcoder.community.dao.DiscussPostMapper;
import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.DiscussPost;
import com.newcoder.community.entity.User;
import com.newcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes =CommunityApplication.class)
public class mapperTest {
    @Autowired
    UserMapper userMapper ;
    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void TestSelectUser(){
        User user=userMapper.selectById(101);
        System.out.println(user);

            User user1=userMapper.selectByName("liubei");
        System.out.println(user1);

        User user2=userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user2);
    }
    @Test
    public void testInsertUser(){
        User user=new User();
        user.setUsername("yyx");
        user.setPassword("yyx");
        user.setSalt("abc");
        user.setEmail("940833295@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        System.out.println(user);
        int row=userMapper.insertUser(user);
        System.out.println(row);
        System.out.println(user.getId());
    }

    @Test
    public void updateUser()
    {
        int row=userMapper.updateStatus(150,1);
        System.out.println(row);
        row=userMapper.updateHeader(150,"http://www.nowcoder.com/102.png");
        System.out.println(row);

        row=userMapper.updatePassword(150,"hello");
        System.out.println(row );
    }

    @Test
    public void selectPosts()
    {
        List<DiscussPost> list=discussPostMapper.selectDiscussPosts(0,0,10);
        for(DiscussPost post :list )
        {
            System.out.println(post);
        }

       int  row =discussPostMapper.selectDiscussPostRows(0);
        System.out.println(row);
    }
}
