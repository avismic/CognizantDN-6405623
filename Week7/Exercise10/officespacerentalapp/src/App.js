// src/App.js

import React from 'react';
import './App.css'; // We will create this file for styling
import officeImage from './office-space.jpeg'; // Import the image 

function App() {
  // Create a list of office space objects as required [cite: 23]
  // This allows us to easily add more office spaces in the future
  const officeSpaces = [
    {
      Name: 'DBS',
      Rent: 50000,
      Address: 'Chennai'
    },
    {
      Name: 'Co-Work Inc.',
      Rent: 75000,
      Address: 'Bangalore'
    },
    {
      Name: 'The Hive',
      Rent: 90000,
      Address: 'Mumbai'
    },
     {
      Name: 'Innovate Hub',
      Rent: 58000,
      Address: 'Pune'
    }
  ];

  return (
    <div className="App">
      {/* Create an element to display the heading of the page [cite: 20] */}
      <header className="App-header">
        <h1>Office Space, at an Affordable Range</h1>
      </header>

      <main className="office-list">
        {/* Loop through the office space list and display each one [cite: 23] */}
        {officeSpaces.map((office, index) => (
          <div className="office-card" key={index}>
            {/* Attribute to display the image of the office space  */}
            <img src={officeImage} alt="Modern office space" className="office-image" />
            
            <div className="office-details">
              {/* Create an object of office to display the details like Name, Rent and Address [cite: 22] */}
              <h2>{office.Name}</h2>
              <p className="office-address">{office.Address}</p>
              
              {/* To apply CSS, display the color of the Rent in Red if it’s below 60000 and in Green if it’s above 60000 [cite: 24] */}
              {/* We use an inline style with a ternary operator for the condition */}
              <p className="office-rent" style={{ color: office.Rent <= 60000 ? '#e74c3c' : '#2ecc71' }}>
                Rent: Rs. {office.Rent.toLocaleString()}
              </p>
            </div>
          </div>
        ))}
      </main>
    </div>
  );
}

export default App;