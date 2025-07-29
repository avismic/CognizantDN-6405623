import React from "react";
import "./App.css";
import CalculateScore from "./CalculateScore";

function App() {
  return (
    <div style={{ padding: "2rem" }}>
      <h1>Score Calculator App</h1>
      <CalculateScore
        Name="Alice"
        School="Greenwood High"
        Total={88}
        goal={100}
      />
      <CalculateScore
        Name="Bob"
        School="Sunnyvale School"
        Total={76}
        goal={90}
      />
    </div>
  );
}

export default App;
