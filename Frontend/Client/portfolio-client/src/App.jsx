import { useEffect } from "react";
import Navbar from "./components/Navbar";
import Home from "./sections/Home";
import About from "./sections/About";
import Skills from "./pages/Skills";
import Projects from "./pages/Projects";
import Employment from "./pages/Employment";
import Contact from "./sections/Contact";
import { getUISettings } from "./services/uiSettings";

function App() {

  useEffect(() => {
    getUISettings().then(res => {
      if (!res.data) return;

      document.documentElement.style.setProperty(
        "--primary-color",
        res.data.primaryColor
      );

      document.body.style.background =
        res.data.theme === "dark" ? "#121212" : "#ffffff";
      document.body.style.color =
        res.data.theme === "dark" ? "#ffffff" : "#000000";
    });
  }, []);

  return (
    <>
      <Navbar />
      <Home />
      <About />
      <Skills />
      <Projects />
      <Employment />
      <Contact />
    </>
  );
}

export default App;
