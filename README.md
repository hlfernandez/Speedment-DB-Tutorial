Speedment: 'Hello Speedment' Tutorial
========================

This repository contains an implementation of the ['Hello Speedment'](https://github.com/speedment/speedment/wiki/Tutorial:-Hello-Speedment) tutorial, a simple example of Speedment for database querying in Java 8.

Usage
------------
### 1. Setup the database
This example has been created for a `MySQL` database with user `mysqluser`. 

First, you need to setup the database:

```sql
CREATE DATABASE hellospeedment;

USE hellospeedment;

CREATE TABLE IF NOT EXISTS `user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `name` varchar(32) NOT NULL,
    `age` int(5) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
```

### 2. Download and install

You can download this project directly from Github using the following command:
```bash
git clone https://github.com/hlfernandez/Speedment-DB-Tutorial.git
```

And then install it by running `mvn install`.

### 3. Launch

Launch the project with `mvn exec:java`, passing your database password as parameter:

```bash
mvn exec:java -Dexec.args="yourdatabasepassword"
```