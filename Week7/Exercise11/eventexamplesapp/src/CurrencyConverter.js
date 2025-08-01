import React, { useState } from 'react';

function CurrencyConverter() {
  const [inr, setInr] = useState('');
  const [euro, setEuro] = useState(0);

  const INR_TO_EURO_RATE = 0.011; // Static rate for this lab

  // This function handles the conversion logic [cite: 25]
  const handleSubmit = (event) => {
    // Prevents the default form submission behavior which reloads the page
    event.preventDefault();
    const euroValue = parseFloat(inr) * INR_TO_EURO_RATE;
    setEuro(euroValue.toFixed(2)); // Format to 2 decimal places
  };

  return (
    <div className="component-card">
      <h3>4. Currency Converter (INR to EUR)</h3>
      {/* We use a form for semantic HTML */}
      <form onSubmit={handleSubmit}>
        <label htmlFor="inr-input">Enter Indian Rupees (INR):</label>
        <input
          type="number"
          id="inr-input"
          value={inr}
          onChange={(e) => setInr(e.target.value)}
          placeholder="e.g., 1000"
        />
        {/* The button's click event is handled by the form's onSubmit */}
        <button type="submit">Convert</button>
      </form>
      {euro > 0 && (
        <p style={{ fontSize: '20px', fontWeight: 'bold', marginTop: '20px' }}>
          Result: ₹{inr} is equal to €{euro}
        </p>
      )}
    </div>
  );
}

export default CurrencyConverter;