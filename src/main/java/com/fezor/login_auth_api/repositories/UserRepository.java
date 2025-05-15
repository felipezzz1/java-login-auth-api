package com.fezor.login_auth_api.repositories;

import com.fezor.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
