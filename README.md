Hello

This application uses PostgreSQL as database. For the application to work properly, please configure the database. For this You have two options. <br>
**Option 1**. Create a database and user according to the following description: <br>
spring.datasource.url=jdbc:postgresql://localhost:5432/appdb <br>
spring.datasource.username=testuser <br>
spring.datasource.password=password <br>
**Option 2**. Change the application.properties settings (see the code lines above) so that they would meet the configuration of Your own database and user settings.
