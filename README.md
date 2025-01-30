#IDMS Data Fetcher

This is a Spring Boot application designed to fetch data from the IDMS API, store it in a MySQL database, and provide an API endpoint to retrieve the stored data. The solution ensures that no duplicate entries are saved in the database by validating new data against existing records.

#Tech Stack

- Spring Boot: For building the backend REST API.
- Spring Security: For JWT authentication and securing the API.
- Hibernate: For ORM and interacting with MySQL.
- MySQL: For storing the data.
- Postman: For testing the API endpoints.

#Prerequisites

To run this project, make sure you have the following installed:

- Java 17 or later
- MySQL (or a compatible database)
- Maven
- Postman (for testing the API)

#MySQL Configuration

Ensure you have MySQL running locally or on a remote server, and create a database named `idms_db`.

#API Credentials

The following credentials are used to authenticate requests to the IDMS API:

- Username: `testerAPI@drivesoft.tech`
- Password: `GiclVIaDRAT8^7st@@M90ain`
- LayoutID: `2006084`
- Account Status: `a`
- Institution ID: `107007`
- Page Number: `1`

These credentials are used for making authenticated API requests to the IDMS API and should be properly configured.
Create table with this fields
○ ContractSalesPrice
○ AcctType
○ SalesGroupPerson1ID
○ ContractDate
○ CollateralStockNumber
○ CollateralYearModel
○ CollateralMake
○ CollateralModel
○ Borrower1FirstName
○ Borrower1LastName
○ AcctID

CREATE TABLE accounts (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    contract_sales_price DECIMAL(10, 2),
    acct_type VARCHAR(50),
    sales_group_person1_id VARCHAR(50),
    contract_date DATE,
    collateral_stock_number VARCHAR(50),
    collateral_year_model INT,
    collateral_make VARCHAR(100),
    collateral_model VARCHAR(100),
    borrower1_first_name VARCHAR(100),
    borrower1_last_name VARCHAR(100),
    acct_id VARCHAR(50) UNIQUE NOT NULL
);

Build Project : mvn clean install
Run Application : mvn spring-boot:run

