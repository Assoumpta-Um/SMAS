import React, { useState } from "react";
import { useForm } from "react-hook-form";
import axios from "axios";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
import Img from "../../assets/img3.jpg";
import "./Login.css";

const Login = () => {
  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm();

  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  return (
    <div className="hero">
      <div className="signup-box">
        <div className="left-box">
          <h2>
            Welcome To{" "}
            <span style={{ color: "#fcb900", marginBottom: "30" }}>SMAS Admin Login</span>{" "}
          </h2>

          <form
            action="#"
            onSubmit={handleSubmit(async (data) => {
              console.log(data);
              try {
                setLoading(true);
                const response = await axios.post(
                  "http://localhost:8186/auth/login",
                  data
                );
                navigate("/baptism-table");
                toast.success("Logged In successfully");
                setLoading(false);
                console.log(response.data.data);
                localStorage.setItem("token", response.data.data.token);
              } catch (error) {
                setLoading(false);
                toast.error(error.response.data.error);
              }
            })}
          >
            <input
              className="input-box"
              type="emailAddress"
              placeholder="Enter Email"
              name="emailAddress"
              {...register("emailAddress", {
                required: "please enter your email",
              })}
            />
            <p className="errors"> {errors.emailAddress?.message}</p>
            <input
              className="input-box"
              type="password"
              name="password"
              placeholder="Enter a password"
              {...register("password", {
                required: "please enter password",
                minLength: {
                  value: 8,
                  message: "password must be at least 8 characters",
                },
              })}
            />
            <p className="errors"> {errors.password?.message} </p>
            <div className="app">
              <input type="checkbox" style={{ marginRight: 10 }} />
              <label htmlFor="">Remeber me</label>
            </div>
            <button type="Submit">
              LOGIN <span>&#x27f6;</span>
            </button>
            <ToastContainer />
            <p style={{ marginTop: 10 }}>
              Don't have Account <Link to="/signup">Sign up</Link>
            </p>
          </form>
          <h6 style={{ marginTop: 10, textAlign: "center" }}>
            copy right &copy; SMAS
          </h6>
        </div>
        <div className="right-box">
          <img src={Img} alt="" />
        </div>
      </div>
    </div>
  );
};

export default Login;
