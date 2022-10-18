Dear reader

This application uses PostgreSQL as database. For the application to work properly, please configure the database. For this You have two options: <br>
**Option 1**. Create a database and user according to the following description: <br>
spring.datasource.url=jdbc:postgresql://localhost:5432/appdb <br>
spring.datasource.username=testuser <br>
spring.datasource.password=password <br>
**Option 2**. Change the application.properties settings (see the code lines above) so that they would meet the configuration of Your own database and user settings.

Important information:
**PostgreSQL database is set to create-drop- whole data is deleted every time the application stops running.
**For backend the automation of API documentation is configured. To see the documentation open URL http://localhost:8080/swagger-ui/ after running the backend application.
