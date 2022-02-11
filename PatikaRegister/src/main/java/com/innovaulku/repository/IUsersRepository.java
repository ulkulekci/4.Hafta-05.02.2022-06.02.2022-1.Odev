package com.innovaulku.repository;

import com.innovaulku.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsersRepository extends JpaRepository<UsersModel,Integer> {
    Optional<UsersModel> findAllByLoginAndPassword(String login, String password);
    Optional<UsersModel> findFirstByLogin(String login);
}
