import React, { useRef } from "react";
import emailjs from "@emailjs/browser";
import styled from "styled-components";
import "./Feedback.css";

const Feedback = () => {
  const form = useRef();

  const sendEmail = (e) => {
    var name = document.getElementById("name");
    var email = document.getElementById("email");
    var msg = document.getElementById("msg");
    const success = document.getElementById("success");
    const danger = document.getElementById("danger");

    if (name.value === "" || email.value === "" || msg.value === "") {
      danger.style.display = "block";
    } else {
      setTimeout(() => {
        name.value = "";
        email.value = "";
        msg.value = "";
      }, 1000);

      success.style.display = "block";
    }
    setTimeout(() => {
      danger.style.display = "none";
      success.style.display = "none";
    }, 2000);
    e.preventDefault();

    emailjs
      .sendForm(
        "service_p7orgxc",
        "template_dt04zv1",
        form.current,
        "mFQha3g7eEJmhw6av"
      )
      .then(
        (result) => {
          console.log(result.text);
          console.log("message sent");
        },
        (error) => {
          console.log(error.text);
        }
      );
  };

  return (
    <StyledContactForm style={{ marginLeft: 300, marginTop: 45 }}>
      <h2>Application Approval</h2>
      <form ref={form} onSubmit={sendEmail}>
        <label>Name</label>
        <input type="text" name="user_name" id="name" />
        <label>Email</label>
        <input type="email" name="user_email" id="email" />
        <label>Feedback</label>
        <textarea name="message" id="msg" />
        <input type="submit" value="Approval/Deny" id="msg" />
        <div class="messaged">
          <div class="success" id="success">
            Your Message Successfully Sent!
          </div>
          <div class="danger" id="danger">
            Fields Can't be Empty!
          </div>
        </div>
      </form>
    </StyledContactForm>
  );
};

export default Feedback;

// Styles
const StyledContactForm = styled.div`
  form {
    display: flex;
    flex-direction: column;
    font-size: 16px;
    margin: 0 auto;

    input {
      width: 50%;
      text-aligh: center;
      height: 35px;
      padding: 7px;
      outline: none;
      border-radius: 5px;
      border: 1px solid rgb(220, 220, 220);

      &:focus {
        border: 2px solid rgba(0, 206, 158, 1);
      }
    }

    textarea {
      max-width: 50%;
      min-width: 50%;
      width: 100%;
      max-height: 100px;
      min-height: 100px;
      padding: 7px;
      outline: none;
      border-radius: 5px;
      border: 1px solid rgb(220, 220, 220);

      &:focus {
        border: 2px solid rgba(0, 206, 158, 1);
      }
    }

    label {
      margin-top: 1rem;
    }

    input[type="submit"] {
      margin-top: 2rem;
      cursor: pointer;
      background: #04aa6d;
      color: white;
      border: none;
    }
  }
`;
