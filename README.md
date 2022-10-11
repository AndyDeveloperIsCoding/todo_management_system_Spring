Hello

This application uses PostgreSQL as database. For the application to work properly, please configure the database. For this You have two options.
**Option 1**. Create a database and user according to the following description:
spring.datasource.url=jdbc:postgresql://localhost:5432/appdb
spring.datasource.username=testuser
spring.datasource.password=password
**Option 2**. Change the application.properties settings (see the code lines above) so that they would meet the configuration of Your own database and user settings.
