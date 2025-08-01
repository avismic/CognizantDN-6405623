import React from 'react';
import './Getuser.css'; // Import the CSS file for styling

class Getuser extends React.Component {
  state = {
    loading: true,
    person: null,
  };

  async componentDidMount() {
    const url = "https://api.randomuser.me/";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ person: data.results[0], loading: false });
    console.log(data.results[0]);
  }

  render() {
    if (this.state.loading) {
      return <div className="loading-text">Loading user...</div>;
    }

    if (!this.state.person) {
      return <div className="loading-text">Could not fetch a user.</div>;
    }

    const { name, picture } = this.state.person;

    return (
      <div className="user-card">
        <img src={picture.large} alt={`${name.first} ${name.last}`} className="user-image" />
        <h1 className="user-name">
          {name.title}. {name.first} {name.last}
        </h1>
      </div>
    );
  }
}

export default Getuser;