import React, { useState } from "react";
import { fetchFlights } from "../api";
import "../styles/FlightSearch.css"; // Import CSS

const FlightSearch = ({ setFlights }) => {
  const [from, setFrom] = useState("");
  const [to, setTo] = useState("");
  const [date, setDate] = useState("");
  const [loading, setLoading] = useState(false);

  const handleSearch = async () => {
    setLoading(true);
    try {
      const flights = await fetchFlights(from, to, date);
      setFlights(flights);
    } catch (error) {
      console.error("Error fetching flights:", error);
    }
    setLoading(false);
  };

  return (
    <div className="flight-search-container">
      <h2>Search Flights</h2>
      <input
        type="text"
        placeholder="From"
        value={from}
        onChange={(e) => setFrom(e.target.value)}
      />
      <input
        type="text"
        placeholder="To"
        value={to}
        onChange={(e) => setTo(e.target.value)}
      />
      <input
        type="date"
        value={date}
        onChange={(e) => setDate(e.target.value)}
      />
      <button onClick={handleSearch} disabled={loading}>
        {loading ? "Searching..." : "Search"}
      </button>
    </div>
  );
};

export default FlightSearch;
