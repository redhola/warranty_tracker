# Warranty Tracking Application

## Project Description
This project is a Java Spring Boot application that manages the inventory and warranty tracking of IoT devices.

## Technologies Used
- Java 17
- Spring Boot
- PostgreSQL

## PostgreSQL Configuration
Configure the settings in the `application.properties` file of PostgreSQL as follows:
```properties
spring.application.name=warranty-tracker
spring.datasource.url=jdbc:postgresql://localhost:5432/warranty_tracker
spring.datasource.username=postgres
spring.datasource.password=roltek
spring.jpa.hibernate.ddl-auto=update
spring.datasource.initialization-mode=always


----API Endpoints---

## Add Device (Create Device)
Method: POST
URL: /api/devices
Body (JSON):

{
    "serialNumber": "123456",
    "brand": "BrandA",
    "model": "ModelX"
}

-------------------------------------

## Update Device (Update Device)
Method: PUT
URL: /api/devices/{id}
Body (JSON):

{
    "serialNumber": "654321",
    "brand": "BrandB",
    "model": "ModelY"
}

-------------------------------------

## Delete Device (Delete Device)
Method: DELETE
URL: /api/devices/{id}

-------------------------------------

## Get All Devices (Get All Devices)
Method: GET
URL: /api/devices

-------------------------------------

## Get Device by ID (Get Device by ID)
Method: GET
URL: /api/devices/{id}

-------------------------------------

## Check Warranty (Check Warranty)
Method: GET
URL: /api/warranties/{deviceId}

-------------------------------------

Additional Information
This project aimed to develop a Java Spring Boot application that manages the inventory and warranty tracking of IoT devices. With this project, we achieved the following:

Project Details:
Device Information: Successfully stored the serial number, brand, and model information of devices.
Warranty Check: Implemented a feature to check the warranty status of devices. The warranty period is 2 years from the purchase date. If the warranty period has expired, the warranty status is marked as "Warranty Expired".

--Technologies Used--
-Java 17
-Java Spring Boot
-PostgreSQL


--Models Implemented--
-Device: [id, serialNumber, brand, model]
-Warranty: [id, deviceId, purchaseDate, warrantyStatus]


--Functional Requirements--
-CRUD Operations: Enabled adding, updating, and deleting devices.
-Warranty Status Check: Developed functionality to check the warranty status of devices.
-Example Scenario:
-Added a device.
-Checked the warranty status of the device.
-Marked the warranty status as "Warranty Expired" if the warranty period had expired.


--Additional Notes--
-Used Hibernate for database operations.
-Utilized PostgreSQL as the database.
