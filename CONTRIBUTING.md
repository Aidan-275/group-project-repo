How to clone the project:
1. Go to the Code page of the repo
2. Click the green **Code** while on any branch
3. Copy the text inside the text box under **HTTPS**
4. In IntelliJ, go to **File > New > Project from Version Control**
5. Paste the copied URL into the URL text box
6. Click **Clone**
---
How to run the project:
1. Open Docker Desktop
2. Go to IntelliJ and open the **docker-compose.yml** file
3. Click the run button next to the line that says **db**
4. Go to the **Services** tab in the bottom left
5. Under **Docker**, go to **Docker-compose: group-project-repo > db**
6. You should see **group-project-repo-db-1** with a health status next to it, wait until it says **healthy**
7. Go back to the **docker-compose.yml** file and then click the run button next to the line that says **app**
8. Go to the **Services** tab again, go to **Docker-compose: group-project-repo > app**
9. You should see that the app has ran inside the **Log** menu
---
