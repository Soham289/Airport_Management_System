import React from "react";
import "../styles/FlightResults.css";  // Import the CSS file

const FlightResults = ({ flights }) => {
  return (
    <div className="flight-results-container">
      <h2>Flight Results</h2>
      {flights.length > 0 ? (
        <table className="flight-table">
          <thead>
            <tr>
              <th>Flight ID</th>
              <th>Airline</th>
              <th>Source</th>
              <th>Destination</th>
              <th>Departure Time</th>
              <th>Arrival Time</th>
              <th>Status</th>
              <th>Gate Number</th>
            </tr>
          </thead>
          <tbody>
            {flights.map((flight, index) => (
              <tr key={index}>
                <td>{flight.flightID || "N/A"}</td>
                <td>{flight.airline || "N/A"}</td>
                <td>{flight.source || "N/A"}</td>
                <td>{flight.destination || "N/A"}</td>
                <td>{flight.departureTime || "N/A"}</td>
                <td>{flight.arrivalTime || "N/A"}</td>
                <td>{flight.status || "N/A"}</td>
                <td>{flight.gateNumber || "N/A"}</td>
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p className="no-flights">No flights found</p>
      )}
    </div>
  );
};

export default FlightResults;
