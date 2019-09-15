package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //The method calls the updateImage() method in the Repository and passes the Image to be updated in the database
    public void updateComment(Comment comment) {
        commentRepository.updateComment(comment);
    }

    public List<Comment> getComment(Integer imageId)
    {
        return commentRepository.getComment(imageId);
    }
}
