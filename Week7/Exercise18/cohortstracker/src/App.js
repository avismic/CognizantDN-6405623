// src/App.js

import React from "react";
// Ensure this line does NOT have curly braces around CohortDetails
import CohortDetails from "./components/CohortDetails";
import { CohortData } from "./components/Cohort.js";
import "./App.css";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>My Academy Cohort Dashboard</h1>
      </header>
      <div className="cohort-container">
        <CohortDetails cohort={CohortData[0]} />
        <CohortDetails cohort={CohortData[1]} />
      </div>
    </div>
  );
}

export default App;
