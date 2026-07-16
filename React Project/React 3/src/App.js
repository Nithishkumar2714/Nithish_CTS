import './App.css';
import React from "react";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contacts";

function App() {
    return (
        <div className="container">
            <Home/>
            <About/>
            <Contact/>
        </div>
    );
}

export default App;
