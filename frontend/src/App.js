import React, { useState } from "react";
import { BrowserRouter as Router } from "react-router-dom";
import Navbar from "./components/Navbar";
import FlightSearch from "./components/FlightSearch";
import FlightResults from "./components/FlightResults";
import "./styles/App.css"; // Import CSS

function App() {
  const [flights, setFlights] = useState([]);

  return (
    <Router>
      <div className="app-container">
        <Navbar />
        <div className="app-content">
          <FlightSearch setFlights={setFlights} />
          <FlightResults flights={flights} />
        </div>
      </div>
    </Router>
  );
}

export default App;
