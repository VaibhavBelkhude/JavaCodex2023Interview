package com.trigent.SocialNetworkPostAPP.repo;


import com.trigent.SocialNetworkPostAPP.model.SocialNetworkPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {
    List<SocialNetworkPost> findByAuthor(String author);

    @Query("SELECT p FROM SocialNetworkPost p WHERE p.postCategory = :category ORDER BY p.viewCount DESC")
    List<SocialNetworkPost> findTop10ByPostCategoryOrderByViewCountDesc(String category);
}
