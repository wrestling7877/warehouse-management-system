package com.wms.application.auth;

import com.wms.presentation.auth.dto.LoginRequest;
import com.wms.presentation.auth.dto.LoginResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final AuthenticationManager authenticationManager;

    public LoginResponse login(LoginRequest request) {

     //   authenticationManager.authenticate(
       //         new UsernamePasswordAuthenticationToken(
         //               request.getEmail(),
           //             request.getPassword()
             //   )
       // );

        return new LoginResponse("temporary-token");
    }

}
