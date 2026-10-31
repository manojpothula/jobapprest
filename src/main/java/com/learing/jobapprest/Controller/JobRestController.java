package com.learing.jobapprest;

import com.learing.jobapprest.model.JobPost;
import com.learing.jobapprest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {
    @Autowired
    private JobService service;
    @GetMapping("jobPosts")

    public List<JobPost> getAllJobs()
    {
      return service.getAllJobs();
    }
   @GetMapping("jobPosts/{postId}")

    public JobPost getJob(@PathVariable int postId)
   {
       return service.getJob(postId);
   }
   @PostMapping("jobPosts")
   public void addJob(@RequestBody JobPost jobpost)
   {
    service.addJob(jobpost);
   }
   @PutMapping("jobPosts")
    public JobPost updateJob(@RequestBody JobPost jobpost)
   {
       service.updateJob(jobpost);
       return service.getJob(jobpost.getPostId());
   }
   @DeleteMapping("jobPosts/{postId}")
   public String  deleteJob(@PathVariable int postId )
   {
     service.deleteJob(postId);
     return "deleted";
   }
   @GetMapping("load")
    public  String load()
   {
       service.load();
       return "success";
   }
  @GetMapping("jobPosts/keyword/{keyword}")
   public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword)
   {
    return service.search(keyword);
   }
}
