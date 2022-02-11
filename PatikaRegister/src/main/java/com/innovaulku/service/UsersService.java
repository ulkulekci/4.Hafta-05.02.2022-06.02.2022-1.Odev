package com.innovaulku.service;


import com.innovaulku.model.UsersModel;
import com.innovaulku.repository.IUsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final IUsersRepository usersRepository;

    public UsersService(IUsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login, String password, String email) {

    if (login == null || password == null) {
        return null;}
    else {
        if (usersRepository.findFirstByLogin(login).isPresent())
        {
            System.out.println("Duplicate login");
            return null;
        }
        UsersModel usersModel = new UsersModel();
        usersModel.setLogin(login);
        usersModel.setPassword(password);
        usersModel.setEmail(email);
        return usersRepository.save(usersModel);
    }}
        public UsersModel authenticate(String login, String password)
         {return usersRepository.findAllByLoginAndPassword(login,password).orElse(null);
        }
    }

