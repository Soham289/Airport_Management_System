import axios from "axios";

const API_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";

const api = axios.create({
  baseURL: API_URL,
  headers: { "Content-Type": "application/json" },
});

export const fetchFlights = async (from, to, date) => {
  try {
    const response = await api.get(`/flights?from=${from}&to=${to}&date=${date}`);
    return response.data;
  } catch (error) {
    console.error("Error fetching flights:", error);
    throw error;
  }
};

export default api;
