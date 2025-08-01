import React, { useState } from 'react';
import './Register.css'; // We will create this file for styling

// This function validates the entire form
const validateForm = (errors) => {
  let valid = true;
  Object.values(errors).forEach(val => val.length > 0 && (valid = false));
  return valid;
};

const Register = () => {
  const [formData, setFormData] = useState({
    fullName: '',
    email: '',
    password: '',
  });

  const [errors, setErrors] = useState({
    fullName: '',
    email: '',
    password: '',
  });

  // This function handles changes in the input fields and performs live validation
  const handleChange = (event) => {
    const { name, value } = event.target;
    setFormData({ ...formData, [name]: value });

    // Live validation logic as per the requirements [cite: 20, 21, 22]
    let error = '';
    switch (name) {
      case 'fullName':
        error = value.length < 5 ? 'Name should have at least 5 characters' : '';
        break;
      case 'email':
        error = (!value.includes('@') || !value.includes('.')) ? 'Email should have @ and .' : '';
        break;
      case 'password':
        error = value.length < 8 ? 'Password should have at least 8 characters.' : '';
        break;
      default:
        break;
    }
    setErrors({ ...errors, [name]: error });
  };

  // This function handles the form submission [cite: 7]
  const handleSubmit = (event) => {
    event.preventDefault(); // Prevents the page from reloading

    // Check if the form is valid before submitting [cite: 23]
    if (validateForm(errors) && formData.fullName && formData.email && formData.password) {
      alert('Form Submitted Successfully!');
      console.log('Form Data:', formData);
      // Here you would typically send the data to a server
    } else {
      // If the form is invalid, show a generic error or specific errors
      alert('Please fix the errors before submitting.');
    }
  };

  return (
    <div className="register-container">
      <form className="register-form" onSubmit={handleSubmit} noValidate>
        <h2>Register Here!!!</h2>

        {/* Name Input Field */}
        <div className="form-group">
          <label htmlFor="fullName">Name:</label>
          <input
            type="text"
            id="fullName"
            name="fullName"
            value={formData.fullName}
            onChange={handleChange}
            required
          />
          {errors.fullName && <p className="error-text">{errors.fullName}</p>}
        </div>

        {/* Email Input Field */}
        <div className="form-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
          {errors.email && <p className="error-text">{errors.email}</p>}
        </div>

        {/* Password Input Field */}
        <div className="form-group">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            required
          />
          {errors.password && <p className="error-text">{errors.password}</p>}
        </div>
        
        {/* Submit Button */}
        <button type="submit">Submit</button>
      </form>
    </div>
  );
};

export default Register;