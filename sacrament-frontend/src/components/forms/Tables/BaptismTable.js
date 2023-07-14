import React, { useState, useEffect } from "react";
import axios from "axios";
import "./Tables.css";
import { BsFillTrashFill, BsFillPencilFill } from "react-icons/bs";
import { Link } from "react-router-dom";
import { toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const BaptismTable = () => {
  const [bapt, setBapt] = useState([]);

  const deleteBaptism = (e, id) => {
    e.preventDefault();
    axios.delete("http://localhost:8186/smas/baptism/" + id).then((res) => {
      console.log("User Deleted Successfully");
      toast.success("User Deleted Successfully", {
        position: "top-right",
        autoClose: 2000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
        theme: "colored",
      });
      if (bapt) {
        setBapt((prevElement) => {
          return prevElement.filter((bapt) => bapt.id !== id);
        });
      }
    });
  };

  useEffect(() => {
    fetchData();
  }, []);

  //function to fetch data in database
  const fetchData = () => {
    axios
      .get("http://localhost:8186/smas/baptism/")
      .then((res) => {
        console.log(res);
        setBapt(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  };

  return (
    <div className="headers">
      <h3>
        <span>Paroisse Saint Vincent Pallotti Gikondo Baptism Request.</span>
      </h3>
      <div className="search-bar-container">{/* <SearchBar /> */}</div>

      <div className="tables">
        <table>
          <thead>
            <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Father's Name</th>
              <th>Mother's Name</th>
              <th>Patron/Matron</th>
              <th>Province</th>
              <th>District</th>
              <th>Sector</th>
              <th>Samons' Place</th>
              <th>Baptism Date</th>
              <th>Baptism Number</th>
              <th>Action</th>
            </tr>
          </thead>

          {bapt.map((user) => (
            <tbody className="content" key={user.id}>
              <tr>
                <td>{user.firstName} </td>
                <td>{user.lastName}</td>
                <td>{user.fatherName}</td>
                <td>{user.motherName}</td>
                <td>{user.patronMatron} </td>
                <td>{user.province}</td>
                <td>{user.district}</td>
                <td>{user.sector}</td>
                <td>{user.placeOfSummons} </td>
                <td>{user.baptismDate}</td>
                <td>{user.baptismNumber}</td>
                <td>
                  <BsFillTrashFill
                    onClick={(e, id) => deleteBaptism(e, user.id)}
                    className="delete-btn"
                  />
                  <BsFillPencilFill
                    className="edit-btn"
                    // onClick={() => editRow(idx)}
                  />
                  <button
                    style={{
                      marginLeft: 10,
                      color: "whitesmoke",
                      fontWeight: "bold",
                      fontFamily: "Quicksand",
                      padding: 5,
                      backgroundColor: "green",
                      justifyContent: "center",
                      textAlign: "center",
                    }}
                  >
                    <Link to="/feedback">Feedback</Link>
                  </button>
                </td>
              </tr>
            </tbody>
          ))}
        </table>
      </div>
    </div>
  );
};

export default BaptismTable;
