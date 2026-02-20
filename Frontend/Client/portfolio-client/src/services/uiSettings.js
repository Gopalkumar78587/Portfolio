import axios from "axios";

export const getUISettings = () =>
  axios.get("http://localhost:8080/api/ui-settings");
