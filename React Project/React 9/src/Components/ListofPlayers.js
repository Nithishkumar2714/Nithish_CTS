import React from "react";

function ListofPlayers() {
    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 76 },
        { name: "Rahul", score: 65 },
        { name: "Pant", score: 91 },
        { name: "Hardik", score: 68 },
        { name: "Jadeja", score: 72 },
        { name: "Ashwin", score: 58 },
        { name: "Shami", score: 49 },
        { name: "Bumrah", score: 85 },
        { name: "Siraj", score: 61 }
    ];
    const lowScorePlayers = players.filter(player => player.score < 70);
    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
            <h2>Players with Score below 70</h2>

            {lowScorePlayers.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}
export default ListofPlayers;