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
    @Bean
    public Framework getFrame(){
        System.out.println("创建Framework from Configuration");
        return new Framework();
    }
}
