package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy emailCommentNotificationProxy;

    public CommentService(CommentRepository commentRepository,@Qualifier("emailCommentNotificationProxy") CommentNotificationProxy emailCommentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.emailCommentNotificationProxy = emailCommentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in DB
        commentRepository.storeComment(comment);
        //send email
        emailCommentNotificationProxy.sendComment(comment);
    }
}
