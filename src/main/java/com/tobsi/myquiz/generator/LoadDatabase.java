package com.tobsi.myquiz.generator;

import com.tobsi.myquiz.entity.Employee;
import com.tobsi.myquiz.entity.Role;
import com.tobsi.myquiz.entity.UserRole;
import com.tobsi.myquiz.repository.EmployeeRepository;
import com.tobsi.myquiz.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    /*
    @Bean
    CommandLineRunner initDatabase(RoleRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Role(UserRole.ROLE_ADMIN)));
            log.info("Preloading " + repository.save(new Role(UserRole.ROLE_MODERATOR)));
            log.info("Preloading " + repository.save(new Role(UserRole.ROLE_USER)));
        };
    }
     */

}
