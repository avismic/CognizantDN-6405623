import React, { Component } from 'react';
import './CountPeople.css'; // We will create this file next for styling

class CountPeople extends Component {
    constructor() {
        super();
        this.state = {
            entrycount: 0,
            exitcount: 0,
        };
    }

    updateEntry = () => {
        this.setState((prevState) => {
            return { entrycount: prevState.entrycount + 1 };
        });
    };

    updateExit = () => {
        this.setState((prevState) => {
            return { exitcount: prevState.exitcount + 1 };
        });
    };

    render() {
        return (
            <div className="container">
                <div className="counter-box">
                    <button className="login-btn" onClick={this.updateEntry}>
                        Login
                    </button>
                    <p className="counter-text">{this.state.entrycount} People Entered!</p>
                </div>

                <div className="counter-box">
                    <button className="exit-btn" onClick={this.updateExit}>
                        Exit
                    </button>
                    <p className="counter-text">{this.state.exitcount} People Left!</p>
                </div>
            </div>
        );
    }
}

export default CountPeople;