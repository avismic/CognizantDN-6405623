// src/App.js
import "./App.css";
import GitClient from "./GitClient";
import { useEffect, useState } from "react";

function App() {
  const [repositories, setRepositories] = useState([]);

  useEffect(() => {
    GitClient.getRepositories("techiesyed")
      .then((response) => {
        setRepositories(response.data);
      })
      .catch((error) => {
        console.error("Error fetching repositories:", error);
      });
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h1>GitHub Repositories of User - TechieSyed</h1>
      </header>
      <main className="repo-container">
        {repositories.map((repo) => (
          <div key={repo.id} className="repo-card">
            <h3>{repo.name}</h3>
            <p>{repo.description || "No description available."}</p>
            <a href={repo.html_url} target="_blank" rel="noopener noreferrer">
              View on GitHub
            </a>
          </div>
        ))}
      </main>
    </div>
  );
}

export default App;
