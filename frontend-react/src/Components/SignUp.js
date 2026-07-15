import React, { useState } from "react";
import "./SignUp.css";
import axios from "axios";

function Signup() {
  const [email, setEmail] = useState("");
  const [name, setName] = useState("");
  const [password, setPassword] = useState("");

  const [showMessage, setShowMessage] = useState(false);
  const [showSignup, setShowSignup] = useState(true);
  const [showExists, setShowExists] = useState(false);

  const user = {
    emailId: email,
    userName: name,
    password: password,
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    setShowExists(false);

    try {
      console.log("Checking username:", name);

      const checkResponse = await axios.get(
        `http://localhost:1234/userCheck?username=${name}`
      );

      if (checkResponse.data === "exists") {
        setShowExists(true);
        return;
      }

      const signupResponse = await axios.post(
        "http://localhost:1234/signup",
        user
      );

      console.log(signupResponse.data);

      setShowSignup(false);
      setShowMessage(true);

    } catch (error) {
      console.error("Signup Error:", error);

      if (error.response) {
        console.log(error.response.data);
      }
    }
  };

  return (
    <div>
      <br />

      <center>
        <h1>Travel Buddy</h1>
        <h6>- Find your travel partner!</h6>
      </center>

      {showSignup && (
        <div>
          <center id="centerelements">
            <form onSubmit={handleSubmit}>
              <div id="eos">
                <label>Email:</label>
                <input
                  type="email"
                  placeholder="Email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)}
                  required
                />
              </div>

              <br />

              <div id="uos">
                <label>UserName:</label>
                <input
                  type="text"
                  placeholder="UserName"
                  value={name}
                  onChange={(e) => setName(e.target.value)}
                  required
                />
              </div>

              <br />

              <div id="pos">
                <label>Password:</label>
                <input
                  type="password"
                  placeholder="Password"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                  required
                />
              </div>

              <br />

              <div className="ss">
                <input
                  className="btn btn-primary"
                  type="submit"
                  value="Sign Up"
                />
              </div>
            </form>
          </center>
        </div>
      )}

      {showMessage && (
        <div className="signupms">
          <center className="signupsms">
            Successfully Signed Up!
            <br />
            Try{" "}
            <a className="stls" href="/l">
              Login to your Account →
            </a>
          </center>
        </div>
      )}

      {showExists && (
        <div className="existsms">
          <center className="existssms">
            The username you entered already exists.
            <br />
            Please choose another username.
          </center>
        </div>
      )}
    </div>
  );
}

export default Signup;