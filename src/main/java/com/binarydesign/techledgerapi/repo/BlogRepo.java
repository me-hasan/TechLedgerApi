package com.binarydesign.techledgerapi.repo;


import com.binarydesign.techledgerapi.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<BlogPost, Integer> {

//    List<BlogPost> blogs = new ArrayList<>();
//
//    public BlogRepo() {
//        blogs.add(new BlogPost(1, "New post for fins",  "This is dummy text", 3, true));
//        blogs.add(new BlogPost(2, "New post for fins", "This is dummy text", 5, false));
//        blogs.add(new BlogPost(3, "New post for fins", "This is dummy text", 8, true));
//    }
//
//    public List<BlogPost> getAllBlogs(){
//        return blogs;
//    }
//
//    public void addBlog(BlogPost blogPost) {
//        blogPost.setId(blogs.size() + 1);
//        blogs.add(blogPost);
//    }
}
