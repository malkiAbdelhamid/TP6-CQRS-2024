package com.esi.msqueryjoinlibrarybook;

import com.example.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})
public class MsQueryJoinLibraryBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsQueryJoinLibraryBookApplication.class, args);
    }

}
