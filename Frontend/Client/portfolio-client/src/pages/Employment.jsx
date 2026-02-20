import { useEffect, useState } from "react";
import API from "../services/api";
import "./Employment.css";

function Employment() {
  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    API.get("/employment")
      .then(res => setJobs(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <section id="experience" className="experience">
      <h2>Experience</h2>

      <div className="timeline">
        {jobs.map(job => (
          <div className="timeline-item" key={job.id}>
            <div className="timeline-dot"></div>

            <div className="timeline-content">
              <h3>{job.companyName}</h3>
              <h4>{job.role}</h4>
              <span className="duration">
                {job.startDate} – {job.endDate}
              </span>
              <p>{job.description}</p>
            </div>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Employment;
