# 🌸 Spring MVC User Registration Web Application

ℹ️ This project is a Spring MVC web application designed to facilitate user registration. It enables users to register by providing their information through a user-friendly form.

🔧 **Technologies Utilized:**
   - Java: The primary programming language employed for development.
   - Spring MVC: A robust framework for constructing web applications in Java, providing extensive support for web development.
   - Hibernate: An Object-Relational Mapping (ORM) tool simplifying database interactions by mapping Java objects to database tables.
   - MySQL: A prevalent relational database management system utilized for efficient data storage and retrieval.

🚀 **Getting Started:**
   - **Clone the Repository:** 
     ```
     git clone https://github.com/your-repo.git
     ```
   - **Set up a MySQL Database:** 
     Create a new database named `user_registration`.
   - **Update Database Credentials:**
     Update `hibernate.cfg.xml` with your database credentials (URL, username, password).
   - **Run the Application:** 
     Deploy the application on a server such as Tomcat or Jetty.

📝 **Features:**
   - User Registration Form with Validation: Validates user input to ensure correctness and completeness.
   - Data Persistence using Hibernate: Facilitates the storage of user information in the database, ensuring data integrity and consistency.

🔗 **Endpoints:**
   - `/add` - POST request to add a new user to the database.

🛠️ **Project Structure:**
   - `src/main/java/com/jsp/mvc/user` - Contains Java source files comprising the application's logic.
   - `src/main/webapp` - Houses web resources including HTML, CSS, and JavaScript files.
   - `pom.xml` - Maven configuration file listing project dependencies.

📦 **Dependencies:**
   - Spring Context 5.3.28: Offers core Spring functionality for managing application contexts.
   - Spring WebMVC 5.3.28: Implements the Model-View-Controller (MVC) design pattern in Spring for structured web development.
   - Hibernate Core 5.4.33.Final: Facilitates essential functionality for Hibernate Object-Relational Mapping.
   - MySQL Connector/J 8.3.0: MySQL JDBC driver enabling Java applications to interact with MySQL databases.

🔍 **Note:**
   - Proper configuration of the database and dependencies is imperative before executing the application. Ensure accurate setup for seamless operation.
