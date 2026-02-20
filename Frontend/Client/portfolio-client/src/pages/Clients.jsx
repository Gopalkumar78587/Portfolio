import { useEffect, useState } from "react";
import API from "../services/api";

function Clients() {
  const [clients, setClients] = useState([]);

  useEffect(() => {
    API.get("/clients")
      .then(res => setClients(res.data));
  }, []);

  return (
    <div>
      <h2>Clients</h2>
      {clients.map(c => (
        <p key={c.id}>{c.name} – {c.company}</p>
      ))}
    </div>
  );
}

export default () => <h2 style={{ padding:20 }}>Clients Page</h2>;

