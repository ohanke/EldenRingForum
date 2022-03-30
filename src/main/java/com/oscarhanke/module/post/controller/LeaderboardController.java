package com.oscarhanke.module.post.controller;

import com.oscarhanke.module.post.repository.CommentRepository;
import com.oscarhanke.module.post.repository.UserRepository;
import com.oscarhanke.module.post.repository.entity.CommentEntity;
import com.oscarhanke.module.post.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;

@Controller
public class LeaderboardController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private LeaderboardService leaderboardService;


    @GetMapping("/leaderboard")
    public String getLeaderboard(){
        HashMap<String, Integer> usersWithLikes = leaderboardService.getUsersWithLikes();

        return "leaderboard.html";
    }
}
