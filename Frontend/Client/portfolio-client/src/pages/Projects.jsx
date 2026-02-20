import { useEffect, useState } from "react";
import API from "../services/api";
import "./Projects.css";

function Projects() {
  const [projects, setProjects] = useState([]);

  useEffect(() => {
    API.get("/projects")
      .then(res => setProjects(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <section id="projects" className="projects">
      <h2>Projects</h2>

      <div className="projects-grid">
        {projects.map(p => (
          <div className="project-card" key={p.id}>
            <h3>{p.title}</h3>
            <p>{p.description}</p>

            <div className="tech">
              <strong>Tech Stack:</strong>
              <span>{p.techStack}</span>
            </div>
          </div>
        ))}
      </div>
    </section>
  );
}

export default Projects;
