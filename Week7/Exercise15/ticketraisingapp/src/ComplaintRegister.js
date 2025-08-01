import React, { Component } from 'react';

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);
    // Initialize state to hold form data and a unique transaction ID
    this.state = {
      name: '',
      complaint: '',
      transactionId: this.generateTransactionId(),
    };
  }

  // A single handler to update state for any form field
  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  };

  // Generates a random number for the transaction ID
  generateTransactionId = () => {
    return Math.floor(Math.random() * 100000);
  }

  // Handles the form submission
  handleSubmit = (event) => {
    event.preventDefault(); // Prevents the page from reloading
    if (!this.state.name || !this.state.complaint) {
        alert("Please fill out both fields before submitting.");
        return;
    }
    const msg = `Thanks ${this.state.name}\nYour Complaint was Submitted.\nTransaction ID is: ${this.state.transactionId}`;
    alert(msg);

    // Reset the form and generate a new ID for the next submission
    this.setState({
      name: '',
      complaint: '',
      transactionId: this.generateTransactionId(),
    });
  };

  render() {
    return (
      <div className="form-container">
        <h2>Register Your Complaint Here!</h2>
        <form onSubmit={this.handleSubmit}>
          <div className="form-group">
            <label>Name:</label>
            <input
              type="text"
              name="name"
              value={this.state.name}
              onChange={this.handleChange}
              placeholder="Enter your full name"
            />
          </div>
          <div className="form-group">
            <label>Complaint:</label>
            <textarea
              name="complaint"
              value={this.state.complaint}
              onChange={this.handleChange}
              placeholder="Describe your issue in detail"
            />
          </div>
          <button type="submit">Submit Complaint</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;