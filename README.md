# 🚀 Spring Boot Application Deployment on AWS EC2 (Amazon Linux)

This project demonstrates how to deploy a Spring Boot application to an **AWS EC2 instance (Amazon Linux), using **WinSCP** and **PuTTY**.

Project Structure:
Sample/
├── target/
│ └── myapp.jar
├── README.md

AWS account with EC2 access
- EC2 Windows instance running (with Java installed)
- Spring Boot `.jar` file built (via `mvn clean package`)
- WinSCP (for file transfer)
- PuTTY (for SSH access)
- `.ppk` private key for EC2 login

  📤 Steps to Upload and Run
  1. Build Your Spring Boot App
  2. In the terminal - mvn clean install --> This will generate a jar file.
  3. Create an EC2 instance.
     -Amazon MAchine Engine: Amazon Linux
     -Create New key pain - '.ppk' and download it.
  5. Open Putty
     -Host name: Public DNS
     -Upload private key as authentication credentials.
     -Log in as "ec2-user"(Linux)
     -Install java - sudo dnf install java-17-amazon-corritto
     ![image](https://github.com/user-attachments/assets/2b2a4213-1d7c-4b98-98c5-d87d0c77249a)


     
  7. Open WinSCP
     -HOst name: public DNS address
     -user_name: ec2-user
     -password: ppk key pair file.
     ![image](https://github.com/user-attachments/assets/6d024589-fef5-49f4-a502-39ec67e98893)
     
  8.Upload the jar file in EC2 instance
     ![image](https://github.com/user-attachments/assets/d533288c-1e88-4ddf-84ed-9d284a8c7823)

  9. Run the file in puTTY console
     - java -jar "jar file name"
     - ![image](https://github.com/user-attachments/assets/7e0a7660-6f0a-4e96-9153-d5fcb526930a)

  10. Add Chrome browser traffic in security group
      - port: 8080
      - ![image](https://github.com/user-attachments/assets/6e02ff92-de6d-4397-8f82-4c9da4671c3c)
     
  11. Open Chrome and put the public DNS address including the port
      -Example: "ec2-51-21-194-60.eu-north-1.compute.amazonaws.com:8080"
      -![image](https://github.com/user-attachments/assets/6b58c1c3-4b43-4753-8425-a4cce0b8b18b)

  12. Clean Up
      To avoid AWS charges:
      - Terminate the EC2 instance
      - Delete unused security groups, key pairs, and S3 buckets (if any)
     

Author
Deployed by: Jaee Joshi
GitHub: https://github.com/JaeeJoshi/
LinkedIn: https://www.linkedin.com/in/jaeejoshi/
        







     
