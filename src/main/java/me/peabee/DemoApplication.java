package me.peabee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@MapperScan("me.peabee.dao.mapper")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        // 自定义处理404异常
        DispatcherServlet servlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
        servlet.setThrowExceptionIfNoHandlerFound(true);
    }
}
