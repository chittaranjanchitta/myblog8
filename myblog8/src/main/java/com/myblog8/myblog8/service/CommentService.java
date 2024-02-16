package com.myblog8.myblog8.service;



import com.myblog8.myblog8.entity.Comment;
import com.myblog8.myblog8.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentsId(Long postId, Long commentId);

    List<CommentDto> getCommentsById();

    void deleteCommentById(Long postId, Long commentId);
}
