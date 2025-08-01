import React from "react";

// Declare arrays to be merged [cite: 27]
const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];

// Merge the two arrays using the spread operator (...) feature of ES6 [cite: 27]
const IndianPlayersMerged = [...T20Players, ...RanjiTrophyPlayers];

const indianTeam = [
  "Sachin1",
  "Dhoni2",
  "Virat3",
  "Rohit4",
  "Yuvraj5",
  "Raina6",
];

// Use Destructuring feature of ES6 to get odd/even players [cite: 13, 26]
const [first, second, third, fourth, fifth, sixth] = indianTeam;

function OddPlayers() {
  return (
    <>
      <h2>Odd Players</h2>
      <ul>
        <li>
          First: <span>{first}</span>
        </li>
        <li>
          Third: <span>{third}</span>
        </li>
        <li>
          Fifth: <span>{fifth}</span>
        </li>
      </ul>
    </>
  );
}

function EvenPlayers() {
  return (
    <>
      <h2>Even Players</h2>
      <ul>
        <li>
          Second: <span>{second}</span>
        </li>
        <li>
          Fourth: <span>{fourth}</span>
        </li>
        <li>
          Sixth: <span>{sixth}</span>
        </li>
      </ul>
    </>
  );
}

function IndianPlayers() {
  return (
    <div className="card">
      <h1>Indian Team</h1>
      <OddPlayers />
      <hr />
      <EvenPlayers />
      <hr />
      <h2>List of Indian Players Merged:</h2>
      <ul className="merged-list">
        {IndianPlayersMerged.map((player) => (
          <li key={player}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
