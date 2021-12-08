package org.isaccanedo.blogapp.service;

import org.isaccanedo.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
