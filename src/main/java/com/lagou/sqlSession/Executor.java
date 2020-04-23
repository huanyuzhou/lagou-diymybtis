package com.lagou.sqlSession;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

import java.util.List;

/**
 * @author HuanyuZhou
 * @date 2020/4/23 14:51
 */
public interface Executor {

    public<E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
