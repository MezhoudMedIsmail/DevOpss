# ⚙️ DevOpss – Full Stack DevOps Project with CI/CD

This repository provides a full-stack DevOps setup for deploying a Java-based web application with support for CI/CD, containerization, and environment management using **Jenkins**, **Docker**, **Maven**, and **Docker Compose**.

---

## 🔧 Key Features

- 🧱 **Java Web Application** with Maven project structure
- 🐳 **Dockerized backend** using a custom Dockerfile
- ⚙️ **Jenkinsfile** for continuous integration and deployment
- 🗃 **Environment variables** managed via `.env`
- 📦 **Docker Compose** for service orchestration
- 🧪 Includes compiled `.class` and target files for demonstration

---

## 📁 Folder Structure

```
.
├── src/                   # Java source code
├── target/                # Compiled Java artifacts
├── .env                   # App environment configuration
├── Dockerfile             # Backend containerization logic
├── docker-compose.yml     # Multi-container configuration
├── Jenkinsfile            # Jenkins pipeline configuration
├── pom.xml                # Maven project definition
├── .mvn/, mvnw, mvnw.cmd  # Maven wrapper files
└── .idea/, .settings/     # IDE and project metadata
```

---

## 📦 Technologies

- **Java / Maven**
- **Docker**
- **Docker Compose**
- **Jenkins**
- **Shell scripting**
- **HTML / JavaScript / CSS** (front-end content in `/src`)

---

## 🚀 How to Use

### Prerequisites

- Java 11+
- Maven
- Docker & Docker Compose
- Jenkins (optional for pipeline automation)

### Steps

1. Clone the repo:

```bash
git clone https://github.com/MezhoudMedIsmail/DevOpss.git
cd DevOpss
```

2. Run with Docker Compose:

```bash
docker-compose up --build
```

3. To build manually:

```bash
mvn clean install
docker build -t devopss-app .
docker run -p 8080:8080 devopss-app
```

4. Jenkins will use the `Jenkinsfile` to:
   - Pull repo
   - Build the app
   - Run tests
   - Deploy the containerized service

---

## 🔐 Environment Configuration

Set variables in `.env` like:

```env
PORT=8080
ENVIRONMENT=development
```

---

## 🧭 Roadmap

- Add Nginx reverse proxy
- TLS/SSL with Let's Encrypt
- GitHub Actions alternative CI setup
- Kubernetes deployment YAMLs

---

## 🤝 Contributing

Contributions are welcome! Fork the repo and submit a pull request with enhancements.


---

Built to demonstrate end-to-end DevOps for Java Web Applications 🛠️
