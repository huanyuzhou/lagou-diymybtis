package com.lagou.io;

import java.io.InputStream;

/**
 * @author HuanyuZhou
 * @date 2020/4/23 10:21
 */
public class Resources {

    public Resources() {
    }

    //根据配置文件的路径，将配置文件加载成字节输入流，储存在内存中
    public static InputStream getResourceAsSteam(String path){
        InputStream resourceAsStream = Resources.class.getClassLoader().getResourceAsStream(path);
        return resourceAsStream;
    }

}
