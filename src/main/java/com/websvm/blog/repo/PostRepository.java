package com.websvm.blog.repo;

import com.websvm.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>
{

}
