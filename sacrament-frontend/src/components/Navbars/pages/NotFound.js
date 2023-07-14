import { Link } from "react-router-dom";
import "./Home.css";
const NotFound = () => {
  return (
    <div className="not-found">
      <h2>Sorry</h2>
      <p className="pg">That page can't be Found</p>
      <Link to="/" className="links">
        Back to the HomePage
      </Link>
    </div>
  );
};

export default NotFound;
