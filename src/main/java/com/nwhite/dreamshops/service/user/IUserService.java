package com.nwhite.dreamshops.service.user;

import com.nwhite.dreamshops.dto.UserDto;
import com.nwhite.dreamshops.model.User;
import com.nwhite.dreamshops.request.CreateUserRequest;
import com.nwhite.dreamshops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
