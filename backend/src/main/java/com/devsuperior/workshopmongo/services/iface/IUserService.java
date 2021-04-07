package com.devsuperior.workshopmongo.services.iface;

import com.devsuperior.workshopmongo.models.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();

    UserDTO findById(String id);

}
