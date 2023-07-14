import React from "react";
import { ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

import { Route, Routes } from "react-router-dom";
import Home from "./components/Navbars/pages/Home";
import Footer from "./components/Navbars/pages/Footer";
import Login from "../src/components/register/Login";
import Navbar from "./components/Navbars/Navbar";
import Eucharist from "../src/components/forms/Eucharist";
import Baptism from "../src/components/forms/Baptism";
import Confirmation from "../src/components/forms/Confirmation";
import Marriage from "../src/components/forms/Marriage";
import Ordination from "../src/components/forms/Ordination";
import Reconsiliation from "../src/components/forms/Reconsiliation";
import ContactUs from "./components/Navbars/pages/ContactUs";
import NotFound from "./components/Navbars/pages/NotFound";
import Feedback from "./components/Navbars/pages/Feedback";

//TABLES
import BaptismTable from "./components/forms/Tables/BaptismTable";
import EucharistTable from "./components/forms/Tables/EucharistTable";
import OrdinationTable from "./components/forms/Tables/OrdinationTable";
import ReconsiliationTable from "./components/forms/Tables/ReconsiliationTable";
import MarriageTable from "./components/forms/Tables/MarriageTable";
import ConfirmationTable from "./components/forms/Tables/ConfirmationTable";
import Dashboard from "./pages/Dashboard";
import DashRoutes from "./components/forms/Tables/DashboardRoutes";

function App() {
  return (
    <div className="App">
      <Navbar />
      <ToastContainer />
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/feedback" element={<Feedback />} />
        <Route exact path="/contact-us" element={<ContactUs />} />
        <Route exact path="/baptism" element={<Baptism />} />
        <Route exact path="/eucharist" element={<Eucharist />} />
        <Route exact path="/confirmation" element={<Confirmation />} />
        <Route exact path="/marriage" element={<Marriage />} />
        <Route exact path="/ordination" element={<Ordination />} />
        <Route exact path="/reconciliation" element={<Reconsiliation />} />
        <Route exact path="/dashboard" element={<Dashboard />} />
        <Route element={<DashRoutes />}>
          <Route exact path="/baptism-table" element={<BaptismTable />} />
          <Route exact path="/eucharist-table" element={<EucharistTable />} />
          <Route exact path="/ordination-table" element={<OrdinationTable />} />
          <Route
            exact
            path="/reconsiliation-table"
            element={<ReconsiliationTable />}
          />
          <Route exact path="/marriage-table" element={<MarriageTable />} />
          <Route
            exact
            path="/confirmation-table"
            element={<ConfirmationTable />}
          />
        </Route>

        <Route exact path="/sign-up" element={<Login />} />
        <Route exact path="*" element={<NotFound />} />
      </Routes>

      <Footer />
    </div>
  );
}

export default App;
