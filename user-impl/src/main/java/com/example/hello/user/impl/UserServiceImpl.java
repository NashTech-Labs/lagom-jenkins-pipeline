package com.example.hello.user.impl;

import java.util.concurrent.CompletableFuture;

import akka.NotUsed;
import com.example.hello.user.api.UserService;
import com.example.hello.user.models.UserResponse;
import com.lightbend.lagom.javadsl.api.ServiceCall;

public class UserServiceImpl implements UserService {

  public UserServiceImpl() {

  }
  @Override public ServiceCall<NotUsed, UserResponse> helloUser() {
    return request -> {
      UserResponse userResponse = new UserResponse();
      userResponse.setMessage("hello world");
      return CompletableFuture.completedFuture(userResponse);
    };
  }

}
