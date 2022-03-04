package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepo;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(null, "127.0.0.1", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server-1.png", Status.SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.70", "Red Hat Linux", "32 GB", "Mail Server", "http://localhost:8080/server/image/server-2.png", Status.SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "Web Server", "http://localhost:8080/server/image/server-2.png", Status.SERVER_DOWN));
        };
    }


}
