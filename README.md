# Veterinary Clinic Management System

A web application designed to manage veterinary clinic operations, including scheduling appointments, maintaining pet and owner records, and
managing veterinary services.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Manage Appointments:** Schedule and manage veterinary appointments.
- **Pet and Owner Records:** Maintain records of pets and their respective owners.
- **Veterinary Management:** Manage veterinarians and their specialties.
- **Comprehensive UI:** User-friendly interface enabling easy navigation of the system.

## Technologies Used

- **Java 21**: The core programming language.
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: For database interaction.
- **Jakarta EE**: For enterprise features and functionalities.
- **Vaadin**: For building a modern user interface.
- **Lombok**: To reduce boilerplate code.
- **H2 Database**: For local development and testing.

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 21 or later
- Gradle
- Docker (optional, for running the database locally)

### Installation

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/Araya2001/caso-estudio-clinica-veterinaria.git
    cd caso-estudio-clinica-veterinaria
    ```

2. **Build the Project:**

   Use Gradle to build the project:

    ```bash
    ./gradlew build
    ```

   Or on Windows:

    ```bash
    gradlew build
    ```

3. **Run the Application:**

   You can run the application using:

    ```bash
    ./gradlew bootRun
    ```

   Or on Windows:

    ```bash
    gradlew bootRun
    ```

## Usage

Navigate to [http://localhost:8080](http://localhost:8080) in your browser to access the application interface.

- **Explore Features:**
    - Add pets, pet owners, and schedule appointments via the UI.
    - Manage veterinarian schedules and clinic resources.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/feature-name`).
3. Commit your Changes (`git commit -m 'Add some feature'`).
4. Push to the Branch (`git push origin feature/feature-name`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.