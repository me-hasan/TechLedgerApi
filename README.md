# Tech Ledger API (Blog)

## Overview
Tech Ledger API is a Spring Boot application that provides a RESTful API for managing blog posts. The application allows authenticated users to create, read, update, and delete blog entries and supports user authentication with JWT.

## Prerequisites
Ensure you have the following installed on your system:
- **Docker**: Install from [Docker's official site](https://www.docker.com/get-started).
- **Docker Compose**: Usually comes with Docker Desktop. If not, you can find instructions [here](https://docs.docker.com/compose/install/).
- **Postman** (or any API testing tool): To test the API endpoints.

## Getting Started

### 1. Clone the Repository
Clone this repository to your local machine:
```bash
git clone https://github.com/me-hasan/techledger-api.git
```
Navigate to the project directory:
```bash
cd techledger-api
```

### 2. **Build the Project:**
   Use the `mvn package` command to compile the code and package it into a `.jar` file.
   ```bash
   mvn package
   ```

   This will generate a packaged `.jar` file in the `target` directory, which you can then use to run the application.


### 3. Build the Docker Image
From the project root, build the Docker image:
```bash
docker-compose up --build
```

### 4. Run the Application with Docker Compose
Start the application and all defined services (e.g., database):
```bash
docker-compose up -d
```

### 5. Access the API
Once the application is running, you can access the API at:
```
http://localhost:8899
```

## JWT Authentication
The Tech Ledger API uses JWT (JSON Web Token) for authentication. After a successful login, clients receive a token, which they must include in the `Authorization` header for accessing secure endpoints. Only the following endpoints are public and do not require a token:

- **Public Endpoints**
  - `GET /api/user`
  - `POST /api/login`
  - `GET /api/blogPostsWithComments`

Other endpoints require an authenticated user. Ensure to include the JWT token with requests as follows:
```
Authorization: Bearer your_token_here
```

## Postman Collection
For testing purposes, a Postman collection is provided to make interacting with the API easier. Import the `TechLedgerAPI.postman_collection.json` file found in this repository to access predefined requests for all endpoints, including examples for authentication and authorized requests.

### Import Postman Collection
1. Open Postman and select **Import**.
2. Choose **Upload Files** and select `TechLedgerAPI.postman_collection.json`.
3. The collection should now be available in your Postman, complete with setup for authentication and public endpoints.

## Running API Endpoints

### Blog Post API Endpoints
API endpoints for managing blog posts allow CRUD operations. The details of each endpoint, including methods, URL paths, and request bodies, are provided in the Postman collection.

### Comments API Endpoints
Endpoints for managing comments on blog posts are also included in the Postman collection.

### Authentication Endpoints
The API supports basic user authentication via the `/api/login` endpoint, returning a JWT token on successful authentication.

## Testing the API
Using Postman or any other API testing tool:
1. Import the Postman collection to view and test all available endpoints.
2. For secure endpoints, authenticate via `/api/login` and use the received token for subsequent requests.

## Troubleshooting
If you encounter any issues, check the console logs for error messages, verify the database configuration, and ensure all services are running.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Postman](https://www.postman.com/)



