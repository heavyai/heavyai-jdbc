# Building HeavyAI JDBC Driver

This guide explains how to build the HeavyAI JDBC driver from source on different platforms.

## Linux (Debian/Ubuntu)

### Prerequisites

Install Java and Maven using apt:

```bash
# Update package list
sudo apt update

# Install OpenJDK 11 (or higher)
sudo apt install openjdk-11-jdk

# Install Maven
sudo apt install maven

# Optional: Install Git if not already available
sudo apt install git
```

### Verify Installations

Check that everything is properly installed:

```bash
# Check Java version (should be 11 or higher)
java -version

# Check Maven version
mvn -version

# Check Git version
git --version
```

### Build the JDBC Driver

```bash
# Clone the repository (if needed)
git clone https://github.com/heavyai/heavyai-jdbc.git
cd heavyai-jdbc

# Build standard JAR
mvn clean package

# Build fat JAR (includes all dependencies)
mvn clean package -P fatjar
```

## macOS

### Prerequisites

#### 1. Install Homebrew (if not already installed)

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

#### 2. Install Required Packages

Install Java and Maven using Homebrew:

```bash
# Install OpenJDK (Java)
brew install openjdk

# Install Maven
brew install maven

# Optional: Install Git if not already available
brew install git
```

#### 3. Verify Installations

Check that everything is properly installed:

```bash
# Check Java version (should be 8 or higher)
java -version

# Check Maven version
mvn -version

# Check Git version
git --version
```

### Building the JDBC Driver

#### 1. Clone the Repository (if needed)

```bash
git clone https://github.com/heavyai/heavyai-jdbc.git
cd heavyai-jdbc
```

#### 2. Build the Standard JAR

To build the standard JAR file (without dependencies):

```bash
mvn clean package
```

#### 3. Build the Fat JAR

To build a JAR file with all dependencies included:

```bash
mvn clean package -P fatjar
```

This will create two JAR files in the `target/` directory:
- `heavyai-jdbc-6.1.0.jar` - Standard JAR without dependencies
- `heavyai-jdbc-6.1.0-jar-with-dependencies.jar` - Fat JAR with all dependencies

#### 4. Verify the Build

Check that the JAR files were created successfully:

```bash
ls -la target/*.jar
```

You should see output similar to:
```
-rw-r--r--@ 1 user  staff  9083637 Aug 28 12:25 heavyai-jdbc-6.1.0-jar-with-dependencies.jar
-rw-r--r--@ 1 user  staff  4564865 Aug 28 12:24 heavyai-jdbc-6.1.0.jar
```

## Using the JAR File

The built JAR files can be used with any JDBC-compatible application:

- **Standard JAR**: `heavyai-jdbc-6.1.0.jar` - Use when dependencies are managed externally
- **Fat JAR**: `heavyai-jdbc-6.1.0-jar-with-dependencies.jar` - Self-contained JAR with all dependencies

### JDBC Connection Details

- **Driver Class**: `ai.heavy.jdbc.HeavyAIDriver`
- **URL Format**: `jdbc:heavyai:{host}:{port}:{database}`
- **Default Port**: 6274

## Troubleshooting

### Common Issues

1. **Java Version Issues**
   - Ensure you're using Java 8 or higher
   - Check with `java -version`

2. **Maven Not Found**
   - Make sure Maven is in your PATH
   - Try `brew link maven` if needed

3. **Build Failures**
   - Clean the project first: `mvn clean`
   - Check internet connection (Maven needs to download dependencies)

### Getting Help

- HeavyAI JDBC Issues: [GitHub Issues](https://github.com/heavyai/heavyai-jdbc/issues)
- HeavyDB Documentation: [HeavyDB Docs](https://docs.heavy.ai/)

## Build Profile Options

The project supports several Maven profiles:

- **Default**: `mvn clean package` - Builds standard JAR
- **Fat JAR**: `mvn clean package -P fatjar` - Builds JAR with dependencies
- **Release**: `mvn clean package -P release` - Builds release artifacts with sources and javadocs