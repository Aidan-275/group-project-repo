How to clone the project:
1. Go to the Code page of the repo
2. Click the green **Code** while on any branch
3. Copy the text inside the text box under **HTTPS**
4. In IntelliJ, go to **File > New > Project from Version Control**
5. Paste the copied URL into the URL text box
6. Click **Clone**
---
How to run the project:
1. Open Docker Desktop as it must be running in order to run the app
2. Go to IntelliJ and open the **docker-compose.yml** file
3. Click the run button next to the line that says **db**, we run this first to set up the connection to the db
4. Go to the **Services** tab in the bottom left
5. Under **Docker**, go to **Docker-compose: group-project-repo > db**
6. You should see **group-project-repo-db-1** with a health status next to it, wait until it says **healthy**
7. Go back to the **docker-compose.yml** file and then click the run button next to the line that says **app**
8. Go to the **Services** tab again, go to **Docker-compose: group-project-repo > app**
9. You should see that the app has ran inside the **Log** menu
---
How to submit Pull Requests:
1. Push your branch to GitHub
2. Go to the repository on GitHub
3. Click the button to open a Pull Request
4. Choose the branch you want to merge **from** and **into**
5. Add a summary of what changed
6. Submit it
7. Someone else reviews it, then merges it
---
How to report bugs using the issue template:
1. Go to the **Issues** tab
2. Click **New Issue**
3. Select the **bug** template
4. Fill it in
5. Submit the issue
