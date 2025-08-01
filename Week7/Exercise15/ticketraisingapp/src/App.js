import React from "react";
import ComplaintRegister from "./ComplaintRegister"; // Import your component
import "./App.css"; // Import global styles
import "./ComplaintRegister.css"; // Import component-specific styles

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <ComplaintRegister />
      </header>
    </div>
  );
}

export default App;
