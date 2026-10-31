package com.learing.jobapprest.repo;

import com.learing.jobapprest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  JobRepo extends JpaRepository<JobPost,Integer> {

  List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String s);
}


//
//    // ArrayList to store JobPost objects

//
//    // method to return all JobPosts
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    // method to save a job post object into arrayList
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//
//    }
//
//
//    public JobPost getJob(int postId) {
//        for(JobPost post : jobs)
//        {
//            if(post.getPostId()==postId)
//            {
//                return post;
//            }
//        }
//
//
//        return null;
//    }
//
//
//    public void updatePost(JobPost jobpost) {
//        for(JobPost jobpost1 : jobs)
//        {
//            if(jobpost1.getPostId() == jobpost.getPostId())
//            {
//                jobpost1.setPostProfile(jobpost.getPostProfile());
//                jobpost1.setPostDesc(jobpost.getPostDesc());
//                jobpost1.setReqExperience(jobpost.getReqExperience());
//                jobpost1.setPostTechStack(jobpost.getPostTechStack());
//
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        for(JobPost jobpost : jobs)
//        {
//            if(jobpost.getPostId()==postId)
//            {
//                jobs.remove(jobpost);
//            }
//        }

