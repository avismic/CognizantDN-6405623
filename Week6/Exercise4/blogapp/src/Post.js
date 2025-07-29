import React, { Component } from 'react';

export default class Post extends Component {
  render() {
    const { title, body } = this.props;
    return (
      <div style={{ border: '1px solid #ccc', margin: '1rem', padding: '1rem' }}>
        <h2>{title}</h2>
        <p>{body}</p>
      </div>
    );
  }
}
