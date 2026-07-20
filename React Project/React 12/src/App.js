import React, { useState } from "react";
function App() {
  const [login, setLogin] = useState(false);
  return (
      <div>
        <h1>Ticket Booking App</h1>
        {
          login ?
              <div>
                <h2>Welcome User</h2>
                <p>You can Book Tickets.</p>

                <button onClick={() => setLogin(false)}>
                  Logout
                </button>
              </div>
              :
              <div>
                <h2>Welcome Guest</h2>
                <p>Please Login to Book Tickets.</p>
                <button onClick={() => setLogin(true)}>
                  Login
                </button>
              </div>
        }
      </div>
  );
}
export default App;