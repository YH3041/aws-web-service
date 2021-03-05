package com.younghoon.awswebservice.service;

import com.younghoon.awswebservice.domain.posts.PostsRepository;
import com.younghoon.awswebservice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository repository;

    @Transactional
    public Long Save(PostsSaveRequestDto postsSaveRequestDto) {
        return repository.save(postsSaveRequestDto.toEntity()).getId();
    }

}
