package com.trigent.SocialNetworkPostAPP.service;

import com.trigent.SocialNetworkPostAPP.model.SocialNetworkPost;
import com.trigent.SocialNetworkPostAPP.repo.SocialNetworkPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialNetworkPostService {

    @Autowired
    private SocialNetworkPostRepository repository;

    public List<SocialNetworkPost> getTop10PostsByCategory(String category) {
        return repository.findTop10ByPostCategoryOrderByViewCountDesc(category);
    }

    public List<SocialNetworkPost> getPostsByAuthor(String author) {
        return repository.findByAuthor(author);
    }
}
