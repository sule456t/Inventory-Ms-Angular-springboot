package com.suleiman.InventoryManagementSystem.service;

import com.suleiman.InventoryManagementSystem.dto.LoginRequest;
import com.suleiman.InventoryManagementSystem.dto.RegisterRequest;
import com.suleiman.InventoryManagementSystem.dto.Response;
import com.suleiman.InventoryManagementSystem.dto.UserDTO;
import com.suleiman.InventoryManagementSystem.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getCurrentLoggedInUser();
    Response updateUser(Long id, UserDTO userDTO);
    Response deleteUser(Long id);
    Response getUserTransactions(Long id);
}
