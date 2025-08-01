import React from 'react';
import './App.css';
import Counter from './Counter';
import EventButtons from './EventButtons';
import CurrencyConverter from './CurrencyConverter';

function App() {
  return (
    <div className="App">
      <header className="app-header">
        <h1>ReactJS Events Hands-On Lab</h1>
      </header>

      <main className="components-grid">
        {/* Render the Counter component */}
        <Counter />

        {/* Render the EventButtons component which contains two features */}
        <EventButtons />

        {/* Render the CurrencyConverter component */}
        <CurrencyConverter />
      </main>
    </div>
  );
}

export default App;