package com.devsuperior.workshopmongo.services.iface;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import com.devsuperior.workshopmongo.models.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();

    UserDTO findById(String id);

    UserDTO insert(UserDTO dto);

    UserDTO update(String id, UserDTO dto);

    void delete(String id);

    List<PostDTO> getUserPosts(String id);
}
