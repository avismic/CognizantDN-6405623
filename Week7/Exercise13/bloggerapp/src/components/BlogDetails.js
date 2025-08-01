import React from 'react';
import { blogs } from '../data/blogs';

function BlogDetails() {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id} className="item">
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;