import React, { useState } from 'react';
import './App.css';

// Component for the guest user view
function GuestGreeting() {
  return (
    <div className="content-container">
      <h1>Please sign up.</h1>
      <p>Browse our exclusive flight details below. Sign up to book your ticket!</p>
      <div className="flight-details">
        <h3>Flight Details</h3>
        <ul>
          <li>✈️ New York to London - $750</li>
          <li>✈️ Tokyo to Sydney - $900</li>
          <li>✈️ Dubai to Paris - $820</li>
        </ul>
      </div>
    </div>
  );
}

// Component for the logged-in user view
function UserGreeting() {
  return (
    <div className="content-container">
      <h1>Welcome back!</h1>
      <p>You can now book your tickets.</p>
      <div className="booking-section">
        <h3>Book Your Flight</h3>
        <p>Your journey awaits! Select your flight and proceed to checkout.</p>
        <button className="book-ticket-btn">Book Now</button>
      </div>
    </div>
  );
}

// Button to handle login
function LoginButton(props) {
  return (
    <button className="btn login-btn" onClick={props.onClick}>
      Login
    </button>
  );
}

// Button to handle logout
function LogoutButton(props) {
  return (
    <button className="btn logout-btn" onClick={props.onClick}>
      Logout
    </button>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  let button;
  let greeting;

  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
    greeting = <UserGreeting />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
    greeting = <GuestGreeting />;
  }

  return (
    <div className="App">
      <header className="App-header">
        {greeting}
        {button}
      </header>
    </div>
  );
}

export default App;