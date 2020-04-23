package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;

/**
 * @author HuanyuZhou
 * @date 2020/4/23 14:30
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {

        this.configuration = configuration;
    }

    @Override
    public sqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
