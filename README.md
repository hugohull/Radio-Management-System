# Radio Management System

A Java-based web application designed to help radio companies manage their stations efficiently, developed as part of a coursework assignment. This system enables CRUD operations for both radio stations and their respective broadcasts using JSP for views and Spring MVC for handling requests and validation.

## Project Features

### 1. Project Setup & Configuration
- Configured to use JSP for views, placing all view files in `src/main/webapp/WEB-INF/views/`.

### 2. Domain Classes
- **`Station`**: Represents individual stations with fields for `host`, `producer`, `genre`, and `frequency`.
- **`Radio`**: Represents a radio with fields for `id`, `name`, `format`, and a list of associated `Station` objects.

### 3. Basic Controller Setup
- **`MainController`**: Handles root URL (`"/"`) requests with support for both POST and GET, displaying a `start` view.

### 4. Radio Management
- **Static List Initialization**: `Hw1Application` contains a static list of radios initialized with sample data.
- **RadioController**:
  - Displays all radios at `/radios` view.
  - Allows adding a new radio at `/newRadio`, handled by a JSP form.
  - Form submission at `/addRadio` adds the new radio to the list and redirects to `/radios`.

### 5. Station Management
- **StationController**:
  - Displays all stations for a selected radio at `/stations`.
  - Allows adding a new station via `/newStation`, including a parameter to link the station with the correct radio.
  - Form submission at `/addStation` adds the station to the chosen radio's list and redirects to `/radios`.

### 6. Validation
- **Radio Validation**:
  - Ensures `id` uniqueness.
  - Requires `name` and `format` fields to be non-empty.
- **Station Validation**:
  - Requires `host` and `producer` fields to be non-empty.
  - Restricts `genre` to "Pop music," "Rock music," or "Classical music."
  - Enforces `frequency` to fall within the 90–130 range.

Error messages display in the forms for fields that fail validation, guiding users to correct inputs.

---

This project aims to create a reliable, validated system for managing radio data, focusing on robust data handling and user-friendly validation feedback.
