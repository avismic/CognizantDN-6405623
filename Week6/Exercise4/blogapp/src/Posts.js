import React, { Component } from 'react';
import Post from './Post';

export default class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => {
        if (!res.ok) throw new Error(`Status ${res.status}`);
        return res.json();
      })
      .then(data => this.setState({ posts: data }))
      .catch(err => this.setState({ error: err.message }));
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert(`Error: ${error}\nInfo: ${JSON.stringify(info)}`);
  }

  render() {
    const { posts, error } = this.state;
    if (error) {
      return <div style={{ color: 'red' }}>Failed to load: {error}</div>;
    }
    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map(p => (
          <Post key={p.id} title={p.title} body={p.body} />
        ))}
      </div>
    );
  }
}
