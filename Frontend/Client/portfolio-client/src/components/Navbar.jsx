import { useEffect, useState } from "react";
import "./Navbar.css";

const sections = [
  "home",
  "about",
  "skills",
  "projects",
  "experience",
  "contact"
];

function Navbar() {
  const [active, setActive] = useState("home");
  const [scrolled, setScrolled] = useState(false);

  useEffect(() => {
    const onScroll = () => {
      setScrolled(window.scrollY > 50);

      sections.forEach(id => {
        const el = document.getElementById(id);
        if (!el) return;

        const top = el.offsetTop - 120;
        const height = el.offsetHeight;

        if (window.scrollY >= top && window.scrollY < top + height) {
          setActive(id);
        }
      });
    };

    window.addEventListener("scroll", onScroll);
    return () => window.removeEventListener("scroll", onScroll);
  }, []);

  return (
    <header className={`navbar ${scrolled ? "scrolled" : ""}`}>
      <div className="logo">Gopal Kumar Yadav</div>

      <nav>
        {sections.map(sec => (
          <a
            key={sec}
            href={`#${sec}`}
            className={active === sec ? "active" : ""}
          >
            {sec}
          </a>
        ))}
      </nav>
    </header>
  );
}

export default Navbar;
