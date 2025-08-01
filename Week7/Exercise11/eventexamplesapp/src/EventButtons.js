import React from 'react';

function EventButtons() {
  // This function takes an argument as required [cite: 22]
  const sayMessage = (message) => {
    alert(message);
  };

  // This function handles the synthetic event 'onClick' [cite: 23]
  // In React, events like 'onClick' are actually SyntheticEvent wrappers.
  // This provides a consistent API across different browsers. [cite: 4, 9]
  // React event names are camelCase, like 'onClick', not 'onpress'. [cite: 5]
  const handleSyntheticEventClick = (e) => {
    // We can inspect the synthetic event 'e' in the console
    console.log('Synthetic Event Object:', e);
    alert("I was clicked"); // [cite: 23]
  };

  return (
    <>
      <div className="component-card">
        <h3>2. Welcome Button</h3>
        {/* We use an arrow function to call sayMessage with an argument */}
        <button onClick={() => sayMessage('Welcome')}>Say Welcome</button>
      </div>

      <div className="component-card">
        <h3>3. Synthetic Event</h3>
        <p>Click the button and check the browser console to see the SyntheticEvent object.</p>
        {/* The 'OnPress' event is for React Native. For web, we use 'onClick'. */}
        <button onClick={handleSyntheticEventClick}>Invoke "onClick"</button>
      </div>
    </>
  );
}

export default EventButtons;