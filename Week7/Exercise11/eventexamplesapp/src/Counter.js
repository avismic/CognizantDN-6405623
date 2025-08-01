import React, { useState } from 'react';

function Counter() {
  // Use the useState hook to hold the count value in the component's state
  const [count, setCount] = useState(0);

  // Function to increment the counter
  const incrementValue = () => {
    setCount(prevCount => prevCount + 1); // [cite: 20]
  };

  // Function to decrement the counter
  const decrementValue = () => {
    setCount(prevCount => prevCount - 1); // 
  };

  // A second function to be called by the increase button
  const sayHello = () => {
    alert("Hello! You clicked the increment button!"); // [cite: 21]
  };

  // This function will invoke multiple methods as required 
  const handleIncrement = () => {
    incrementValue();
    sayHello();
  };

  return (
    <div className="component-card">
      <h3>1. Counter</h3>
      <p style={{ fontSize: '24px', fontWeight: 'bold', textAlign: 'center' }}>
        Count: {count}
      </p>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={decrementValue} style={{ backgroundColor: '#f44336' }}>Decrement</button>
    </div>
  );
}

export default Counter;