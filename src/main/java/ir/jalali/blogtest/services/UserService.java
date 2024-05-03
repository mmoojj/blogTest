package ir.jalali.blogtest.services;

import ir.jalali.blogtest.model.User;
import ir.jalali.blogtest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User registerUser(User user){
        return  this.userRepository.save(user);

    }

    public List<User> findAllUser(){
        return  userRepository.findAll();
    }
}
