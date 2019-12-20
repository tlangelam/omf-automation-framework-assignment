# omf-automation-framework-assignment
OMF Automation Testing Technical Assessment (3 days to complete)  The purpose of this assessment is to evaluate the candidate’s technical ability to determine if he/ she will be successful as a Senior Test Analyst at Old Mutual Finance.

Tools to install

    1. Install and setup JAVA . https://www.java.com/en/download/
    2. Install and setup Gradle. https://gradle.org/install/
    3. Install and setup IntelliJ IDE (or any IDE) https://www.jetbrains.com/idea/download
    4. Install Docker, Docker Compose https://www.docker.com/products/docker-desktop
    5. Download real VNC https://www.realvnc.com/en/connect/download/viewer/
    

Running tests.
    
    1. Clone repo to your workspace directory
    2. Navigate to the project repo
    3. Run 'docker-compose up' command to bring up docker images where tests will be executed
    4. Run 'gradle clean test' to execute tests
    
    View execution using VNC or similar tools
     - CHROME 0.0.0.0:5901
     - FIREFOX 0.0.0.0:5902
    
    
Reporting.  
   
     1. View reports on reportportal 'http://IP_ADDRESS:8080'
     *Use next login\pass for access: default\1q2w3e
     2. run cmd 'docker ps -a' to get the IP_ADRRESS
     
Objectives
    
    1. Test script creation                      [Y]
    2. Use of element identification             [Y]
    3. Descriptive coding                        [Y]
    4. Screenshot capturing                      [N]
    5. Exception handling                        [N]
    6. Execution on different browsers           [Y]
    7. Use of code repository                    [Y]
    8. General coding standards                  [Y]
    9. Validations                               [Y]
    10. Reporting                                [N]
    11. Execute tests in Docker                  [Y]
