import "./Contact.css";

function Contact() {
  return (
    <section id="contact" className="contact">
      <h2>Contact Me</h2>

      <p className="contact-intro">
        Feel free to reach out for collaboration, queries, or opportunities.
      </p>

      <div className="contact-container">
        {/* Contact Form (Frontend Only) */}
        <form className="contact-form">
          <input type="text" placeholder="Your Name" />
          <input type="email" placeholder="Your Email" />
          <textarea rows="5" placeholder="Your Message"></textarea>
          <button type="submit">Send Message</button>
        </form>

        {/* Contact Info */}
        <div className="contact-info">
            <p><strong>Phone:</strong> +91 6204046766</p>
          <p><strong>Email:</strong> gopalkumaryadav913@gmail.com</p>
          <p><strong>GitHub:</strong> github.com/yourprofile</p>
          <p><strong>LinkedIn:</strong> linkedin.com/in/yourprofile</p>
        </div>
      </div>
    </section>
  );
}

export default Contact;
