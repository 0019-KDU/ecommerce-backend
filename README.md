# E-commerce Backend with Spring Boot and PostgreSQL

This is a Spring Boot-based backend for an e-commerce platform that provides RESTful APIs to handle CRUD operations, role-based access control, basic security, and email notifications. The application uses PostgreSQL as the database and includes functionalities for managing products, user reviews, carts, and orders.

## Features

- **Admin Role**:
  - Create, update, and delete products.
  - Manage users and orders.
- **User Role**:
  - View all products.
  - Write reviews and comments on products.
  - Add products to cart and create orders.
  - Receive email notifications for order confirmations.

## Technologies

- **Backend**: Spring Boot
- **Database**: PostgreSQL
- **Security**: Spring Security (Role-based access control)
- **Email**: JavaMailSender for sending emails
- **Others**: JPA/Hibernate, REST APIs

## REST API Endpoints

Here is a list of common API endpoints:

- `POST /login` – User login.
- `GET /products` – Get all products.
- `GET /products/{id}` – Get product details by ID.
- `POST /admin/products` – Create a new product (Admin only).
- `PUT /admin/products/{id}` – Update product details (Admin only).
- `DELETE /admin/products/{id}` – Delete a product (Admin only).
- `POST /cart` – Add products to the cart.
- `POST /order` – Create an order and send confirmation email.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/ecommerce-backend-springboot.git
