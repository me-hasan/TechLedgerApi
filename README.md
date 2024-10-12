# Tech Ledger API

## Overview
Tech Ledger API is a Spring Boot application that provides a RESTful API for managing blog posts. This application allows users to create, read, and manage blog entries.

## Prerequisites
Before you run the application, ensure you have the following installed on your system:

- **Docker**: Install from [Docker's official site](https://www.docker.com/get-started).
- **Docker Compose**: Usually comes with Docker Desktop. If not, you can find instructions [here](https://docs.docker.com/compose/install/).
- **Postman** (or any API testing tool): To test the API endpoints.

## Getting Started

### 1. Clone the Repository
Clone this repository to your local machine using the following command:
```bash
git clone https://github.com/me-hasan/techledger-api.git
```
Change to the project directory:
```bash
cd techledger-api
```

### 2. Build the Docker Image
Navigate to the root directory of the project and build the Docker image using the following command:
```bash
docker-compose up --build
```

### 3. Run the Application with Docker Compose
You can run the application along with any necessary services (like a database) using Docker Compose:
```bash
docker-compose up -d
```
This will start the application and any other defined services (e.g., a database) as specified in the `docker-compose.yml` file.

### 4. Access the API
Once the application is running, you can access the API at:
```
http://localhost:8899
```

### 5. API Endpoints

#### Get All Blogs
- **Endpoint**: `GET /blogPosts`
- **Description**: Retrieves a list of all blog posts.

#### Add a New Blog Post
- **Endpoint**: `POST /blogPost`
- **Request Body**:
```json
{
    "title": "Your blog title",
    "content": "Your blog content",
    "userId": 12,
    "status": true
}
```
- **Description**: Adds a new blog post to the database.

## Testing the API
You can use Postman or any other API testing tool to interact with the API endpoints. Make sure to set the correct HTTP method and request body format.

### Example
To add a new blog post, set the request method to `POST`, use the `/blog` endpoint, and include the JSON request body as shown above.

## Troubleshooting
If you encounter any issues, check the console for any error messages. Ensure that your database is properly configured if you are using one.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Postman](https://www.postman.com/)

---

Feel free to adjust the sections as necessary to fit your specific setup and any additional configurations you may have!