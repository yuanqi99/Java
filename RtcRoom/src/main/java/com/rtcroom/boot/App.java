package com.rtcroom.boot;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.rtcroom.*")
@MapperScan("com.rtcroom.project.**.**.mapper")
public class App
{
    public static void main( String[] args )
    {
        SpringApplication springApplication = new SpringApplication(App.class);

        springApplication.addListeners(new ApplicationListener<ApplicationEvent>(){
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("Application Event: " + event.toString());
                System.out.println("Bean 初始化");
            }
        });

        springApplication.addListeners(new ApplicationListener<ContextRefreshedEvent>() {
            @Override
            public void onApplicationEvent(ContextRefreshedEvent event) {
                System.out.println("Context Refreshed Event: " + event.toString());
                System.out.println("Bean 初始化");
            }
        });

        springApplication.addListeners(new ApplicationListener<ContextClosedEvent>(){
            @Override
            public void onApplicationEvent(ContextClosedEvent event) {
                System.out.println("Application Event: " + event.toString());
                System.out.println("Bean 关闭");
            }
        });
        springApplication.run(args);

        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());








    }
}
