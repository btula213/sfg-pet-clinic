###How to define properties in external files?

Properties file can have a hierarchy, where one configuration can be overwritten in subsequent files.

        Property files defined in jar file. 
        Application.properties defined outside of jar
        YAML files
        OS variables
        Java System properties
        JNDI
        Spring_Application_Json
        Command Line Argument
        Test Environment Arguments

Use Environment variable for changing parameters (Account/password). Though not secure, but the environemnt itself is secure.

In the configuration file, annotate the class with 

        @PropertySource("classpath:datasource.properties") 
        Read the properties using @Value("${parameter.name}") annotation
        For e.g.
        @Bean
    FakeDataSource fakeDataSource(
            @Value("${guru.username}") String username,
            @Value("${guru.password}") String password,
            @Value("${guru.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource(username, password, jdbcurl);
        return fakeDataSource;
    }


Environment Variable / Parameter variable Demo

        In the Project Run Configuration, you can pass the environment variables to overwrite variables defined in jar
        Environment Variables should be defined in Snake_Case i.e. 
        GURU_USERNAME=UsernameFromEnvVar

Likewise, the variables can also be passed through Program arguments.

        Program Argument Variables should be defined with -- i.e. 
        --guru.username=UsernameFromParameter --guru.jdbcurl=URLFromParameter


Application.Properties --> Environment Variable--> Program Argument overwrites previous parameter values.







         


