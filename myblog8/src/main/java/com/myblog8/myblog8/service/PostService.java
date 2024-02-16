package com.myblog8.myblog8.service;

import com.myblog8.myblog8.payload.PostDto;
import com.myblog8.myblog8.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto savePost(PostDto postDto);

    void deletePost(long id);

    PostDto updatePost(long id, PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getPosts();

    List<PostDto> getPosts(int pageNo, int pageSize);

    List<PostDto> getPosts(int pageNo, int pageSize, String sortBy);

    PostResponse getPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
