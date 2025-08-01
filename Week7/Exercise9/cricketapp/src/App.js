import React from "react";
import "./App.css";
import ListofPlayers from "./ListofPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {
  // Set this flag to true or false to see the different outputs [cite: 28]
  // true: Shows the list of all players and players with scores < 70 [cite: 30]
  // false: Shows the odd/even players and the merged list [cite: 31]
  const flag = true;

  return (
    <div className="app-container">
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
