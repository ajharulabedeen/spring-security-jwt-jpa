/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.javabrains.springsecurityjwt;

import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author G7
 */
public class ExceptionLoggin extends AuthenticationException{
    
    public ExceptionLoggin(String msg) {
        super(msg);
    }
    
}
