package com.springkill.HessianTest;


import com.caucho.hessian.io.HessianInput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.remoting.caucho.HessianServiceExporter;

@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class HessianTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HessianTestApplication.class, args);
    }

    @Bean(name = "/hessian")
    public HessianServiceExporter Service() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(new GreetingImpl());
        exporter.setServiceInterface(Greeting.class);
        return exporter;
    }

}
