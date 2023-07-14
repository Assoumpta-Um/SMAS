import axios from "axios";

const BAPTISM_API_BASE_URL = "http://localhost:8186/smas/baptism/";

class SmasService {
  deleteEmployee(id) {
    return axios.delete(BAPTISM_API_BASE_URL + "/" + id);
  }
}

export default SmasService;
