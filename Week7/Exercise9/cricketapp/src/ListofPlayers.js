import React from "react";

// Declare an array with 11 players and their scores [cite: 23]
const players = [
  { name: "Jack", score: 50 },
  { name: "Michael", score: 70 },
  { name: "John", score: 40 },
  { name: "Ann", score: 61 },
  { name: "Brooks", score: 61 },
  { name: "Sachin", score: 95 },
  { name: "Dhoni", score: 100 },
  { name: "Virat", score: 84 },
  { name: "Jadeja", score: 64 },
  { name: "Raina", score: 75 },
  { name: "Rohit", score: 80 },
];

function ListofPlayers() {
  // Use the arrow function feature of ES6 to filter players with scores <= 70 [cite: 12, 24]
  const playersBelow70 = players.filter((player) => player.score <= 70);

  return (
    <div className="card">
      <h1>List of Players</h1>
      {/* Use the map feature of ES6 to display all players [cite: 11, 23] */}
      <ul>
        {players.map((player) => (
          <li key={player.name}>
            Mr. {player.name} <span>{player.score}</span>
          </li>
        ))}
      </ul>

      <h2>List of Players having Scores Less than or equal to 70</h2>
      <ul>
        {playersBelow70.map((player) => (
          <li key={player.name}>
            Mr. {player.name} <span>{player.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
