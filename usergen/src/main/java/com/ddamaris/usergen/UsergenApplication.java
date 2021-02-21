package com.ddamaris.usergen;

import com.ddamaris.usergen.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class UsergenApplication {

    public static List<User> list;
    public static List<User> getUsers(){
        if(list==null){
            list = new ArrayList<>();
            User u1 = new User(1,"Bob","Marley");
            User u2=new User(2,"Elvis","Presley");
            list.add(u1);
            list.add(u2);
        }
        return list;
    }

    public static void main(String[] args) {
        SpringApplication.run(UsergenApplication.class, args);
    }

}
