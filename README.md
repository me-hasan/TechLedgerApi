Here's an updated `README.md` file that combines the structure of your previous README with the new details for enhanced clarity. It maintains your Docker instructions and includes API endpoint details.

```markdown
# Tech Ledger API

## Overview
Tech Ledger API is a Spring Boot application that provides a RESTful API for managing blog posts. This application allows users to create, read, update, and delete blog entries.

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

## API Endpoints

| Method | Endpoint         | Description                        | Request Body                          |
| ------ |------------------| ---------------------------------- | ------------------------------------- |
| GET    | `/api/blogPosts` | Retrieve all blog posts            | None                                  |
| GET    | `/api/blogPost/{id}` | Retrieve a single blog post by ID  | None                                  |
| POST   | `/api/blogPost`      | Create a new blog post             | JSON with `title` and `content`       |
| PUT    | `/api/blogPost/{id}` | Update an existing blog post by ID | JSON with `title` and `content`       |
| DELETE | `/api/blogPost/{id}` | Delete a blog post by ID           | None                                  |

### Example Usage

#### Get All Blog Posts
- **Request**:
  ```bash
  GET /api/blogPosts
  ```
- **Response**:
  Returns a list of all blog posts.

#### Create a New Blog Post
- **Request**:
  ```bash
  POST /api/blogPost
  ```
- **Request Body**:
  ```json
  {
      "title": "Your blog title",
      "content": "Your blog content"
  }
  ```
- **Response**:
  Returns the created blog post with `201 Created` status.

#### Update an Existing Blog Post
- **Request**:
  ```bash
  PUT /api/blogPost/{id}
  ```
- **Request Body**:
  ```json
  {
      "title": "Updated title",
      "content": "Updated content"
  }
  ```
- **Response**:
  Returns the updated blog post.

#### Delete a Blog Post
- **Request**:
  ```bash
  DELETE /api/blogPost/{id}
  ```
- **Response**:
  Returns `200 OK` if the deletion was successful, or `404 Not Found` if the post does not exist.

## Testing the API
You can use Postman or any other API testing tool to interact with the API endpoints. Make sure to set the correct HTTP method and request body format as shown in the examples above.

## Troubleshooting
If you encounter any issues, check the console for error messages. Ensure that your database is properly configured and that all necessary services are running.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Postman](https://www.postman.com/)

---

