package com.tobsi.myquiz.repository;

import com.tobsi.myquiz.entity.Role;
import com.tobsi.myquiz.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRole name);
}
