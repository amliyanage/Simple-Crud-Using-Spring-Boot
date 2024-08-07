package lk.ijse.demo.controller;

import lk.ijse.demo.entity.Blog;
import lk.ijse.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    // End Point
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/number")
    public int getNumber() {
        return 9;
    }

    @GetMapping("/data/{number}")
    public int getData(@PathVariable int number) {
        return number;
    }

    @GetMapping("/object")
    public Blog getObject() {
        Blog blog = new Blog();
        return blog;
    }

    @PostMapping("/savepost")
    public void savePost(@RequestBody Blog blog) {
        blogRepository.save(blog);
    }

    @GetMapping("/getallpost")
    public List<Blog> getAllPost() {
        return blogRepository.findAll();
    }

    @PutMapping("/updatepost")
    public void updatePost(@RequestBody Blog blog){
        blogRepository.save(blog);
    }

    @DeleteMapping("/deletepost")
    public String deletePost(@RequestBody Blog blog){
        blogRepository.deleteById(blog.getId());
        return "delete success";
    }
}