package com.devsuperior.workshopmongo.services.iface;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPostService {

    PostDTO findById(String id);

    List<PostDTO> findByTitle(String text);

    @Transactional(readOnly = true)
    List<PostDTO> fullSearch(String text, String start, String end);
}
