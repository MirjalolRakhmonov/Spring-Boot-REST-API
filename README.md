# Spring-Boot-REST-API
REST API with Spring Boot that connects to a database

# DEVELOPMENT PROCESS
1. Update db configs in application.properties
2. Create Employee entity
3. Create DAO interface
4. Create DAO implementation
5. Create REST controller to use DAO

# REST CRUD FUNCTIONALITIES
*  Get list of employees
*  Get single employee by ID
*  Add a new employee
*  Update an existing employee
*  Delete an existing employee

# SERVICE METHODS(Layer) for REST CRUD functionalities
*EmployeeRESTController<-->EmployeeService<-->EmployeeDAO
