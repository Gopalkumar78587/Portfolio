import "./About.css";

function About() {
  return (
    <section id="about" className="about">
      <h2>About Me</h2>

      <p className="about-intro">
        I am a Full Stack Developer with hands-on experience in building
        scalable and secure web applications. I enjoy working on both
        backend and frontend technologies and following a structured,
        sprint-based development approach.
      </p>

      <div className="about-cards">
        <div className="about-card">
          <h4>Backend</h4>
          <p>
            Java, Spring Boot, REST APIs, MySQL, JPA, Spring Security
          </p>
        </div>

        <div className="about-card">
          <h4>Frontend</h4>
          <p>
            React, Angular, JavaScript, HTML, CSS, Bootstrap
          </p>
        </div>

        <div className="about-card">
          <h4>Focus Areas</h4>
          <p>
            Clean architecture, Admin dashboards, Secure APIs,
            Real-time UI updates
          </p>
        </div>
      </div>
    </section>
  );
}

export default About;
