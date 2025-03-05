# Address Book Application Initialized  

### UC-1 
- **Setup of the Spring Address Book Application** 
- **Created Dummy Controller to check endpoint** 


### UC-2 
- **Defined the Controller to Demonstrate the Rest API using @RestController annotation** 

### Section-2 UC-1 
- **Remove the Direct Interaction of controller to User and Introduced the Service Layer** 


### Section-2 UC-2 
- **Introduce DTO and Model in Address Book Application** 

### Section-2 UC-3 
- **Use In Memory to save  or store the data in address book application** 

### Section-3 UC-1
- **Removed the Getter and Setter and Introduced Lombok** 
- **@Data annotation used to getter and setter method it also contains @toString** 
- **@Getter used to getter methods** 
- **@Setter used for setter method** 

### Section-3 UC-2
- **Used Lombok logging for lod the information** 
- **Configuration did in application.properties** 
```bash 
-
# Set log level for the application
logging.level.root=INFO
logging.level.com.example=DEBUG 

# Log output format
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n

# Log file output
logging.file.name=logs/app.log
 
``` 

