# M2 Challenge

In this assessment, you will build a simple REST web service.

## Structure

Your solution must have the following structural elements:

- Your solution must be in an IntelliJ project called `M2-Challenge-Lastname-Firstname`.
- Your project must be built using Spring Boot and Spring MVC. Initialize your project using `start.spring.io`.
- Your project must have an in-memory DAO that follows the pattern shown in this module.
- Your REST API must accept and return data in JSON format where appropriate.
- Your REST API must be documented with Swagger. Save the `.yaml` file in the root of your project directory.

## Requirements/Features

This web service is a quote-of-the-day, word-of-the-day, and magic 8-ball service. You must implement and document the following REST APIs:

- Quote API:
  - URI: /quote
  - Method: GET
  - Request Body: None
  - Response Body: Quote
- Quote Object instance variables:
  - id
  - author
  - quote
- Word API
  - URI: /word
  - Method: GET
  - Request Body: None
  - Response Body: Definition
- Definition Object instance variables:
  - id
  - word
  - definition
- Magic 8-ball API:
  - URI: /magic
  - Method: POST
  - Request Body: question
  - Response Body: Answer
- Answer Object instance variables:
  - id
  - question
  - answer


### Additional Requirements

- Your service must contain at least 10 quotes. Quotes must be served up at random.
- Your service must contain at least 10 words and their corresponding definitions. Words and definitions must be served up at random.
- Your service must contain at least six different magic 8-ball responses. Answers from 8-ball must be served up at random.

## Submission

Great job completing your second Challenge! It’s time to submit. Follow the steps from your first Challenge submission, but customize the naming conventions for this particular assignment. Make sure to double-check that your submission is completed.

## Grading Requirements

### **General setup and format requirements: 25%**

1. Your solution must reside in an IntelliJ project called `M2-Challenge-Lastname-Firstname`.
2. Your project must be built using Spring Boot and Spring MVC. Initialize your project using `start.spring.io`.
3. Your project must have an in-memory DAO that follows the pattern shown in this module.
4. The REST API must accept and return data in JSON format where appropriate.
5. The REST API must be documented with Swagger. Save the `.yaml` file in the root of your project directory.

### **Quote API Code: 25%**

1. Code is clean (follows general patterns as presented in class)
2. Quote API:

    - URI: /quote
    - Method: GET
    - Request Body: None
    - Response Body: Quote

3. Quote object instance variables:

    - id
    - author
    - quote

4. Your service must contain at least 10 quotes.
5. Quotes must be served up at random.

### **Word API Code: 25%**

1. Code is clean (follows general patterns as presented in class)
2. Word API:

    - URI: /word
    - Method: GET
    - Request Body: None
    - Response Body: Definition

3. Definition object instance variables:

    - id
    - word
    - definition

4. Your service must contain at least 10 words and their corresponding definition.
5. Words and definitions must be served up at random.

### **Magic 8-Ball API Code: 25%**

1. Code is clean (follows general patterns as presented in class)
2. Magic 8-ball API:

    - URI: /magic
    - Method: POST
    - Request Body: question
    - Response Body: Answer

3. Answer Object instance variables:

    - id
    - question
    - answer

4. Your service must contain at least six different magic 8-ball responses.
5. Answers from 8-ball must be served up at random.


---

© 2021 Trilogy Education Services, a 2U, Inc. brand. All Rights Reserved.
