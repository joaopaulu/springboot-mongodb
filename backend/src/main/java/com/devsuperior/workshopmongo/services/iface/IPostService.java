package com.devsuperior.workshopmongo.services.iface;

import com.devsuperior.workshopmongo.models.dto.PostDTO;

public interface IPostService {

    PostDTO findById(String id);

}
