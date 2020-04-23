package com.lagou.sqlSession;

import java.util.List;

/**
 * @author HuanyuZhou
 * @date 2020/4/23 14:35
 */
public interface sqlSession {

    //查询所有
    public <E> List<E> selectList(String statementId,Object... params) throws Exception;

    //根据条件查询单个

    public <T> T selectone(String statementId,Object... params) throws Exception;
}
