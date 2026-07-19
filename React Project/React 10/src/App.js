import React from "react";
function App() {
  const officeSpaces = [
    {
      id: 1,
      name: "Tech Park",
      rent: 55000,
      address: "Chennai",
      image:
          "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      id: 2,
      name: "DLF Cyber City",
      rent: 70000,
      address: "Bangalore",
      image:
          "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    },
    {
      id: 3,
      name: "Business Tower",
      rent: 45000,
      address: "Hyderabad",
      image:
          "https://images.unsplash.com/photo-1486406146926-c627a92ad1ab?w=600"
    }
  ];
  return (
      <div style={{ padding: "20px", fontFamily: "Arial" }}>
        <h1>Office Space Rental App</h1>

        {officeSpaces.map((office) => (
            <div
                key={office.id}
                style={{
                  border: "1px solid gray",
                  borderRadius: "10px",
                  padding: "15px",
                  marginBottom: "20px",
                  width: "350px"
                }}
            >
              <img
                  src={office.image}
                  alt={office.name}
                  width="300"
                  height="200"
              />

              <h2>{office.name}</h2>

              <p>
                <strong>Address:</strong> {office.address}
              </p>

              <p>
                <strong>Rent:</strong>{" "}
                <span
                    style={{
                      color: office.rent < 60000 ? "red" : "green",
                      fontWeight: "bold"
                    }}
                >
              ₹{office.rent}
            </span>
              </p>
            </div>
        ))}
      </div>
  );
}
export default App;