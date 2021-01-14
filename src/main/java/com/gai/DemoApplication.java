package com.gai;

        import com.gai.config.DBConfig1;
        import com.gai.config.DBConfig2;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.context.properties.EnableConfigurationProperties;
        import org.springframework.cache.annotation.EnableCaching;
        import org.springframework.scheduling.annotation.EnableAsync;
        import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
