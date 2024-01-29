package org.example.repository;

import org.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findOptionalByEmailAndPassword(String email, String password);

    List<User> findAllByOrderByName();

    Boolean existsByNameIgnoreCase(String name);

    List<User> findAllByNameContainingIgnoreCase(String name);

    Optional<User> findByEmail(String email);
    List<User> findAllByEmailEndsWithIgnoreCase(String name);

    List<User> findUsersWithLongPasswordNative(Integer length);

    List<User> findUsersWithLongPasswordJPQL(int passwordLength);
}