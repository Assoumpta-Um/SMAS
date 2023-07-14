import React, { useState } from "react";
// import { useNavigate } from "react-router-dom";
import "./Forms.css";
import { toast } from "react-toastify";

const Reconsiliation = () => {
  const [firstname, setFirstname] = useState("");
  const [lastname, setLastname] = useState("");
  const [fathername, setFathername] = useState("");
  const [mothername, setMothername] = useState("");
  const [patronMatron, setPatronMatron] = useState("");
  const [placeofSummons, setPlaceofSummons] = useState("");
  const [province, setProvince] = useState("");
  const [district, setDistrict] = useState("");
  const [sector, setSector] = useState("");
  const [reconsiliationDate, setReconsiliationDate] = useState("");
  const [reconsiliatioNumber, setReconsiliationNumber] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const christian = {
      province: province,
      district: district,
      fatherName: fathername,
      motherName: mothername,
      firstName: firstname,
      lastName: lastname,
      patronMatron: patronMatron,
      placeOfSummons: placeofSummons,
      sector: sector,
      reconsiliationDate: reconsiliationDate,
      reconsiliationNumber: reconsiliatioNumber,
    };
    setProvince("");
    setDistrict("");
    setFathername("");
    setMothername("");
    setFirstname("");
    setLastname("");
    setPlaceofSummons("");
    setPatronMatron("");
    setSector("");
    setReconsiliationDate("");
    setReconsiliationNumber("");

    fetch(`http://localhost:8186/smas/reconsiliation/`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(christian),
    }).then(() => {
      console.log("Application Saved Successfully");
      toast.success("Application Saved Successfully", {
        position: "top-right",
        autoClose: 2000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
        theme: "colored",
      });
    });
  };

  return (
    <div className="bodyz">
      <div className="create">
        <h2>
          Reconsiliation <span>Form</span>
        </h2>
        <form onSubmit={handleSubmit} autoComplete="off">
          <label>
            First Name: <span>*</span>
          </label>
          <input
            type="text"
            required
            value={firstname}
            onChange={(e) => setFirstname(e.target.value)}
          />
          <label>
            Last Name:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={lastname}
            onChange={(e) => setLastname(e.target.value)}
          />
          <label>
            Father's Name:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={fathername}
            onChange={(e) => setFathername(e.target.value)}
          />
          <label>
            Mother's name:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={mothername}
            onChange={(e) => setMothername(e.target.value)}
          />

          <label>
            Patron/Matron:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={patronMatron}
            onChange={(e) => setPatronMatron(e.target.value)}
          />
          <label>
            Place Of Summons: <span>*</span>
          </label>
          <input
            type="text"
            required
            value={placeofSummons}
            onChange={(e) => setPlaceofSummons(e.target.value)}
          />
          <label>
            Province:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={province}
            onChange={(e) => setProvince(e.target.value)}
          />
          <label>
            District:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={district}
            onChange={(e) => setDistrict(e.target.value)}
          />
          <label>
            Sector:<span>*</span>
          </label>
          <input
            type="text"
            required
            value={sector}
            onChange={(e) => setSector(e.target.value)}
          />
          <label>
            Reconsiliation Date:<span>*</span>
          </label>
          <input
            type="date"
            required
            value={reconsiliationDate}
            onChange={(e) => setReconsiliationDate(e.target.value)}
          />
          <label>
            Reconsiliation Number:<span>*</span>
          </label>
          <input
            type="number"
            required
            value={reconsiliatioNumber}
            onChange={(e) => setReconsiliationNumber(e.target.value)}
          />

          <button>Submit</button>
        </form>
      </div>
    </div>
  );
};

export default Reconsiliation;
