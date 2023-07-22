
# Class-User-Management

This is the code for Class-User-Management. Its an assignment of the class hence the class tag.

This also uses **Relational Data** and **JPA** for data source



## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 1 class which uses APIs as mentioned below* :

* ### UserController Class

    * @GetMapping("users")
    * @PostMapping("addUsers")
    * @DeleteMapping("deleteUser")
    * @PutMapping("updateAge")

## Services
-  *This section contains 1 class with functions that helps API to perform their specific tasks* : 


* ### UserService Class
    
    * List<User> getUsers()
    * addUsers(List<User> users)
    * deleteUser(Integer id)
    * updateAge(Integer id, Integer age)


## Model
- *This section contains 1 model as required by project named **User**. It has its relative datamembers in them which will be used as columns to store their respective data*.


##  Repository
- *This section contains 1 **Interface** named IUserRepo.*

- *It extends JpaRepository Interface*.


## Database Design
- *In this section we used the models as mentioned in Model section, which are used as a table to store data*.
- *It also uses **Relational Database** and **JPA** to create datastructure*.
- *We use **MYSQL** which is a management system for relational data*

## Data Structure Used

- *We used **Relational database** along with **JPA** as the data source in this project*.

- *This kind of data persists forever and we use **SQL** to manipulate this data via MYSQL.*

## Summary

*This project performs the task of managing User with various types of API's like **Get, Post, Put, Delete***.

*This project is also connected to a relational data which is the data source of this project.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)


