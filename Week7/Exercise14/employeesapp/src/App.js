// src/App.js (Updated)
import React, { useState } from 'react';
import EmployeesList from './EmployeesList';
import ThemeContext from './ThemeContext'; // 1. Import the context [cite: 30]
import './App.css';

function App() {
  const [theme, setTheme] = useState('light');

  const employees = [
    { id: 1, first_name: "John", last_name: "Doe", email: "john.doe@example.com", avatar: "https://i.pravatar.cc/150?img=1" },
    { id: 2, first_name: "Jane", last_name: "Smith", email: "jane.smith@example.com", avatar: "https://i.pravatar.cc/150?img=2" },
    { id: 3, first_name: "Peter", last_name: "Jones", email: "peter.jones@example.com", avatar: "https://i.pravatar.cc/150?img=3" }
  ];

  const toggleTheme = () => {
    setTheme(currentTheme => (currentTheme === 'light' ? 'dark' : 'light'));
  };

  // 2. The entire JSX is wrapped in the provider.
  // The value is assigned from the component's state [cite: 32]
  return (
    <ThemeContext.Provider value={theme}>
      <div className={`app-container ${theme}`}>
        <header>
          <h1>Employee Management</h1>
          <button onClick={toggleTheme} className={`button ${theme}`}>
            Switch to {theme === 'light' ? 'Dark' : 'Light'} Mode
          </button>
        </header>
        {/* 3. The theme prop is no longer passed here [cite: 33] */}
        <EmployeesList employees={employees} />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;