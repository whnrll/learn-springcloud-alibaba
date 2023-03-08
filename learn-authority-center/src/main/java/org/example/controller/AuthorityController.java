package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.annotation.IgnoreResponseAdvice;
import org.example.service.IJwtService;
import org.example.vo.JwtToken;
import org.example.vo.UsernameAndPassword;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：权威控制器
 *
 * @author xutao
 * @Date 2023-03-01 22:16:33
 */
@Slf4j
@RestController
@RequestMapping("/authority")
public class AuthorityController {
    private final IJwtService jwtService;

    public AuthorityController(IJwtService jwtService) {
        this.jwtService = jwtService;
    }

    @IgnoreResponseAdvice
    @PostMapping("/token")
    public JwtToken token(@RequestBody UsernameAndPassword usernameAndPassword) throws Exception {
        log.info("AuthorityController token() input param: [{}]", usernameAndPassword);
        return new JwtToken(
            jwtService.generateToken(usernameAndPassword.getUsername(), usernameAndPassword.getPassword()));
    }
}
