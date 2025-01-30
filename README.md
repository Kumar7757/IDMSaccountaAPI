# IDMSaccountaAPI
# IDMS Integration Project

Project Overview
This project integrates with the IDMS API to fetch data, store it in a MySQL database, and provide an API endpoint to retrieve the stored data. The solution ensures no duplicate entries are saved during data insertion.

Key Features:
- Fetches data from the IDMS API using specified credentials.
- Stores the data in a MySQL database.
- Exposes an API endpoint to retrieve the stored data.
- Ensures that no duplicate entries are saved.

---

Prerequisites

Before running this project, you need to have the following installed on your machine:

- JDK 11 or higher: To run the Spring Boot application.
- MySQL: To store the data.
- Maven: For building and managing the dependencies.

Credentials:
You will need the following API credentials and data for accessing the IDMS API:
- Base URL: `https://idms.dealersocket.com`
- Username: `testerAPI@drivesoft.tech`
- Password: `GiclVIaDRAT8^7st@@M90ain`
- LayoutID: `2006084`
- Account Status: `a`
- Institution ID: `107007`
- Page Number: `1`

Ensure these values are correctly referenced in your project for API communication.

Setup
1. Clone the Repository
git clone https://github.com/yourusername/idms-project.git
cd idms-project

Create a database in MySQL and configure the database properties in the application.properties file.
In the src/main/resources/application.properties file, configure your database connection.
Make sure pom.xml file includes dependencies for Spring Boot, MySQL, and any other necessary libraries.
Build the project using Maven: "mvn clean package"
Run the Spring Boot application: "mvn spring-boot:run"
After successfully starting the application, the server will be running locally on http://localhost:8081.
