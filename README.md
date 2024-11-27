# <u>Spring Boot Course Management System</u>

<p>
  A simple Spring Boot application to manage courses, allowing users to add, view, update, and delete course details.
</p>

## <u>Features</u>

<ul>
  <li>View a list of all courses</li>
  <li>Add a new course</li>
  <li>Update an existing course</li>
  <li>Delete a course</li>
</ul>

## <u>Technologies Used</u>

<ul>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>H2 Database (or MySQL/PostgreSQL)</li>
  <li>Java</li>
  <li>Postman for testing APIs</li>
</ul>

## <u>Setup Instructions</u>

<ol>
  <li>Clone the repository:</li>

git clone https://github.com/your-username/spring-boot-course-management.git
<li>Navigate to the project directory:</li>
bash
Copy code
cd spring-boot-course-management
<li>Build the project using Maven:</li>
bash
Copy code
mvn clean install
<li>Run the application:</li>
bash
Copy code
mvn spring-boot:run
<li>Access the application at:</li> <ul> <li><strong>API Endpoints:</strong> <code>http://localhost:8080/courses</code></li> <li><strong>H2 Console (if H2 database is used):</strong> <code>http://localhost:8080/h2-console</code></li> </ul> </ol>
<u>API Endpoints</u>
<table border="1" cellpadding="5"> <thead> <tr> <th>Method</th> <th>Endpoint</th> <th>Description</th> </tr> </thead> <tbody> <tr> <td>GET</td> <td><code>/courses</code></td> <td>Fetch all courses</td> </tr> <tr> <td>POST</td> <td><code>/courses</code></td> <td>Add a new course</td> </tr> <tr> <td>DELETE</td> <td><code>/courses/{id}</code></td> <td>Delete a course by ID</td> </tr> </tbody> </table>
<u>Example Request</u>
<p> <strong>POST /courses</strong> - Add a new course </p> <pre> { "title": "Spring Boot Basics", "description": "Learn Spring Boot from scratch.", "price": 99.99 } </pre>
<u>Contributing</u>
<p> Contributions are welcome! Please fork the repository and submit a pull request. </p>
<u>License</u>
<p> This project is licensed under the <strong>MIT License</strong>. </p> ```
