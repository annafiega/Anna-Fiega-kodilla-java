package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistic {
    public int numberOfUsers;
    public int numberOfPosts;
    public int numberOfComments;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNubmerOfCommentsPerPost;
    Statistics statistics;



    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (numberOfPosts == 0 || numberOfUsers == 0) {
            this.avgNumberOfPostsPerUser = 0;
            this.avgNumberOfCommentsPerUser = 0;
            this.avgNubmerOfCommentsPerPost = 0;
            this.numberOfPosts=0;
            this.numberOfComments=0;
            }else{
            this.avgNumberOfPostsPerUser = (double)this.numberOfPosts / numberOfUsers;
            this.avgNumberOfCommentsPerUser = (double)this.numberOfComments / numberOfUsers;
            this.avgNubmerOfCommentsPerPost = (double)this.numberOfComments / numberOfPosts;
        }
    }
    public String  showStatistics(){
        String result;
        result=("Number of Users: "+ this.numberOfUsers +"\n"+ "Number of posts: "+ this.numberOfPosts +"\n"+ "Number of comments: "+ this.numberOfComments +"\n"+ "Average number of posts per user: " + this.avgNumberOfPostsPerUser+"\n"+"Average number of comments per user: "+this.avgNumberOfCommentsPerUser +"\n"+"Average number of comments per post: "+this.avgNubmerOfCommentsPerPost+"\n");
        { System.out.println (result);}
        return result;
    }
}