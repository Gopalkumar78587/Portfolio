import "./Home.css";

function Home() {
  return (
    <section id="home" className="home">
      <div className="home-content">
        <h1>
          Hi, I’m <span>Gopal Kumar Yadav</span>
        </h1>

        <h3>Full Stack Developer</h3>

        <p>
          I design and develop full-stack web applications using
          Java, Spring Boot, React, and Angular.
          This portfolio showcases my academic and practical projects.
        </p>

        <div className="home-buttons">
          <a href="#projects">
            <button>View Projects</button>
          </a>

          <a href="#contact">
            <button className="outline">Contact Me</button>
          </a>
        </div>
      </div>
    </section>
  );
}

export default Home;
