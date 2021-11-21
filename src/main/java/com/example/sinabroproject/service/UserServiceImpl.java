package com.example.sinabroproject.service;


import com.example.sinabroproject.entity.user.entity.User;
import com.example.sinabroproject.entity.user.entity.UserRepository;
import com.example.sinabroproject.payload.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String UserSignUp(UserRequest userRequest) {
        User newUser = User.builder()
                .email(userRequest.getEmail())
                .password(passwordEncoder.encode(userRequest.getPassword()))
                .build();


        userRepository.save(newUser);

        return "success";
    }
}
