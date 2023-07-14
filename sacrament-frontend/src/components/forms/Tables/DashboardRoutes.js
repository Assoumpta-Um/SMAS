import { Navigate, Outlet } from "react-router-dom";
import Dashboardlayout from "./DashboardLayout";

const DashRoutes = () => {
  let auth = { token: true };

  return auth.token ? (
    <Dashboardlayout>
      <Outlet />
    </Dashboardlayout>
  ) : (
    <Navigate to="/login" />
  );
};

export default DashRoutes;
