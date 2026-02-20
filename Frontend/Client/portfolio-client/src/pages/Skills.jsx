import { useEffect, useState } from "react";
import API from "../services/api";
import SkillChart from "../components/SkillChart";

function Skills() {
  const [skills, setSkills] = useState([]);

  useEffect(() => {
    API.get("/skills").then(res => setSkills(res.data));
  }, []);

  return (
    <section id="skills">
      <h2>Skills</h2>

      <SkillChart skills={skills} />

      {skills.map(s => (
        <div key={s.id} style={{ marginBottom: "10px" }}>
          <strong>{s.name}</strong>
          <div style={{ background: "#ddd", height: "8px" }}>
            <div
              style={{
                width: `${s.proficiency}%`,
                height: "8px",
                background: "var(--primary-color)"
              }}
            />
          </div>
        </div>
      ))}
    </section>
  );
}

export default Skills;
