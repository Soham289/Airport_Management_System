import React from 'react';
import { Link } from 'react-router-dom';
import "../styles/Navbar.css";

const Navbar = () => {
  return (
    <nav>
      <ul>
        <li><Link to="/">Home</Link></li>
        <li><Link to="/manage-booking">Manage Booking</Link></li>
        <li><Link to="/flight-status">Flight Status</Link></li>
        <li><Link to="/check-in">Check-in</Link></li>
        <li><Link to="/my-trips">My Trips</Link></li>
        <li><Link to="/contact">Contact</Link></li>
        <li><Link to="/login">Login</Link></li>
        <li><Link to="/signup">Sign Up</Link></li>
      </ul>
    </nav>
  );
};

export default Navbar;
