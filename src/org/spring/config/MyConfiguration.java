package org.spring.config;

import org.spring.beans.bo.Framework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-01-25
 * Time: 16:01
 */
@Configuration
public class MyConfiguration {
    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Bean
    public Framework framework(){
        System.out.println("创建Framework from Configuration");
        return new Framework();
    }
}
